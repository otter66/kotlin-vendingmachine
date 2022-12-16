package vendingmachine.controller

import vendingmachine.domain.Generator
import vendingmachine.model.Product
import vendingmachine.model.VendingMachine
import vendingmachine.view.InputView
import vendingmachine.view.OutputView

class MainController(
    private val inputView: InputView,
    private val outputView: OutputView
) {
    private val generator: Generator = Generator()

    fun run() {
        val vendingMachine: VendingMachine = makeVendingMachine()
        val inputAmount: Int = getValidatedInputAmount()
    }

    private fun makeVendingMachine(): VendingMachine {
        val amount = getValidatedVendingMachineAmount()
        val coinList = generator.makeMachineCoinList(amount)
        val productList = getValidatedProductList()

        return VendingMachine(amount, coinList, productList)
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
