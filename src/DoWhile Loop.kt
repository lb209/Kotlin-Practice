fun main() {

    println("===== Example 1 =====")

    var i = 1

    do {

        println(i)

        i++

    } while (i <= 5)

    println()


    println("===== Example 2 =====")

    var number = 10

    do {

        println(number)

        number--

    } while (number >= 1)

    println()


    println("===== Example 3 =====")

    var even = 2

    do {

        println(even)

        even += 2

    } while (even <= 20)

    println()


    println("===== Example 4 =====")

    var table = 1

    do {

        println("9 x $table = ${9 * table}")

        table++

    } while (table <= 10)

}