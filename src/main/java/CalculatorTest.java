import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, Calculator.subtract(3, 2));
    }
    
}
