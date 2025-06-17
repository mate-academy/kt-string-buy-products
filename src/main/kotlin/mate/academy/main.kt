package mate.academy

fun main() {
    var client = readLine() ?: "Unknown client"
    var price = readLine()?.toIntOrNull() ?: 0
    var quantity = readLine()?.toIntOrNull() ?: 0

    println(getTotalPriceMessage(client, price, quantity))
}
