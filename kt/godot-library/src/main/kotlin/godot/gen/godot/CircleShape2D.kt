// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TransferContext
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import kotlin.Double
import kotlin.Suppress
import kotlin.Unit

/**
 * Circular shape resource for 2D physics.
 *
 * 2D circular shape to be added as a *direct* child of a [godot.PhysicsBody2D] or [godot.Area2D] using a [godot.CollisionShape2D] node. This shape is useful for modeling balls or small characters and its collision detection with everything else is very fast.
 *
 * **Performance:** Being a primitive collision shape, [godot.CircleShape2D] is the fastest collision shape to check collisions against, as it only requires a distance check with the shape's origin.
 */
@GodotBaseType
public open class CircleShape2D : Shape2D() {
  /**
   * The circle's radius.
   */
  public var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CIRCLESHAPE2D_GET_RADIUS, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_CIRCLESHAPE2D_SET_RADIUS, NIL)
    }

  public override fun __new(): Unit {
    callConstructor(ENGINECLASS_CIRCLESHAPE2D)
  }

  public companion object
}
