package euler_kotlin.implementation

import euler_kotlin.model.Implementation

object Implementation002 : Implementation {
  override fun computeSolution(): String = fib().filter { it % 2 == 0 }.takeWhile { it <= 4_000_000 }.sum().toString()

  /** @return Infinite sequence of Fibonacchi numbers. */
  private fun fib(): Sequence<Int> = sequence {
    var (a,b) = Pair(0,1)
    while (true) {
      yield(b)
      val newA = b
      b += a
      a = newA
    }
  }
}
