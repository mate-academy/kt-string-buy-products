package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    // [client] has to pay $[cost] per [quantity] products
    return "$client has to pay $${price * quantity} per $quantity products"
}
