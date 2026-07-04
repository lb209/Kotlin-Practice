fun main() {

    println("===== String Array =====")

    var names = arrayOf("Ali", "Ahmed", "Hassan", "Hussain")

    println(names[0])
    println(names[1])
    println(names[2])
    println(names[3])

    println()


    println("===== Update Array =====")

    names[2] = "Usman"

    println(names[0])
    println(names[1])
    println(names[2])
    println(names[3])

    println()


    println("===== Loop Array =====")

    for (i in names) {
        println(i)
    }

    println()


    println("===== Integer Array =====")

    var marks = arrayOf(70, 80, 90, 95, 88)

    for (i in marks) {
        println(i)
    }

    println()


    println("===== Sum of Array =====")

    var sum = 0

    for (i in marks) {

        sum = sum + i

    }

    println("Total Marks = $sum")

    println()


    println("===== Search Value =====")

    var find = 90
    var found = false

    for (i in marks) {

        if (i == find) {

            found = true

        }

    }

    if (found) {
        println("Value Found")
    } else {
        println("Value Not Found")
    }

    println()


    println("===== Maximum =====")

    var max = marks[0]

    for (i in marks) {

        if (i > max) {

            max = i

        }

    }

    println("Maximum = $max")

    println()


    println("===== Minimum =====")

    var min = marks[0]

    for (i in marks) {

        if (i < min) {

            min = i

        }

    }

    println("Minimum = $min")

}