package com.example.myapplication

import kotlin.random.Random

fun main() {

}

fun task1(number: Int): Int {
    when {
        number < 0 -> return 0
        else -> return number * 2;
    }
}

val task2: (Int) -> Boolean = { number -> number % 2 == 0 }

fun outPutArray(array: Array<Int>) {
    for(element in array) {
        print(" $array");
    }
}

fun IntArray.filterAndMap(filter: (Int) -> Boolean, map: (Int) -> Int): Array<Int> {
    return this.filter(filter).map(map).toTypedArray()
}

fun task3() {
    print("Введите размер массива N: ")
    val n = readLine()?.toIntOrNull()

    val array = IntArray(n ?: 0)

    if (n != null && n > 0) {
        for (i in 0 until n) {
            array[i] = Random.nextInt(-100, 501);
        }
    }

    val arrayTask1 = array.map(::task1).toTypedArray();

    outPutArray(arrayTask1);

    val arrayTask2 = array.filter(task2).toTypedArray();

    outPutArray(arrayTask2);

    val task: (Int) -> Int = { it * 2 }

    val result = array.filterAndMap(task2, task);

    outPutArray(result);
}

//Функция filterAndMap нарушает принцип Single Responsibility Principle (SRP),
// так как она выполняет две задачи: фильтрацию и преобразование элементов массива.
// В идеале, каждая функция должна иметь одну ответственность. В данном случае,
// функция filterAndMap берет на себя две ответственности,
// что может затруднить ее тестирование и поддержку.

///Задание 5

// (Int, Int, String) -> Unit (1)

// () -> String (2)

// (() -> Unit) -> Unit (3)