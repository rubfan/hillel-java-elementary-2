package SumTest;

import static ArraysForTests.ArraysFromHomeWork6.Sum;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class SumTests {
    private int a[];
    private int ind1;
    private int ind2;
    private Random rnd = new Random();

    @Before
    public void setUp() {
        a = new int[10 + rnd.nextInt(20)];
        for (int i = 0; i < a.length; i++)
            a[i]= rnd.nextInt(200) - 100;
        Arrays.sort(a);
    }

    @Test
    public void testSumMustTrue(){
        for (int i = 1; i < 10000; i++) {
            ind2 = rnd.nextInt(a.length - 2) + 1;
            ind1 = rnd.nextInt(ind2);
            assertThat(Sum(a, a[ind1] + a[ind2]), is(true));
        }
    }
    @Test
    public void testSumMustFalse(){
        assertThat(Sum(a, 2* a[a.length - 1] + 1), is(false));
    }

}
