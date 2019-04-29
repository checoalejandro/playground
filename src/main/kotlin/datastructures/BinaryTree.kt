package datastructures

import algorithms.Search

class BinaryTree {

    var head: BinaryNode? = null

    fun clear() {
    }

    fun add(value: Int) {
        val newNode = BinaryNode(value)
        if (head == null) {
            head = newNode
        } else {
            addNode(newNode, head!!)
        }
    }

    private fun addNode(newNode: BinaryNode, current: BinaryNode) {
        when {
            newNode.value == current.value -> {
                println("${newNode.value} already exists!")
            }
            newNode.value > current.value -> {
                if (current.right == null) {
                    current.right = newNode
                } else {
                    addNode(newNode, current.right!!)
                }
            }
            newNode.value < current.value -> {
                if (current.left == null) {
                    current.left = newNode
                } else {
                    addNode(newNode, current.left!!)
                }
            }
        }
    }

    fun find(value: Int) = head?.let { Search.binaryTreeSearch(it, value) }

    class BinaryNode(var value: Int = -1) {
        var right: BinaryNode? = null
        var left: BinaryNode? = null
    }
}