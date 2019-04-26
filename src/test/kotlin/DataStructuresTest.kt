import algorithms.ListNode
import algorithms.Tree
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
        Tree().apply {

        }
    }
}