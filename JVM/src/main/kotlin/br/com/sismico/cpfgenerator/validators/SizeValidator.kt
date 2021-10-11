package br.com.sismico.cpfgenerator.validators

class SizeValidator: Validation {
    override fun validate(cpf: String) = cpf.length <= 11
}