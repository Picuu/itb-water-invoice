fun main() {
    println("$WHITE_BACKGROUND_BRIGHT$BLACK_BOLD    CALCULATE WATER INVOICE    $RESET")
    val waterConsumption:Int = getWaterConsumption()

    val hasSocialBonus:Boolean
    var isNumerous:Boolean = false
    var isSingleParent:Boolean = false
    var familySize:Int = 0
    var fixedFee:Int = getFixedFee(false)
    var totalCost:Float = fixedFee.toFloat()

    if (waterConsumption >= 50) {
        hasSocialBonus = hasSocialBonus()

        if (!hasSocialBonus) {
            isNumerous = isNumerousFamily()
            if (!isNumerous) {
                isSingleParent = isSingleParentFamily()
                if (isSingleParent) familySize = getFamilySize()
            }
        }

        fixedFee = getFixedFee(hasSocialBonus)
        val literCost:Float = getLiterCost(waterConsumption)
        val discount: Float = getDiscount(isNumerous, isSingleParent, familySize, hasSocialBonus)
        val waterCost:Float = getWaterCost(waterConsumption, literCost, discount)

        totalCost = fixedFee + waterCost

        showInvoice(waterConsumption, literCost, waterCost, fixedFee, totalCost, hasSocialBonus, isNumerous, isSingleParent, familySize, discount)
    } else {
        showInvoice(waterConsumption, fixedFee =  fixedFee, totalCost = totalCost)
    }
}

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
