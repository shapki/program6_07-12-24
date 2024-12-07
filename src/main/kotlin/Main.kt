/*Для заданного массива nums размера n вернуть элемент большинства. Элемент большинства — это элемент, который появляется больше [n / 2] раз.
Вы можете предположить, что элемент большинства всегда существует в массиве.*/

import kotlin.system.measureTimeMillis
fun majorElement(nums: IntArray): Int {
    var count = 0
    var element = 0

    for (num in nums) {
        if (count == 0)
            element = num
        count += if (num == element) 1 else -1
    }

    return element
}

fun readInt(): IntArray {
    return readLine()?.split(Regex("[,\\s]+"))?.map { it.toInt() }?.toIntArray() ?: intArrayOf()
}

fun main() {
    print("| Массив: ")
    val nums = readInt()
    testMajorElement(nums)
}

fun testMajorElement(nums: IntArray) {
    val startTime = System.currentTimeMillis()
    val result = majorElement(nums)
    val endTime = System.currentTimeMillis()
    val time = endTime - startTime
    println("Вывод: $result, Время: $time мс")
}