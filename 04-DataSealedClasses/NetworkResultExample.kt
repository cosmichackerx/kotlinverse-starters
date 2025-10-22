/**
 * Kotlinverse Starter – Data & Sealed Classes
 * Description: Demonstrates data classes and sealed classes for modeling state.
 */
data class User(val id: Int, val name: String)

sealed class RequestState {
    object Loading : RequestState()
    data class Success(val user: User) : RequestState()
    data class Error(val exception: Throwable) : RequestState()
}

fun handle(state: RequestState) {
    when (state) {
        is RequestState.Loading -> println("Loading…")
        is RequestState.Success -> println("Success: ${state.user}")
        is RequestState.Error -> println("Error: ${state.exception}")
    }
}

fun main() {
    handle(RequestState.Loading)
    handle(RequestState.Success(User(1, "Bob")))
    handle(RequestState.Error(Exception("Failed")))
}
