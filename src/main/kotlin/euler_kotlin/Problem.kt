package euler_kotlin

import euler_kotlin.implementation.Implementation001
import euler_kotlin.model.Implementation
import euler_kotlin.model.Solution

enum class Problem(
  val title: String,
  val implementation: Implementation,
  val solution: Solution
) {
  Problem001("Multiples of 3 or 5", Implementation001, Solution("233168"));

  fun number(): Int = ordinal + 1
}
