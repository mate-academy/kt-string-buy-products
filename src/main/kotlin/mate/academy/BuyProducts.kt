package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    return "$client has to pay $${quantity * price} per $quantity products"
}
