/**
 * Created by My on 04.08.2018.
 */

import org.junit.Test;

import static org.junit.Assert.*;
public class MergeArraysTest {
    @Test
    public void mergeTest(){
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 8, 9, 12};
        int[] c = {1, 2, 3, 4, 5, 8, 9, 12};
        assertArrayEquals(MergeArrays.merge(a,b), c);
    }
}
