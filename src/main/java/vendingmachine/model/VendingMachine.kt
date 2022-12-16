package vendingmachine.model

import vendingmachine.values.Coin

class VendingMachine(
    private var amount: Int,
    private var coinList: MutableList<Coin>,
    private var products: List<Product>
) {

}