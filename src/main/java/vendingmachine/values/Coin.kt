package vendingmachine.values

enum class Coin(
    val amount: Int,
    var count: Int,
) {
    COIN_500(500, 0),
    COIN_100(100, 0),
    COIN_50(50, 0),
    COIN_10(10, 0)
}