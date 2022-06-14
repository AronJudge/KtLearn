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


class LenarnKotlin {

}