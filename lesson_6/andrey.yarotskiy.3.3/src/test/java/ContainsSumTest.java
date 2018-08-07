import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Created by My on 04.08.2018.
 */
public class ContainsSumTest {
    @Test
    public void contains(){
        int a[] = {1, 5, 7, 9, 12};
        int sum = 12;
        assertTrue(ContainsSum.containsSum(a,sum));
    }
    @Test
    public void notContains(){
        int a[] = {1, 5, 9, 12};
        int sum = 11;
        assertFalse(ContainsSum.containsSum(a,sum));
    }
}
