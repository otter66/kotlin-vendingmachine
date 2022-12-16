package vendingmachine.view

import camp.nextstep.edu.missionutils.Console
import vendingmachine.domain.Validator
import vendingmachine.values.REQUIRE_VENDING_MACHINE_AMOUNT_MESSAGE

class InputView(
    private val validator: Validator,
    private val outputView: OutputView
) {

    fun readVendingMachineAmount(): Int {
        outputView.printMessage(REQUIRE_VENDING_MACHINE_AMOUNT_MESSAGE)
        val input = Console.readLine()
        validator.validateVendingMachineAmount(input)
        return input.toInt()
    }

}