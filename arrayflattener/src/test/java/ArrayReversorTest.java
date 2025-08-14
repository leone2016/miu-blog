
import com.arrayflattener.ArrayFlattenerService;
import com.arrayflattener.ArrayReversor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class ArrayReversorTest {

    @Test
    void testReverseArrayWithValidInput() {
        ArrayFlattenerService mockService = mock(ArrayFlattenerService.class);
        int[][] input = { {1,3}, {0}, {4,5,9} };
        int[] flattened = {1,3,0,4,5,9};

        when(mockService.flattenArray(input)).thenReturn(flattened);

        ArrayReversor reversor = new ArrayReversor(mockService);
        int[] result = reversor.reverseArray(input);

        int[] expected = {9,5,4,0,3,1};
        assertArrayEquals(expected, result);

        verify(mockService, times(1)).flattenArray(input);
    }

    @Test
    void testReverseArrayWithNullInput() {
        ArrayFlattenerService mockService = mock(ArrayFlattenerService.class);
        when(mockService.flattenArray(null)).thenReturn(null);

        ArrayReversor reversor = new ArrayReversor(mockService);
        assertNull(reversor.reverseArray(null));

        verify(mockService, times(1)).flattenArray(null);
    }
}
