package prova

import org.junit.Assert
import org.junit.Test
import prova.CharSequence

/**
 * @author Felipe Wisniewski
 **/
class CharSequenceTest {

    @Test
    fun shouldReturn_biggerSequence() {
        val chaSeq = CharSequence("preessaaao")

        Assert.assertEquals("aaa", chaSeq.getBiggerSequence())
    }

    @Test
    fun shouldReturn_null() {
        val chaSeq = CharSequence("paralelepipedo")

        Assert.assertEquals("Não possue sequência!", chaSeq.getBiggerSequence())
    }
}