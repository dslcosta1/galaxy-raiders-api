package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(
  initialPosition: Point2D,
  initialVelocity: Vector2D,
  radius: Double,
  mass: Double,
  time: Int
) :
  SpaceObject("Explosion", '#', initialPosition, initialVelocity, radius, mass) {
  var time: Int = time

  fun updateTime() {
    time = time - 1
  }

  fun isTrigged(): Boolean {
    return time > 0
  }
}
