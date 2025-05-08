package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val cost: Int = price * quantity
    return "$client has to pay $$cost per $quantity products"
}
