package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val totalPrice = price * quantity
    return "$client has to pay $$totalPrice per $quantity products"
}
