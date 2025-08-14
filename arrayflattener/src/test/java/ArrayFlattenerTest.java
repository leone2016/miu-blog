import com.arrayflattener.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ArrayFlattenerTest {
    private final Main main = new Main();

    @Test
    void testFlattenWithValidArray() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expected = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(expected, main.flattenArray(input));
    }

    @Test
    void testFlattenWithNullInput() {
        assertNull(main.flattenArray(null));
    }

}
