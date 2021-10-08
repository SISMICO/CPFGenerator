package br.com.sismico.cpfgenerator

import org.junit.Assert.assertEquals
import org.junit.Test
import kotlin.test.assertTrue

class CPFTest {

    @Test
    fun validate() {
        val myCPF = "32804586847"
        val cpf = CPF()
        val result = cpf.validate(myCPF)

        assertTrue(result)
    }

    @Test
    fun generator() {
    }

    @Test
    fun testGenerator() {
    }

    @Test
    fun div11firstDigit() {
        val initial = "328045868"
        val firstDigit = "4"
        val cpf = CPF()
        val result = cpf.div11firstDigit(initial)

        assertEquals(firstDigit, result)
    }

    @Test
    fun div11firstSecond() {
        val initial = "3280458684"
        val firstDigit = "7"
        val cpf = CPF()
        val result = cpf.div11firstSecond(initial)

        assertEquals(firstDigit, result)
    }
}