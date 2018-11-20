import max_sum.SubsetSum
import seq_char.CharSequence
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    startTest()
}

fun startTest() {
    var escolha: String? = null

    println("\n###### ESCOLHA UM TESTE ######")
    println("1 - Subconjunto da máxima soma")
    println("2 - Sequência de caracteres")
    println("0 - Sair")
    print(": ")

    while (escolha == null) {
        escolha = readLine()

        when(escolha) {
            "1" -> subsetMaxSum()
            "2" -> charSequence()
            "0" -> println("Até logo!")
            else -> {
                escolha = null
                print(": ")
            }
        }
    }
}

fun subsetMaxSum() {
    val setNumber = arrayListOf<Int>()
    var num: Int? = 1

    println("\nDigite um número inteiro e tecle enter para o próximo")
    println("ou sem número para calcular")

    while (num != null) {
        print(": ")
        val input = readLine()

        if (input.equals("")) {
            val subset = SubsetSum(setNumber)
            println("R: ${subset.subsetMaxSum()}")
            num = null
        }else {
            try {
                setNumber.add(input!!.toInt())
            } catch (e: NumberFormatException) {
                println("Formato inválido")
            }
        }
    }
    startTest()
}

fun charSequence() {
    var word = "a"

    println("\nDigite uma palavra e tecle enter")
    println("mais de uma palavra será considerada apenas a primeira")

    while (word != "") {
        print(": ")
        word = readLine().toString()

        if (word.length >= 2) {
            val charSeq = CharSequence(word)
            println("R: ${charSeq.getBiggerSequence()}")
        }
    }
    startTest()
}
