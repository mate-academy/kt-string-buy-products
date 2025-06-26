package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val total = price * quantity
    val message = "$client has to pay \$$total per $quantity products"
    println("DEBUG: $message")
    return message
}
