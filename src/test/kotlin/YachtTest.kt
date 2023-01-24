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

    @Test
    fun `full house two small three big`() = assertEquals(16, Yacht.solve(FULL_HOUSE, 2, 2, 4, 4, 4))

    @Test
    fun `full house three small two big`() = assertEquals(19, Yacht.solve(FULL_HOUSE, 5, 3, 3, 5, 3))

    @Test
    fun `two pair is not a full house`() = assertEquals(0, Yacht.solve(FULL_HOUSE, 2, 2, 4, 4, 5))

    @Test
    fun `four of a kind is not a full house`() = assertEquals(0, Yacht.solve(FULL_HOUSE, 1, 4, 4, 4, 4))

    @Test
    fun `yacht is not a full house`() = assertEquals(0, Yacht.solve(FULL_HOUSE, 2, 2, 2, 2, 2))

    @Test
    fun `little straight`() = assertEquals(30, Yacht.solve(LITTLE_STRAIGHT, 3, 5, 4, 1, 2))

    @Test
    fun `little straight as big straight`() = assertEquals(0, Yacht.solve(BIG_STRAIGHT, 1, 2, 3, 4, 5))

    @Test
    fun `four in order but not a little straight`() = assertEquals(0, Yacht.solve(LITTLE_STRAIGHT, 1, 1, 2, 3, 4))

    @Test
    fun `no pairs but not a little straight`() = assertEquals(0, Yacht.solve(LITTLE_STRAIGHT, 1, 2, 3, 4, 6))

    @Test
    fun `minimum is 1 maximum is 5 but not a little straight`() = assertEquals(0, Yacht.solve(LITTLE_STRAIGHT, 1, 1, 3, 4, 5))

    @Test
    fun `big straight`() = assertEquals(30, Yacht.solve(BIG_STRAIGHT, 4, 6, 2, 5, 3))

    @Test
    fun `big straight as little straight`() = assertEquals(0, Yacht.solve(LITTLE_STRAIGHT, 6, 5, 4, 3, 2))

    @Test
    fun `no pairs but not a big straight`() = assertEquals(0, Yacht.solve(BIG_STRAIGHT, 6, 5, 4, 3, 1))
}
