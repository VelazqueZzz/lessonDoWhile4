//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import kotlin.random.Random

fun main() {
    val secret = Random.nextInt(1, 10)   // случайное число от 1 до 9
    val maxAttempts = 5
    var attempts = 0

    println("Угадайте число от 1 до 9. У вас $maxAttempts попыток.")

    while (attempts < maxAttempts) {
        print("Попытка ${attempts + 1}: ")
        val guess = readln().toInt()
        attempts++

        if (guess == secret) {
            println("Это была великолепная игра!")
            break   // выходим из программы
        }

        val remaining = maxAttempts - attempts
        if (remaining > 0) {
            println("Неверно. Осталось попыток: $remaining")
        }
    }

    println("Было загадано число $secret")
}