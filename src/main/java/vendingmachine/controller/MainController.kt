package vendingmachine.controller

import vendingmachine.domain.Generator
import vendingmachine.model.Product
import vendingmachine.model.VendingMachine
import vendingmachine.values.NOTICE_REMAINING_MONEY_MESSAGE
import vendingmachine.values.REQUIRE_PURCHASE_PRODUCT_NAME_MESSAGE
import vendingmachine.view.InputView
import vendingmachine.view.OutputView

class MainController(
    private val inputView: InputView,
    private val outputView: OutputView
) {
    private val generator: Generator = Generator()

    fun run() {
        val vendingMachine: VendingMachine = makeVendingMachine()

        purchaseProducts(vendingMachine)

        outputView.printMessage(NOTICE_REMAINING_MONEY_MESSAGE)
        outputView.printCoinsCount(vendingMachine.countChange())
    }

    private fun purchaseProducts(vendingMachine: VendingMachine) {
        while (true) {
            outputView.printRemainingInputAmount(vendingMachine.getInputAmount())
            if (!vendingMachine.isAvailableStatus()) break
            
            val purchaseProductName = inputView.readPurchaseProductName()

            vendingMachine.purchaseProduct(purchaseProductName)
        }
    }

    private fun makeVendingMachine(): VendingMachine {
        val amount = getValidatedVendingMachineAmount()
        val coinList = generator.makeMachineCoinList(amount)
        val productList = getValidatedProductList()
        val inputAmount: Int = getValidatedInputAmount()

        return VendingMachine(inputAmount, coinList, productList)
    }

    private fun getValidatedVendingMachineAmount(): Int {
        while (true) {
            try {
                return inputView.readVendingMachineAmount()
            } catch (e: IllegalArgumentException) {
                outputView.printErrorMessage(e)
            }
        }
    }

    private fun getValidatedProductList(): List<Product> {
        while (true) {
            try {
                return inputView.readVendingMachineProducts()
            } catch (e: IllegalArgumentException) {
                outputView.printErrorMessage(e)
            }
        }
    }

    private fun getValidatedInputAmount(): Int {
        while (true) {
            try {
                return inputView.readInputAmount()
            } catch (e: IllegalArgumentException) {
                outputView.printErrorMessage(e)
            }
        }
    }

}
