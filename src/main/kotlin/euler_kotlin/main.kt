package euler_kotlin

fun main() {
  for (problem in Problem.values()) {
    print("Problem ${problem.number()}: ${problem.title} ")
    val computedSolution: String = problem.implementation.computeSolution()
    if (computedSolution == problem.solution.value) println("\u001B[32m✓\u001B[0m")
    else println("\u001B[31m✗\u001B[0m Wrong computed solution ($computedSolution)")
  }
}
