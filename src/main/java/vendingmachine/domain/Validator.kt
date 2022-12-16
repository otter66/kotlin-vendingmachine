package vendingmachine.domain

class Validator {

    fun validateVendingMachineAmount(input: String) {
        require(input.toIntOrNull() != null) {
            "[ERROR]"
        }
    }

}