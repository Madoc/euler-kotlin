package euler_kotlin

fun main(): Unit = Problem.values().forEach(::checkProblem)

private fun checkProblem(problem: Problem) {
  reportChecking(problem)
  val startTimeMillis: Long = System.currentTimeMillis()
  val computedSolution: String = problem.implementation.computeSolution()
  val durationMillis: Long = System.currentTimeMillis() - startTimeMillis
  if (computedSolution == problem.solution.value) reportSuccess(durationMillis)
  else reportFailure(computedSolution, durationMillis)
}

private fun reportChecking(problem: Problem): Unit =
  print("Problem ${problem.number()}: ${problem.title} ")

private fun reportSuccess(durationMillis: Long): Unit = println("\u001B[32m✓\u001B[0m ($durationMillis ms)")

private fun reportFailure(wrongSolution: String, durationMillis: Long): Unit =
  println("\u001B[31m✗\u001B[0m ($durationMillis ms) Wrong computed solution ($wrongSolution)")
