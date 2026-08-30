package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val result = "$client has to pay $${price * quantity} per $quantity products"
    return result
}
