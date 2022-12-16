package view

import domain.Validator

class InputView(
    private val validator: Validator
) {

    fun read(): Int {
        val input = readln()
        validator.validate(input)
        return input.toInt()
    }

}