package br.com.sismico.cpfgenerator

import br.com.sismico.cpfgenerator.validators.NumericValidator
import br.com.sismico.cpfgenerator.validators.SizeValidator
import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class Validators {

    @Test
    fun `when informed cpf has the correct size`() {
        val cpf = "32804586847"
        val validator = SizeValidator()

        assertTrue(validator.validate(cpf))
    }

    @Test
    fun `when informed cpf has more than 11 digits`() {
        val cpfAbove = "328045868471"
        val validator = SizeValidator()

        assertFalse(validator.validate(cpfAbove))
    }

    @Test
    fun `when informed cpf has only digits`() {
        val cpf = "32804586847"
        val validator = NumericValidator()

        assertTrue(validator.validate(cpf))
    }

    @Test
    fun `when informed cpf don't has only digits`() {
        val cpf = "328045868A7"
        val validator = NumericValidator()

        assertFalse(validator.validate(cpf))
    }

}