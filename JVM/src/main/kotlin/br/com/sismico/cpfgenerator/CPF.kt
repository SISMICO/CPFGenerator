package br.com.sismico.cpfgenerator

import kotlin.random.Random
import br.com.sismico.cpfgenerator.DigitVerification.Digit.div11

class CPF {

    fun validate(cpf: String): Boolean {
        val initial = cpf.substring(0, 9)
        val initialWithFirstDigit = cpf.substring(0, 10)
        val firstDigit = cpf.substring(9, 10)
        val secondDigit = cpf.substring(10, 11)

        return firstDigit == div11(initial) && secondDigit == div11(initialWithFirstDigit)
    }

    fun generator(startDigits: String): String {
        val fullInitial = startDigits + (1..9 - startDigits.length)
            .joinToString(separator = "") { Random.nextInt(0, 9).toString() }
        return fullInitial
            .let { it + div11(it) }
            .let { it + div11(it) }
    }

    fun generator(): String = generator("")



}