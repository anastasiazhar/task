import org.example.BubbleSort;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BubbleSortTest {

    private final BubbleSort b = new BubbleSort();

    @Test
    public void sortsCorrectly() {
        assertEquals(Arrays.asList(1,3,4,5,6,8,8), b.sort(Arrays.asList(1,4,5,6,8,3,8)));
        assertEquals(Arrays.asList(-9.3d,0.1d,0.2d,4d,5d,9d), b.sort(Arrays.asList(-9.3d,0.2d,4d,0.1d,5d,9d)));
        assertEquals(new ArrayList<Integer>(), b.sort(new ArrayList<Integer>()));
    }

    @Test
    public void managesNullValues() {
        assertEquals(Arrays.asList(5.0001d), b.sort(Arrays.asList(null,5.0001d)));
        assertThrows(RuntimeException.class, () -> b.sort(null));
    }
}
