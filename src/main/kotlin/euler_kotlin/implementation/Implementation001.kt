package euler_kotlin.implementation

import euler_kotlin.model.Implementation

object Implementation001 : Implementation {
  override fun computeSolution(): String = (1..999).filter { it % 3 == 0 || it % 5 == 0 }.sum().toString()
}
