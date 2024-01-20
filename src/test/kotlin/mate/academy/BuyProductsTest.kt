package mate.academy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BuyProductsTest {

    @Test
    fun getTotalPriceMessage_SingleProduct_CorrectTotalPriceMessage() {
        // given
        val client = "John"
        val price = 50
        val quantity = 1

        // when
        val result = getTotalPriceMessage(client, price, quantity)

        // then
        assertEquals("John has to pay $50 per 1 products", result)
    }

    @Test
    fun getTotalPriceMessage_MultipleProducts_CorrectTotalPriceMessage() {
        // given
        val client = "Alice"
        val price = 20
        val quantity = 4

        // when
        val result = getTotalPriceMessage(client, price, quantity)

        // then
        assertEquals("Alice has to pay $80 per 4 products", result)
    }

    @Test
    fun getTotalPriceMessage_NoProducts_ZeroTotalPriceMessage() {
        // given
        val client = "Bob"
        val price = 100
        val quantity = 0

        // when
        val result = getTotalPriceMessage(client, price, quantity)

        // then
        assertEquals("Bob has to pay $0 per 0 products", result)
    }

    @Test
    fun getTotalPriceMessage_FreeProducts_CorrectTotalPriceMessage() {
        // given
        val client = "Sara"
        val price = 0
        val quantity = 5

        // when
        val result = getTotalPriceMessage(client, price, quantity)

        // then
        assertEquals("Sara has to pay $0 per 5 products", result)
    }

    @Test
    fun getTotalPriceMessage_LargeNumbers_CorrectTotalPriceMessage() {
        // given
        val client = "Mike"
        val price = 999
        val quantity = 999

        // when
        val result = getTotalPriceMessage(client, price, quantity)

        // then
        assertEquals("Mike has to pay $998001 per 999 products", result)
    }
}
