package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    val str1 = "$client has to pay $${price*quantity} per $quantity products"

    return str1
}
