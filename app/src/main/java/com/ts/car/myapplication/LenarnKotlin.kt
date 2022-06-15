package com.ts.car.myapplication

import kotlin.math.max

fun main() {
    println("1111");

    var a = 10

    var b : Int = 10

    val c = 10

    // c = c* 10;

    a= a * b;

    println(b)
    println(a)
    println(c)

    println(methodName(a,b));
}

fun methodName(parm1 :Int, parm2: Int) : Int {
    return max(parm1, parm2);
}

fun largerNumber1(num1 : Int, num2 : Int) : Int = max(num1, num2);
fun largerNumber2(num1 : Int, num2 : Int) = max(num1, num2);


fun largerNumber3(num1: Int, num2: Int) : Int {
    var value = 0
    if (num1 > num2) {
        value = num1
    } else value = num2;
    return value
}

fun largerNumber4(num1: Int , num2: Int) : Int{
    val  value = if (num1 > num2) {
        num1
    } else num2
    return value
}

fun largerNumber5(num1: Int, num2: Int) : Int {
    return if (num1 > num2) num1  else num2
}

fun  largerNumber6(num1: Int, num2: Int) = if (num1 > num2) num1  else num2


fun getSore(name : String) = if (name == "Tom") {
    86
} else if (name == "Jim") {
    95
} else {
    100
}

fun getSore2(name : String) = when (name) {
    "Tom" -> 86
    "jam" -> 77
    "Lily" -> 100
    else -> 0
}

// is = instanceof
fun checkNumber(num : Number) {
    when (num) {
        is Int -> println("number is Int")
        is Double -> println("number is Double")
        else -> println("number not support")
    }
}

// Kotlin中判断字
//符串或对象是否相等可以直接使用==关键字, 而不用像Java那样调用equals()
fun



class LenarnKotlin {

}