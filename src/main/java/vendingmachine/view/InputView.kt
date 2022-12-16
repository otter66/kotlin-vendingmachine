package vendingmachine.view

import camp.nextstep.edu.missionutils.Console
import vendingmachine.domain.Validator

class InputView(
    private val validator: Validator,
    private val outputView: OutputView
) {

    fun readVendingMachineAmount(): Int {
        outputView
        val input = Console.readLine()
        validator.validate(input)
        return input.toInt()
    }

}