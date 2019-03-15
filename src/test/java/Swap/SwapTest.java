package Swap;

import org.junit.Assert;
import org.junit.Test;

/**
 * Get the tests passing.
 */
public class SwapTest {
    @Test
    public void testSwap() throws Exception {
        Object[] result = Swap.swap(0,1, 1.5, 2,3);
        Object[] expected = {2, 1.5, 3};
        Assert.assertArrayEquals(expected, result);
    }
}