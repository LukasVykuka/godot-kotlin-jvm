// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.NodePath
import godot.core.StringName
import godot.core.VariantArray
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal2
import godot.signals.Signal3
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.NotImplementedError
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Base class for [godot.AnimationTree] nodes. Not related to scene nodes.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/animation/animation_tree.html]($DOCS_URL/tutorials/animation/animation_tree.html)
 *
 * Base resource for [godot.AnimationTree] nodes. In general, it's not used directly, but you can create custom ones with custom blending formulas.
 *
 * Inherit this when creating animation nodes mainly for use in [godot.AnimationNodeBlendTree], otherwise [godot.AnimationRootNode] should be used instead.
 */
@GodotBaseType
public open class AnimationNode : Resource() {
  /**
   * Emitted by nodes that inherit from this class and that have an internal tree when one of their animation nodes changes. The animation nodes that emit this signal are [godot.AnimationNodeBlendSpace1D], [godot.AnimationNodeBlendSpace2D], [godot.AnimationNodeStateMachine], [godot.AnimationNodeBlendTree] and [godot.AnimationNodeTransition].
   */
  public val treeChanged: Signal0 by signal()

  /**
   * Emitted by nodes that inherit from this class and that have an internal tree when one of their animation node names changes. The animation nodes that emit this signal are [godot.AnimationNodeBlendSpace1D], [godot.AnimationNodeBlendSpace2D], [godot.AnimationNodeStateMachine], and [godot.AnimationNodeBlendTree].
   */
  public val animationNodeRenamed: Signal3<Long, String, String> by signal("objectId", "oldName",
      "newName")

  /**
   * Emitted by nodes that inherit from this class and that have an internal tree when one of their animation nodes removes. The animation nodes that emit this signal are [godot.AnimationNodeBlendSpace1D], [godot.AnimationNodeBlendSpace2D], [godot.AnimationNodeStateMachine], and [godot.AnimationNodeBlendTree].
   */
  public val animationNodeRemoved: Signal2<Long, String> by signal("objectId", "name")

