package br.com.sismico.cpfgenerator.validators

interface Validation {
    fun validate(cpf: String): Boolean
}