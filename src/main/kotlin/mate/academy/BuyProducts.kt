package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val cost = quantity * price;
    return "$client has to pay $$cost per $quantity products"
}
