import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void main() {
        Calculator c = new Calculator();
        double x = c.sq_root(4.0);
        assertEquals(2.0, x);
        double y = c.sq_root(9.0);
        assertNotEquals(2.0, y);
        int n = c.factorial(5);
        assertEquals(120, n);
        int n2 = c.factorial(5);
        assertNotEquals(10, n2);
        double l = c.logarithm(16.8);
        assertEquals(2.8213788864092133, l);
        double l2 = c.logarithm(5);
        assertNotEquals(2.6, l2);
        double p = c.power(5.0, 2);
        assertEquals(25.0, p);
        double p1 = c.power(2.0, 2);
        assertNotEquals(5.0, p1);



    }
}