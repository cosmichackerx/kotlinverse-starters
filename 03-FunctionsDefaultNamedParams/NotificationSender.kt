/**
 * Kotlinverse Starter – Functions (Default & Named Parameters)
 * Description: Demonstrates function default arguments and named arguments.
 */
fun sendNotification(title: String, message: String, priority: Int = 1) {
    println("Title: $title | Message: $message | Priority: $priority")
}

fun main() {
    sendNotification("Welcome", "Hello world!")                                    // uses default priority
    sendNotification(title = "Alert", message = "Check this", priority = 5)       // named arguments
}
