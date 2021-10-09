package br.com.sismico.cpfgenerator.validators

class ValidationService {
    private val validators = listOf(
        NumericValidator(),
        SizeValidator()
    )

    fun validate(cpf: String): Boolean {
        return validators.all { it.validate(cpf) }
    }

}