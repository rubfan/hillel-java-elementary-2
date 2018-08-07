import org.junit.Test;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by My on 07.08.2018.
 */
public class PalindromeTest {
    @Test
    public void isPalindromeTest(){
        assertThat(Palindrome.isPalindrome("Dogogod"), is(true));
        assertThat(Palindrome.isPalindrome("NotAPalindrome"), is(false));
    }
    @Test
    public void howManyPalindromes(){
        assertThat(Palindrome.howManyPalindromes("deleveled, evitative, cat, dog, deified"),
                is("There are 3 palindromes in the text"));
    }
}
