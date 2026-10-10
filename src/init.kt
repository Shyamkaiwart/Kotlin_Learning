class Car(val brand: String, val model: String, val year: Int){
    init {
        println("A new car object is creatd")
    }
    fun showDetails(){
        println("$brand, $model, $year")
    }
}

fun main() {
    val car1 = Car("Toyota", "modelname", 2025)

    car1.showDetails()
}