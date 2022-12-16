package vendingmachine.controller

import vendingmachine.view.InputView
import vendingmachine.view.OutputView

class MainController(
    private val inputView: InputView,
    private val outputView: OutputView
) {

    fun run() {
        getValidatedInput()
    }

    private fun getValidatedInput(): Int {
        while (true) {
            try {
                return inputView.read()
            } catch (e: IllegalArgumentException) {
                outputView.printErrorMessage(e)
            }
        }
    }

}
