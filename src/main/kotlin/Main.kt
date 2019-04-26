import algorithms.General
import algorithms.General.permutation
import algorithms.Search.binarySearch
import utils.ArrayUtils
import utils.TimeLog

fun main(args: Array<String>) {
    // Binary search
//    val binaryLog = TimeLog("Binary #1")
//    val array = listOf(3,6,9,11,12,16,21,22,23,24,29,33,40,48,49)
//    val toFind = 22
//    binarySearch(array, toFind)
//    binaryLog.end()

    // General O(ab)
//    var arrayA = ArrayUtils.getRandIntArray()
//    var arrayB = ArrayUtils.getRandIntArray()
//    General.printUnorderedPairs(arrayA, arrayB)

    val word = "International"
    permutation(word, "")
}