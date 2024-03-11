package mate.academy

const val CLIENT = "Mary"
const val PRICE = 30
const val QUANTITY = 3

fun main() {
    println(getTotalPriceMessage(CLIENT, PRICE, QUANTITY))
}

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val totalCost = price * quantity
    return "$client has to pay $$totalCost per $quantity products"
}
