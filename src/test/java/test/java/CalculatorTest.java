package test.java;

/**
 * Created by abbyr on 12/03/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
import main.java.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
   @Test
   void testAddition() {
      Calculator calc = new Calculator();
      assertEquals(5, calc.add(2, 3)); // Check if 2 + 3 = 5
   }
}
