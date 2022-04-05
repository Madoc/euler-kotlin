package euler_kotlin.implementation

import euler_kotlin.model.Implementation

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143?
 */
object Implementation003 : Implementation {
  override fun computeSolution(): String = largestPrimeFactor(600_851_475_143).toString()

  private fun largestPrimeFactor(n: Long): Long {
    for (f in 2..n / 2) if (n % f == 0L) return largestPrimeFactor(n / f)
    return n
  }
}