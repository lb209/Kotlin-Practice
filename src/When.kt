fun main() {

    println("===== Day Example =====")

    var day = 3

    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid Day")
    }

    println()


    println("===== Grade Example =====")

    var marks = 'B'

    when (marks) {
        'A' -> println("Excellent")
        'B' -> println("Good")
        'C' -> println("Average")
        'D' -> println("Poor")
        else -> println("Fail")
    }

    println()


    println("===== Month Example =====")

    var month = 8

    when (month) {
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> println("Invalid Month")
    }

    println()


    println("===== Calculator =====")

    var num1 = 10
    var num2 = 5
    var choice = 1

    when (choice) {

        1 -> println("Addition = ${num1 + num2}")

        2 -> println("Subtraction = ${num1 - num2}")

        3 -> println("Multiplication = ${num1 * num2}")

        4 -> println("Division = ${num1 / num2}")

        else -> println("Wrong Choice")

    }

}