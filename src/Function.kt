// Functions.kt

fun sayHello() {
    println("Hello Kotlin")
}

fun printName(name: String) {
    println("Name : $name")
}

fun add(num1: Int, num2: Int) {
    println("Addition = ${num1 + num2}")
}

fun subtract(num1: Int, num2: Int) {
    println("Subtraction = ${num1 - num2}")
}

fun multiply(num1: Int, num2: Int) {
    println("Multiplication = ${num1 * num2}")
}

fun divide(num1: Int, num2: Int) {
    println("Division = ${num1 / num2}")
}

fun square(number: Int): Int {
    return number * number
}

fun cube(number: Int): Int {
    return number * number * number
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun findMax(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun main() {

    println("===== Function Without Parameter =====")
    sayHello()

    println()

    println("===== Function With Parameter =====")
    printName("Hussain")

    println()

    println("===== Arithmetic Functions =====")
    add(10, 20)
    subtract(30, 10)
    multiply(5, 6)
    divide(20, 5)

    println()

    println("===== Return Function =====")
    var result = square(5)
    println("Square = $result")

    println()

    var answer = cube(3)
    println("Cube = $answer")

    println()

    println("===== Boolean Function =====")

    if (isEven(8)) {
        println("Even Number")
    } else {
        println("Odd Number")
    }

    println()

    println("===== Maximum Number =====")

    var max = findMax(50, 90)
    println("Maximum = $max")
}