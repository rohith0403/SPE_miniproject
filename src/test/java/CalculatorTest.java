import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void main() {
        Calculator c = new Calculator();
        double x = c.sq_root(4.0);
        assertEquals(2.0, 4.0);
    }
}