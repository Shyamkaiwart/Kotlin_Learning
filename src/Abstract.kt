abstract class Animal {
    abstract fun sound()
}

class Bhais : Animal() {
    override fun sound(){
        println("Bhais Sound Mooos")
    }
}

class Snake(): Animal() {
    override fun sound(){
        println("Snake Sound Shshhhhh")
    }
}

fun main() {
    val bhais = Bhais()
    val snake = Snake()
    bhais.sound()
    snake.sound()
}
