package vendingmachine.domain

import vendingmachine.model.Product
import vendingmachine.model.VendingMachine
import vendingmachine.values.Coin

class Generator {

    fun makeVendingMachine(amount: Int, productList: List<Product>): VendingMachine {
        val coinCountList: MutableList<Int> = mutableListOf()


        return VendingMachine(amount, coinCountList, productList)
    }

}