package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val totalPrice = "$client has to pay ${price * quantity} per $quantity products"
    return totalPrice
}
