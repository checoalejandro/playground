package utils

object ArrayUtils {
    fun getRandIntArray(size: Int = 100) : List<Int> {
       return (0 until size).map { NumberUtils.getRandInt(0, 1000) }
    }
    fun getRandIntSortedArray(size: Int = 100): List<Int> {
        return getRandIntArray(size).sorted()
    }
}