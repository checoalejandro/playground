package algorithms

object General {
    /**
     * Two loops is O(ab), not O(N^2)
     */
    fun printUnorderedPairs(arrayA: List<Int>, arrayB: List<Int>) {
        arrayA.forEach { itA ->
            arrayB.forEach { itB ->
                /* O(1) work */
                if (itA < itB) {
                    println("$itA,$itB")
                }
            }
        }
    }

    fun permutation(str: String, prefix: String) {
        if (str.isEmpty()) {
            println(prefix)
        } else {
            (0 until str.length).forEach { i ->
                val rem = str.substring(0, i) + str.substring(i + 1)
                permutation(rem, prefix + str.toCharArray()[i])
            }
        }
    }
}