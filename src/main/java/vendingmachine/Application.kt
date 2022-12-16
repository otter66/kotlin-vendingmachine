package vendingmachine

import vendingmachine.controller.MainController
import vendingmachine.domain.Validator
import vendingmachine.view.InputView
import vendingmachine.view.OutputView

fun main() {
    val validator = Validator()
    val inputView = InputView(validator)
    val outputView = OutputView()
    val mainController = MainController(inputView, outputView)

    mainController.run()
}