  /**
   * If `true`, filtering is enabled.
   */
  public var filterEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_IS_FILTER_ENABLED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_SET_FILTER_ENABLED,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODE, scriptIndex)
    return true
  }

  /**
   * When inheriting from [godot.AnimationRootNode], implement this virtual method to return all children animation nodes in order as a `name: node` dictionary.
   */
  public open fun _getChildNodes(): Dictionary<Any?, Any?> {
    throw NotImplementedError("_get_child_nodes is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [godot.AnimationRootNode], implement this virtual method to return a list of the properties on this animation node. Parameters are custom local memory used for your animation nodes, given a resource can be reused in multiple trees. Format is similar to [godot.Object.getPropertyList].
   */
  public open fun _getParameterList(): VariantArray<Any?> {
    throw NotImplementedError("_get_parameter_list is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [godot.AnimationRootNode], implement this virtual method to return a child animation node by its [name].
   */
  public open fun _getChildByName(name: StringName): AnimationNode? {
    throw NotImplementedError("_get_child_by_name is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [godot.AnimationRootNode], implement this virtual method to return the default value of a [parameter]. Parameters are custom local memory used for your animation nodes, given a resource can be reused in multiple trees.
   */
  public open fun _getParameterDefaultValue(parameter: StringName): Any? {
    throw NotImplementedError("_get_parameter_default_value is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [godot.AnimationRootNode], implement this virtual method to return whether the [parameter] is read-only. Parameters are custom local memory used for your animation nodes, given a resource can be reused in multiple trees.
   */
  public open fun _isParameterReadOnly(parameter: StringName): Boolean {
    throw NotImplementedError("_is_parameter_read_only is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [godot.AnimationRootNode], implement this virtual method to run some code when this animation node is processed. The [time] parameter is a relative delta, unless [seek] is `true`, in which case it is absolute.
   *
   * Here, call the [blendInput], [blendNode] or [blendAnimation] functions. You can also use [getParameter] and [setParameter] to modify local memory.
   *
   * This function should return the time left for the current animation to finish (if unsure, pass the value from the main blend being called).
   */
  public open fun _process(
    time: Double,
    seek: Boolean,
    isExternalSeeking: Boolean,
    testOnly: Boolean,
  ): Double {
    throw NotImplementedError("_process is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [godot.AnimationRootNode], implement this virtual method to override the text caption for this animation node.
   */
  public open fun _getCaption(): String {
    throw NotImplementedError("_get_caption is not implemented for AnimationNode")
  }

  /**
   * When inheriting from [godot.AnimationRootNode], implement this virtual method to return whether the blend tree editor should display filter editing on this animation node.
   */
  public open fun _hasFilter(): Boolean {
    throw NotImplementedError("_has_filter is not implemented for AnimationNode")
  }

  /**
   * Adds an input to the animation node. This is only useful for animation nodes created for use in an [godot.AnimationNodeBlendTree]. If the addition fails, returns `false`.
   */
  public fun addInput(name: String): Boolean {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_ADD_INPUT, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Removes an input, call this only when inactive.
   */
  public fun removeInput(index: Long): Unit {
    TransferContext.writeArguments(LONG to index)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_REMOVE_INPUT, NIL)
  }

  /**
   * Sets the name of the input at the given [input] index. If the setting fails, returns `false`.
   */
  public fun setInputName(input: Long, name: String): Boolean {
    TransferContext.writeArguments(LONG to input, STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_SET_INPUT_NAME, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Gets the name of an input by index.
   */
  public fun getInputName(input: Long): String {
    TransferContext.writeArguments(LONG to input)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_GET_INPUT_NAME,
        STRING)
    return TransferContext.readReturnValue(STRING, false) as String
  }

  /**
   * Amount of inputs in this animation node, only useful for animation nodes that go into [godot.AnimationNodeBlendTree].
   */
  public fun getInputCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_GET_INPUT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns the input index which corresponds to [name]. If not found, returns `-1`.
   */
  public fun findInput(name: String): Long {
    TransferContext.writeArguments(STRING to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_FIND_INPUT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Adds or removes a path for the filter.
   */
  public fun setFilterPath(path: NodePath, enable: Boolean): Unit {
    TransferContext.writeArguments(NODE_PATH to path, BOOL to enable)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_SET_FILTER_PATH, NIL)
  }

  /**
   * Returns whether the given path is filtered.
   */
  public fun isPathFiltered(path: NodePath): Boolean {
    TransferContext.writeArguments(NODE_PATH to path)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_IS_PATH_FILTERED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Blend an animation by [blend] amount (name must be valid in the linked [godot.AnimationPlayer]). A [time] and [delta] may be passed, as well as whether [seeked] happened.
   *
   * A [loopedFlag] is used by internal processing immediately after the loop. See also [enum Animation.LoopedFlag].
   */
  public fun blendAnimation(
    animation: StringName,
    time: Double,
    delta: Double,
    seeked: Boolean,
    isExternalSeeking: Boolean,
    blend: Double,
    loopedFlag: Animation.LoopedFlag = Animation.LoopedFlag.LOOPED_FLAG_NONE,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to animation, DOUBLE to time, DOUBLE to delta, BOOL to seeked, BOOL to isExternalSeeking, DOUBLE to blend, LONG to loopedFlag.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_BLEND_ANIMATION, NIL)
  }

  /**
   * Blend another animation node (in case this animation node contains children animation nodes). This function is only useful if you inherit from [godot.AnimationRootNode] instead, else editors will not display your animation node for addition.
   */
  public fun blendNode(
    name: StringName,
    node: AnimationNode,
    time: Double,
    seek: Boolean,
    isExternalSeeking: Boolean,
    blend: Double,
    filter: FilterAction = AnimationNode.FilterAction.FILTER_IGNORE,
    sync: Boolean = true,
    testOnly: Boolean = false,
  ): Double {
    TransferContext.writeArguments(STRING_NAME to name, OBJECT to node, DOUBLE to time, BOOL to seek, BOOL to isExternalSeeking, DOUBLE to blend, LONG to filter.id, BOOL to sync, BOOL to testOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_BLEND_NODE, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Blend an input. This is only useful for animation nodes created for an [godot.AnimationNodeBlendTree]. The [time] parameter is a relative delta, unless [seek] is `true`, in which case it is absolute. A filter mode may be optionally passed (see [enum FilterAction] for options).
   */
  public fun blendInput(
    inputIndex: Long,
    time: Double,
    seek: Boolean,
    isExternalSeeking: Boolean,
    blend: Double,
    filter: FilterAction = AnimationNode.FilterAction.FILTER_IGNORE,
    sync: Boolean = true,
    testOnly: Boolean = false,
  ): Double {
    TransferContext.writeArguments(LONG to inputIndex, DOUBLE to time, BOOL to seek, BOOL to isExternalSeeking, DOUBLE to blend, LONG to filter.id, BOOL to sync, BOOL to testOnly)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_BLEND_INPUT, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sets a custom parameter. These are used as local memory, because resources can be reused across the tree or scenes.
   */
  public fun setParameter(name: StringName, `value`: Any): Unit {
    TransferContext.writeArguments(STRING_NAME to name, ANY to value)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_SET_PARAMETER, NIL)
  }

  /**
   * Gets the value of a parameter. Parameters are custom local memory used for your animation nodes, given a resource can be reused in multiple trees.
   */
  public fun getParameter(name: StringName): Any? {
    TransferContext.writeArguments(STRING_NAME to name)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_ANIMATIONNODE_GET_PARAMETER, ANY)
    return TransferContext.readReturnValue(ANY, true) as Any?
  }

  public enum class FilterAction(
    id: Long,
  ) {
    /**
     * Do not use filtering.
     */
    FILTER_IGNORE(0),
    /**
     * Paths matching the filter will be allowed to pass.
     */
    FILTER_PASS(1),
    /**
     * Paths matching the filter will be discarded.
     */
    FILTER_STOP(2),
    /**
     * Paths matching the filter will be blended (by the blend value).
     */
    FILTER_BLEND(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}
