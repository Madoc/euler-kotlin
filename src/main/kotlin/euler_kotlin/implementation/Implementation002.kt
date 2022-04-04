package euler_kotlin.implementation

import euler_kotlin.model.Implementation

/*
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the
first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the
even-valued terms.
 */
object Implementation002 : Implementation {
  override fun computeSolution(): String = fib().filter { it % 2 == 0 }.takeWhile { it <= 4_000_000 }.sum().toString()

  /** @return Infinite sequence of Fibonacchi numbers. */
  private fun fib(): Sequence<Int> = sequence {
    var (a, b) = Pair(0, 1)
    while (true) {
      yield(b)
      a = b.also { b += a }
    }
  }
}
