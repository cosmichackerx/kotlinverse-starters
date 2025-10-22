/**
 * Kotlinverse Starter – Scope Functions: let, run, apply, also, with
 * Description: Shows side-by-side usage of scope functions.
 */
fun main() {
    val str: String? = "KotlinScope"

    // let
    str?.let {
        println("let: $it")
    }

    // run
    val runResult = str?.run {
        println("run context this: $this")
        "Result from run"
    }
    println("runResult: $runResult")

    // apply
    val sb = StringBuilder().apply {
        append("Hello ")
        append("Kotlin")
    }
    println("apply result: $sb")

    // also
    val list = mutableListOf(1, 2, 3).also {
        println("also before: $it")
        it.add(4)
    }
    println("also after: $list")

    // with
    with(sb) {
        println("with: ${this.toString()}")
    }
}
