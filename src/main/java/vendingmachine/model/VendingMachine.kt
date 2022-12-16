package vendingmachine.model

import vendingmachine.values.Coin

class VendingMachine(
    private var amount: Int,
    private var coinCountList: MutableList<Int>,
    private var products: List<Product>
) {

}