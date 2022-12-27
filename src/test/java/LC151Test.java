import static org.junit.Assert.*;

public class LC151Test {

    @org.junit.Test
    public void reverseWords() {
        String actual1 = LC151.reverseWords("the sky is blue");
        String actual2 = LC151.reverseWords("  hello world  ");
        String actual3 = LC151.reverseWords("a good   example");

        assertEquals(actual1, "blue is sky the");
        assertEquals(actual2, "world hello");
        assertEquals(actual3, "example good a");
    }
}