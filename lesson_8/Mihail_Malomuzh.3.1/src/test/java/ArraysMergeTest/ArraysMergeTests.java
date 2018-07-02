package ArraysMergeTest;

import static ArraysForTests.ArraysFromHomeWork6.Merge;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class ArraysMergeTests {
    private int a[];
    private int b[];
    private int c[];
    private int ind1;
    private int ind2;

    @Before
    public void setUp() {
        Random rnd = new Random();

        a = new int[10 + rnd.nextInt(20)];
        for (int i = 0; i < a.length; i++)
            a[i]= rnd.nextInt(200) - 100;
        Arrays.sort(a);

        b = new int[10 + rnd.nextInt(20)];
        for (int i = 0; i < b.length; i++)
           b[i]= rnd.nextInt(200) - 100;
        Arrays.sort(b);

        ind2 = 1 + rnd.nextInt(a.length + b.length - 1);
        ind1 = rnd.nextInt(ind2);

        c = Merge(a,b);
        int f = 0;
    }

    @Test
    public void testMergedArrayLength(){
        assertThat(a.length + b.length, is(c.length));
    }

    @Test
    public void testMergedArrayElementsValues(){
        assertThat(c[ind2]- c[ind1] >= 0, is(true));
    }

    @Test
    public void testMergedArrayElementsValuesSumEqualsIncomingArraysValuesSum(){
        int aSum = 0;
        int bSum = 0;
        int cSum = 0;
        for (int i = 0; i < a.length; i++)
            aSum += a[i];
        for (int i = 0; i < b.length; i++)
            bSum += b[i];
        for (int i = 0; i < c.length; i++)
            cSum += c[i];
        assertThat(aSum + bSum, is(cSum));
    }






}
