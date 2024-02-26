package mate.academy

const val CLIENT = "Mary"
const val PRICE = 30
const val QUANTITY = 3

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val cost = PRICE * QUANTITY
    return "$CLIENT has to pay \$$cost per $QUANTITY products"
}
