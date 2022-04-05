package euler_kotlin.implementation

import euler_kotlin.model.Implementation

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
object Implementation004 : Implementation {
  // TODO Should be optimized:
  // We should start with big numbers as `n1` and `n2`.
  // When we find the first palindrome, we store it as our current `best` and its factors as `bestF1` and `bestF2`.
  // Now when we have a new `n1` candidate, we know that `n2` must be at least `best / n1`.
  // So we can start iterating `n2` at that minimum.
  // This should be significantly faster. (Actually even if we don't start with big numbers.)

  override fun computeSolution(): String =
    (100..999).flatMap { n1 -> (n1..999).map { n1 * it } }.filter(::isPalindromic).maxOrNull().toString()

  private fun isPalindromic(n: Int): Boolean {
    val str = n.toString()
    return str == str.reversed()
  }
}
