package mate.academy

private const val DEFAULT_PRICE = 30
private const val DEFAULT_QUANTITY = 3

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val cost = price * quantity
    return "$client has to pay \$$cost per $quantity products"
}

fun main() {
    val clientName = "Mary"
    val price = DEFAULT_PRICE
    val quantity = DEFAULT_QUANTITY
    println(getTotalPriceMessage(clientName, price, quantity))
}
