package mate.academy

private const val DEFAULT_PRISE = 30
private const val DEFAULT_QUANTITY = 3;

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val totalCost = price * quantity
    return "$client has to pay \$$totalCost per $quantity products"
}
fun main() {
    val clientName = "Mary"
    val price = DEFAULT_PRISE
    val quantity = DEFAULT_QUANTITY
    print(getTotalPriceMessage(clientName, price, quantity))
}
