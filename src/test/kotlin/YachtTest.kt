import kotlin.test.Test
import kotlin.test.assertEquals
import YachtCategory.*

class YachtTest {

    @Test
    fun yacht() = assertEquals(50, Yacht.solve(YACHT, 5, 5, 5, 5, 5))

    @Test
    fun notYacht() = assertEquals(0, Yacht.solve(YACHT, 1, 3, 3, 2, 5))

    @Test
    fun ones() = assertEquals(3, Yacht.solve(ONES, 1, 1, 1, 3, 5))

    @Test
    fun twos() = assertEquals(2, Yacht.solve(TWOS, 2, 3, 4, 5, 6))

    @Test
    fun threes() = assertEquals(3, Yacht.solve(THREES, 3, 1, 1, 5, 1))

    @Test
    fun fours() = assertEquals(8, Yacht.solve(FOURS, 1, 4, 1, 4, 1))

    @Test
    fun fives() = assertEquals(15, Yacht.solve(FIVES, 1, 5, 1, 5, 5))

    @Test
    fun sixes() = assertEquals(18, Yacht.solve(SIXES, 1, 6, 6, 6, 1))


    @Test
    fun notOnes() = assertEquals(0, Yacht.solve(ONES, 4, 3, 6, 5, 5))
}
