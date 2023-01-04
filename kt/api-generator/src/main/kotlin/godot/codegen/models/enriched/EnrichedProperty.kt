package godot.codegen.models.enriched

import com.squareup.kotlinpoet.ANY
import godot.codegen.constants.GodotTypes
import godot.codegen.extensions.convertToCamelCase
import godot.codegen.extensions.getTypeClassName
import godot.codegen.extensions.isObjectSubClass
import godot.codegen.workarounds.sanitizeApiType
import godot.codegen.models.Argument
import godot.codegen.models.Property
import godot.codegen.traits.CallableTrait
import godot.codegen.traits.NullableTrait
import godot.codegen.traits.TypedTrait

class EnrichedProperty(val internal: Property) : TypedTrait, NullableTrait {
    val name = internal.name.replace("/", "_").convertToCamelCase()
    val getter = internal.getter.convertToCamelCase()
    val setter = internal.setter?.convertToCamelCase()
    val isIndexed = internal.index != null

    var getterMethod: EnrichedMethod? = null
    var setterMethod: EnrichedMethod? = null

    val hasValidSetterInClass: Boolean
        get() = setterMethod != null

    val hasValidGetterInClass: Boolean
        get() = getterMethod != null

    var shouldUseSuperSetter = false
    var shouldUseSuperGetter = false

    // Here we use getter type instead.
    // We have part of code that check if core type or not before it is possible to
    // set getter. So if getter is not set, we use property type.
    val internalType: String
        get() = getterMethod?.type ?: internal.type

    override val type: String
        get() = if (internal.type.indexOf(",") != -1) {
            // There are property with multiple types, and it's all Materials, so
            // Godot's developer should make more strict API
            "Material"
        } else {
            // There are inconsistencies between property type and getter type in api.
            internalType.sanitizeApiType()
        }
    override val nullable = isObjectSubClass() || getTypeClassName().className == ANY
}

fun List<Property>.toEnriched() = map {
    EnrichedProperty(it)
}

fun EnrichedProperty.toSetterCallable() = object : CallableTrait {
    init {
        requireNotNull(setterMethod)
    }

    override val arguments = if (isIndexed) {
        listOf(
            Argument("index", GodotTypes.int, null, null).toEnriched(),
            Argument("value", internalType, null, null).toEnriched()
        )
    } else {
        listOf(
            Argument("value", internalType, null, null).toEnriched()
        )
    }
    override val isVararg = false
    override val engineIndexName = setterMethod!!.engineIndexName
    override val type = ""
    override val nullable = false
}

fun EnrichedProperty.toGetterCallable() = object : CallableTrait {
    init {
        requireNotNull(getterMethod)
    }

    override val arguments = if (isIndexed) {
        listOf(Argument("index", GodotTypes.int, null, null).toEnriched())
    } else {
        listOf()
    }
    override val isVararg = false
    override val engineIndexName = getterMethod!!.engineIndexName
    override val type = this@toGetterCallable.type
    override val nullable = this@toGetterCallable.nullable
}
