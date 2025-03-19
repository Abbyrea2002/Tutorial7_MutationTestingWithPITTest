import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by abbyr on 12/03/2025
 * COMMENTS ABOUT PROGRAM HERE
 */
public class CalculatorTest
{
   @Test
   void testAddition() {
      Calculator calc = new Calculator();
      assertEquals(5, calc.add(2, 3)); // Check if 2 + 3 = 5
   }
}//class
