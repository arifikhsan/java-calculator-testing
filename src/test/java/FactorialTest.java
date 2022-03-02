import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void factorialOf() {
        assertEquals(24, Factorial.factorialOf(4));
        assertEquals(120, Factorial.factorialOf(5));
    }
}