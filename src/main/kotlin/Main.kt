fun main() {
    println("$WHITE_BACKGROUND_BRIGHT$BLACK_BOLD    CALCULATE WATER INVOICE    $RESET")
    val waterConsumption:Int = getWaterConsumption()

    var hasSocialBonus:Boolean = false
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
    }

    println("$totalCost€")
    // println(showTicket())
}
