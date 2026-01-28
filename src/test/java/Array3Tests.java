
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Array3Tests {

    Array3 array3 = new Array3();

    @Disabled
    @Test
    public void maxSpan() {
        assertEquals(4, array3.maxSpan(new int[] { 1, 2, 1, 1, 3 }));
        assertEquals(6, array3.maxSpan(new int[] { 1, 4, 2, 1, 4, 1, 4 }));
        assertEquals(6, array3.maxSpan(new int[] { 1, 4, 2, 1, 4, 4, 4 }));
        assertEquals(3, array3.maxSpan(new int[] { 3, 3, 3 }));
        assertEquals(3, array3.maxSpan(new int[] { 3, 9, 3 }));
        assertEquals(2, array3.maxSpan(new int[] { 3, 9, 9 }));
        assertEquals(1, array3.maxSpan(new int[] { 3, 9 }));
        assertEquals(2, array3.maxSpan(new int[] { 3, 3 }));
        assertEquals(0, array3.maxSpan(new int[] {}));
        assertEquals(1, array3.maxSpan(new int[] { 1 }));
    }

    @Disabled
    @Test
    public void fix34() {
        assertEquals(new int[] { 1, 3, 4, 1 }, array3.fix34(new int[] { 1, 3, 1, 4 }));
        assertEquals(new int[] { 1, 3, 4, 1, 1, 3, 4 }, array3.fix34(new int[] { 1, 3, 1, 4, 4, 3, 1 }));
        assertEquals(new int[] { 3, 4, 2, 2 }, array3.fix34(new int[] { 3, 2, 2, 4 }));
        assertEquals(new int[] { 3, 4, 3, 4, 2, 2 }, array3.fix34(new int[] { 3, 2, 3, 2, 4, 4 }));
        assertEquals(new int[] { 2, 3, 4, 3, 4, 2, 2 }, array3.fix34(new int[] { 2, 3, 2, 3, 2, 4, 4 }));
        assertEquals(new int[] { 5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4 },
                array3.fix34(new int[] { 5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5 }));
        assertEquals(new int[] { 3, 4, 1 }, array3.fix34(new int[] { 3, 1, 4 }));
        assertEquals(new int[] { 3, 4, 1 }, array3.fix34(new int[] { 3, 4, 1 }));
        assertEquals(new int[] { 1, 1, 1 }, array3.fix34(new int[] { 1, 1, 1 }));
        assertEquals(new int[] { 1 }, array3.fix34(new int[] { 1 }));
        assertEquals(new int[] {}, array3.fix34(new int[] {}));
        assertEquals(new int[] { 7, 3, 4, 7, 7 }, array3.fix34(new int[] { 7, 3, 7, 7, 4 }));
        assertEquals(new int[] { 3, 4, 1, 3, 4, 1 }, array3.fix34(new int[] { 3, 1, 4, 3, 1, 4 }));
        assertEquals(new int[] { 3, 4, 1, 3, 4, 1 }, array3.fix34(new int[] { 3, 1, 1, 3, 4, 4 }));
    }

    @Disabled
    @Test
    public void fix45() {
        assertEquals(new int[] { 9, 4, 5, 4, 5, 9 }, array3.fix45(new int[] { 5, 4, 9, 4, 9, 5 }));
        assertEquals(new int[] { 1, 4, 5, 1 }, array3.fix45(new int[] { 1, 4, 1, 5 }));
        assertEquals(new int[] { 1, 4, 5, 1, 1, 4, 5 }, array3.fix45(new int[] { 1, 4, 1, 5, 5, 4, 1 }));
        assertEquals(new int[] { 4, 5, 4, 5, 9, 9, 4, 5, 9 }, array3.fix45(new int[] { 4, 9, 4, 9, 5, 5, 4, 9, 5 }));
        assertEquals(new int[] { 1, 1, 4, 5, 4, 5 }, array3.fix45(new int[] { 5, 5, 4, 1, 4, 1 }));
        assertEquals(new int[] { 4, 5, 2, 2 }, array3.fix45(new int[] { 4, 2, 2, 5 }));
        assertEquals(new int[] { 4, 5, 4, 5, 2, 2 }, array3.fix45(new int[] { 4, 2, 4, 2, 5, 5 }));
        assertEquals(new int[] { 4, 5, 4, 5, 2 }, array3.fix45(new int[] { 4, 2, 4, 5, 5 }));
        assertEquals(new int[] { 1, 1, 1 }, array3.fix45(new int[] { 1, 1, 1 }));
        assertEquals(new int[] { 4, 5 }, array3.fix45(new int[] { 4, 5 }));
        assertEquals(new int[] { 1, 4, 5 }, array3.fix45(new int[] { 5, 4, 1 }));
        assertEquals(new int[] {}, array3.fix45(new int[] {}));
        assertEquals(new int[] { 1, 4, 5, 4, 5 }, array3.fix45(new int[] { 5, 4, 5, 4, 1 }));
        assertEquals(new int[] { 4, 5, 4, 5, 1 }, array3.fix45(new int[] { 4, 5, 4, 1, 5 }));
        assertEquals(new int[] { 3, 4, 5 }, array3.fix45(new int[] { 3, 4, 5 }));
        assertEquals(new int[] { 4, 5, 1 }, array3.fix45(new int[] { 4, 1, 5 }));
        assertEquals(new int[] { 1, 4, 5 }, array3.fix45(new int[] { 5, 4, 1 }));
        assertEquals(new int[] { 2, 4, 5, 2 }, array3.fix45(new int[] { 2, 4, 2, 5 }));
    }

    @Disabled
    @Test
    public void canBalance() {
        assertEquals(true, array3.canBalance(new int[] { 1, 1, 1, 2, 1 }));
        assertEquals(false, array3.canBalance(new int[] { 2, 1, 1, 2, 1 }));
        assertEquals(true, array3.canBalance(new int[] { 10, 10 }));
        assertEquals(true, array3.canBalance(new int[] { 10, 0, 1, -1, 10 }));
        assertEquals(true, array3.canBalance(new int[] { 1, 1, 1, 1, 4 }));
        assertEquals(false, array3.canBalance(new int[] { 2, 1, 1, 1, 4 }));
        assertEquals(false, array3.canBalance(new int[] { 2, 3, 4, 1, 2 }));
        assertEquals(true, array3.canBalance(new int[] { 1, 2, 3, 1, 0, 2, 3 }));
        assertEquals(false, array3.canBalance(new int[] { 1, 2, 3, 1, 0, 1, 3 }));
        assertEquals(false, array3.canBalance(new int[] { 1 }));
        assertEquals(true, array3.canBalance(new int[] { 1, 1, 1, 2, 1 }));
    }

    @Disabled
    @Test
    public void linearIn() {
        assertEquals(true, array3.linearIn(new int[] { 1, 2, 4, 6 }, new int[] { 2, 4 }));
        assertEquals(false, array3.linearIn(new int[] { 1, 2, 4, 6 }, new int[] { 2, 3, 4 }));
        assertEquals(true, array3.linearIn(new int[] { 1, 2, 4, 4, 6 }, new int[] { 2, 4 }));
        assertEquals(true, array3.linearIn(new int[] { 2, 2, 4, 4, 6, 6 }, new int[] { 2, 4 }));
        assertEquals(true, array3.linearIn(new int[] { 2, 2, 2, 2, 2 }, new int[] { 2, 2 }));
        assertEquals(false, array3.linearIn(new int[] { 2, 2, 2, 2, 2 }, new int[] { 2, 4 }));
        assertEquals(true, array3.linearIn(new int[] { 2, 2, 2, 2, 4 }, new int[] { 2, 4 }));
        assertEquals(true, array3.linearIn(new int[] { 1, 2, 3 }, new int[] { 2 }));
        assertEquals(false, array3.linearIn(new int[] { 1, 2, 3 }, new int[] { -1 }));
        assertEquals(true, array3.linearIn(new int[] { 1, 2, 3 }, new int[] {}));
        assertEquals(true, array3.linearIn(new int[] { -1, 0, 3, 3, 3, 10, 12 }, new int[] { -1, 0, 3, 12 }));
        assertEquals(false, array3.linearIn(new int[] { -1, 0, 3, 3, 3, 10, 12 }, new int[] { 0, 3, 12, 14 }));
        assertEquals(false, array3.linearIn(new int[] { -1, 0, 3, 3, 3, 10, 12 }, new int[] { -1, 10, 11 }));
    }

    @Disabled
    @Test
    public void squareUp() {
        assertEquals(new int[] { 0, 0, 1, 0, 2, 1, 3, 2, 1 }, array3.squareUp(3));
        assertEquals(new int[] { 0, 1, 2, 1 }, array3.squareUp(2));
        assertEquals(new int[] { 0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1 }, array3.squareUp(4));
        assertEquals(new int[] { 1 }, array3.squareUp(1));
        assertEquals(new int[] {}, array3.squareUp(0));
        assertEquals(new int[] { 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0, 4, 3, 2, 1, 0, 5, 4, 3, 2,
                1, 6, 5, 4, 3, 2, 1 }, array3.squareUp(6));
    }

    @Disabled
    @Test
    public void seriesUp() {
        assertEquals(new int[] { 1, 1, 2, 1, 2, 3 }, array3.seriesUp(3));
        assertEquals(new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4 }, array3.seriesUp(4));
        assertEquals(new int[] { 1, 1, 2 }, array3.seriesUp(2));
        assertEquals(new int[] { 1 }, array3.seriesUp(1));
        assertEquals(new int[] {}, array3.seriesUp(0));
        assertEquals(new int[] { 1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6 }, array3.seriesUp(6));
    }

    @Disabled
    @Test
    public void maxMirror() {
        assertEquals(3, array3.maxMirror(new int[] { 1, 2, 3, 8, 9, 3, 2, 1 }));
        assertEquals(3, array3.maxMirror(new int[] { 1, 2, 1, 4 }));
        assertEquals(2, array3.maxMirror(new int[] { 7, 1, 2, 9, 7, 2, 1 }));
        assertEquals(4, array3.maxMirror(new int[] { 21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9 }));
        assertEquals(4, array3.maxMirror(new int[] { 1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25 }));
        assertEquals(5, array3.maxMirror(new int[] { 1, 2, 3, 2, 1 }));
        assertEquals(2, array3.maxMirror(new int[] { 1, 2, 3, 3, 8 }));
        assertEquals(2, array3.maxMirror(new int[] { 1, 2, 7, 8, 1, 7, 2 }));
        assertEquals(3, array3.maxMirror(new int[] { 1, 1, 1 }));
        assertEquals(1, array3.maxMirror(new int[] { 1 }));
        assertEquals(0, array3.maxMirror(new int[] {}));
        assertEquals(3, array3.maxMirror(new int[] { 9, 1, 1, 4, 2, 1, 1, 1 }));
        assertEquals(7, array3.maxMirror(new int[] { 5, 9, 9, 4, 5, 4, 9, 9, 2 }));
        assertEquals(2, array3.maxMirror(new int[] { 5, 9, 9, 6, 5, 4, 9, 9, 2 }));
        assertEquals(3, array3.maxMirror(new int[] { 5, 9, 1, 6, 5, 4, 1, 9, 5 }));
    }

    @Disabled
    @Test
    public void countClumps() {
        assertEquals(2, array3.countClumps(new int[] { 1, 2, 2, 3, 4, 4 }));
        assertEquals(2, array3.countClumps(new int[] { 1, 1, 2, 1, 1 }));
        assertEquals(1, array3.countClumps(new int[] { 1, 1, 1, 1, 1 }));
        assertEquals(0, array3.countClumps(new int[] { 1, 2, 3 }));
        assertEquals(4, array3.countClumps(new int[] { 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 }));
        assertEquals(4, array3.countClumps(new int[] { 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 }));
        assertEquals(5, array3.countClumps(new int[] { 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 }));
        assertEquals(5, array3.countClumps(new int[] { 0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2 }));
        assertEquals(0, array3.countClumps(new int[] {}));
    }

}