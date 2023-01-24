import kotlin.test.Test
import kotlin.test.assertEquals
import YachtCategory.*

class YachtTest {

    @Test
    fun shouldReturn50ForYacht() = assertEquals(50, Yacht.solve(YACHT, 5, 5, 5, 5, 5))

    @Test
    fun `shouldReturn0ForNotYacht`() = assertEquals(0, Yacht.solve(YACHT, 1, 3, 3, 2, 5))

}
