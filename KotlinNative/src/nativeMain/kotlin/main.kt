import br.com.sismico.cpfgenerator.CPF
import br.com.sismico.cpfgenerator.validators.ValidationService

fun main(args: Array<String>) {
    val input = if (args.isNotEmpty()) args[0] else ""
    if (input.isEmpty() || ValidationService().validate(input))
        println(CPF().generator(input))
    else
        println("CPF informed was invalid!")
}

fun Char.toNumberInt(): Int {
    return this.toInt() - '0'.toInt()
}