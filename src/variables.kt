//How to store data in variables
//var:The value can be changed after assignment.
//val:The value cannot be changed after assignment.
fun vr() {
    //The value can be changed after assignment.
    var nam = "Ali"
    nam = "Sultan"

    println("value is change: $nam")
}
fun vl() {
    //The value cannot be changed after assignment.
    var na = "Ali"
    na = "Sultan"

    println("value is not change: $na")
}

fun main() {
    var name = "M Hussain Shahzad"
    var age = 20
    var city = "Muridwala"
    var program = "BSSE"

    println("Name = $name")
    println("Age = $age")
    println("City = $city")
    println("Program = $program")

    vr()
    vl()
}