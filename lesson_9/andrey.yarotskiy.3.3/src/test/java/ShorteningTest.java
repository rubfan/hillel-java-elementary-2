/**
 * Created by My on 07.08.2018.
 */
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;


import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class ShorteningTest {
    @Test
    public void cut(){

        String input = "internationalization";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertThat("i18n", equalTo(Shortening.cut()));
        input = "internationalization localization cat elephant monitor";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertThat("i18n l10n cat e6t m5r", equalTo(Shortening.cut()));
    }

}
