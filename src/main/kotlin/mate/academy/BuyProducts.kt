package mate.academy

const val CLIENT_NAME = "Bob"
const val PRICE = 30
const val QUANTITY = 3

fun main() {
    println(getTotalPriceMessage(CLIENT_NAME, PRICE, QUANTITY))
}

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    return "$client has to pay $${price * quantity} per $quantity products"
}
