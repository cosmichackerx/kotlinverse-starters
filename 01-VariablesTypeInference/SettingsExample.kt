/**
 * Kotlinverse Starter – Variables & Type Inference
 * Description: Demonstrates val/var usage and type inference in Kotlin.
 */
fun main() {
    data class Settings(var darkMode: Boolean = false, var pushNotifications: Boolean = true)

    val settings = Settings()
    println("Dark mode: ${settings.darkMode}, Notifications: ${settings.pushNotifications}")

    settings.darkMode = true
    settings.pushNotifications = false
    println("Updated – Dark mode: ${settings.darkMode}, Notifications: ${settings.pushNotifications}")
}
