package preconditions

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

internal class FooTest {

    @Test
    fun checkArgument_trueCondition_doesNothing() {
        checkArgument(true)
    }

    @Test
    fun checkArgument_falseCondition_throwsIllegalArgumentException() {
        assertFailsWith<IllegalArgumentException> { checkArgument(false) }
    }

    @Test
    fun checkArgument_falseConditionWithCustomMessage_throwsIllegalArgumentException() {
        val exception =
            assertFailsWith<IllegalArgumentException> { checkArgument(false, "custom error message") }
        assertEquals("custom error message", exception.message)
    }
}