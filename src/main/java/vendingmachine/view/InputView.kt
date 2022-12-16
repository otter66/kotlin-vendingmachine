package vendingmachine.view

import camp.nextstep.edu.missionutils.Console
import vendingmachine.domain.Validator

class InputView(
    private val validator: Validator
) {

    fun read(): Int {
        val input = Console.readLine()
        validator.validate(input)
        return input.toInt()
    }

}