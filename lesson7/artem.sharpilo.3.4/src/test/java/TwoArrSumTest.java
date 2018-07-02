import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoArrSumTest {
    int[] a = new int[]{1, 3, 5};
    int[] b = new int[]{2, 4, 8, 9, 12};


    @Test
    public void testArrSum() {
        int[] c = new int[a.length + b.length];
        assertTrue(c.length == (a.length + b.length));

    }

    @Test
    public void testRightOrder() {
        int[] c = new int[a.length + b.length];
        int i1 = 0;
        int o;

        for (o = 0; o < c.length; ++o) {
            if (o < a.length) {
                c[o] = a[o];
            } else {
                c[o] = b[i1];
                ++i1;
            }
        }

        Arrays.sort(c);
        for (int i = 0; i < c.length-2; i++) {
            assertTrue(c[i] < c[i+1]);
        }
    }
}