//class Car (
//    var brand: String = "Toyota",
//    var model: String = "Innova",
//    var year: Int = 2024
//
//)
//
//fun main() {
//    var Car1 = Car()
//    println(Car1.brand)
//    println(Car1.model)
//    println(Car1.year)
//}

//class Car {
//    var brand: String = "Toyota"
//    var model: String = "Innova"
//    var year: Int = 2024
//    fun drive(){
//        println("I am Driving")
//    }
//}
//
//fun main() {
//    val Car1 = Car()
//    println(Car1.brand)
//    println(Car1.model)
//    println(Car1.year)
//    Car1.drive()
//}

class Car {
    var brand: String = "Toyota"
    var model: String = "Innova"
    var year: Int = 2024
    fun showDetails(){
        println("Brand is $brand")
        println("Model is $model")
        println("Year is $year")
    }
}

fun main() {
    val car1 = Car()
    car1.showDetails()
}