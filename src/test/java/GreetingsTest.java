import org.example.Greetings;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

public class GreetingsTest {
    @Test
    public void testGreet(){
        Greetings gree = new Greetings();
        Assertions.assertEquals("Hello",gree.greet());

    }
}
