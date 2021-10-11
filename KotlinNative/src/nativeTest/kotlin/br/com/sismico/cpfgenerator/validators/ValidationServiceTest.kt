package br.com.sismico.cpfgenerator.validators

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidationServiceTest {
    private val service = ValidationService()

    @Test
    fun `when cpf is valid`() {
        val cpf = "32804586847"

        assertTrue(service.validate(cpf))
    }

    @Test
    fun `when cpf is invalid`() {
        val moreDigit = "328045868479"
        val withLetter = "32804A8B847"
        val withSpecialCharacter = "32804&86847"

        assertFalse(service.validate(moreDigit))
        assertFalse(service.validate(withLetter))
        assertFalse(service.validate(withSpecialCharacter))
    }
}