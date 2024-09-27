import java.time.LocalDate
import java.time.Month
import java.util.*

fun main() {
    // ЗАДАНИЕ 1
    println("ЗАДАНИЕ 1")
    for (i in 1..10) {
        println(i)
    }

    // ЗАДАНИЕ 2
    println("ЗАДАНИЕ 2")
    for (i in 2..20 step 2) {
        println(i)
    }

    // ЗАДАНИЕ 3
    println("ЗАДАНИЕ 3")
    print("Введите число N: ")
    val n1 = readLine()!!.toInt()
    var sum = 0
    for (i in 1..n1) {
        sum += i
    }
    println("Сумма чисел от 1 до $n1: $sum")

    // ЗАДАНИЕ 4
    println("ЗАДАНИЕ 4")
    print("Введите число: ")
    val number = readLine()!!.toInt()
    var factorial = 1
    for (i in 1..number) {
        factorial *= i
    }
    println("Факториал $number: $factorial")

    // ЗАДАНИЕ 5
    println("ЗАДАНИЕ 5")
    print("Введите число: ")
    val num = readLine()!!.toInt()
    var isPrime = true
    if (num <= 1) {
        isPrime = false
    } else {
        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) {
                isPrime = false
                break
            }
        }
    }
    if (isPrime) {
        println("$num - простое число")
    } else {
        println("$num - не простое число")
    }

    // ЗАДАНИЕ 6
    println("ЗАДАНИЕ 6")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j}\t")
        }
        println()
    }

    // ЗАДАНИЕ 7
    println("ЗАДАНИЕ 7")
    print("Введите N: ")
    val nFib = readLine()!!.toInt()
    var a = 0
    var b = 1
    println("Первые $nFib чисел Фибоначчи:")
    for (i in 1..nFib) {
        println(a)
        val temp = a
        a = b
        b = temp + b
    }

    // ЗАДАНИЕ 8
    println("ЗАДАНИЕ 8")
    print("Введите первое число: ")
    val num1 = readLine()!!.toInt()
    print("Введите второе число: ")
    val num2 = readLine()!!.toInt()
    fun gcd(a: Int, b: Int): Int {
        if (b == 0) {
            return a
        }
        return gcd(b, a % b)
    }

    val nod = gcd(num1, num2)
    println("НОД $num1 и $num2: $nod")

    // ЗАДАНИЕ 9
    println("ЗАДАНИЕ 9")
    print("Введите строку: ")
    val str = readLine()!!
    println("Строка в обратном порядке: ${str.reversed()}")

    // ЗАДАНИЕ 10
    println("ЗАДАНИЕ 10")
    print("Введите число: ")
    val numberStr = readLine()!!
    var sumDigits = 0
    for (digit in numberStr) {
        sumDigits += digit.toString().toInt()
    }
    println("Сумма цифр $numberStr: $sumDigits")

    // ЗАДАНИЕ 11
    println("ЗАДАНИЕ 11")
    print("Введите первую строку: ")
    val str1 = readLine()!!.toLowerCase()
    print("Введите вторую строку: ")
    val str2 = readLine()!!.toLowerCase()
    if (str1.toCharArray().sortedArray().contentToString() == str2.toCharArray().sortedArray().contentToString()) {
        println("Строки - анаграммы")
    } else {
        println("Строки - не анаграммы")
    }

    // ЗАДАНИЕ 12
    println("ЗАДАНИЕ 12")
    print("Введите начальное число: ")
    val start = readLine()!!.toInt()
    print("Введите шаг: ")
    val step = readLine()!!.toInt()
    println("Числовая последовательность:")
    for (i in start..start + step * 9 step step) {
        println(i)
    }

    // ЗАДАНИЕ 13
    println("ЗАДАНИЕ 13")
    println("Таблица квадратов чисел от 1 до 20:")
    for (i in 1..20) {
        println("${i}\t${i * i}")
    }

    // ЗАДАНИЕ 14
    println("ЗАДАНИЕ 14")
    println("10 случайных чисел от 1 до 100:")
    for (i in 1..10) {
        println((1..100).random())
    }

    // ЗАДАНИЕ 15
    println("ЗАДАНИЕ 15")
    print("Введите строку: ")
    val string = readLine()!!.toLowerCase()
    if (string == string.reversed()) {
        println("Строка - палиндром")
    } else {
        println("Строка - не палиндром")
    }

    // ЗАДАНИЕ 16
    println("ЗАДАНИЕ 16")
    print("Введите N: ")
    val n2 = readLine()!!.toInt()
    var sigma = 0
    for (i in 1..n2) {
        sigma += i * i
    }
    println("Сумма квадратов чисел от 1 до $n2: $sigma")

    // ЗАДАНИЕ 17
    println("ЗАДАНИЕ 17")
    print("Введите строку: ")
    val inputStr = readLine()!!
    println("Символы строки по одному:")
    for (char in inputStr) {
        println(char)
    }

    // ЗАДАНИЕ 18
    println("ЗАДАНИЕ 18")
    print("Введите высоту лестницы: ")
    val height = readLine()!!.toInt()
    for (i in 1..height) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }

    // ЗАДАНИЕ 19
    println("ЗАДАНИЕ 19")
    val numbers1 = arrayOf(12, 54, 32, 87, 91, 23, 65)
    println("Исходный массив: ${numbers1.contentToString()}")
    for (i in 0 until numbers1.size - 1) {
        for (j in i + 1 until numbers1.size) {
            if (numbers1[i] > numbers1[j]) {
                val temp = numbers1[i]
                numbers1[i] = numbers1[j]
                numbers1[j] = temp
            }
        }
    }
    println("Отсортированный массив: ${numbers1.contentToString()}")

    // ЗАДАНИЕ 20
    println("ЗАДАНИЕ 20")
    print("Введите начало диапазона: ")
    val startRange = readLine()!!.toInt()
    print("Введите конец диапазона: ")
    val endRange = readLine()!!.toInt()
    println("Простые числа в диапазоне от $startRange до $endRange:")
    for (i in startRange..endRange) {
        var isPrime = true
        if (i <= 1) {
            isPrime = false
        } else {
            for (j in 2..Math.sqrt(i.toDouble()).toInt()) {
                if (i % j == 0) {
                    isPrime = false
                    break
                }
            }
        }
        if (isPrime) {
            println(i)
        }
    }
    // ЗАДАНИЕ 21
    println("ЗАДАНИЕ 21")
    print("Введите год: ")
    val year = readLine()!!.toInt()
    print("Введите месяц (число от 1 до 12): ")
    val month = readLine()!!.toInt()
    val monthEnum = Month.of(month)
    val startDate = LocalDate.of(year, monthEnum, 1)
    val endDate = startDate.withDayOfMonth(startDate.lengthOfMonth())

    // Используем цикл while для итерации по датам
    var currentDate = startDate
    while (currentDate <= endDate) {
        println(currentDate)
        currentDate = currentDate.plusDays(1)
    }

    // ЗАДАНИЕ 22
    println("ЗАДАНИЕ 22")
    val random = Random()
    val secretNumber = random.nextInt(100) + 1
    var attempts = 0
    println("Угадайте число от 1 до 100.")
    while (true) {
        print("Введите ваше предположение: ")
        val guess = readLine()!!.toInt()
        attempts++
        if (guess == secretNumber) {
            println("Вы угадали за $attempts попыток!")
            break
        } else if (guess < secretNumber) {
            println("Число больше.")
        } else {
            println("Число меньше.")
        }
    }

    // ЗАДАНИЕ 23
    println("ЗАДАНИЕ 23")
    while (true) {
        print("Введите первую цифру: ")
        val num1 = readLine()!!.toInt()
        print("Введите вторую цифру: ")
        val num2 = readLine()!!.toInt()
        print("Введите операцию (+ или *): ")
        val operation = readLine()!!
        if (operation == "+") {
            println("$num1 + $num2 = ${num1 + num2}")
        } else if (operation == "*") {
            println("$num1 * $num2 = ${num1 * num2}")
        } else if (operation == "стоп") {
            println("До свидания!")
            break
        } else {
            println("Неверная операция.")
        }
    }

    // ЗАДАНИЕ 24
    println("ЗАДАНИЕ 24")
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )
    println("Исходная матрица:")
    for (i in 0 until matrix.size) {
        for (j in 0 until matrix[i].size) {
            print("${matrix[i][j]}t")
        }
        println()
    }
    val transposedMatrix = Array(matrix[0].size) { IntArray(matrix.size) }
    for (i in 0 until matrix.size) {
        for (j in 0 until matrix[i].size) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }
    println("Транспонированная матрица:")
    for (i in 0 until transposedMatrix.size) {
        for (j in 0 until transposedMatrix[i].size) {
            print("${transposedMatrix[i][j]}t")
        }
        println()

    }
    // ЗАДАНИЕ 25
    println("ЗАДАНИЕ 25")
    println("Кубы чисел от 1 до 10:")
    for (i in 1..10) {
        println("${i}t${i * i * i}")
    }

    // ЗАДАНИЕ 26
    println("ЗАДАНИЕ 26")
    print("Введите N: ")
    val n = readLine()!!.toInt()
    var sumEven = 0
    var sumOdd = 0
    for (i in 1..n) {
        if (i % 2 == 0) {
            sumEven += i
        } else {
            sumOdd += i
        }
    }
    println("Сумма четных чисел от 1 до $n: $sumEven")
    println("Сумма нечетных чисел от 1 до $n: $sumOdd")

    // ЗАДАНИЕ 27
    println("ЗАДАНИЕ 27")
    print("Введите N: ")
    val nPyramid = readLine()!!.toInt()
    for (i in 1..nPyramid) {
        for (j in 1..nPyramid - i) {
            print("  ")
        }
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }

    // ЗАДАНИЕ 28
    println("ЗАДАНИЕ 28")
    print("Введите количество чисел: ")
    val nNumbers = readLine()!!.toInt()
    val numbers2 = Array(nNumbers) { 0 }
    println("Введите $nNumbers чисел:")
    for (i in 0 until nNumbers) {
        numbers2[i] = readLine()!!.toInt()
    }
    Arrays.sort(numbers2)
    println("Числа в порядке возрастания:")
    for (number in numbers2) {
        print("$number ")
    }
    println()

    // ЗАДАНИЕ 29
    println("ЗАДАНИЕ 29")
    print("Введите N: ")
    val nSeries = readLine()!!.toInt()
    var sumSeries = 0.0
    for (i in 1..nSeries) {
        sumSeries += 1.0 / i
    }
    println("Сумма ряда: $sumSeries")

    // ЗАДАНИЕ 30
    println("ЗАДАНИЕ 30")
    print("Введите целое число: ")
    val decimal = readLine()!!.toInt()
    var binary = ""
    var temp = decimal
    while (temp > 0) {
        binary = (temp % 2).toString() + binary
        temp /= 2
    }
    println("Двоичное представление: $binary")
}