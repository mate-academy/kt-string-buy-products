package mate.academy

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    var product = ""
    if (quantity > 1) {
        product = " products"
    } else {
        product = " product"
    }
    return "$client has to pay \$" + price * quantity + " per " + quantity + product;
}
