object Yacht {

    fun solve(category: YachtCategory, vararg dices: Int): Int {
        return when (category) {
            YachtCategory.YACHT -> if (dices.toSet().size == 1) 50 else 0
            YachtCategory.ONES -> 0
            YachtCategory.TWOS -> 0
            YachtCategory.THREES -> 0
            YachtCategory.FOURS -> 0
            YachtCategory.FIVES -> 0
            YachtCategory.SIXES -> 0
            YachtCategory.FULL_HOUSE -> 0
            YachtCategory.FOUR_OF_A_KIND -> 0
            YachtCategory.LITTLE_STRAIGHT -> 0
            YachtCategory.BIG_STRAIGHT -> 0
            YachtCategory.CHOICE -> 0
        }
    }
}
