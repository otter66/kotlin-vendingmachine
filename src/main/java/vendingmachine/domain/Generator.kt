package vendingmachine.domain

import vendingmachine.model.Product
import vendingmachine.model.VendingMachine

class Generator {

    fun makeVendingMachine(amount: Int, productList: List<Product>): VendingMachine {

        return VendingMachine(amount, productList)
    }

}