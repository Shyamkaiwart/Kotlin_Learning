//class Student(var name: String, var age: Int, var mark: Int){
//    fun showDetail(){
//        println("Student name is $name, age is $age and obtained mark is $mark")
//    }
//}
//
//fun main() {
//    val student1 = Student("Shyam",25,80)
//    val student2 = Student("Ramu",30,90)
//    student1.showDetail()
//    student2.showDetail()
//}

//class book (val title: String, val page: Int ){
//    fun showDetails(){println("book name is :$title, and page is : $page")}
//
//
//}
//
//fun main() {
//    val show = book("Kotlin Learning",250)
//    show.showDetails()
//}


class Book (val a: Int, val b: Int ){
    init {
        println("The sum of a and is shows below:")
    }
    fun print() {
        val c = a+b
        println("Value of C is : $c")
    }

}

fun main() {
    val book1 = Book(100,250)
    val book2 = Book(50,70)
    println(book1.print())
    println(book2.print())
}