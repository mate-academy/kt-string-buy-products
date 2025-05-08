package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {

    val totalCost = price * quantity
    return "$client has to pay $$totalCost per $quantity products"
}
