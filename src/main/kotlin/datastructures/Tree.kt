package datastructures

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