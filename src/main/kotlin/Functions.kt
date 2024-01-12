/**
 * This method calculates the fixed water fee based on whether the user has social bonus or not.
 * @param hasSocialBonus Boolean of whether the user has a social bonus or not.
 * @return Integer of the water fixed fee.
 * @author Picuu
 * @since 10/01/2024
 */
fun getFixedFee(hasSocialBonus: Boolean): Int {
    if (hasSocialBonus) return 3
    return 6
}

/**
 * This method calculates the cost per liter of water.
 * @param waterConsumption Integer of the liters consumed.
 * @return Float of the cost per liter of water.
 * @author Picuu
 * @since 10/01/2024
 */
fun getLiterCost(waterConsumption: Int):Float {
    if (waterConsumption > 200) return .3f
    return .15f
}

/**
 * This method calculates the discount the user will get based on various parameters.
 * @param isNumerous Boolean of whether the user forms part of a numerous family or not.
 * @param isSingleParent Boolean of whether the user forms part of a single-parent family or not.
 * @param familySize Integer of the amount of people on the user's family. This parameter is optional.
 * @param hasSocialBonus Boolean of whether the user has a social bonus or not.
 * @return Float of the discount the user will get.
 * @author Picuu
 * @since 11/01/2024
 */
fun getDiscount(isNumerous: Boolean, isSingleParent: Boolean, familySize: Int, hasSocialBonus: Boolean): Float {
    if (hasSocialBonus) return .2f
    if (isNumerous) return .5f
    if (isSingleParent) {
        if (familySize > 5) return .5f
        return (10 - familySize) / 10f
    }
    return 1f
}

/**
 * This method calculates the variable cost of the water invoice based on all deductions.
 * @param waterConsumption Integer of the liters consumed.
 * @param literCost Float of the cost per liter of water.
 * @param discount Float of the discount to apply to the price.
 * @return Float of the final cost of the water consumed.
 * @author Picuu
 * @since 11/01/2024
 */
fun getWaterCost(waterConsumption: Int, literCost: Float, discount: Float): Float {
    val waterCost:Float = waterConsumption * literCost
    return roundToFloat(waterCost * discount, 2)
}