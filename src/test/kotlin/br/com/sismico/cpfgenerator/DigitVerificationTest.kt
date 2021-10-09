package br.com.sismico.cpfgenerator

import br.com.sismico.cpfgenerator.DigitVerification.Digit.div11
import org.junit.Assert.*
import org.junit.Test

class DigitVerificationTest {

    @Test
    fun `when first digit is valid`() {
        val initial = "328045868"
        val firstDigit = "4"
        val result = div11(initial)

        assertEquals(firstDigit, result)
    }

    @Test
    fun `when second digit is valid`() {
        val initial = "3280458684"
        val firstDigit = "7"
        val result = div11(initial)

        assertEquals(firstDigit, result)
    }

}