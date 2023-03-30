package Testing;

import org.junit.*;
import static org.junit.Assert.*;

import java.beans.Transient;

public class TestOperations {
    private CalculatorTest calculator;

    @Before
    public void setUp() {
        calculator = new CalculatorTest();
    }

    @Test
    public void addition() {
        assertEquals(5, calculator.add(3, 2));
    }

    @Test
    public void additionIncorrec() {
        assertNotEquals(4, calculator.add(3, 2));
    }

    @Test
    public void subtract() {
        assertEquals(1, calculator.subtract(3, 2));
    }

}
