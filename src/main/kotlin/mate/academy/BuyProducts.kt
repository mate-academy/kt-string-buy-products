package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    return "${client} has to pay ${price * quantity} per $quantity products"
}

private const val PRICE = 30
private const val QUANTITY = 3
private const val CLIENT = "Mary"

fun main() {
    val client = CLIENT
    val price = PRICE
    val quantity = QUANTITY
    println(getTotalPriceMessage(client, price, quantity))
}
