// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A customizable [godot.StyleBox] that doesn't use a texture.
 *
 * By configuring various properties of this style box, you can achieve many common looks without the need of a texture. This includes optionally rounded borders, antialiasing, shadows, and skew.
 *
 * Setting corner radius to high values is allowed. As soon as corners overlap, the stylebox will switch to a relative system.
 *
 * **Example:**
 *
 * ```
 * 		height = 30
 * 		corner_radius_top_left = 50
 * 		corner_radius_bottom_left = 100
 * 		```
 *
 * The relative system now would take the 1:2 ratio of the two left corners to calculate the actual corner width. Both corners added will **never** be more than the height. Result:
 *
 * ```
 * 		corner_radius_top_left: 10
 * 		corner_radius_bottom_left: 20
 * 		```
 */
@GodotBaseType
public open class StyleBoxFlat : StyleBox() {
  /**
   * The background color of the stylebox.
   */
  public var bgColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BG_COLOR, COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BG_COLOR, NIL)
    }

  /**
   * Toggles drawing of the inner part of the stylebox.
   */
  public var drawCenter: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_IS_DRAW_CENTER_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_DRAW_CENTER, NIL)
    }

  /**
   * If set to a non-zero value on either axis, [skew] distorts the StyleBox horizontally and/or vertically. This can be used for "futuristic"-style UIs. Positive values skew the StyleBox towards the right (X axis) and upwards (Y axis), while negative values skew the StyleBox towards the left (X axis) and downwards (Y axis).
   *
   * **Note:** To ensure text does not touch the StyleBox's edges, consider increasing the [godot.StyleBox]'s content margin (see [godot.StyleBox.contentMarginBottom]). It is preferable to increase the content margin instead of the expand margin (see [expandMarginBottom]), as increasing the expand margin does not increase the size of the clickable area for [godot.Control]s.
   */
  public var skew: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_SKEW, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_SKEW, NIL)
    }

  /**
   * Sets the color of the border.
   */
  public var borderColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_COLOR,
          NIL)
    }

  /**
   * If `true`, the border will fade into the background color.
   */
  public var borderBlend: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_BLEND,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_BLEND,
          NIL)
    }

  /**
   * This sets the number of vertices used for each corner. Higher values result in rounder corners but take more processing power to compute. When choosing a value, you should take the corner radius ([setCornerRadiusAll]) into account.
   *
   * For corner radii less than 10, `4` or `5` should be enough. For corner radii less than 30, values between `8` and `12` should be enough.
   *
   * A corner detail of `1` will result in chamfered corners instead of rounded corners, which is useful for some artistic effects.
   */
  public var cornerDetail: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_CORNER_DETAIL,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_DETAIL,
          NIL)
    }

  /**
   * The color of the shadow. This has no effect if [shadowSize] is lower than 1.
   */
  public var shadowColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_SHADOW_COLOR,
          COLOR)
      return TransferContext.readReturnValue(COLOR, false) as Color
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_SHADOW_COLOR,
          NIL)
    }

  /**
   * The shadow size in pixels.
   */
  public var shadowSize: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_SHADOW_SIZE,
          LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_SHADOW_SIZE, NIL)
    }

  /**
   * The shadow offset in pixels. Adjusts the position of the shadow relatively to the stylebox.
   */
  public var shadowOffset: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_SHADOW_OFFSET,
          VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_SHADOW_OFFSET,
          NIL)
    }

  /**
   * Antialiasing draws a small ring around the edges, which fades to transparency. As a result, edges look much smoother. This is only noticeable when using rounded corners or [skew].
   *
   * **Note:** When using beveled corners with 45-degree angles ([cornerDetail] = 1), it is recommended to set [antiAliasing] to `false` to ensure crisp visuals and avoid possible visual glitches.
   */
  public var antiAliasing: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_IS_ANTI_ALIASED,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_ANTI_ALIASED,
          NIL)
    }

  /**
   * This changes the size of the antialiasing effect. `1.0` is recommended for an optimal result at 100% scale, identical to how rounded rectangles are rendered in web browsers and most vector drawing software.
   *
   * **Note:** Higher values may produce a blur effect but can also create undesired artifacts on small boxes with large-radius corners.
   */
  public var antiAliasingSize: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_AA_SIZE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_AA_SIZE, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_STYLEBOXFLAT, scriptIndex)
    return true
  }

  /**
   * Sets the border width to [width] pixels for all sides.
   */
  public fun setBorderWidthAll(width: Long): Unit {
    TransferContext.writeArguments(LONG to width)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_WIDTH_ALL,
        NIL)
  }

  /**
   * Returns the smallest border width out of all four borders.
   */
  public fun getBorderWidthMin(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_WIDTH_MIN,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the specified [enum Side]'s border width to [width] pixels.
   */
  public fun setBorderWidth(margin: Side, width: Long): Unit {
    TransferContext.writeArguments(LONG to margin.id, LONG to width)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_BORDER_WIDTH, NIL)
  }

  /**
   * Returns the specified [enum Side]'s border width.
   */
  public fun getBorderWidth(margin: Side): Long {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_BORDER_WIDTH, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the corner radius to [radius] pixels for all corners.
   */
  public fun setCornerRadiusAll(radius: Long): Unit {
    TransferContext.writeArguments(LONG to radius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS_ALL,
        NIL)
  }

  /**
   * Sets the corner radius to [radius] pixels for the given [corner]. See [enum Corner] for possible values.
   */
  public fun setCornerRadius(corner: Corner, radius: Long): Unit {
    TransferContext.writeArguments(LONG to corner.id, LONG to radius)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_CORNER_RADIUS, NIL)
  }

  /**
   * Returns the given [corner]'s radius. See [enum Corner] for possible values.
   */
  public fun getCornerRadius(corner: Corner): Long {
    TransferContext.writeArguments(LONG to corner.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_CORNER_RADIUS,
        LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Sets the expand margin to [size] pixels for the specified [enum Side].
   */
  public fun setExpandMargin(margin: Side, size: Double): Unit {
    TransferContext.writeArguments(LONG to margin.id, DOUBLE to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN, NIL)
  }

  /**
   * Sets the expand margin to [size] pixels for all sides.
   */
  public fun setExpandMarginAll(size: Double): Unit {
    TransferContext.writeArguments(DOUBLE to size)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_SET_EXPAND_MARGIN_ALL,
        NIL)
  }

  /**
   * Returns the size of the specified [enum Side]'s expand margin.
   */
  public fun getExpandMargin(margin: Side): Double {
    TransferContext.writeArguments(LONG to margin.id)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_STYLEBOXFLAT_GET_EXPAND_MARGIN,
        DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  public companion object
}
