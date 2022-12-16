package vendingmachine.domain

import vendingmachine.values.COST_CONDITION_MESSAGE
import vendingmachine.values.NOTICE_ERROR_MESSAGE

class Validator {

    fun validateVendingMachineAmount(input: String) {
        require(input.toIntOrNull() != null) {
            NOTICE_ERROR_MESSAGE + COST_CONDITION_MESSAGE
        }
    }

    fun

}