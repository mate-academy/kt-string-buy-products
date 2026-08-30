package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    var total = price * quantity
    return "$client has to pay $$total per $quantity products"
}
