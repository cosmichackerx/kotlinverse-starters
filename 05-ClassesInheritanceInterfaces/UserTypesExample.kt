/**
 * Kotlinverse Starter – Classes, Inheritance & Interfaces
 * Description: Demonstrates interface, base class, subclass and polymorphism.
 */
interface UserAction {
    fun accessLevel(): Int
}

open class BaseUser(val name: String) : UserAction {
    override fun accessLevel() = 1
}

class AdminUser(name: String) : BaseUser(name) {
    override fun accessLevel() = 10
}

fun main() {
    val guest = BaseUser("Guest")
    val admin = AdminUser("Admin")
    println("${guest.name} access: ${guest.accessLevel()}")
    println("${admin.name} access: ${admin.accessLevel()}")
}
