/**
 * Kotlinverse Starter – Scope Functions Extended Example
 * Description: Initializes a profile object and modifies it.
 */
data class Profile(var name: String, var age: Int)

fun main() {
    val profile: Profile? = Profile("Charlie", 19)

    // let
    profile?.let {
        println("Welcome ${it.name}")
    }

    // apply
    val newProfile = Profile("", 0).apply {
        name = "Dana"
        age = 21
    }
    println(newProfile)

    // also
    val sideEffectProfile = newProfile.also {
        println("Debug: $it")
    }
    sideEffectProfile.name = "Dina"

    // run
    val result = sideEffectProfile.run {
        age += 1
        "Age incremented to $age"
    }
    println(result)

    // with
    with(sideEffectProfile) {
        println("With: Name is $name, Age is $age")
    }
}
