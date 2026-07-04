fun main() {

    println("===== Arithmetic Operators =====")

    var num1 = 20
    var num2 = 10

    println("Number 1 = $num1")
    println("Number 2 = $num2")

    println("Addition = ${num1 + num2}")
    println("Subtraction = ${num1 - num2}")
    println("Multiplication = ${num1 * num2}")
    println("Division = ${num1 / num2}")
    println("Modulus = ${num1 % num2}")

    println("\n===== Assignment Operators =====")

    var number = 10

    println("Original Value = $number")

    number += 5
    println("After += 5 : $number")

    number -= 3
    println("After -= 3 : $number")

    number *= 2
    println("After *= 2 : $number")

    number /= 4
    println("After /= 4 : $number")

    number %= 2
    println("After %= 2 : $number")


    println("\n===== Comparison Operators =====")

    var a = 15
    var b = 20

    println("a == b : ${a == b}")
    println("a != b : ${a != b}")
    println("a > b  : ${a > b}")
    println("a < b  : ${a < b}")
    println("a >= b : ${a >= b}")
    println("a <= b : ${a <= b}")


    println("\n===== Logical Operators =====")

    var age = 22
    var hasLicense = true

    println("age >= 18 && hasLicense = ${age >= 18 && hasLicense}")
    println("age >= 18 || hasLicense = ${age >= 18 || hasLicense}")
    println("!hasLicense = ${!hasLicense}")


    println("\n===== Increment / Decrement =====")

    var count = 5

    println("Original = $count")

    count++
    println("After ++ = $count")

    count--
    println("After -- = $count")


    println("\n===== Unary Operators =====")

    var x = 10

    println("+x = ${+x}")
    println("-x = ${-x}")


    println("\n===== String Interpolation =====")

    var name = "Hussain"
    var marks = 85

    println("Student Name = $name")
    println("Marks = $marks")
    println("Marks + Bonus = ${marks + 5}")


    println("\n===== Even or Odd Example =====")

    var number2 = 17

    println("Number = $number2")

    if (number2 % 2 == 0) {
        println("Even Number")
    } else {
        println("Odd Number")
    }
}