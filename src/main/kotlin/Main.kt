fun main() {
    println("$WHITE_BACKGROUND_BRIGHT$BLACK_BOLD    CALCULATE WATER INVOICE    $RESET")
    val waterConsumption:Int = getWaterConsumption()

    val hasSocialBonus:Boolean = hasSocialBonus()
    var isNumerous:Boolean = false
    var isSingleParent:Boolean = false
    var familySize:Int = 0

    if (!hasSocialBonus) {
        isNumerous = isNumerousFamily()
        if (!isNumerous) {
            isSingleParent = isSingleParentFamily()
            if (isSingleParent) familySize = getFamilySize()
        }
    }


    val fixedFee:Int = getFixedFee(hasSocialBonus)
    val literCost:Float = getLiterCost(waterConsumption)
    val waterCostOUT:Float = getWaterCost(waterConsumption, literCost, isNumerous, isSingleParent, familySize, hasSocialBonus)

    var totalCost:Float = fixedFee.toFloat()

    if (waterConsumption > 50) totalCost = fixedFee + waterCostOUT

    println("$totalCost€")
    // println(showTicket())
}
