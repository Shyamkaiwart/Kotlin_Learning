class Student(var name: String, var age: Int, var mark: Int){
    fun showDetail(){
        println("Student name is $name, age is $age and obtained mark is $mark")
    }
}

fun main() {
    val student1 = Student("Shyam",25,80)
    val student2 = Student("Ramu",30,90)
    student1.showDetail()
    student2.showDetail()
}