// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * A container that preserves the proportions of its child controls.
 *
 * Tutorials:
 * [$DOCS_URL/tutorials/ui/gui_containers.html]($DOCS_URL/tutorials/ui/gui_containers.html)
 *
 * A container type that arranges its child controls in a way that preserves their proportions automatically when the container is resized. Useful when a container has a dynamic size and the child nodes must adjust their sizes accordingly without losing their aspect ratios.
 */
@GodotBaseType
public open class AspectRatioContainer : Container() {
  /**
   * The aspect ratio to enforce on child controls. This is the width divided by the height. The ratio depends on the [stretchMode].
   */
  public var ratio: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRatioPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRatioPtr, NIL)
    }

  /**
   * The stretch mode used to align child controls.
   */
  public var stretchMode: StretchMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getStretchModePtr, LONG)
      return AspectRatioContainer.StretchMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setStretchModePtr, NIL)
    }

  /**
   * Specifies the horizontal relative position of child controls.
   */
  public var alignmentHorizontal: AlignmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentHorizontalPtr, LONG)
      return AspectRatioContainer.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlignmentHorizontalPtr, NIL)
    }

  /**
   * Specifies the vertical relative position of child controls.
   */
  public var alignmentVertical: AlignmentMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAlignmentVerticalPtr, LONG)
      return AspectRatioContainer.AlignmentMode.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAlignmentVerticalPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ASPECTRATIOCONTAINER, scriptIndex)
    return true
  }

  public enum class StretchMode(
    id: Long,
  ) {
    /**
     * The height of child controls is automatically adjusted based on the width of the container.
     */
    STRETCH_WIDTH_CONTROLS_HEIGHT(0),
    /**
     * The width of child controls is automatically adjusted based on the height of the container.
     */
    STRETCH_HEIGHT_CONTROLS_WIDTH(1),
    /**
     * The bounding rectangle of child controls is automatically adjusted to fit inside the container while keeping the aspect ratio.
     */
    STRETCH_FIT(2),
    /**
     * The width and height of child controls is automatically adjusted to make their bounding rectangle cover the entire area of the container while keeping the aspect ratio.
     *
     * When the bounding rectangle of child controls exceed the container's size and [godot.Control.clipContents] is enabled, this allows to show only the container's area restricted by its own bounding rectangle.
     */
    STRETCH_COVER(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public enum class AlignmentMode(
    id: Long,
  ) {
    /**
     * Aligns child controls with the beginning (left or top) of the container.
     */
    ALIGNMENT_BEGIN(0),
    /**
     * Aligns child controls with the center of the container.
     */
    ALIGNMENT_CENTER(1),
    /**
     * Aligns child controls with the end (right or bottom) of the container.
     */
    ALIGNMENT_END(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_ratio")

    public val getRatioPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_ratio")

    public val setStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_stretch_mode")

    public val getStretchModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_stretch_mode")

    public val setAlignmentHorizontalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_alignment_horizontal")

    public val getAlignmentHorizontalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_alignment_horizontal")

    public val setAlignmentVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "set_alignment_vertical")

    public val getAlignmentVerticalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AspectRatioContainer", "get_alignment_vertical")
  }
}
