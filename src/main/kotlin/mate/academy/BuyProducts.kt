package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    return "$client has pay \$$price for $quantity products"
}
