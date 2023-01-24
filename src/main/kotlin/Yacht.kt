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
            YachtCategory.FULL_HOUSE -> isFullHouse(dices)
            YachtCategory.FOUR_OF_A_KIND -> 0
            YachtCategory.LITTLE_STRAIGHT -> littleStraight(dices.toList())
            YachtCategory.BIG_STRAIGHT -> bigStraight(dices.toList())
            YachtCategory.CHOICE -> 0
        }
    }
}

private fun sumDiceOfValue(value: Int, dices: IntArray): Int {
    return dices.filter { it == value }.sum()
}

private fun isFullHouse(dices: IntArray): Int {
    val groupedDice = dices.groupBy { it }
    return if (groupedDice.any { it.value.size == 3 } && groupedDice.any { it.value.size == 2 })
        dices.sum() else 0
}

private fun bigStraight(dices: List<Int>): Int {
    val bigStraight = listOf(2, 3, 4, 5, 6)
    return if (dices.containsAll(bigStraight)) 30
    else 0
}

private fun littleStraight(dices: List<Int>): Int {
    val littleStraight = listOf(1, 2, 3, 4, 5)
    return if (dices.containsAll(littleStraight)) 30
    else 0
}