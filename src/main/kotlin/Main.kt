fun main() {
    println("$WHITE_BACKGROUND_BRIGHT$BLACK_BOLD    CALCULATE WATER INVOICE    $RESET")
    val waterConsumption:Int = getWaterConsumption()

}

/**
 * This method calls the function readInt() to ask the user how many liters of water he'd used.
 * @return Integer with the liters of water specified by the user.
 * @see readInt
 */
fun getWaterConsumption():Int {
    return readInt(BLUE + "How many liters of water have you used this month? $RESET", "Wrong data type. Please, enter a valid number!", "Value too small. Please, enter a number greater than 0!", 0)
}