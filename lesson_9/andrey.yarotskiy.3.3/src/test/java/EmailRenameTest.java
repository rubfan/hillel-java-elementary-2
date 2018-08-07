/**
 * Created by My on 07.08.2018.
 */
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


import static org.junit.Assert.*;

public class EmailRenameTest {
    @Test
    public void renameTest(){
        assertThat(EmailRename.rename("person@gmail.com"), equalTo("person[ at ]gmail[ dot ]com"));
    }
}
