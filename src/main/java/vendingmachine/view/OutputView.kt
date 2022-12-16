package vendingmachine.view

import vendingmachine.values.*

class OutputView {

    fun printMessage(message: String) {
        println(message)
    }

    fun printErrorMessage(e: IllegalArgumentException) {
        println(e.message)
    }

    fun printRemainingInputAmount(amount: Int) {
        println(NOTICE_REMAINING_MONEY_MESSAGE.format(amount))
        println()
    }

    fun printVendingMachineCoins(coin: Coin) {
        println(NOTICE_VENDING_MACHINE_COINS_MESSAGE.format(COIN_500, coin.count))
        println(NOTICE_VENDING_MACHINE_COINS_MESSAGE.format(COIN_100, coin.count))
        println(NOTICE_VENDING_MACHINE_COINS_MESSAGE.format(COIN_50, coin.count))
        println(NOTICE_VENDING_MACHINE_COINS_MESSAGE.format(COIN_10, coin.count))
        println()
    }
}