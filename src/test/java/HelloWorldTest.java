import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.HelloWorld;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    public void testGetGreeting() {
        HelloWorld hello = new HelloWorld();
        String expected = "Hello, World!";
        String actual = hello.getGreeting();

        assertEquals(expected, actual, "The greeting should be 'Hello, World!'");
    }
}
