package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val totalAmount = price * quantity
    return "$client has to pay $$totalAmount per $quantity products"
}
