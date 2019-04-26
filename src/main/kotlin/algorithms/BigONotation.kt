package algorithms

import utils.ArrayUtils
import utils.NumberUtils

/**
 * Test binary
 * O(logN)
 */
object Search {
    fun binarySearch(array: List<Int> = ArrayUtils.getRandIntArray(), searching: Int = NumberUtils.getRandInt()) {
        if (array.isEmpty()) return
        val middleIndex = (array.size / 2)
        when {
            array[middleIndex] == searching -> {
                println("Found!")
            }
            array[middleIndex] > searching -> {
                binarySearch(array.subList(0, middleIndex), searching)
            }
            array[middleIndex] < searching -> {
                binarySearch(array.subList(middleIndex, array.size), searching)
            }
        }
    }
}
