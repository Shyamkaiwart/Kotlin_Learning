fun multiply(name: String, age: Int){
    println("My name is $name, the age is $age")
}

fun multiply(name: String, age: Int, dep: String){
    println("My name is $name, the age is $age, the dep is $dep")
}

fun main() {
    multiply("Shyam",25)
    multiply("Rahul", 23, "Sceince")
}