package prova

/**
 * Classe responsável por retornar uma sequência de caracteres que mais aparecem em sequência em dada palavra.
 * @author Felipe Wisniewski
 **/
class CharSequence(val word: String) {

    fun getBiggerSequence() : String {
        val sequences = arrayListOf<String>()
        var auxFirst = word[0]
        var auxNext: Char
        var sequence = auxFirst.toString()
        var acc = 0

        for (index in word.indices) {
            auxNext = if (index == word.lastIndex) break else word[index + 1]

            if (auxFirst == auxNext) {
                sequence += auxNext
                acc = 1
            }

            if (acc == 1) {
                sequences.add(sequence)
                acc = 0
            }else {
                sequence = auxNext.toString()
            }

            auxFirst = auxNext
        }
        return getSequence(sequences)
    }

    private fun getSequence(sequences: ArrayList<String>) = sequences.maxBy { it.count() } ?: "Não possue sequência!"
}