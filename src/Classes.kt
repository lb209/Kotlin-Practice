// Classes.kt

class Student(var name: String, var age: Int) {

    fun display() {
        println("Student Name : $name")
        println("Student Age  : $age")
    }
}

class Car(var company: String, var model: String) {

    fun showCar() {
        println("Company : $company")
        println("Model   : $model")
    }
}

class Employee(var name: String, var salary: Int) {

    fun employeeInfo() {
        println("Employee Name : $name")
        println("Salary : $salary")
    }
}

class BankAccount(var owner: String, var balance: Int) {

    fun showBalance() {
        println("Account Holder : $owner")
        println("Balance : $balance")
    }

    fun deposit(amount: Int) {
        balance = balance + amount
        println("Deposit Successful")
        println("New Balance = $balance")
    }

    fun withdraw(amount: Int) {

        if (amount <= balance) {

            balance = balance - amount

            println("Withdraw Successful")
            println("Remaining Balance = $balance")

        } else {

            println("Insufficient Balance")

        }

    }

}

fun main() {

    println("===== Student Object =====")

    var s1 = Student("Ali",20)

    s1.display()

    println()

    println("===== Second Student =====")

    var s2 = Student("Hussain",22)

    s2.display()

    println()

    println("===== Car Object =====")

    var car = Car("Toyota","Corolla")

    car.showCar()

    println()

    println("===== Employee Object =====")

    var emp = Employee("Ahmed",50000)

    emp.employeeInfo()

    println()

    println("===== Bank Account =====")

    var account = BankAccount("Hussain",10000)

    account.showBalance()

    println()

    account.deposit(5000)

    println()

    account.withdraw(3000)

    println()

    account.withdraw(20000)

}