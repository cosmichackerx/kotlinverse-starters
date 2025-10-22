/**
 * Kotlinverse Starter – Generics & Reified Types
 * Description: Demonstrates generic class and inline reified function.
 */
data class User(val id: Int = 0, val name: String = "Unknown")

class Repository<T>(private val clazz: Class<T>) {
    fun fetch(): T {
        return clazz.getDeclaredConstructor().newInstance()
    }
}

inline fun <reified T> create(): T {
    return T::class.java.getDeclaredConstructor().newInstance()
}

fun main() {
    val userRepo = Repository(User::class.java)
    println(userRepo.fetch())

    val newUser: User = create()
    println(newUser)
}
