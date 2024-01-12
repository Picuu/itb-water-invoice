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

/** This function prints a styled invoice, showing all discounts, deductions and prices.
 * @param waterConsumption Integer of the liters consumed.
 * @param literCost Float of the cost per liter of water.
 * @param waterCost Float of the cost of the water based on the liters consumed.
 * @param fixedFee Integer of the fixed fee import.
 * @param totalCost Float of the total cost of the water invoice.
 * @param hasSocialBonus Boolean of whether the user has a social bonus or not.
 * @param isNumerous Boolean of whether the user forms part of a numerous family or not.
 * @param isSingleParent Boolean of whether the user forms part of a single-parent family or not.
 * @param familySize Integer of the amount of people on the user's family. This parameter is optional.
 * @param discount Float of the discount to apply to the price.
 * @author Picuu
 * @since 11/01/2024
 */
fun showInvoice(waterConsumption: Int, literCost: Float = 0f, waterCost: Float = 0f, fixedFee: Int, totalCost: Float,
                hasSocialBonus: Boolean = false, isNumerous: Boolean = false, isSingleParent: Boolean = false,
                familySize: Int = 0, discount: Float = 0f) {

    val waterRealCost = roundToFloat(waterConsumption * literCost, 2)
    val discountAmount = roundToFloat(waterRealCost - roundToFloat(waterCost, 2), 2)
    val discountPercentage = 100 - (discount * 100)

    println("\n**************************************************")
    println("$BLUE_BACKGROUND_BRIGHT$BLACK_BOLD                Water Bill Invoice                $RESET")
    println("${RED}Fixed Fee: $fixedFee€$RESET")
    println("$PURPLE--------------------------------------------------$RESET")
    println("${YELLOW_UNDERLINED}Consumption Details:$RESET")
    println("   Water Consumption: $BLUE$waterConsumption liters$RESET")
    println("   Rate per Liter: $BLUE$literCost€$RESET\n")
    println("   ${CYAN}Total Water Cost:$RESET $GREEN_BRIGHT$waterRealCost€$RESET")
    println("$PURPLE--------------------------------------------------$RESET")
    println("${YELLOW_UNDERLINED}Discounts:$RESET")

    if (hasSocialBonus)
        println("   Social Bonus: -$discountAmount€ ($discountPercentage%)")
    else if (isNumerous)
        println("   Numerous Family: -$discountAmount€ ($discountPercentage%)")
    else if (isSingleParent)
        println("   Single Parent Family of $familySize: -$discountAmount€ ($discountPercentage%)")
    else
        println("   You do not apply for any discounts.")

    println("\n   ${CYAN}Final Water Cost:$RESET $GREEN_BRIGHT${roundToFloat(waterCost, 2)}€$RESET")
    println("$PURPLE--------------------------------------------------$RESET")
    println("${CYAN_BOLD_BRIGHT}Total Amount Due:$RESET $GREEN_BRIGHT${roundToFloat(totalCost, 2)}€$RESET")
    println("**************************************************\n")
}