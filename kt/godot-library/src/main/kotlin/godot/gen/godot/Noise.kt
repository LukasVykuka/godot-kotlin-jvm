// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR2
import godot.core.VariantType.VECTOR3
import godot.core.Vector2
import godot.core.Vector3
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

@GodotBaseType
public open class Noise internal constructor() : Resource() {
  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NOISE, scriptIndex)
    return true
  }

  public fun getNoise1d(x: Double): Double {
    TransferContext.writeArguments(DOUBLE to x)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_NOISE_1D, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getNoise2d(x: Double, y: Double): Double {
    TransferContext.writeArguments(DOUBLE to x, DOUBLE to y)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_NOISE_2D, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getNoise2dv(v: Vector2): Double {
    TransferContext.writeArguments(VECTOR2 to v)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_NOISE_2DV, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getNoise3d(
    x: Double,
    y: Double,
    z: Double
  ): Double {
    TransferContext.writeArguments(DOUBLE to x, DOUBLE to y, DOUBLE to z)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_NOISE_3D, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getNoise3dv(v: Vector3): Double {
    TransferContext.writeArguments(VECTOR3 to v)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_NOISE_3DV, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public fun getImage(
    width: Long,
    height: Long,
    invert: Boolean = false,
    in3dSpace: Boolean = false
  ): Image? {
    TransferContext.writeArguments(LONG to width, LONG to height, BOOL to invert, BOOL to in3dSpace)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_IMAGE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  public fun getSeamlessImage(
    width: Long,
    height: Long,
    invert: Boolean = false,
    in3dSpace: Boolean = false,
    skirt: Double = 0.1
  ): Image? {
    TransferContext.writeArguments(LONG to width, LONG to height, BOOL to invert, BOOL to in3dSpace, DOUBLE to skirt)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NOISE_GET_SEAMLESS_IMAGE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as Image?
  }

  public companion object
}
