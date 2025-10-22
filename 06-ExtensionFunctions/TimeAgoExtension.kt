/**
 * Kotlinverse Starter – Extension Functions
 * Description: Demonstrates extension function to convert timestamp to “time ago”.
 */
fun Long.toTimeAgo(): String {
    val minutes = this / 60000
    return when {
        minutes > 60 -> "${minutes / 60} hour(s) ago"
        minutes > 0 -> "$minutes minute(s) ago"
        else -> "just now"
    }
}

fun main() {
    val timestamp = System.currentTimeMillis() - 120_000L // 2 minutes ago
    println(timestamp.toTimeAgo())
}
