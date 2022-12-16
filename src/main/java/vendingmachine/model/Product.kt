package vendingmachine.model

class Product(
    private val name: String,
    private val cost: Int,
    private var count: Int
) {

    fun getProductCost() = cost

    fun isAvailableProducts() = count > 0

}
