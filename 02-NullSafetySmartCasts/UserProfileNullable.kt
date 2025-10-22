/**
 * Kotlinverse Starter – Null Safety & Smart Casts
 * Description: Demonstrates nullable types, safe calls, Elvis operator, and smart casting.
 */
fun main() {
    data class User(val name: String, val photoUrl: String?)

    fun showProfile(user: User?) {
        user?.let {
            println("Hello ${it.name}, photoUrl: ${it.photoUrl ?: "No photo"}")
        } ?: run {
            println("No user found")
        }
    }

    fun parse(obj: Any) {
        if (obj is User) {
            println("User name: ${obj.name}")  // smart cast to User
        } else {
            println("Not a User")
        }
    }

    val user1: User? = User("Alice", null)
    val user2: User? = null
    showProfile(user1)
    showProfile(user2)

    parse(user1 as Any)
    parse("Just a String")
}
