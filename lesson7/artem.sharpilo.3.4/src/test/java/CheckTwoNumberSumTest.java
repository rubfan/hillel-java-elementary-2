import org.junit.Before;
import org.junit.Test;
import org.hamcrest.*;

import java.util.regex.Matcher;

import static org.junit.Assert.*;

public class CheckTwoNumberSumTest {
    int[] a = new int[]{1, 4, 8, 9, 10};
    int sum = 15;
    int res = 0;




    @Test
    public void testCheckArr() {
        int res = 0;
        for (int i = 0; i < a.length - 1; ++i) {
            if (a[i] + a[i + 1] == sum) {
                ++res;
            }
        }

        System.out.println(res);

        assertThat(sum, Matchers.equalTo(15));
        assertThat(res, Matchers.notNullValue());

    }
    @Test
    public void testResult(){
        assertThat(res, Matchers.equalTo(0));

    }

}

