//open class Animal{
//    open fun fly(){
//    println("This is Animal Class function")
//    }
//}
//class Sound : Animal(){
//    override fun fly(){println("This is Sound's overriden class")}
//    }
//
//fun main() {
//    val obj = Sound()
//    obj.fly()
//}


//open class Vehicle{
//    open fun start(){
//        println("Vehicle is starting")
//    }
//}
//
//class Car1 : Vehicle(){
//    override fun start(){println("Car engine is Starting")}
//}
//
//fun main() {
//    val car=Car1()
//    car.start()
//}

open class Animal{
    open fun sound(){
        println("Animal makes sound")
    }
}
class Dog : Animal(){
    override fun sound() {
        println("Dog barks")
    }
}
class Cat : Animal(){
    override fun sound() {
        println("Cat meaos")
    }
}

fun main() {
    val dog = Dog()
    val cat = Cat()
    dog.sound()
    cat.sound()
}