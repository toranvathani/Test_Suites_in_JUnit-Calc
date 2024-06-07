import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void checkAdd(){
        Calculator calc = new Calculator();
        Assertions.assertEquals(4,calc.add(2,2));
    }
}
