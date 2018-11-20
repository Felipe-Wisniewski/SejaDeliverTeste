package prova

import org.junit.Assert
import org.junit.Test

/**
 * @author Felipe Wisniewski
 **/
class SubsetSumTest {

    @Test
    fun shouldReturn_indexesAndResultOfMaxSum() {
        val testSet = arrayListOf(2,-4,6,8,-10,100,-6,5)
        val subsetSumTest = SubsetSum(testSet)

        val startIndex = 2
        val endIndex = 5
        val maxSum = 104
        val expected = arrayOf(startIndex, endIndex, maxSum)

        val result = subsetSumTest.maxSum()

        Assert.assertArrayEquals(expected, result)
    }

    @Test
    fun shouldReturn_subsetMaxSum() {
        val testSet = arrayListOf(2,-4,6,8,-10,100,-6,5)
        val subsetSumTest = SubsetSum(testSet)

        val expected = arrayListOf("2", "-4", "**6", "8", "-10", "100**", "-6", "5")

        val result = subsetSumTest.subsetMaxSum()

        Assert.assertEquals(expected, result)
    }

    @Test
    fun shouldReturn_subsetNullOrEmpty() {
        val testSet = arrayListOf(0)
        val subsetSumTest = SubsetSum(testSet)

        val expected = arrayListOf("Conjunto NULO ou VAZIO")

        val result = subsetSumTest.subsetMaxSum()

        Assert.assertEquals(expected, result)
    }
}