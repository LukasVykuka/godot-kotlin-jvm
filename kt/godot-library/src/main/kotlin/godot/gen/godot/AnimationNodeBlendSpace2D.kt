// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.BOOL
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * Blends linearly between three [godot.AnimationNode] of any type placed in a 2D space.
 *
 * Tutorials:
 * [https://godotengine.org/asset-library/asset/678](https://godotengine.org/asset-library/asset/678)
 *
 * A resource to add to an [godot.AnimationNodeBlendTree].
 *
 * This node allows you to blend linearly between three animations using a [godot.core.Vector2] weight.
 *
 * You can add vertices to the blend space with [addBlendPoint] and automatically triangulate it by setting [autoTriangles] to `true`. Otherwise, use [addTriangle] and [removeTriangle] to create up the blend space by hand.
 */
@GodotBaseType
public open class AnimationNodeBlendSpace2D : AnimationRootNode() {
  /**
   * Emitted every time the blend space's triangles are created, removed, or when one of their vertices changes position.
   */
  public val trianglesUpdated: Signal0 by signal()

  /**
   * If `true`, the blend space is triangulated automatically. The mesh updates every time you add or remove points with [addBlendPoint] and [removeBlendPoint].
   */
  public var autoTriangles: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_AUTO_TRIANGLES, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_AUTO_TRIANGLES, NIL)
    }

  /**
   * The blend space's X and Y axes' lower limit for the points' position. See [addBlendPoint].
   */
  public var minSpace: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_MIN_SPACE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_MIN_SPACE, NIL)
    }

  /**
   * The blend space's X and Y axes' upper limit for the points' position. See [addBlendPoint].
   */
  public var maxSpace: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_MAX_SPACE, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_MAX_SPACE, NIL)
    }

  /**
   * Position increment to snap to when moving a point.
   */
  public var snap: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_SNAP, VECTOR2)
      return TransferContext.readReturnValue(VECTOR2, false) as Vector2
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_SNAP, NIL)
    }

  /**
   * Name of the blend space's X axis.
   */
  public var xLabel: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_X_LABEL, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_X_LABEL, NIL)
    }

  /**
   * Name of the blend space's Y axis.
   */
  public var yLabel: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_Y_LABEL, STRING)
      return TransferContext.readReturnValue(STRING, false) as String
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_Y_LABEL, NIL)
    }

  /**
   * Controls the interpolation between animations. See [enum BlendMode] constants.
   */
  public var blendMode: BlendMode
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_MODE, LONG)
      return AnimationNodeBlendSpace2D.BlendMode.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_MODE, NIL)
    }

  /**
   * If `false`, the blended animations' frame are stopped when the blend value is `0`.
   *
   * If `true`, forcing the blended animations to advance frame.
   */
  public var sync: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_IS_USING_SYNC, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_USE_SYNC, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_ANIMATIONNODEBLENDSPACE2D, scriptIndex)
    return true
  }

  /**
   * Adds a new point that represents a [node] at the position set by [pos]. You can insert it at a specific index using the [atIndex] argument. If you use the default value for [atIndex], the point is inserted at the end of the blend points array.
   */
  public fun addBlendPoint(
    node: AnimationRootNode,
    pos: Vector2,
    atIndex: Long = -1
  ): Unit {
    TransferContext.writeArguments(OBJECT to node, VECTOR2 to pos, LONG to atIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_ADD_BLEND_POINT, NIL)
  }

  /**
   * Updates the position of the point at index [point] on the blend axis.
   */
  public fun setBlendPointPosition(point: Long, pos: Vector2): Unit {
    TransferContext.writeArguments(LONG to point, VECTOR2 to pos)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_POSITION, NIL)
  }

  /**
   * Returns the position of the point at index [point].
   */
  public fun getBlendPointPosition(point: Long): Vector2 {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_POSITION, VECTOR2)
    return TransferContext.readReturnValue(VECTOR2, false) as Vector2
  }

  /**
   * Changes the [godot.AnimationNode] referenced by the point at index [point].
   */
  public fun setBlendPointNode(point: Long, node: AnimationRootNode): Unit {
    TransferContext.writeArguments(LONG to point, OBJECT to node)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_SET_BLEND_POINT_NODE, NIL)
  }

  /**
   * Returns the [godot.AnimationRootNode] referenced by the point at index [point].
   */
  public fun getBlendPointNode(point: Long): AnimationRootNode? {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_NODE, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as AnimationRootNode?
  }

  /**
   * Removes the point at index [point] from the blend space.
   */
  public fun removeBlendPoint(point: Long): Unit {
    TransferContext.writeArguments(LONG to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_REMOVE_BLEND_POINT, NIL)
  }

  /**
   * Returns the number of points in the blend space.
   */
  public fun getBlendPointCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_BLEND_POINT_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Creates a new triangle using three points [x], [y], and [z]. Triangles can overlap. You can insert the triangle at a specific index using the [atIndex] argument. If you use the default value for [atIndex], the point is inserted at the end of the blend points array.
   */
  public fun addTriangle(
    x: Long,
    y: Long,
    z: Long,
    atIndex: Long = -1
  ): Unit {
    TransferContext.writeArguments(LONG to x, LONG to y, LONG to z, LONG to atIndex)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_ADD_TRIANGLE, NIL)
  }

  /**
   * Returns the position of the point at index [point] in the triangle of index [triangle].
   */
  public fun getTrianglePoint(triangle: Long, point: Long): Long {
    TransferContext.writeArguments(LONG to triangle, LONG to point)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_TRIANGLE_POINT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Removes the triangle at index [triangle] from the blend space.
   */
  public fun removeTriangle(triangle: Long): Unit {
    TransferContext.writeArguments(LONG to triangle)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_REMOVE_TRIANGLE, NIL)
  }

  /**
   * Returns the number of triangles in the blend space.
   */
  public fun getTriangleCount(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_ANIMATIONNODEBLENDSPACE2D_GET_TRIANGLE_COUNT, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  public enum class BlendMode(
    id: Long
  ) {
    /**
     * The interpolation between animations is linear.
     */
    BLEND_MODE_INTERPOLATED(0),
    /**
     * The blend space plays the animation of the node the blending position is closest to. Useful for frame-by-frame 2D animations.
     */
    BLEND_MODE_DISCRETE(1),
    /**
     * Similar to [BLEND_MODE_DISCRETE], but starts the new animation at the last animation's playback position.
     */
    BLEND_MODE_DISCRETE_CARRY(2),
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
