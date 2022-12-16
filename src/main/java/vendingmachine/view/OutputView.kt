package vendingmachine.view

import vendingmachine.values.NOTICE_REMAINING_MONEY_MESSAGE

class OutputView {

    fun printMessage(message: String) {
        println(message)
    }

    fun printErrorMessage(e: IllegalArgumentException) {
        println(e.message)
    }

    fun printRemainingInputAmount(amount: Int) {
        println(NOTICE_REMAINING_MONEY_MESSAGE.format(amount))
    }
}