fun main() {

    println("===== Simple if =====")

    var age = 20

    if (age >= 18) {
        println("You can vote")
    }

    println()


    println("===== if else =====")

    var marks = 45

    if (marks >= 50) {
        println("Pass")
    } else {
        println("Fail")
    }

    println()


    println("===== else if =====")

    var number = 0

    if (number > 0) {
        println("Positive Number")
    } else if (number < 0) {
        println("Negative Number")
    } else {
        println("Zero")
    }

    println()


    println("===== Even Odd =====")

    var num = 15

    if (num % 2 == 0) {
        println("Even Number")
    } else {
        println("Odd Number")
    }

    println()


    println("===== Grade System =====")

    var grade = 82

    if (grade >= 90) {
        println("Grade A+")
    } else if (grade >= 80) {
        println("Grade A")
    } else if (grade >= 70) {
        println("Grade B")
    } else if (grade >= 60) {
        println("Grade C")
    } else {
        println("Fail")
    }

    println()


    println("===== Driving License =====")

    var userAge = 22
    var hasLicense = true

    if (userAge >= 18 && hasLicense) {
        println("Drive Allowed")
    } else {
        println("Drive Not Allowed")
    }

}