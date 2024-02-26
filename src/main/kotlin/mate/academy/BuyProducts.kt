package mate.academy

const val client = "Mary"
const val price = 30
const val quantity = 3

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val cost = price * quantity
    return "$client has to pay \$$cost per $quantity products"
}
