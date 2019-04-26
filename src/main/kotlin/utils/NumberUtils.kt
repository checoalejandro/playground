package utils

import kotlin.random.Random

object NumberUtils {
    fun getRandInt() = Random.nextInt()
    fun getRandInt(start: Int, end: Int) = Random.nextInt(start, end)
}