/**
 * Kotlinverse Starter – Coroutines & Flow
 * Description: Demonstrates a simple flow of user data fetched asynchronously.
 */
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

data class UserData(val id: Int, val name: String)

fun fetchUserFlow(): Flow<UserData> = flow {
    emit(UserData(1, "Alice"))
    delay(1000)
    emit(UserData(2, "Bob"))
}

fun main() = runBlocking {
    fetchUserFlow().collect { user ->
        println("Got user: ${user.name}")
    }
}
