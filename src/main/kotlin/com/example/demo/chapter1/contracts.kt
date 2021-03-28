import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@ExperimentalContracts
fun main() {
    val s: String? = "foo"
    if (s.isNotNull()) {
        println(s.length)
    }
}

@ExperimentalContracts
fun String?.isNotNull(): Boolean {
    contract {
        returns(true) implies (this@isNotNull != null)
    }
    return this@isNotNull != null && this@isNotNull.isNotBlank()
}