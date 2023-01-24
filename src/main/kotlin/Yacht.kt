object Yacht {

    fun solve(category: YachtCategory, vararg dices: Int): Int {
        return when (category) {
            YachtCategory.YACHT -> if (dices.toSet().size == 1) 50 else 0
            YachtCategory.ONES -> sumDiceOfValue(1, dices)
            YachtCategory.TWOS -> sumDiceOfValue(2, dices)
            YachtCategory.THREES -> sumDiceOfValue(3, dices)
            YachtCategory.FOURS -> sumDiceOfValue(4, dices)
            YachtCategory.FIVES -> sumDiceOfValue(5, dices)
            YachtCategory.SIXES -> sumDiceOfValue(6, dices)
            YachtCategory.FULL_HOUSE -> 0
            YachtCategory.FOUR_OF_A_KIND -> 0
            YachtCategory.LITTLE_STRAIGHT -> 0
            YachtCategory.BIG_STRAIGHT -> 0
            YachtCategory.CHOICE -> 0
        }
    }
}

private fun sumDiceOfValue(value: Int, dices: IntArray): Int {
    return dices.filter { it == value }.sum()
}
