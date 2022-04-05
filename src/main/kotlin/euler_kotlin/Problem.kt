package euler_kotlin

import euler_kotlin.implementation.Implementation001
import euler_kotlin.implementation.Implementation002
import euler_kotlin.implementation.Implementation003
import euler_kotlin.model.Implementation
import euler_kotlin.model.Solution

enum class Problem(
  val title: String,
  val implementation: Implementation,
  val solution: Solution
) {
  Problem001("Multiples of 3 or 5", Implementation001, Solution("233168")),
  Problem002("Even Fibonacci numbers", Implementation002, Solution("4613732")),
  Problem003("Largest prime factor", Implementation003, Solution("6857")),
  ;

  fun number(): Int = ordinal + 1
}
