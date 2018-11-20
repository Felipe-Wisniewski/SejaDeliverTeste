package max_sum

class SubsetSum(val set: ArrayList<Int>) {

    fun maxSum(): Array<Int> {
        if (set.isNullOrEmpty()) return arrayOf(0,0,0)

        var tempStart = 0
        var startIndex = 0
        var endIndex = 0
        var currentSum = set[0]
        var maxSum = set[0]

        for (i in 1 until set.size -1) {
            currentSum += set[i]

            if (set[i] > currentSum) {
                currentSum = set[i]
                tempStart = i
            }

            if (currentSum > maxSum) {
                maxSum = currentSum
                startIndex = tempStart
                endIndex = i
            }
        }

        return arrayOf(startIndex, endIndex, maxSum)
    }

    fun subsetMaxSum(): ArrayList<String> {
        val subset = arrayListOf<String>()
        val resultMaxSum = maxSum()

        if (resultMaxSum[2] <= 0) {
            subset.add("Conjunto NULO ou VAZIO")
        }else {
           for (i in 0 until set.size) {
               when(i){
                   resultMaxSum[0] -> subset.add(i, "**${set[i]}")
                   resultMaxSum[1] -> subset.add(i, "${set[i]}**")
                   else -> subset.add(i, "${set[i]}")
               }
           }
        }
        return subset
    }
}