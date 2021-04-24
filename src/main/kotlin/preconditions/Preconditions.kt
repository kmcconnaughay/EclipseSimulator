package preconditions

fun checkArgument(condition: Boolean, message: String? = null) {
    if (condition) {
        return
    }

    if (message != null) {
        throw IllegalArgumentException(message)
    } else {
        throw IllegalArgumentException()
    }
}
