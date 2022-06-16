package com.ts.car.myapplication

class List {

}

fun main () {


    val lsit = listOf("apple", "banna", "orange", "pear", "Grape")

    for (fruit in lsit) {
        println(fruit)
    }

    val list = mutableListOf("apple", "banna", "orange", "pear", "Grape")
    list.add("watermelon")
    for (fruit in lsit) {
        println(fruit)
    }

    val set = setOf("apple", "banna", "orange", "pear", "Grape","apple")


    val map = HashMap<String, Int>()
    map.put("Apple", 1)
    map.put("Apple", 1)
    map.put("Apple", 1)
    map.put("Apple", 1)

    map["Apple"] = 2

    val number = map["Apple"]
}