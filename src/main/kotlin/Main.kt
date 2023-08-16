import kotlin.system.exitProcess

fun main() {

    do {
        calculator()
        println("Would you like to calculate one more time? Press 1 if yes, 2 if no")
        val answer: Int = readln().toInt()
    } while (answer== 1)

    exitProcess(0)
}

fun calculator() {

    println("Please enter '+', '-', '*', '/' to add, subtract, multiply or divide accordingly")
    val operator: String = readln()
    println("Please enter two integer numbers to calculate")
    val number1 = readln().toDouble()
    val number2 = readln().toDouble()
    var result : Double? = null

    when(operator){
        '+'.toString() -> result = number1 + number2
        '-'.toString() -> result = number1 - number2
        '*'.toString() -> result = number1 * number2
        '/'.toString() -> result = number1 / number2
        else -> println("Invalid operator")
    }

    println("Result: $result")
}