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

    fun printCoinsCount(coinList: List<Coin>) {
        repeat(coinList.size) { index ->
            println(NOTICE_VENDING_MACHINE_COINS_MESSAGE.format(
                coinList[index].amount, coinList[index].count))
        }
       println()
    }

}