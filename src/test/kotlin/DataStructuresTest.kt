import datastructures.BinaryTree
import datastructures.ListNode
import datastructures.Tree
import org.junit.Test

class DataStructuresTest {

    @Test
    fun linkedList() {
        ListNode().apply {
            add(10)
            add(11)
            add(4)
            add(7)
            add(2)
            add(8)
            add(13)
            add(4)
            add(1)
            add(9)
            print()
            clear()
            print()
        }
    }

    @Test
    fun tree() {
        val tree = Tree()

    }

    @Test
    fun binaryTree() {
        val binaryTree = BinaryTree()
        binaryTree.apply {
            add(10)
            add(40)
            add(5)
            add(1)
            add(12)
            add(32)
            add(21)
            add(22)
            add(23)
            add(41)
            add(46)
            add(3)
            add(15)
            add(29)
            add(6)
            add(9)
        }
        binaryTree.find(22)
    }
}