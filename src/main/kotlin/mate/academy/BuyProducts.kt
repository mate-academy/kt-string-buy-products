package mate.academy

fun main() {
    getTotalPriceMessage("ffff", 20, 3)
}

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    return "$client has to pay $${price * quantity} per $quantity products"
}
