package com.ts.car.myapplication

class Student(val  son : String, val grade : Int, name: String, age: Int) : Person(name, age) , Study{

    init {
        println("son is " + son)
        println("grade is " + grade)
    }

    constructor(name : String, age: Int) : this("", 0, name , age)
    constructor() : this("", 0)

    override fun readBooks() {
        println(name + " is reading.")
    }

    override fun doHomework() {
        println(name + " is doing homework.")
    }
}

fun main () {
    val student1 = Student()
    val student2 = Student("Jack", 19)
    val student4 = Student("a123",5,"jack",19)

    doStudy(student2)

}

fun doStudy(study: Study) {
    study.readBooks()
    study.doHomework()
}