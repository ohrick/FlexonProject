import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class test {
    @Test
    public void testSum() {
        System.out.println("Array Generator");
        arrayGenerator ag = new arrayGenerator(3);
        ag.getInteger(0, 10);
        ag.getInteger(1, 1);
        ag.getInteger(2, 5);

        assertEquals(1, ag.findMin());
        assertEquals(10, ag.findMax());

        int[] expectedReverseArray = {5,1,10};
        Assert.assertArrayEquals(expectedReverseArray, ag.reverseArray());

        int[] expectedSortArray = {10, 5, 1};
        Assert.assertArrayEquals(expectedSortArray, ag.sortIntegers());
    }
}
