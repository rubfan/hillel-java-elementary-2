package ua.od.hillel;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

/**
 * Created by ruslangramatic on 4/14/18.
 */
public class CalculatorTest {
    private ICalculator calc;

    @Before
    public void init(){
        calc = new Calculator();
    }

    @Test
    public void addTest() {
        calc.add(10f, 10f);
        assertTrue(calc.getResult() == 20);
        assertEquals(Double.valueOf(20), calc.getResult());
    }

    @Test
    public void divTest() {
        calc.div(20f, 10f);
        assertTrue(calc.getResult() == 2);
    }

    @Test
    public void mulTest() {
        calc.mul(10f, 10f);
        assertTrue(calc.getResult() == 100);
        assertThat(calc.getResult(), instanceOf(Integer.class));
    }

}
