import.org.junit.Test;
import java.math.BigDecimal;


public class CalculatorTest {
    @Test
    public void testNewCalculatorHasAnAccumulatorOfZero() {
        Calculator calculator = new Calculator();
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }

}
