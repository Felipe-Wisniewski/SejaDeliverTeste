package prova

import java.lang.NumberFormatException

/**
 * Classe que contêm os métodos de interação com usuário (UI).
 */
class Proof {

    /**
     * Menu para escolha de um teste.
     */
    fun startProof() {
        var escolha: String? = null

        println("\n####### ESCOLHA UM TESTE #######")
        println("1 - Subconjunto da máxima soma")
        println("2 - Sequência de caracteres")
        println("0 - Sair")
        print(": ")

        while (escolha == null) {
            escolha = readLine()

            when(escolha) {
                "1" -> proofSubsetMaxSum()
                "2" -> proofCharSequence()
                "0" -> println("Até logo!")
                else -> {
                    escolha = null
                    print(": ")
                }
            }
        }
    }

    /**
     * Método de entrada do conjunto de inteiros e impressão do subconjunto da máxima soma.
    */
    fun proofSubsetMaxSum() {
        val setNumber = arrayListOf<Int>()
        var num: Int? = 1

        println("\nDigite um número inteiro e tecle enter para o próximo")
        println("número ou somente enter para calcular..")

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
        startProof()
    }

    /**
     * Método de entrada de uma palavra e impressão da sequência de caracteres.
     */
    fun proofCharSequence() {
        var word = "a"

        println("\nDigite uma palavra e tecle enter para localizar a ")
        println("maior sequência ou apenas enter para sair..")

        while (word != "") {
            print(": ")
            word = readLine().toString()

            if (word.length >= 2) {
                val charSeq = CharSequence(word)
                println("R: ${charSeq.getBiggerSequence()}")
                word = ""
            }
        }
        startProof()
    }
}