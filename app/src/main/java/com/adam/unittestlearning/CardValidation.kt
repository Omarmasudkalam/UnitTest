package com.adam.unittestlearning


class CardValidation {

    // User INPUT  CORRECT//
    val cardInput = "1111-1222-1112-1216"
    val dateInput = "1216" //Slash prob
    // User INPUT  CORRECT//

    // User INPUT  FALSE//
    val cardInput1 = "3242-1222-1112-1216"
    val dateInput1 = "04/34"
    // User INPUT  FALSE//

    fun validateCardDetails(
        cardInput: String,
        dateInput: String
    ): Boolean {
        verifyBank(cardInput)
        verifyDate(dateInput)
        return false
    }


    fun verifyBank(cardInput: String) = when (cardInput.take(4)) {
        ACME -> true
        ALFA -> true
        AMEX -> true
        else -> false
    }

    fun verifyDate(DateInput: String) = when (cardInput.takeLast(4)) {
        dateInput -> true
        else -> false
    }

    fun verifyWrongDate(DateInput: String) = when (cardInput.takeLast(4)) {
        dateInput -> false
        else -> true
    }

    companion object {
        const val ACME = "1121"
        const val ALFA = "1111"
        const val AMEX = "3796"
    }
}

