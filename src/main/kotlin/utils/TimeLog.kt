package utils

class TimeLog(var label: String = "") {
    var instance = System.currentTimeMillis()

    fun start() {
        instance = System.currentTimeMillis()
    }

    fun end() {
        val end = System.currentTimeMillis()
        val diff = end - instance
        println("Checkpoint $label: $diff ms taken")
    }
    companion object {
        var instance = TimeLog()
        init {
            instance.label = "Global"
        }
    }
}