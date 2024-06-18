package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val amount = price * quantity
    return "$client has to pay $$amount per $quantity products"
}
