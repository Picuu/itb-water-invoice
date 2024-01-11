import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.*

class FunctionsKtTest {

/* //    This tests can't be executed because we cannot write keyboard inputs while executing tests.
    @Test
    fun testGetWaterConsumption() {
        assertNotNull(getWaterConsumption())
        assertTrue(getWaterConsumption() is Int)
    }

    @Test
    fun testIsNumerousFamily() {
        assertNotNull(isNumerousFamily())
        assertTrue(isNumerousFamily() is Boolean)
    }

    @Test
    fun testIsSingleParnetFamily() {
        assertNotNull(isSingleParentFamily())
        assertTrue(isSingleParentFamily() is Boolean)
    }

    @Test
    fun testGetFamilySize() {
        assertNotNull(getFamilySize())
        assertTrue(getFamilySize() is Int)
    }

    @Test
    fun testHasSocialBonus() {
        assertNotNull(hasSocialBonus())
        assertTrue(hasSocialBonus() is Boolean)
    }
*/

    @Test
    fun testGetFixedFee() {
        assertNotNull(getFixedFee(true))
        assertNotNull(getFixedFee(false))
        assertTrue(getFixedFee(true) is Int)
        assertTrue(getFixedFee(false) is Int)
        assertEquals(3, getFixedFee(true))
        assertEquals(6, getFixedFee(false))
    }

    @Test
    fun testGetLiterCost() {
        assertNotNull(getLiterCost(0))
        assertTrue(getLiterCost(0) is Float)
        assertEquals(.3f, getLiterCost(400))
        assertEquals(.15f, getLiterCost(100))
    }

    @Test
    fun testGetDiscount() {
        assertNotNull(getDiscount(false, false, 0, false))
        assertNotNull(getDiscount(true, true, 10, true))
        assertTrue(getDiscount(false, false, 0, false) is Float)
        assertTrue(getDiscount(true, true, 10, true) is Float)
        assertEquals(.2f, getDiscount(true, true, 4, true))
        assertEquals(.5f, getDiscount(true, true, 4, false))
        assertEquals(.5f, getDiscount(false, true, 6, false))
        assertEquals(.7f, getDiscount(false, true, 3, false))
        assertEquals(1f, getDiscount(false, false, 0, false))
    }

    @Test
    fun testGetWaterCost() {
        assertNotNull(getWaterCost(0, 0f, 0f))
        assertTrue(getWaterCost(0, 0f, 0f) is Float)
        assertEquals(15f, getWaterCost(100, .15f, 1f))
        assertEquals(7.5f, getWaterCost(100, .15f, .5f))
        assertEquals(37.5f, getWaterCost(250, .3f, .5f))
    }

}