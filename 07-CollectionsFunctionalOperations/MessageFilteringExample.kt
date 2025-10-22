/**
 * Kotlinverse Starter – Collections & Functional Operations
 * Description: Demonstrates filtering, sorting, mapping collections.
 */
data class Message(val text: String, val read: Boolean, val timestamp: Long)

fun main() {
    val messages = listOf(
        Message("Hi", false, 1000L),
        Message("Hello", true, 2000L),
        Message("Hey you", false, 1500L)
    )

    val uiList = messages
        .filter { !it.read }
        .sortedByDescending { it.timestamp }
        .map { it.text.uppercase() }

    uiList.forEach { println(it) }
}
