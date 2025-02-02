package vendingmachine.view

import camp.nextstep.edu.missionutils.Console
import vendingmachine.domain.Validator
import vendingmachine.model.Product
import vendingmachine.values.REQUIRE_INPUT_AMOUNT_MESSAGE
import vendingmachine.values.REQUIRE_PRODUCTS_MESSAGE
import vendingmachine.values.REQUIRE_PURCHASE_PRODUCT_NAME_MESSAGE
import vendingmachine.values.REQUIRE_VENDING_MACHINE_AMOUNT_MESSAGE

class InputView(
    private val validator: Validator,
    private val outputView: OutputView
) {

    fun readVendingMachineAmount(): Int {
        outputView.printMessage(REQUIRE_VENDING_MACHINE_AMOUNT_MESSAGE)
        val input = Console.readLine()
        outputView.printMessage("")
        return validator.validateVendingMachineAmount(input)
    }

    fun readVendingMachineProducts(): List<Product> {
        outputView.printMessage(REQUIRE_PRODUCTS_MESSAGE)
        val input = Console.readLine()
        outputView.printMessage("")
        return validator.validateVendingMachineProducts(input)
    }

    fun readInputAmount(): Int {
        outputView.printMessage(REQUIRE_INPUT_AMOUNT_MESSAGE)
        val input = Console.readLine()
        outputView.printMessage("")
        return validator.validateInputAmount(input)
    }

    fun readPurchaseProductName(): String {
        outputView.printMessage(REQUIRE_PURCHASE_PRODUCT_NAME_MESSAGE)
        outputView.printMessage("")
        return Console.readLine()
    }

}