package br.com.sismico.cpfgenerator.validators

class NumericValidator: Validation {
    override fun validate(cpf: String): Boolean {
        return cpf.all { it in '0'..'9' }
    }
}