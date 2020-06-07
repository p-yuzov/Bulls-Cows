import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
val core = Core()
class CoreTest {
    @Test
    fun getNumberBefore_1234_9876() {
        val result = core.getNumber()
        assertTrue(result>=1234 && result<=9876)
    }

    @Test
    fun checkInput_1234_return_true() {
        assertTrue(core.checkInput("1234"))
    }
    @Test
    fun checkInput_12345_return_false(){
        assertFalse(core.checkInput("12345"))
    }
    @Test
    fun checkInput_abcd_return_false(){
        assertFalse(core.checkInput("abcd"))
    }
    @Test
    fun checkInput_1123_return_false(){
        assertFalse(core.checkInput("1123"))
    }
    @Test
    fun calcBullsCows_1234_2345_return_03(){
        val result=core.calcBullsCows("1234","2345")
        assertTrue(result.bulls==0 && result.cows==3)
    }
    @Test
    fun calcBullsCows_1234_1564_return_20(){
        val result=core.calcBullsCows("1234","1564")
        assertTrue(result.bulls==2 && result.cows==0)
    }

}