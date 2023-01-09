import org.example.BalancedWordsCounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BalancedWordsCounterTest {

    private final BalancedWordsCounter b = new BalancedWordsCounter();

    @Test
    public void countsCorrectly() {
        assertEquals(28, b.count("aabbabcccba"));
        assertEquals(0, b.count(""));
    }

    @Test
    public void throwsExceptions() {
        RuntimeException re1 = assertThrows(RuntimeException.class, () -> b.count("abababa1"));
        assertEquals("The string contains symbols other than letters.", re1.getMessage());
        RuntimeException re2 = assertThrows(RuntimeException.class, () -> b.count(null));
        assertEquals("Input is null.", re2.getMessage());
    }
}
