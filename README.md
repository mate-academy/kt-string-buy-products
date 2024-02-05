# Buy Products

A client has purchased several products that have a certain price. Return a message with the total cost that the client needs to pay. To do that, implement a `getTotalPriceMessage()` function that:

- accepts three arguments: `client`, `price`, and `quantity`;
- returns a message in the `[client] has to pay $[cost] per [quantity] products` format.

For example:

```kotlin
val client = "Mary"
val price = 30
val quantity = 3

getTotalPriceMessage(client, price, quantity)
// returned value is "Mary has to pay $90 per 3 products"
```
