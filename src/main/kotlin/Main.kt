fun main() {
    println("$WHITE_BACKGROUND_BRIGHT$BLACK_BOLD    CALCULATE WATER INVOICE    $RESET")
    val waterConsumption:Int = getWaterConsumption()
    val isNumerous:Boolean = isNumerousFamily()
    val isSingleParent:Boolean = isSingleParentFamily()
    val familySize:Int = getFamilySize()
    val hasSocialBonus:Boolean = hasSocialBonus()

    val fixedFee:Int = getFixedFee(hasSocialBonus)
    val literCost:Float = getLiterCost(waterConsumption)
    val waterCost:Float = getWaterCost(waterConsumption, literCost, isNumerous, isSingleParent, familySize, hasSocialBonus)
}

/**
 * This method calls the function readInt() to ask the user how many liters of water he'd used.
 * @return Integer with the liters of water specified by the user.
 * @see readInt
 */
fun getWaterConsumption():Int {
    return readInt(BLUE + "How many liters of water have you used this month? $RESET", "Wrong data type. Please, enter a valid number!", "Value too small. Please, enter a number greater than 0!", 0)
}

/**
 * This method calls the function readBoolean() to ask the user if he is a numerous family.
 * @return Boolean of whether the user is a numerous family or not.
 * @see readBoolean
 */
fun isNumerousFamily():Boolean {
    return readBoolean(BLUE + "Are you a numerous family? (true/false) $RESET", "Wrong data type. Please, enter a valid value!")
}

/**
 * This method calls the function readBoolean() to ask the user if he part of a single-parent family.
 * @return Boolean of whether the user forms part of a single-parent family or not.
 * @see readBoolean
 */
fun isSingleParentFamily(): Boolean {
    return readBoolean(BLUE + "Are you part of a single-parent family? (true/false) $RESET", "Wrong data type. Please, enter a valid value!")
}

/**
 * This method calls the function readInt() to ask the user how many people are there in his family.
 * @return Integer with the amount of people in the family.
 * @see readInt
 */
fun getFamilySize(): Int {
    return readInt(BLUE + "How many people are there in your family? $RESET", "Wrong data type. Please, enter a valid number!", "Value too small. Please, enter a number greater than 2!", 2)
}

/**
 * This method calls the function readBoolean() to ask the user if he has a social bonus.
 * @return Boolean of whether the user has a social bonus or not.
 * @see readBoolean
 */
fun hasSocialBonus():Boolean {
    return readBoolean(BLUE + "Do you have a social bonus? (true/false) $RESET", "Wrong data type. Please, enter a valid value!")
}

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
 * This method calculates the variable cost of the water invoice based on all deductions.
 * @param waterConsumption Integer of the liters consumed.
 * @param literCost Float of the cost per liter of water.
 * @param isNumerous Boolean of whether the user forms part of a numerous family or not.
 * @param isSingleParent Boolean of whether the user forms part of a single-parent family or not.
 * @param familySize Integer of the amount of people on the user's family. This parameter is optional.
 * @param hasSocialBonus Boolean of whether the user has a social bonus or not.
 * @return Float of the final cost of the water consumed.
 * @author Picuu
 * @since 10/01/2024
 */
fun getWaterCost(waterConsumption: Int, literCost: Float, isNumerous: Boolean, isSingleParent: Boolean, familySize: Int = 0, hasSocialBonus: Boolean): Float {
    val waterCost:Float = waterConsumption * literCost

    if (hasSocialBonus) return waterCost * .2f
    if (isNumerous) return waterCost * .5f
    if (isSingleParent) return waterCost * (familySize / 10)

    return waterCost
}