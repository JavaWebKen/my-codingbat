
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Array2Tests {

    Array2 array2 = new Array2();

    @Disabled
    @Test
    public void countEvens() {
        assertEquals(3, array2.countEvens(new int[] { 2, 1, 2, 3, 4 }));
        assertEquals(3, array2.countEvens(new int[] { 2, 2, 0 }));
        assertEquals(0, array2.countEvens(new int[] { 1, 3, 5 }));
        assertEquals(0, array2.countEvens(new int[] {}));
        assertEquals(1, array2.countEvens(new int[] { 11, 9, 0, 1 }));
        assertEquals(2, array2.countEvens(new int[] { 2, 11, 9, 0 }));
        assertEquals(1, array2.countEvens(new int[] { 2 }));
        assertEquals(2, array2.countEvens(new int[] { 2, 5, 12 }));
    }

    @Disabled
    @Test
    public void bigDiff() {
        assertEquals(7, array2.bigDiff(new int[] { 10, 3, 5, 6 }));
        assertEquals(8, array2.bigDiff(new int[] { 7, 2, 10, 9 }));
        assertEquals(8, array2.bigDiff(new int[] { 2, 10, 7, 2 }));
        assertEquals(8, array2.bigDiff(new int[] { 2, 10 }));
        assertEquals(8, array2.bigDiff(new int[] { 10, 2 }));
        assertEquals(10, array2.bigDiff(new int[] { 10, 0 }));
        assertEquals(1, array2.bigDiff(new int[] { 2, 3 }));
        assertEquals(0, array2.bigDiff(new int[] { 2, 2 }));
        assertEquals(0, array2.bigDiff(new int[] { 2 }));
        assertEquals(8, array2.bigDiff(new int[] { 5, 1, 6, 1, 9, 9 }));
        assertEquals(3, array2.bigDiff(new int[] { 7, 6, 8, 5 }));
        assertEquals(3, array2.bigDiff(new int[] { 7, 7, 6, 8, 5, 5, 6 }));
    }

    @Disabled
    @Test
    public void centeredAverage() {
        assertEquals(3, array2.centeredAverage(new int[] { 1, 2, 3, 4, 100 }));
        assertEquals(5, array2.centeredAverage(new int[] { 1, 1, 5, 5, 10, 8, 7 }));
        assertEquals(-3, array2.centeredAverage(new int[] { -10, -4, -2, -4, -2, 0 }));
        assertEquals(4, array2.centeredAverage(new int[] { 5, 3, 4, 6, 2 }));
        assertEquals(4, array2.centeredAverage(new int[] { 5, 3, 4, 0, 100 }));
        assertEquals(4, array2.centeredAverage(new int[] { 100, 0, 5, 3, 4 }));
        assertEquals(4, array2.centeredAverage(new int[] { 4, 0, 100 }));
        assertEquals(3, array2.centeredAverage(new int[] { 0, 2, 3, 4, 100 }));
        assertEquals(1, array2.centeredAverage(new int[] { 1, 1, 100 }));
        assertEquals(7, array2.centeredAverage(new int[] { 7, 7, 7 }));
        assertEquals(7, array2.centeredAverage(new int[] { 1, 7, 8 }));
        assertEquals(50, array2.centeredAverage(new int[] { 1, 1, 99, 99 }));
        assertEquals(50, array2.centeredAverage(new int[] { 1000, 0, 1, 99 }));
        assertEquals(4, array2.centeredAverage(new int[] { 4, 4, 4, 4, 5 }));
        assertEquals(4, array2.centeredAverage(new int[] { 4, 4, 4, 1, 5 }));
        assertEquals(6, array2.centeredAverage(new int[] { 6, 4, 8, 12, 3 }));
    }

    @Disabled
    @Test
    public void sum13() {
        assertEquals(6, array2.sum13(new int[] { 1, 2, 2, 1 }));
        assertEquals(2, array2.sum13(new int[] { 1, 1 }));
        assertEquals(6, array2.sum13(new int[] { 1, 2, 2, 1, 13 }));
        assertEquals(4, array2.sum13(new int[] { 1, 2, 13, 2, 1, 13 }));
        assertEquals(3, array2.sum13(new int[] { 13, 1, 2, 13, 2, 1, 13 }));
        assertEquals(0, array2.sum13(new int[] {}));
        assertEquals(0, array2.sum13(new int[] { 13 }));
        assertEquals(0, array2.sum13(new int[] { 13, 13 }));
        assertEquals(0, array2.sum13(new int[] { 13, 0, 13 }));
        assertEquals(0, array2.sum13(new int[] { 13, 1, 13 }));
        assertEquals(14, array2.sum13(new int[] { 5, 7, 2 }));
        assertEquals(5, array2.sum13(new int[] { 5, 13, 2 }));
        assertEquals(0, array2.sum13(new int[] { 0 }));
        assertEquals(0, array2.sum13(new int[] { 13, 0 }));
    }

    @Disabled
    @Test
    public void sum67() {
        assertEquals(5, array2.sum67(new int[] { 1, 2, 2 }));
        assertEquals(5, array2.sum67(new int[] { 1, 2, 2, 6, 99, 99, 7 }));
        assertEquals(4, array2.sum67(new int[] { 1, 1, 6, 7, 2 }));
        assertEquals(2, array2.sum67(new int[] { 1, 6, 2, 2, 7, 1, 6, 99, 99, 7 }));
        assertEquals(2, array2.sum67(new int[] { 1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7 }));
        assertEquals(18, array2.sum67(new int[] { 2, 7, 6, 2, 6, 7, 2, 7 }));
        assertEquals(9, array2.sum67(new int[] { 2, 7, 6, 2, 6, 2, 7 }));
        assertEquals(8, array2.sum67(new int[] { 1, 6, 7, 7 }));
        assertEquals(8, array2.sum67(new int[] { 6, 7, 1, 6, 7, 7 }));
        assertEquals(0, array2.sum67(new int[] { 6, 8, 1, 6, 7 }));
        assertEquals(0, array2.sum67(new int[] {}));
        assertEquals(11, array2.sum67(new int[] { 6, 7, 11 }));
        assertEquals(22, array2.sum67(new int[] { 11, 6, 7, 11 }));
        assertEquals(11, array2.sum67(new int[] { 2, 2, 6, 7, 7 }));
    }

    @Disabled
    @Test
    public void has22() {
        assertEquals(true, array2.has22(new int[] { 1, 2, 2 }));
        assertEquals(false, array2.has22(new int[] { 1, 2, 1, 2 }));
        assertEquals(false, array2.has22(new int[] { 2, 1, 2 }));
        assertEquals(true, array2.has22(new int[] { 2, 2, 1, 2 }));
        assertEquals(false, array2.has22(new int[] { 1, 3, 2 }));
        assertEquals(true, array2.has22(new int[] { 1, 3, 2, 2 }));
        assertEquals(true, array2.has22(new int[] { 2, 3, 2, 2 }));
        assertEquals(true, array2.has22(new int[] { 4, 2, 4, 2, 2, 5 }));
        assertEquals(false, array2.has22(new int[] { 1, 2 }));
        assertEquals(true, array2.has22(new int[] { 2, 2 }));
        assertEquals(false, array2.has22(new int[] { 2 }));
        assertEquals(false, array2.has22(new int[] {}));
        assertEquals(true, array2.has22(new int[] { 3, 3, 2, 2 }));
        assertEquals(false, array2.has22(new int[] { 5, 2, 5, 2 }));
    }

    @Disabled
    @Test
    public void lucky13() {
        assertEquals(true, array2.lucky13(new int[] { 0, 2, 4 }));
        assertEquals(false, array2.lucky13(new int[] { 1, 2, 3 }));
        assertEquals(false, array2.lucky13(new int[] { 1, 2, 4 }));
        assertEquals(true, array2.lucky13(new int[] { 2, 7, 2, 8 }));
        assertEquals(false, array2.lucky13(new int[] { 2, 7, 1, 8 }));
        assertEquals(false, array2.lucky13(new int[] { 3, 7, 2, 8 }));
        assertEquals(false, array2.lucky13(new int[] { 2, 7, 2, 1 }));
        assertEquals(false, array2.lucky13(new int[] { 1, 2 }));
        assertEquals(true, array2.lucky13(new int[] { 2, 2 }));
        assertEquals(true, array2.lucky13(new int[] { 2 }));
        assertEquals(false, array2.lucky13(new int[] { 3 }));
        assertEquals(true, array2.lucky13(new int[] {}));
    }

    @Disabled
    @Test
    public void sum28() {
        assertEquals(true, array2.sum28(new int[] { 2, 3, 2, 2, 4, 2 }));
        assertEquals(false, array2.sum28(new int[] { 2, 3, 2, 2, 4, 2, 2 }));
        assertEquals(false, array2.sum28(new int[] { 1, 2, 3, 4 }));
        assertEquals(true, array2.sum28(new int[] { 2, 2, 2, 2 }));
        assertEquals(true, array2.sum28(new int[] { 1, 2, 2, 2, 2, 4 }));
        assertEquals(false, array2.sum28(new int[] {}));
        assertEquals(false, array2.sum28(new int[] { 2 }));
        assertEquals(false, array2.sum28(new int[] { 8 }));
        assertEquals(false, array2.sum28(new int[] { 2, 2, 2 }));
        assertEquals(false, array2.sum28(new int[] { 2, 2, 2, 2, 2 }));
        assertEquals(true, array2.sum28(new int[] { 1, 2, 2, 1, 2, 2 }));
        assertEquals(true, array2.sum28(new int[] { 5, 2, 2, 2, 4, 2 }));
    }

    @Disabled
    @Test
    public void more14() {
        assertEquals(true, array2.more14(new int[] { 1, 4, 1 }));
        assertEquals(false, array2.more14(new int[] { 1, 4, 1, 4 }));
        assertEquals(true, array2.more14(new int[] { 1, 1 }));
        assertEquals(true, array2.more14(new int[] { 1, 6, 6 }));
        assertEquals(true, array2.more14(new int[] { 1 }));
        assertEquals(false, array2.more14(new int[] { 1, 4 }));
        assertEquals(true, array2.more14(new int[] { 6, 1, 1 }));
        assertEquals(false, array2.more14(new int[] { 1, 6, 4 }));
        assertEquals(true, array2.more14(new int[] { 1, 1, 4, 4, 1 }));
        assertEquals(true, array2.more14(new int[] { 1, 1, 6, 4, 4, 1 }));
        assertEquals(false, array2.more14(new int[] {}));
        assertEquals(false, array2.more14(new int[] { 4, 1, 4, 6 }));
        assertEquals(false, array2.more14(new int[] { 4, 1, 4, 6, 1 }));
        assertEquals(true, array2.more14(new int[] { 1, 4, 1, 4, 1, 6 }));
    }

    @Disabled
    @Test
    public void fizzArray() {
        assertEquals(new int[] { 0, 1, 2, 3 }, array2.fizzArray(4));
        assertEquals(new int[] { 0 }, array2.fizzArray(1));
        assertEquals(new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }, array2.fizzArray(10));
        assertEquals(new int[] {}, array2.fizzArray(0));
        assertEquals(new int[] { 0, 1 }, array2.fizzArray(2));
        assertEquals(new int[] { 0, 1, 2, 3, 4, 5, 6 }, array2.fizzArray(7));
    }

    @Disabled
    @Test
    public void only14() {
        assertEquals(true, array2.only14(new int[] { 1, 4, 1, 4 }));
        assertEquals(false, array2.only14(new int[] { 1, 4, 2, 4 }));
        assertEquals(true, array2.only14(new int[] { 1, 1 }));
        assertEquals(true, array2.only14(new int[] { 4, 1 }));
        assertEquals(false, array2.only14(new int[] { 2 }));
        assertEquals(true, array2.only14(new int[] {}));
        assertEquals(false, array2.only14(new int[] { 1, 4, 1, 3 }));
        assertEquals(false, array2.only14(new int[] { 3, 1, 3 }));
        assertEquals(true, array2.only14(new int[] { 1 }));
        assertEquals(true, array2.only14(new int[] { 4 }));
        assertEquals(false, array2.only14(new int[] { 3, 4 }));
        assertEquals(false, array2.only14(new int[] { 1, 3, 4 }));
        assertEquals(true, array2.only14(new int[] { 1, 1, 1 }));
        assertEquals(false, array2.only14(new int[] { 1, 1, 1, 5 }));
        assertEquals(true, array2.only14(new int[] { 4, 1, 4, 1 }));
    }

    @Disabled
    @Test
    public void fizzArray2() {
        assertEquals(new String[] { "0", "1", "2", "3" }, array2.fizzArray2(4));
        assertEquals(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }, array2.fizzArray2(10));
        assertEquals(new String[] { "0", "1" }, array2.fizzArray2(2));
        assertEquals(new String[] { "0" }, array2.fizzArray2(1));
        assertEquals(new int[] {}, array2.fizzArray2(0));
        assertEquals(new String[] { "0", "1", "2", "3", "4", "5", "6" }, array2.fizzArray2(7));
        assertEquals(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8" }, array2.fizzArray2(9));
        assertEquals(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }, array2.fizzArray2(11));
    }

    @Disabled
    @Test
    public void no14() {
        assertEquals(true, array2.no14(new int[] { 1, 2, 3 }));
        assertEquals(false, array2.no14(new int[] { 1, 2, 3, 4 }));
        assertEquals(true, array2.no14(new int[] { 2, 3, 4 }));
        assertEquals(false, array2.no14(new int[] { 1, 1, 4, 4 }));
        assertEquals(true, array2.no14(new int[] { 2, 2, 4, 4 }));
        assertEquals(false, array2.no14(new int[] { 2, 3, 4, 1 }));
        assertEquals(true, array2.no14(new int[] { 2, 1, 1 }));
        assertEquals(false, array2.no14(new int[] { 1, 4 }));
        assertEquals(true, array2.no14(new int[] { 2 }));
        assertEquals(true, array2.no14(new int[] { 2, 1 }));
        assertEquals(true, array2.no14(new int[] { 1 }));
        assertEquals(true, array2.no14(new int[] { 4 }));
        assertEquals(true, array2.no14(new int[] {}));
        assertEquals(true, array2.no14(new int[] { 1, 1, 1, 1 }));
        assertEquals(false, array2.no14(new int[] { 9, 4, 4, 1 }));
        assertEquals(false, array2.no14(new int[] { 4, 2, 3, 1 }));
        assertEquals(true, array2.no14(new int[] { 4, 2, 3, 5 }));
        assertEquals(true, array2.no14(new int[] { 4, 4, 2 }));
        assertEquals(false, array2.no14(new int[] { 1, 4, 4 }));
    }

    @Disabled
    @Test
    public void isEverywhere() {
        assertEquals(true, array2.isEverywhere(new int[] { 1, 2, 1, 3 }, 1));
        assertEquals(false, array2.isEverywhere(new int[] { 1, 2, 1, 3 }, 2));
        assertEquals(false, array2.isEverywhere(new int[] { 1, 2, 1, 3, 4 }, 1));
        assertEquals(true, array2.isEverywhere(new int[] { 2, 1, 2, 1 }, 1));
        assertEquals(true, array2.isEverywhere(new int[] { 2, 1, 2, 1 }, 2));
        assertEquals(false, array2.isEverywhere(new int[] { 2, 1, 2, 3, 1 }, 2));
        assertEquals(true, array2.isEverywhere(new int[] { 3, 1 }, 3));
        assertEquals(false, array2.isEverywhere(new int[] { 3, 1 }, 2));
        assertEquals(true, array2.isEverywhere(new int[] { 3 }, 1));
        assertEquals(true, array2.isEverywhere(new int[] {}, 1));
        assertEquals(true, array2.isEverywhere(new int[] { 1, 2, 1, 2, 3, 2, 5 }, 2));
        assertEquals(false, array2.isEverywhere(new int[] { 1, 2, 1, 1, 1, 2 }, 2));
        assertEquals(false, array2.isEverywhere(new int[] { 2, 1, 2, 1, 1, 2 }, 2));
        assertEquals(false, array2.isEverywhere(new int[] { 2, 1, 2, 2, 2, 1, 1, 2 }, 2));
        assertEquals(true, array2.isEverywhere(new int[] { 2, 1, 2, 2, 2, 1, 2, 1 }, 2));
        assertEquals(true, array2.isEverywhere(new int[] { 2, 1, 2, 1, 2 }, 2));
    }

    @Disabled
    @Test
    public void either24() {
        assertEquals(true, array2.either24(new int[] { 1, 2, 2 }));
        assertEquals(true, array2.either24(new int[] { 4, 4, 1 }));
        assertEquals(false, array2.either24(new int[] { 4, 4, 1, 2, 2 }));
        assertEquals(false, array2.either24(new int[] { 1, 2, 3, 4 }));
        assertEquals(false, array2.either24(new int[] { 3, 5, 9 }));
        assertEquals(true, array2.either24(new int[] { 1, 2, 3, 4, 4 }));
        assertEquals(true, array2.either24(new int[] { 2, 2, 3, 4 }));
        assertEquals(true, array2.either24(new int[] { 1, 2, 3, 2, 2, 4 }));
        assertEquals(false, array2.either24(new int[] { 1, 2, 3, 2, 2, 4, 4 }));
        assertEquals(false, array2.either24(new int[] { 1, 2 }));
        assertEquals(true, array2.either24(new int[] { 2, 2 }));
        assertEquals(true, array2.either24(new int[] { 4, 4 }));
        assertEquals(false, array2.either24(new int[] { 2 }));
        assertEquals(false, array2.either24(new int[] {}));
    }

    @Disabled
    @Test
    public void matchUp() {
        assertEquals(2, array2.matchUp(new int[] { 1, 2, 3 }, new int[] { 2, 3, 10 }));
        assertEquals(3, array2.matchUp(new int[] { 1, 2, 3 }, new int[] { 2, 3, 5 }));
        assertEquals(2, array2.matchUp(new int[] { 1, 2, 3 }, new int[] { 2, 3, 3 }));
        assertEquals(1, array2.matchUp(new int[] { 5, 3 }, new int[] { 5, 5 }));
        assertEquals(2, array2.matchUp(new int[] { 5, 3 }, new int[] { 4, 4 }));
        assertEquals(1, array2.matchUp(new int[] { 5, 3 }, new int[] { 3, 3 }));
        assertEquals(1, array2.matchUp(new int[] { 5, 3 }, new int[] { 2, 2 }));
        assertEquals(1, array2.matchUp(new int[] { 5, 3 }, new int[] { 1, 1 }));
        assertEquals(0, array2.matchUp(new int[] { 5, 3 }, new int[] { 0, 0 }));
        assertEquals(0, array2.matchUp(new int[] { 4 }, new int[] { 4 }));
        assertEquals(1, array2.matchUp(new int[] { 4 }, new int[] { 5 }));
    }

    @Disabled
    @Test
    public void has77() {
        assertEquals(true, array2.has77(new int[] { 1, 7, 7 }));
        assertEquals(true, array2.has77(new int[] { 1, 7, 1, 7 }));
        assertEquals(false, array2.has77(new int[] { 1, 7, 1, 1, 7 }));
        assertEquals(true, array2.has77(new int[] { 7, 7, 1, 1, 7 }));
        assertEquals(false, array2.has77(new int[] { 2, 7, 2, 2, 7, 2 }));
        assertEquals(true, array2.has77(new int[] { 2, 7, 2, 2, 7, 7 }));
        assertEquals(true, array2.has77(new int[] { 7, 2, 7, 2, 2, 7 }));
        assertEquals(false, array2.has77(new int[] { 7, 2, 6, 2, 2, 7 }));
        assertEquals(true, array2.has77(new int[] { 7, 7, 7 }));
        assertEquals(true, array2.has77(new int[] { 7, 1, 7 }));
        assertEquals(false, array2.has77(new int[] { 7, 1, 1 }));
        assertEquals(false, array2.has77(new int[] { 1, 2 }));
        assertEquals(false, array2.has77(new int[] { 1, 7 }));
        assertEquals(false, array2.has77(new int[] { 7 }));
    }

    @Disabled
    @Test
    public void has12() {
        assertEquals(true, array2.has12(new int[] { 1, 3, 2 }));
        assertEquals(true, array2.has12(new int[] { 3, 1, 2 }));
        assertEquals(true, array2.has12(new int[] { 3, 1, 4, 5, 2 }));
        assertEquals(false, array2.has12(new int[] { 3, 1, 4, 5, 6 }));
        assertEquals(true, array2.has12(new int[] { 3, 1, 4, 1, 6, 2 }));
        assertEquals(true, array2.has12(new int[] { 2, 1, 4, 1, 6, 2 }));
        assertEquals(false, array2.has12(new int[] { 2, 1, 4, 1, 6 }));
        assertEquals(false, array2.has12(new int[] { 1 }));
        assertEquals(false, array2.has12(new int[] { 2, 1, 3 }));
        assertEquals(true, array2.has12(new int[] { 2, 1, 3, 2 }));
        assertEquals(false, array2.has12(new int[] { 2 }));
        assertEquals(false, array2.has12(new int[] { 3, 2 }));
        assertEquals(true, array2.has12(new int[] { 3, 1, 3, 2 }));
        assertEquals(false, array2.has12(new int[] { 3, 5, 9 }));
        assertEquals(false, array2.has12(new int[] { 3, 5, 1 }));
        assertEquals(false, array2.has12(new int[] { 3, 2, 1 }));
        assertEquals(true, array2.has12(new int[] { 1, 2 }));
    }

    @Disabled
    @Test
    public void modThree() {
        assertEquals(true, array2.modThree(new int[] { 2, 1, 3, 5 }));
        assertEquals(false, array2.modThree(new int[] { 2, 1, 2, 5 }));
        assertEquals(true, array2.modThree(new int[] { 2, 4, 2, 5 }));
        assertEquals(false, array2.modThree(new int[] { 1, 2, 1, 2, 1 }));
        assertEquals(true, array2.modThree(new int[] { 9, 9, 9 }));
        assertEquals(false, array2.modThree(new int[] { 1, 2, 1 }));
        assertEquals(false, array2.modThree(new int[] { 1, 2 }));
        assertEquals(false, array2.modThree(new int[] { 1 }));
        assertEquals(false, array2.modThree(new int[] {}));
        assertEquals(false, array2.modThree(new int[] { 9, 7, 2, 9 }));
        assertEquals(false, array2.modThree(new int[] { 9, 7, 2, 9, 2, 2 }));
        assertEquals(true, array2.modThree(new int[] { 9, 7, 2, 9, 2, 2, 6 }));
    }

    @Disabled
    @Test
    public void haveThree() {
        assertEquals(true, array2.haveThree(new int[] { 3, 1, 3, 1, 3 }));
        assertEquals(false, array2.haveThree(new int[] { 3, 1, 3, 3 }));
        assertEquals(false, array2.haveThree(new int[] { 3, 4, 3, 3, 4 }));
        assertEquals(false, array2.haveThree(new int[] { 1, 3, 1, 3, 1, 2 }));
        assertEquals(true, array2.haveThree(new int[] { 1, 3, 1, 3, 1, 3 }));
        assertEquals(false, array2.haveThree(new int[] { 1, 3, 3, 1, 3 }));
        assertEquals(false, array2.haveThree(new int[] { 1, 3, 1, 3, 1, 3, 4, 3 }));
        assertEquals(true, array2.haveThree(new int[] { 3, 4, 3, 4, 3, 4, 4 }));
        assertEquals(false, array2.haveThree(new int[] { 3, 3, 3 }));
        assertEquals(false, array2.haveThree(new int[] { 1, 3 }));
        assertEquals(false, array2.haveThree(new int[] { 3 }));
        assertEquals(false, array2.haveThree(new int[] { 1 }));
    }

    @Disabled
    @Test
    public void twoTwo() {
        assertEquals(true, array2.twoTwo(new int[] { 4, 2, 2, 3 }));
        assertEquals(true, array2.twoTwo(new int[] { 2, 2, 4 }));
        assertEquals(false, array2.twoTwo(new int[] { 2, 2, 4, 2 }));
        assertEquals(true, array2.twoTwo(new int[] { 1, 3, 4 }));
        assertEquals(true, array2.twoTwo(new int[] { 1, 2, 2, 3, 4 }));
        assertEquals(false, array2.twoTwo(new int[] { 1, 2, 3, 4 }));
        assertEquals(true, array2.twoTwo(new int[] { 2, 2 }));
        assertEquals(true, array2.twoTwo(new int[] { 2, 2, 7 }));
        assertEquals(false, array2.twoTwo(new int[] { 2, 2, 7, 2, 1 }));
        assertEquals(true, array2.twoTwo(new int[] { 4, 2, 2, 2 }));
        assertEquals(true, array2.twoTwo(new int[] { 2, 2, 2 }));
        assertEquals(false, array2.twoTwo(new int[] { 1, 2 }));
        assertEquals(false, array2.twoTwo(new int[] { 2 }));
        assertEquals(true, array2.twoTwo(new int[] { 1 }));
        assertEquals(true, array2.twoTwo(new int[] {}));
        assertEquals(true, array2.twoTwo(new int[] { 5, 2, 2, 3 }));
        assertEquals(false, array2.twoTwo(new int[] { 2, 2, 5, 2 }));
    }

    @Disabled
    @Test
    public void sameEnds() {
        assertEquals(false, array2.sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 1));
        assertEquals(true, array2.sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 2));
        assertEquals(false, array2.sameEnds(new int[] { 5, 6, 45, 99, 13, 5, 6 }, 3));
        assertEquals(true, array2.sameEnds(new int[] { 1, 2, 5, 2, 1 }, 1));
        assertEquals(false, array2.sameEnds(new int[] { 1, 2, 5, 2, 1 }, 2));
        assertEquals(true, array2.sameEnds(new int[] { 1, 2, 5, 2, 1 }, 0));
        assertEquals(true, array2.sameEnds(new int[] { 1, 2, 5, 2, 1 }, 5));
        assertEquals(true, array2.sameEnds(new int[] { 1, 1, 1 }, 0));
        assertEquals(true, array2.sameEnds(new int[] { 1, 1, 1 }, 1));
        assertEquals(true, array2.sameEnds(new int[] { 1, 1, 1 }, 2));
        assertEquals(true, array2.sameEnds(new int[] { 1, 1, 1 }, 3));
        assertEquals(true, array2.sameEnds(new int[] { 1 }, 1));
        assertEquals(true, array2.sameEnds(new int[] {}, 0));
        assertEquals(false, array2.sameEnds(new int[] { 4, 2, 4, 5 }, 1));
    }

    @Disabled
    @Test
    public void tripleUp() {
        assertEquals(true, array2.tripleUp(new int[] { 1, 4, 5, 6, 2 }));
        assertEquals(true, array2.tripleUp(new int[] { 1, 2, 3 }));
        assertEquals(false, array2.tripleUp(new int[] { 1, 2, 4 }));
        assertEquals(true, array2.tripleUp(new int[] { 1, 2, 4, 5, 7, 6, 5, 6, 7, 6 }));
        assertEquals(false, array2.tripleUp(new int[] { 1, 2, 4, 5, 7, 6, 5, 7, 7, 6 }));
        assertEquals(false, array2.tripleUp(new int[] { 1, 2 }));
        assertEquals(false, array2.tripleUp(new int[] { 1 }));
        assertEquals(false, array2.tripleUp(new int[] {}));
        assertEquals(true, array2.tripleUp(new int[] { 10, 9, 8, -100, -99, -98, 100 }));
        assertEquals(false, array2.tripleUp(new int[] { 10, 9, 8, -100, -99, 99, 100 }));
        assertEquals(true, array2.tripleUp(new int[] { -100, -99, -99, 100, 101, 102 }));
        assertEquals(false, array2.tripleUp(new int[] { 2, 3, 5, 6, 8, 9, 2, 3 }));
    }

    @Disabled
    @Test
    public void fizzArray3() {
        assertEquals(new int[] { 5, 6, 7, 8, 9 }, array2.fizzArray3(5, 10));
        assertEquals(new int[] { 11, 12, 13, 14, 15, 16, 17 }, array2.fizzArray3(11, 18));
        assertEquals(new int[] { 1, 2 }, array2.fizzArray3(1, 3));
        assertEquals(new int[] { 1 }, array2.fizzArray3(1, 2));
        assertEquals(new int[] {}, array2.fizzArray3(1, 1));
        assertEquals(new int[] { 1000, 1001, 1002, 1003, 1004 }, array2.fizzArray3(1000, 1005));
    }

    @Disabled
    @Test
    public void shiftLeft() {
        assertEquals(new int[] { 2, 5, 3, 6 }, array2.shiftLeft(new int[] { 6, 2, 5, 3 }));
        assertEquals(new int[] { 2, 1 }, array2.shiftLeft(new int[] { 1, 2 }));
        assertEquals(new int[] { 1 }, array2.shiftLeft(new int[] { 1 }));
        assertEquals(new int[] {}, array2.shiftLeft(new int[] {}));
        assertEquals(new int[] { 1, 2, 2, 4, 1 }, array2.shiftLeft(new int[] { 1, 1, 2, 2, 4 }));
        assertEquals(new int[] { 1, 1, 1 }, array2.shiftLeft(new int[] { 1, 1, 1 }));
        assertEquals(new int[] { 2, 3, 1 }, array2.shiftLeft(new int[] { 1, 2, 3 }));
    }

    @Disabled
    @Test
    public void tenRun() {
        assertEquals(new int[] { 2, 10, 10, 10, 20, 20 }, array2.tenRun(new int[] { 2, 10, 3, 4, 20, 5 }));
        assertEquals(new int[] { 10, 10, 20, 20 }, array2.tenRun(new int[] { 10, 1, 20, 2 }));
        assertEquals(new int[] { 10, 10, 10, 20 }, array2.tenRun(new int[] { 10, 1, 9, 20 }));
        assertEquals(new int[] { 1, 2, 50, 50 }, array2.tenRun(new int[] { 1, 2, 50, 1 }));
        assertEquals(new int[] { 1, 20, 50, 50 }, array2.tenRun(new int[] { 1, 20, 50, 1 }));
        assertEquals(new int[] { 10, 10 }, array2.tenRun(new int[] { 10, 10 }));
        assertEquals(new int[] { 10, 10 }, array2.tenRun(new int[] { 10, 2 }));
        assertEquals(new int[] { 0, 0 }, array2.tenRun(new int[] { 0, 2 }));
        assertEquals(new int[] { 1, 2 }, array2.tenRun(new int[] { 1, 2 }));
        assertEquals(new int[] { 1 }, array2.tenRun(new int[] { 1 }));
        assertEquals(new int[] {}, array2.tenRun(new int[] {}));
    }

    @Disabled
    @Test
    public void pre4() {
        assertEquals(new int[] { 1, 2 }, array2.pre4(new int[] { 1, 2, 4, 1 }));
        assertEquals(new int[] { 3, 1 }, array2.pre4(new int[] { 3, 1, 4 }));
        assertEquals(new int[] { 1 }, array2.pre4(new int[] { 1, 4, 4 }));
        assertEquals(new int[] { 1 }, array2.pre4(new int[] { 1, 4, 4, 2 }));
        assertEquals(new int[] { 1, 3 }, array2.pre4(new int[] { 1, 3, 4, 2, 4 }));
        assertEquals(new int[] {}, array2.pre4(new int[] { 4, 4 }));
        assertEquals(new int[] { 3, 3 }, array2.pre4(new int[] { 3, 3, 4 }));
        assertEquals(new int[] { 1, 2, 1 }, array2.pre4(new int[] { 1, 2, 1, 4 }));
        assertEquals(new int[] { 2, 1 }, array2.pre4(new int[] { 2, 1, 4, 2 }));
        assertEquals(new int[] { 2, 1, 2, 1 }, array2.pre4(new int[] { 2, 1, 2, 1, 4, 2 }));
    }

    @Disabled
    @Test
    public void post4() {
        assertEquals(new int[] { 1, 2 }, array2.post4(new int[] { 2, 4, 1, 2 }));
        assertEquals(new int[] { 2 }, array2.post4(new int[] { 4, 1, 4, 2 }));
        assertEquals(new int[] { 1, 2, 3 }, array2.post4(new int[] { 4, 4, 1, 2, 3 }));
        assertEquals(new int[] { 2 }, array2.post4(new int[] { 4, 2 }));
        assertEquals(new int[] { 3 }, array2.post4(new int[] { 4, 4, 3 }));
        assertEquals(new int[] {}, array2.post4(new int[] { 4, 4 }));
        assertEquals(new int[] {}, array2.post4(new int[] { 4 }));
        assertEquals(new int[] { 3, 2 }, array2.post4(new int[] { 2, 4, 1, 4, 3, 2 }));
        assertEquals(new int[] { 2, 2, 2 }, array2.post4(new int[] { 4, 1, 4, 2, 2, 2 }));
        assertEquals(new int[] { 3, 2 }, array2.post4(new int[] { 3, 4, 3, 2 }));
    }

    @Disabled
    @Test
    public void notAlone() {
        assertEquals(new int[] { 1, 3, 3 }, array2.notAlone(new int[] { 1, 2, 3 }, 2));
        assertEquals(new int[] { 1, 3, 3, 5, 5, 2 }, array2.notAlone(new int[] { 1, 2, 3, 2, 5, 2 }, 2));
        assertEquals(new int[] { 3, 4 }, array2.notAlone(new int[] { 3, 4 }, 3));
        assertEquals(new int[] { 3, 3 }, array2.notAlone(new int[] { 3, 3 }, 3));
        assertEquals(new int[] { 1, 3, 3, 2 }, array2.notAlone(new int[] { 1, 3, 1, 2 }, 1));
        assertEquals(new int[] { 3 }, array2.notAlone(new int[] { 3 }, 3));
        assertEquals(new int[] {}, array2.notAlone(new int[] {}, 3));
        assertEquals(new int[] { 7, 7, 6 }, array2.notAlone(new int[] { 7, 1, 6 }, 1));
        assertEquals(new int[] { 1, 1, 1 }, array2.notAlone(new int[] { 1, 1, 1 }, 1));
        assertEquals(new int[] { 1, 1, 1, 2 }, array2.notAlone(new int[] { 1, 1, 1, 2 }, 1));
    }

    @Disabled
    @Test
    public void zeroFront() {
        assertEquals(new int[] { 0, 0, 1, 1 }, array2.zeroFront(new int[] { 1, 0, 0, 1 }));
        assertEquals(new int[] { 0, 0, 1, 1, 1 }, array2.zeroFront(new int[] { 0, 1, 1, 0, 1 }));
        assertEquals(new int[] { 0, 1 }, array2.zeroFront(new int[] { 1, 0 }));
        assertEquals(new int[] { 0, 1 }, array2.zeroFront(new int[] { 0, 1 }));
        assertEquals(new int[] { 0, 1, 1, 1 }, array2.zeroFront(new int[] { 1, 1, 1, 0 }));
        assertEquals(new int[] { 2, 2, 2, 2 }, array2.zeroFront(new int[] { 2, 2, 2, 2 }));
        assertEquals(new int[] { 0, 0, 0, 1 }, array2.zeroFront(new int[] { 0, 0, 1, 0 }));
        assertEquals(new int[] { 0, 0, 0, -1, -1 }, array2.zeroFront(new int[] { -1, 0, 0, -1, 0 }));
        assertEquals(new int[] { 0, 0, -3, -3 }, array2.zeroFront(new int[] { 0, -3, 0, -3 }));
        assertEquals(new int[] {}, array2.zeroFront(new int[] {}));
        assertEquals(new int[] { 0, 0, 9, 9, 9, 9 }, array2.zeroFront(new int[] { 9, 9, 0, 9, 0, 9 }));
    }

    @Disabled
    @Test
    public void withoutTen() {
        assertEquals(new int[] { 1, 2, 0, 0 }, array2.withoutTen(new int[] { 1, 10, 10, 2 }));
        assertEquals(new int[] { 2, 0, 0 }, array2.withoutTen(new int[] { 10, 2, 10 }));
        assertEquals(new int[] { 1, 99, 0 }, array2.withoutTen(new int[] { 1, 99, 10 }));
        assertEquals(new int[] { 13, 14, 0, 0 }, array2.withoutTen(new int[] { 10, 13, 10, 14 }));
        assertEquals(new int[] { 13, 14, 0, 0, 0 }, array2.withoutTen(new int[] { 10, 13, 10, 14, 10 }));
        assertEquals(new int[] { 3, 0, 0 }, array2.withoutTen(new int[] { 10, 10, 3 }));
        assertEquals(new int[] { 1 }, array2.withoutTen(new int[] { 1 }));
        assertEquals(new int[] { 13, 1 }, array2.withoutTen(new int[] { 13, 1 }));
        assertEquals(new int[] { 0 }, array2.withoutTen(new int[] { 10 }));
        assertEquals(new int[] {}, array2.withoutTen(new int[] {}));
    }

    @Disabled
    @Test
    public void zeroMax() {
        assertEquals(new int[] { 5, 5, 3, 3 }, array2.zeroMax(new int[] { 0, 5, 0, 3 }));
        assertEquals(new int[] { 3, 4, 3, 3 }, array2.zeroMax(new int[] { 0, 4, 0, 3 }));
        assertEquals(new int[] { 1, 1, 0 }, array2.zeroMax(new int[] { 0, 1, 0 }));
        assertEquals(new int[] { 5, 1, 5 }, array2.zeroMax(new int[] { 0, 1, 5 }));
        assertEquals(new int[] { 0, 2, 0 }, array2.zeroMax(new int[] { 0, 2, 0 }));
        assertEquals(new int[] { 1 }, array2.zeroMax(new int[] { 1 }));
        assertEquals(new int[] { 0 }, array2.zeroMax(new int[] { 0 }));
        assertEquals(new int[] {}, array2.zeroMax(new int[] {}));
        assertEquals(new int[] { 7, 3, 4, 3, 0, 2 }, array2.zeroMax(new int[] { 7, 0, 4, 3, 0, 2 }));
        assertEquals(new int[] { 7, 3, 4, 3, 1, 1 }, array2.zeroMax(new int[] { 7, 0, 4, 3, 0, 1 }));
        assertEquals(new int[] { 7, 3, 4, 3, 0, 0 }, array2.zeroMax(new int[] { 7, 0, 4, 3, 0, 0 }));
        assertEquals(new int[] { 7, 7, 1, 7, 7, 7 }, array2.zeroMax(new int[] { 7, 0, 1, 0, 0, 7 }));
    }

    @Disabled
    @Test
    public void evenOdd() {
        assertEquals(new int[] { 0, 0, 0, 1, 1, 1, 1 }, array2.evenOdd(new int[] { 1, 0, 1, 0, 0, 1, 1 }));
        assertEquals(new int[] { 2, 3, 3 }, array2.evenOdd(new int[] { 3, 3, 2 }));
        assertEquals(new int[] { 2, 2, 2 }, array2.evenOdd(new int[] { 2, 2, 2 }));
        assertEquals(new int[] { 2, 2, 3 }, array2.evenOdd(new int[] { 3, 2, 2 }));
        assertEquals(new int[] { 0, 0, 1, 1, 1 }, array2.evenOdd(new int[] { 1, 1, 0, 1, 0 }));
        assertEquals(new int[] { 1 }, array2.evenOdd(new int[] { 1 }));
        assertEquals(new int[] { 2, 1 }, array2.evenOdd(new int[] { 1, 2 }));
        assertEquals(new int[] { 2, 1 }, array2.evenOdd(new int[] { 2, 1 }));
        assertEquals(new int[] {}, array2.evenOdd(new int[] {}));
    }

    @Disabled
    @Test
    public void fizzBuzz() {
        assertEquals(new String[] { "1", "2", "Fizz", "4", "Buzz" }, array2.fizzBuzz(1, 6));
        assertEquals(new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7" }, array2.fizzBuzz(1, 8));
        assertEquals(new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz" },
                array2.fizzBuzz(1, 11));
        assertEquals(new String[] { "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13",
                "14", "FizzBuzz" }, array2.fizzBuzz(1, 16));
        assertEquals(new String[] { "1", "2", "Fizz" }, array2.fizzBuzz(1, 4));
        assertEquals(new String[] { "1" }, array2.fizzBuzz(1, 2));
        assertEquals(new String[] { "Buzz", "Fizz", "52", "53", "Fizz", "Buzz" }, array2.fizzBuzz(50, 56));
        assertEquals(new String[] { "FizzBuzz", "16" }, array2.fizzBuzz(15, 17));
        assertEquals(new String[] { "FizzBuzz", "31", "32", "Fizz", "34", "Buzz" }, array2.fizzBuzz(30, 36));
        assertEquals(new String[] { "Buzz", "1001", "Fizz", "1003", "1004", "FizzBuzz" }, array2.fizzBuzz(1000, 1006));
        assertEquals(new String[] { "Fizz", "Buzz", "101" }, array2.fizzBuzz(99, 102));
        assertEquals(new String[] { "14", "FizzBuzz", "16", "17", "Fizz", "19" }, array2.fizzBuzz(14, 20));
    }

}