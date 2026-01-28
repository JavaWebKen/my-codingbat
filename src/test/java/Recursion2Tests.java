
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Recursion2Tests {

    Recursion2 recursion2 = new Recursion2();

    @Disabled
    @Test
    public void groupSum() {
        assertEquals(true, recursion2.groupSum(0, new int[] { 2, 4, 8 }, 10));
        assertEquals(true, recursion2.groupSum(0, new int[] { 2, 4, 8 }, 14));
        assertEquals(false, recursion2.groupSum(0, new int[] { 2, 4, 8 }, 9));
        assertEquals(true, recursion2.groupSum(0, new int[] { 2, 4, 8 }, 8));
        assertEquals(true, recursion2.groupSum(1, new int[] { 2, 4, 8 }, 8));
        assertEquals(false, recursion2.groupSum(1, new int[] { 2, 4, 8 }, 2));
        assertEquals(true, recursion2.groupSum(0, new int[] { 1 }, 1));
        assertEquals(false, recursion2.groupSum(0, new int[] { 9 }, 1));
        assertEquals(true, recursion2.groupSum(1, new int[] { 9 }, 0));
        assertEquals(true, recursion2.groupSum(0, new int[] {}, 0));
        assertEquals(true, recursion2.groupSum(0, new int[] { 10, 2, 2, 5 }, 17));
        assertEquals(true, recursion2.groupSum(0, new int[] { 10, 2, 2, 5 }, 15));
        assertEquals(true, recursion2.groupSum(0, new int[] { 10, 2, 2, 5 }, 9));
    }

    @Disabled
    @Test
    public void groupSum6() {
        assertEquals(true, recursion2.groupSum6(0, new int[] { 5, 6, 2 }, 8));
        assertEquals(false, recursion2.groupSum6(0, new int[] { 5, 6, 2 }, 9));
        assertEquals(false, recursion2.groupSum6(0, new int[] { 5, 6, 2 }, 7));
        assertEquals(true, recursion2.groupSum6(0, new int[] { 1 }, 1));
        assertEquals(false, recursion2.groupSum6(0, new int[] { 9 }, 1));
        assertEquals(true, recursion2.groupSum6(0, new int[] {}, 0));
        assertEquals(true, recursion2.groupSum6(0, new int[] { 3, 2, 4, 6 }, 8));
        assertEquals(true, recursion2.groupSum6(0, new int[] { 6, 2, 4, 3 }, 8));
        assertEquals(false, recursion2.groupSum6(0, new int[] { 5, 2, 4, 6 }, 9));
        assertEquals(false, recursion2.groupSum6(0, new int[] { 6, 2, 4, 5 }, 9));
        assertEquals(false, recursion2.groupSum6(0, new int[] { 3, 2, 4, 6 }, 3));
        assertEquals(true, recursion2.groupSum6(0, new int[] { 1, 6, 2, 6, 4 }, 12));
        assertEquals(true, recursion2.groupSum6(0, new int[] { 1, 6, 2, 6, 4 }, 13));
        assertEquals(false, recursion2.groupSum6(0, new int[] { 1, 6, 2, 6, 4 }, 4));
        assertEquals(false, recursion2.groupSum6(0, new int[] { 1, 6, 2, 6, 4 }, 9));
        assertEquals(true, recursion2.groupSum6(0, new int[] { 1, 6, 2, 6, 5 }, 14));
        assertEquals(true, recursion2.groupSum6(0, new int[] { 1, 6, 2, 6, 5 }, 15));
        assertEquals(false, recursion2.groupSum6(0, new int[] { 1, 6, 2, 6, 5 }, 16));
    }

    @Disabled
    @Test
    public void groupNoAdj() {
        assertEquals(true, recursion2.groupNoAdj(0, new int[] { 2, 5, 10, 4 }, 12));
        assertEquals(false, recursion2.groupNoAdj(0, new int[] { 2, 5, 10, 4 }, 14));
        assertEquals(false, recursion2.groupNoAdj(0, new int[] { 2, 5, 10, 4 }, 7));
        assertEquals(true, recursion2.groupNoAdj(0, new int[] { 2, 5, 10, 4, 2 }, 7));
        assertEquals(true, recursion2.groupNoAdj(0, new int[] { 2, 5, 10, 4 }, 9));
        assertEquals(true, recursion2.groupNoAdj(0, new int[] { 10, 2, 2, 3, 3 }, 15));
        assertEquals(false, recursion2.groupNoAdj(0, new int[] { 10, 2, 2, 3, 3 }, 7));
        assertEquals(true, recursion2.groupNoAdj(0, new int[] {}, 0));
        assertEquals(true, recursion2.groupNoAdj(0, new int[] { 1 }, 1));
        assertEquals(false, recursion2.groupNoAdj(0, new int[] { 9 }, 1));
        assertEquals(true, recursion2.groupNoAdj(0, new int[] { 9 }, 0));
        assertEquals(true, recursion2.groupNoAdj(0, new int[] { 5, 10, 4, 1 }, 11));
    }

    @Disabled
    @Test
    public void groupSum5() {
        assertEquals(true, recursion2.groupSum5(0, new int[] { 2, 5, 10, 4 }, 19));
        assertEquals(true, recursion2.groupSum5(0, new int[] { 2, 5, 10, 4 }, 17));
        assertEquals(false, recursion2.groupSum5(0, new int[] { 2, 5, 10, 4 }, 12));
        assertEquals(false, recursion2.groupSum5(0, new int[] { 2, 5, 4, 10 }, 12));
        assertEquals(false, recursion2.groupSum5(0, new int[] { 3, 5, 1 }, 4));
        assertEquals(true, recursion2.groupSum5(0, new int[] { 3, 5, 1 }, 5));
        assertEquals(true, recursion2.groupSum5(0, new int[] { 1, 3, 5 }, 5));
        assertEquals(false, recursion2.groupSum5(0, new int[] { 3, 5, 1 }, 9));
        assertEquals(false, recursion2.groupSum5(0, new int[] { 2, 5, 10, 4 }, 7));
        assertEquals(true, recursion2.groupSum5(0, new int[] { 2, 5, 10, 4 }, 15));
        assertEquals(false, recursion2.groupSum5(0, new int[] { 2, 5, 10, 4 }, 11));
        assertEquals(true, recursion2.groupSum5(0, new int[] { 1 }, 1));
        assertEquals(false, recursion2.groupSum5(0, new int[] { 9 }, 1));
        assertEquals(true, recursion2.groupSum5(0, new int[] { 9 }, 0));
        assertEquals(true, recursion2.groupSum5(0, new int[] {}, 0));
    }

    @Disabled
    @Test
    public void groupSumClump() {
        assertEquals(true, recursion2.groupSumClump(0, new int[] { 2, 4, 8 }, 10));
        assertEquals(true, recursion2.groupSumClump(0, new int[] { 1, 2, 4, 8, 1 }, 14));
        assertEquals(false, recursion2.groupSumClump(0, new int[] { 2, 4, 4, 8 }, 14));
        assertEquals(true, recursion2.groupSumClump(0, new int[] { 8, 2, 2, 1 }, 9));
        assertEquals(false, recursion2.groupSumClump(0, new int[] { 8, 2, 2, 1 }, 11));
        assertEquals(true, recursion2.groupSumClump(0, new int[] { 1 }, 1));
        assertEquals(false, recursion2.groupSumClump(0, new int[] { 9 }, 1));
    }

    @Disabled
    @Test
    public void splitArray() {
        assertEquals(true, recursion2.splitArray(new int[] { 2, 2 }));
        assertEquals(false, recursion2.splitArray(new int[] { 2, 3 }));
        assertEquals(true, recursion2.splitArray(new int[] { 5, 2, 3 }));
        assertEquals(false, recursion2.splitArray(new int[] { 5, 2, 2 }));
        assertEquals(true, recursion2.splitArray(new int[] { 1, 1, 1, 1, 1, 1 }));
        assertEquals(false, recursion2.splitArray(new int[] { 1, 1, 1, 1, 1 }));
        assertEquals(true, recursion2.splitArray(new int[] {}));
        assertEquals(false, recursion2.splitArray(new int[] { 1 }));
        assertEquals(false, recursion2.splitArray(new int[] { 3, 5 }));
        assertEquals(true, recursion2.splitArray(new int[] { 5, 3, 2 }));
        assertEquals(true, recursion2.splitArray(new int[] { 2, 2, 10, 10, 1, 1 }));
        assertEquals(false, recursion2.splitArray(new int[] { 1, 2, 2, 10, 10, 1, 1 }));
        assertEquals(true, recursion2.splitArray(new int[] { 1, 2, 3, 10, 10, 1, 1 }));
    }

    @Disabled
    @Test
    public void splitOdd10() {
        assertEquals(true, recursion2.splitOdd10(new int[] { 5, 5, 5 }));
        assertEquals(false, recursion2.splitOdd10(new int[] { 5, 5, 6 }));
        assertEquals(true, recursion2.splitOdd10(new int[] { 5, 5, 6, 1 }));
        assertEquals(true, recursion2.splitOdd10(new int[] { 6, 5, 5, 1 }));
        assertEquals(true, recursion2.splitOdd10(new int[] { 6, 5, 5, 1, 10 }));
        assertEquals(false, recursion2.splitOdd10(new int[] { 6, 5, 5, 5, 1 }));
        assertEquals(true, recursion2.splitOdd10(new int[] { 1 }));
        assertEquals(false, recursion2.splitOdd10(new int[] {}));
        assertEquals(true, recursion2.splitOdd10(new int[] { 10, 7, 5, 5 }));
        assertEquals(false, recursion2.splitOdd10(new int[] { 10, 0, 5, 5 }));
        assertEquals(true, recursion2.splitOdd10(new int[] { 10, 7, 5, 5, 2 }));
        assertEquals(false, recursion2.splitOdd10(new int[] { 10, 7, 5, 5, 1 }));
    }

    @Disabled
    @Test
    public void split53() {
        assertEquals(true, recursion2.split53(new int[] { 1, 1 }));
        assertEquals(false, recursion2.split53(new int[] { 1, 1, 1 }));
        assertEquals(true, recursion2.split53(new int[] { 2, 4, 2 }));
        assertEquals(false, recursion2.split53(new int[] { 2, 2, 2, 1 }));
        assertEquals(true, recursion2.split53(new int[] { 3, 3, 5, 1 }));
        assertEquals(false, recursion2.split53(new int[] { 3, 5, 8 }));
        assertEquals(true, recursion2.split53(new int[] { 2, 4, 6 }));
        assertEquals(true, recursion2.split53(new int[] { 3, 5, 6, 10, 3, 3 }));
    }

}