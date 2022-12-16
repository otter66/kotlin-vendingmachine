package vendingmachine.view

import camp.nextstep.edu.missionutils.Console
import vendingmachine.domain.Validator
import vendingmachine.model.Product
import vendingmachine.values.REQUIRE_PRODUCTS_MESSAGE
import vendingmachine.values.REQUIRE_VENDING_MACHINE_AMOUNT_MESSAGE

class InputView(
    private val validator: Validator,
    private val outputView: OutputView
) {

    fun readVendingMachineAmount(): Int {
        outputView.printMessage(REQUIRE_VENDING_MACHINE_AMOUNT_MESSAGE)
        val input = Console.readLine()
        return validator.validateVendingMachineAmount(input)
    }

    fun readVendingMachineProducts(): List<Product> {
        outputView.printMessage(REQUIRE_PRODUCTS_MESSAGE)
        val input = Console.readLine()
        return validator.validateVendingMachineProducts(input)
    }

}