// An interface defines a set of functions or properties that a class can implement.//

interface Swimmer {
    fun swim()
}

interface Runner {
    fun run()
}

class Athlete : Swimmer, Runner {
    // What two functions should you write here?
    override fun swim() {println("This is a swim function")}
    override fun run() {println("This is a run function")}
}

fun main() {
    val athlete = Athlete()
    athlete.swim()
    athlete.run()
}