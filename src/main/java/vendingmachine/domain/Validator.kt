package vendingmachine.domain

import vendingmachine.model.Product
import vendingmachine.values.*

class Validator {

    fun validateVendingMachineAmount(input: String): Int {
        require(input.toIntOrNull() != null) {
            NOTICE_ERROR_MESSAGE + COST_CONDITION_MESSAGE
        }

        return input.toInt()
    }

    fun validateVendingMachineProducts(input: String): List<Product> {
        val productList: MutableList<Product> = mutableListOf()
        val groupList: MutableList<String> = input.split(";").toMutableList()
        checkInputProducts(groupList)

        repeat(groupList.size) { index ->
            val product = groupList[index]
            val (productName, productCost, productCount) =
                product.substring(1 until product.length - 1).split(",")
            checkInputProductCost(productCost)
            checkInputProductCount(productCount)
            productList.add(Product(productName, productCost.toInt(), productCount.toInt()))
        }

        return productList.toList()
    }

    private fun checkInputProducts(groupList: MutableList<String>) {
        repeat(groupList.size) { index ->
            require(groupList[index].contains("[") &&
                    groupList[index].contains("]") &&
                    groupList[index].count { it == ',' } == 2
            ) {
                NOTICE_ERROR_MESSAGE + PRODUCT_INPUT_FORM_CONDITION_MESSAGE
            }
        }
    }

    private fun checkInputProductCost(cost: String) {
        require(cost.toIntOrNull() != null &&
                cost.toInt() >= PRODUCT_MINIMUM_COST &&
                cost.toInt() % PRODUCT_UNIT == 0
        ) {
            NOTICE_ERROR_MESSAGE + PRODUCT_COST_CONDITION_MESSAGE
        }
    }

    private fun checkInputProductCount(count: String) {
        require(count.toIntOrNull() != null) {
            NOTICE_ERROR_MESSAGE + COUNT_CONDITION_MESSAGE
        }
    }

}