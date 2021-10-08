package br.com.sismico.cpfgenerator

class CPF {

    fun validate(cpf: String): Boolean {
        val initial = cpf.substring(0, 9)
        val firstDigit = cpf.substring(9, 10)
        val secondDigit = cpf.substring(10, 11)

        return firstDigit == div11firstDigit(initial) && secondDigit == div11firstSecond(initial+firstDigit)
    }

    fun generator(startDigit: String) {

    }

    fun generator() {

    }

    fun div11firstDigit(initial: String): String {
        var sum = 0
        initial.forEachIndexed { index, c -> sum += (charToInt(c) * (10 - index)) }
        var mod = sum % 11
        return if (mod in 0..1)
            "0"
        else
            (11 - mod).toString()
    }

    fun div11firstSecond(initialWithFirstDigit: String): String {
        var sum = 0
        initialWithFirstDigit.forEachIndexed { index, c -> sum += (charToInt(c) * (11 - index)) }
        var mod = sum % 11
        return if (mod in 0..1)
            "0"
        else
            (11 - mod).toString()
    }

    fun charToInt(character: Char): Int {
        return Character.getNumericValue(character)
    }

}