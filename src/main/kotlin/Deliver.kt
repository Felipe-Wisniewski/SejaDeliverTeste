import max_sum.SubsetSum

fun main(args: Array<String>) {


    val testSet = arrayListOf(10,5,-17,20,50,-1,3,-30,10)
    val subsetSumTest = SubsetSum(testSet)
    println("${subsetSumTest.subsetMaxSum()}")

    startTestDeliverIt()

}

fun startTestDeliverIt() {

    var escolha: Int? = null

    println("# ESCOLHA UM TESTE #")
    println("1 - Subconjunto da máxima soma")
    println("2 - Sequência de caracteres")
    println("0 - Sair")
    print(": ")

    while (escolha == null) {
        escolha = readLine()!!.toInt()

        when(escolha) {
            1 -> subsetMaxSum()
            2 -> charSequence()
            0 -> println("Até logo!")
            else -> escolha = null
        }
    }
}

fun subsetMaxSum() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

fun charSequence() {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}
