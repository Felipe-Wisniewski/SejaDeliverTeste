package seq_char

import org.junit.Assert
import org.junit.Test

class CharSequenceTest {

    @Test
    fun shouldReturn_biggerSequence() {
        val chaSeq = CharSequence("preessaaao")

        Assert.assertEquals("aaa", chaSeq.getBiggerSequence())
    }

    @Test
    fun shouldReturn_null() {
        val chaSeq = CharSequence("paralelepipedo")

        Assert.assertNull(chaSeq.getBiggerSequence())
    }
}