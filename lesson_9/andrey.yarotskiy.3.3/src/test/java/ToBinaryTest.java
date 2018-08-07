import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by My on 07.08.2018.
 */
public class ToBinaryTest {
    @Test
    public void toBinaryTest(){
        assertThat(ToBinary.toBinary(0),is("0"));
        assertThat(ToBinary.toBinary(1),is("1"));
        assertThat(ToBinary.toBinary(2),is("10"));
        assertThat(ToBinary.toBinary(3),is("11"));

        assertThat(ToBinary.toBinary(156),is("10011100"));
        assertThat(ToBinary.toBinary(256),is("100000000"));
        assertThat(ToBinary.toBinary(1024),is("10000000000"));
        assertThat(ToBinary.toBinary(2048),is("100000000000"));

        assertThat(ToBinary.toBinary(-1),is("-1"));
        assertThat(ToBinary.toBinary(-1024),is("-10000000000"));


    }
}
