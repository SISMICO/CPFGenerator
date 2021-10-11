package br.com.sismico.cpfgenerator

import org.junit.Test
import kotlin.test.assertTrue

class CPFTest {

    @Test
    fun `when a cpf is valid`() {
        val firstCPF = "32804586847"
        val secondCPF = "51450828868"
        val thirdCPF = "35181445888"
        val cpf = CPF()

        assertTrue(cpf.validate(firstCPF))
        assertTrue(cpf.validate(secondCPF))
        assertTrue(cpf.validate(thirdCPF))
    }

    @Test
    fun `when try to generate a random cpf`() {
        val cpf = CPF()
        val randomCPF = cpf.generator()

        assertTrue(cpf.validate(randomCPF))
    }

    @Test
    fun `when try to generate a random cpf starting with some value`() {
        val cpf = CPF()
        val startWith = "328"
        val randomCPF = cpf.generator(startWith)

        assertTrue(cpf.validate(randomCPF))
    }
}