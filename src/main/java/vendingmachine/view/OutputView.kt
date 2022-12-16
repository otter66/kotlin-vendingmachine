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
        println(NOTICE_INPUT_AMOUNT_MESSAGE_FORMAT.format(amount))
    }

    fun printCoinsCount(coinList: List<Coin>) {
        repeat(coinList.size) { index ->
            println(NOTICE_COIN_COUNT_MESSAGE_FORMAT.format(
                coinList[index].amount, coinList[index].count))
        }
       println()
    }

}