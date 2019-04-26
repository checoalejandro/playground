package algorithms

class ListNode {
    var head = Node()
    var count = 0

    fun clear() {
        head.node = null
        count = 0
    }

    fun add(value: Int) {
        val newNode = Node()
        newNode.value = value
        var current: Node? = head
        while (current?.node != null) {
            current = current.node
        }
        current?.node = newNode
        count++
    }

    fun print() {
        println("Head -> ")
        var current = head.node
        while (current?.node != null) {
            print("${current.value} -> ")
            current = current.node
        }
        current?.let { print("${current.value} -> ") }
        print(" Tail")
        println()
    }
}

class Tree {
    var root = TreeNode()

    class TreeNode {
        var value: Int = 0
        var nodes = mutableListOf<TreeNode>()

        fun add(node: TreeNode) {
            nodes.add(node)
        }
    }
}

class Node {
    var value: Int = 0
    var node: Node? = null
}