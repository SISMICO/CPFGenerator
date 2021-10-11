package br.com.sismico.cpfgenerator

import toNumberInt

class DigitVerification {

    companion object Digit {
        fun div11(initial: String): String {
            val length = initial.length + 1
            val mod = initial
                .mapIndexed { index, c -> c.toNumberInt() * (length - index) }
                .sum()
                .let { it % 11 }
            return if (mod in 0..1) "0" else (11 - mod).toString()
        }
    }

}