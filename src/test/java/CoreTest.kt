import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class CoreTest {
    @Test
    fun getNumberBefore_1234_9876() {
        val core = Core()
        val result = core.getNumber()
        assertFalse(result<1234 || result>9876)
    }
}