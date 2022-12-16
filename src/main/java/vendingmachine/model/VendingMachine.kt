package vendingmachine.model

import vendingmachine.values.Coin

class VendingMachine(
    private var inputAmount: Int = 0,
    private val coinList: List<Coin>,
    private val products: List<Product>
) {

    fun isAvailableStatus(): Boolean {
        if (!containsAvailableProducts()) return false
        if (inputAmount < minimumAvailableProductCost()) return false

        return true
    }

    private fun minimumAvailableProductCost(): Int {
        var min = Int.MAX_VALUE

        repeat(products.size) { index ->
            val productCost = products[index].getProductCost()
            if(products[index].isAvailableProducts()) {
                min = if (min > productCost) productCost else min
            }
        }

        return min
    }

    private fun containsAvailableProducts(): Boolean {
        repeat(products.size) { index ->
            if (products[index].isAvailableProducts()) return true
        }

        return false
    }

}