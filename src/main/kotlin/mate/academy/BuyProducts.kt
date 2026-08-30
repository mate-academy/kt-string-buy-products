package mate.academy

import java.util.*

fun getTotalPriceMessage(client: String, price: Int, quantity: Int): String {
    return "${capitalise(client)} has to pay $${price * quantity} per $quantity products"
}

private fun capitalise(name: String) : String {
    return name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
}
