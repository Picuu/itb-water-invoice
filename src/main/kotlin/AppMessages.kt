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