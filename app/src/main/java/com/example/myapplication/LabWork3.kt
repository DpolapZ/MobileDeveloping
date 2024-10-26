package com.example.myapplication

import kotlin.math.sqrt

fun main() {
    task1();

    println(getFullName("Дима", "Мазалов"));
    println(getFullName(null, "Мазалов"));

    task3();
    task4();
}

fun task1() {
    var variable: String? = null; //null

    println(variable);

    variable = ":)"; //Вывелось :)

    println(variable);
}

fun getFullName(firstName: String?, lastName: String?): String {
    return "${firstName ?: "Unknown"} ${lastName ?: "Unknown"}"
}

fun calculateSquareRoot(number: Double?): Double {
    return sqrt(number!!)
}

fun task3() {
    try {
        val result1 = calculateSquareRoot(2500.0)
        println("Квадратный корень из 2500: $result1")

        val result2 = calculateSquareRoot(null)
        println("Квадратный корень из null: $result2")
    } catch (e: NullPointerException) {
        println("Ошибка: передано значение null")
    }
}

fun task4() {
    val variable1 = getStringLength("Я строка B)")
    println("Длина строки: $variable1")

    val variable2 = getStringLength(123)
    println("Длина строки: $variable2")

    val variable3 = getStringLength(null)
    println("Длина строки: $variable3")
}

fun getStringLength(obj: Any?): Int {
    val str = obj as? String
    return str?.length ?: -1
}
