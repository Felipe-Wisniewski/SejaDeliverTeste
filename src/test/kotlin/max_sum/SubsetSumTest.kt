package max_sum

import org.junit.Assert
import org.junit.Before
import org.junit.Test

class SubsetSumTest {

    lateinit var subsetSumTest: SubsetSum

    @Before
    fun setUp() {
        val testSet = arrayListOf(2,-4,6,8,-10,100,-6,5)
        subsetSumTest = SubsetSum(testSet)
    }

    @Test
    fun shouldReturn_indexesAndResultOfMaxSum() {
        val startIndex = 2
        val endIndex = 5
        val maxSum = 104
        val expected = arrayOf(startIndex, endIndex, maxSum)

        val result = subsetSumTest.maxSum()

        Assert.assertArrayEquals(expected, result)
    }

    @Test
    fun shouldReturn_subsetMaxSum() {
        val expected = arrayListOf("2", "-4", "**6", "8", "-10", "100**", "-6", "5")

        val result = subsetSumTest.subsetMaxSum()

        Assert.assertEquals(expected, result)
    }

}