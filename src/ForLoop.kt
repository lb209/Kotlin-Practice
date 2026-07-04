fun main() {

    println("===== 1 to 10 =====")

    for (i in 1..10) {
        println(i)
    }

    println()


    println("===== 10 to 1 =====")

    for (i in 10 downTo 1) {
        println(i)
    }

    println()


    println("===== Even Numbers =====")

    for (i in 2..20 step 2) {
        println(i)
    }

    println()


    println("===== Odd Numbers =====")

    for (i in 1..19 step 2) {
        println(i)
    }

    println()


    println("===== Table of 5 =====")

    for (i in 1..10) {
        println("5 x $i = ${5 * i}")
    }

    println()


    println("===== Sum =====")

    var sum = 0

    for (i in 1..10) {
        sum = sum + i
    }

    println("Sum = $sum")

    println()


    println("===== Stars =====")

    for (i in 1..5) {

        for (j in 1..i) {
            print("* ")
        }

        println()

    }

}