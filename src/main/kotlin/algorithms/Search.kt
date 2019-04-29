package algorithms

import datastructures.BinaryTree
import datastructures.Tree
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

    fun binaryTreeSearch(node: BinaryTree.BinaryNode, value: Int) {
        when {
            value == node.value -> {
                println("$value found!")
            }
            value < node.value -> {
                node.left?.let { binaryTreeSearch(it, value) }
            }
            value > node.value -> {
                node.right?.let { binaryTreeSearch(it, value) }
            }
        }
    }
}
