package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val totalCost = price * quantity

    return "$client has to pay $$totalCost per $quantity products"
}

@Suppress("MagicNumber")
fun main() {
    val client1 = "Mary"
    val price1 = 30
    val quantity1 = 3
    println(getTotalPriceMessage(client1, price1, quantity1))

    val client2 = "Bob"
    val price2 = 15
    val quantity2 = 5
    println(getTotalPriceMessage(client2, price2, quantity2))
}
