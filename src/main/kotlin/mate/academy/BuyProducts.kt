package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val sum = price * quantity

    return "$client has to pay $$sum per $quantity products"
}
