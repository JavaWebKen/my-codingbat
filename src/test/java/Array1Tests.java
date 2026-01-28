
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Array1Tests {

    Array1 array1 = new Array1();

    @Disabled
    @Test
    public void firstLast6() {
        assertEquals(true, array1.firstLast6(new int[] { 1, 2, 6 }));
        assertEquals(true, array1.firstLast6(new int[] { 6, 1, 2, 3 }));
        assertEquals(false, array1.firstLast6(new int[] { 13, 6, 1, 2, 3 }));
        assertEquals(true, array1.firstLast6(new int[] { 13, 6, 1, 2, 6 }));
        assertEquals(false, array1.firstLast6(new int[] { 3, 2, 1 }));
        assertEquals(false, array1.firstLast6(new int[] { 3, 6, 1 }));
        assertEquals(true, array1.firstLast6(new int[] { 3, 6 }));
        assertEquals(true, array1.firstLast6(new int[] { 6 }));
        assertEquals(false, array1.firstLast6(new int[] { 3 }));
        assertEquals(true, array1.firstLast6(new int[] { 5, 6 }));
        assertEquals(false, array1.firstLast6(new int[] { 5, 5 }));
        assertEquals(true, array1.firstLast6(new int[] { 1, 2, 3, 4, 6 }));
        assertEquals(false, array1.firstLast6(new int[] { 1, 2, 3, 4 }));
    }

    @Disabled
    @Test
    public void sameFirstLast() {
        assertEquals(false, array1.sameFirstLast(new int[] { 1, 2, 3 }));
        assertEquals(true, array1.sameFirstLast(new int[] { 1, 2, 3, 1 }));
        assertEquals(true, array1.sameFirstLast(new int[] { 1, 2, 1 }));
        assertEquals(true, array1.sameFirstLast(new int[] { 7 }));
        assertEquals(false, array1.sameFirstLast(new int[] {}));
        assertEquals(true, array1.sameFirstLast(new int[] { 1, 2, 3, 4, 5, 1 }));
        assertEquals(false, array1.sameFirstLast(new int[] { 1, 2, 3, 4, 5, 13 }));
        assertEquals(true, array1.sameFirstLast(new int[] { 13, 2, 3, 4, 5, 13 }));
        assertEquals(true, array1.sameFirstLast(new int[] { 7, 7 }));
    }

    @Disabled
    @Test
    public void makePi() {
        assertEquals(new int[] { 3, 1, 4 }, array1.makePi());
    }

    @Disabled
    @Test
    public void commonEnd() {
        assertEquals(true, array1.commonEnd(new int[] { 1, 2, 3 }, new int[] { 7, 3 }));
        assertEquals(false, array1.commonEnd(new int[] { 1, 2, 3 }, new int[] { 7, 3, 2 }));
        assertEquals(true, array1.commonEnd(new int[] { 1, 2, 3 }, new int[] { 1, 3 }));
        assertEquals(true, array1.commonEnd(new int[] { 1, 2, 3 }, new int[] { 1 }));
        assertEquals(false, array1.commonEnd(new int[] { 1, 2, 3 }, new int[] { 2 }));
    }

    @Disabled
    @Test
    public void sum3() {
        assertEquals(6, array1.sum3(new int[] { 1, 2, 3 }));
        assertEquals(18, array1.sum3(new int[] { 5, 11, 2 }));
        assertEquals(7, array1.sum3(new int[] { 7, 0, 0 }));
        assertEquals(4, array1.sum3(new int[] { 1, 2, 1 }));
        assertEquals(3, array1.sum3(new int[] { 1, 1, 1 }));
        assertEquals(11, array1.sum3(new int[] { 2, 7, 2 }));
    }

    @Disabled
    @Test
    public void rotateLeft3() {
        assertEquals(new int[] { 2, 3, 1 }, array1.rotateLeft3(new int[] { 1, 2, 3 }));
        assertEquals(new int[] { 11, 9, 5 }, array1.rotateLeft3(new int[] { 5, 11, 9 }));
        assertEquals(new int[] { 0, 0, 7 }, array1.rotateLeft3(new int[] { 7, 0, 0 }));
        assertEquals(new int[] { 2, 1, 1 }, array1.rotateLeft3(new int[] { 1, 2, 1 }));
        assertEquals(new int[] { 0, 1, 0 }, array1.rotateLeft3(new int[] { 0, 0, 1 }));
    }

    @Disabled
    @Test
    public void reverse3() {
        assertEquals(new int[] { 3, 2, 1 }, array1.reverse3(new int[] { 1, 2, 3 }));
        assertEquals(new int[] { 9, 11, 5 }, array1.reverse3(new int[] { 5, 11, 9 }));
        assertEquals(new int[] { 0, 0, 7 }, array1.reverse3(new int[] { 7, 0, 0 }));
        assertEquals(new int[] { 2, 1, 2 }, array1.reverse3(new int[] { 2, 1, 2 }));
        assertEquals(new int[] { 1, 2, 1 }, array1.reverse3(new int[] { 1, 2, 1 }));
        assertEquals(new int[] { 3, 11, 2 }, array1.reverse3(new int[] { 2, 11, 3 }));
        assertEquals(new int[] { 5, 6, 0 }, array1.reverse3(new int[] { 0, 6, 5 }));
        assertEquals(new int[] { 3, 2, 7 }, array1.reverse3(new int[] { 7, 2, 3 }));
    }

    @Disabled
    @Test
    public void maxEnd3() {
        assertEquals(new int[] { 3, 3, 3 }, array1.maxEnd3(new int[] { 1, 2, 3 }));
        assertEquals(new int[] { 11, 11, 11 }, array1.maxEnd3(new int[] { 11, 5, 9 }));
        assertEquals(new int[] { 3, 3, 3 }, array1.maxEnd3(new int[] { 2, 11, 3 }));
        assertEquals(new int[] { 11, 11, 11 }, array1.maxEnd3(new int[] { 11, 3, 3 }));
        assertEquals(new int[] { 11, 11, 11 }, array1.maxEnd3(new int[] { 3, 11, 11 }));
        assertEquals(new int[] { 2, 2, 2 }, array1.maxEnd3(new int[] { 2, 2, 2 }));
        assertEquals(new int[] { 2, 2, 2 }, array1.maxEnd3(new int[] { 2, 11, 2 }));
        assertEquals(new int[] { 1, 1, 1 }, array1.maxEnd3(new int[] { 0, 0, 1 }));
    }

    @Disabled
    @Test
    public void sum2() {
        assertEquals(3, array1.sum2(new int[] { 1, 2, 3 }));
        assertEquals(2, array1.sum2(new int[] { 1, 1 }));
        assertEquals(2, array1.sum2(new int[] { 1, 1, 1, 1 }));
        assertEquals(3, array1.sum2(new int[] { 1, 2 }));
        assertEquals(1, array1.sum2(new int[] { 1 }));
        assertEquals(0, array1.sum2(new int[] {}));
        assertEquals(9, array1.sum2(new int[] { 4, 5, 6 }));
        assertEquals(4, array1.sum2(new int[] { 4 }));
    }

    @Disabled
    @Test
    public void middleWay() {
        assertEquals(new int[] { 2, 5 }, array1.middleWay(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6 }));
        assertEquals(new int[] { 7, 8 }, array1.middleWay(new int[] { 7, 7, 7 }, new int[] { 3, 8, 0 }));
        assertEquals(new int[] { 2, 4 }, array1.middleWay(new int[] { 5, 2, 9 }, new int[] { 1, 4, 5 }));
        assertEquals(new int[] { 9, 8 }, array1.middleWay(new int[] { 1, 9, 7 }, new int[] { 4, 8, 8 }));
        assertEquals(new int[] { 2, 1 }, array1.middleWay(new int[] { 1, 2, 3 }, new int[] { 3, 1, 4 }));
        assertEquals(new int[] { 2, 1 }, array1.middleWay(new int[] { 1, 2, 3 }, new int[] { 4, 1, 1 }));
    }

    @Disabled
    @Test
    public void makeEnds() {
        assertEquals(new int[] { 1, 3 }, array1.makeEnds(new int[] { 1, 2, 3 }));
        assertEquals(new int[] { 1, 4 }, array1.makeEnds(new int[] { 1, 2, 3, 4 }));
        assertEquals(new int[] { 7, 2 }, array1.makeEnds(new int[] { 7, 4, 6, 2 }));
        assertEquals(new int[] { 1, 3 }, array1.makeEnds(new int[] { 1, 2, 2, 2, 2, 2, 2, 3 }));
        assertEquals(new int[] { 7, 4 }, array1.makeEnds(new int[] { 7, 4 }));
        assertEquals(new int[] { 7, 7 }, array1.makeEnds(new int[] { 7 }));
        assertEquals(new int[] { 5, 9 }, array1.makeEnds(new int[] { 5, 2, 9 }));
        assertEquals(new int[] { 2, 1 }, array1.makeEnds(new int[] { 2, 3, 4, 1 }));
    }

    @Disabled
    @Test
    public void has23() {
        assertEquals(true, array1.has23(new int[] { 2, 5 }));
        assertEquals(true, array1.has23(new int[] { 4, 3 }));
        assertEquals(false, array1.has23(new int[] { 4, 5 }));
        assertEquals(true, array1.has23(new int[] { 2, 2 }));
        assertEquals(true, array1.has23(new int[] { 3, 2 }));
        assertEquals(true, array1.has23(new int[] { 3, 3 }));
        assertEquals(false, array1.has23(new int[] { 7, 7 }));
        assertEquals(true, array1.has23(new int[] { 3, 9 }));
        assertEquals(false, array1.has23(new int[] { 9, 5 }));
    }

    @Disabled
    @Test
    public void no23() {
        assertEquals(true, array1.no23(new int[] { 4, 5 }));
        assertEquals(false, array1.no23(new int[] { 4, 2 }));
        assertEquals(false, array1.no23(new int[] { 3, 5 }));
        assertEquals(true, array1.no23(new int[] { 1, 9 }));
        assertEquals(false, array1.no23(new int[] { 2, 9 }));
        assertEquals(false, array1.no23(new int[] { 1, 3 }));
        assertEquals(true, array1.no23(new int[] { 1, 1 }));
        assertEquals(false, array1.no23(new int[] { 2, 2 }));
        assertEquals(false, array1.no23(new int[] { 3, 3 }));
        assertEquals(true, array1.no23(new int[] { 7, 8 }));
        assertEquals(true, array1.no23(new int[] { 8, 7 }));
    }

    @Disabled
    @Test
    public void makeLast() {
        assertEquals(new int[] { 0, 0, 0, 0, 0, 6 }, array1.makeLast(new int[] { 4, 5, 6 }));
        assertEquals(new int[] { 0, 0, 0, 2 }, array1.makeLast(new int[] { 1, 2 }));
        assertEquals(new int[] { 0, 3 }, array1.makeLast(new int[] { 3 }));
        assertEquals(new int[] { 0, 0 }, array1.makeLast(new int[] { 0 }));
        assertEquals(new int[] { 0, 0, 0, 0, 0, 7 }, array1.makeLast(new int[] { 7, 7, 7 }));
        assertEquals(new int[] { 0, 0, 0, 0, 0, 4 }, array1.makeLast(new int[] { 3, 1, 4 }));
        assertEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 4 }, array1.makeLast(new int[] { 1, 2, 3, 4 }));
        assertEquals(new int[] { 0, 0, 0, 0, 0, 0, 0, 0 }, array1.makeLast(new int[] { 1, 2, 3, 0 }));
        assertEquals(new int[] { 0, 0, 0, 4 }, array1.makeLast(new int[] { 2, 4 }));
    }

    @Disabled
    @Test
    public void double23() {
        assertEquals(true, array1.double23(new int[] { 2, 2 }));
        assertEquals(true, array1.double23(new int[] { 3, 3 }));
        assertEquals(false, array1.double23(new int[] { 2, 3 }));
        assertEquals(false, array1.double23(new int[] { 3, 2 }));
        assertEquals(false, array1.double23(new int[] { 4, 5 }));
        assertEquals(false, array1.double23(new int[] { 2 }));
        assertEquals(false, array1.double23(new int[] { 3 }));
        assertEquals(false, array1.double23(new int[] {}));
        assertEquals(false, array1.double23(new int[] { 3, 4 }));
    }

    @Disabled
    @Test
    public void fix23() {
        assertEquals(new int[] { 1, 2, 0 }, array1.fix23(new int[] { 1, 2, 3 }));
        assertEquals(new int[] { 2, 0, 5 }, array1.fix23(new int[] { 2, 3, 5 }));
        assertEquals(new int[] { 1, 2, 1 }, array1.fix23(new int[] { 1, 2, 1 }));
        assertEquals(new int[] { 3, 2, 1 }, array1.fix23(new int[] { 3, 2, 1 }));
        assertEquals(new int[] { 2, 2, 0 }, array1.fix23(new int[] { 2, 2, 3 }));
        assertEquals(new int[] { 2, 0, 3 }, array1.fix23(new int[] { 2, 3, 3 }));
    }

    @Disabled
    @Test
    public void start1() {
        assertEquals(2, array1.start1(new int[] { 1, 2, 3 }, new int[] { 1, 3 }));
        assertEquals(1, array1.start1(new int[] { 7, 2, 3 }, new int[] { 1 }));
        assertEquals(1, array1.start1(new int[] { 1, 2 }, new int[] {}));
        assertEquals(1, array1.start1(new int[] {}, new int[] { 1, 2 }));
        assertEquals(0, array1.start1(new int[] { 7 }, new int[] {}));
        assertEquals(1, array1.start1(new int[] { 7 }, new int[] { 1 }));
        assertEquals(2, array1.start1(new int[] { 1 }, new int[] { 1 }));
        assertEquals(0, array1.start1(new int[] { 7 }, new int[] { 8 }));
        assertEquals(0, array1.start1(new int[] {}, new int[] {}));
        assertEquals(2, array1.start1(new int[] { 1, 3 }, new int[] { 1 }));
    }

    @Disabled
    @Test
    public void biggerTwo() {
        assertEquals(new int[] { 3, 4 }, array1.biggerTwo(new int[] { 1, 2 }, new int[] { 3, 4 }));
        assertEquals(new int[] { 3, 4 }, array1.biggerTwo(new int[] { 3, 4 }, new int[] { 1, 2 }));
        assertEquals(new int[] { 1, 2 }, array1.biggerTwo(new int[] { 1, 1 }, new int[] { 1, 2 }));
        assertEquals(new int[] { 2, 1 }, array1.biggerTwo(new int[] { 2, 1 }, new int[] { 1, 1 }));
        assertEquals(new int[] { 2, 2 }, array1.biggerTwo(new int[] { 2, 2 }, new int[] { 1, 3 }));
        assertEquals(new int[] { 1, 3 }, array1.biggerTwo(new int[] { 1, 3 }, new int[] { 2, 2 }));
        assertEquals(new int[] { 6, 7 }, array1.biggerTwo(new int[] { 6, 7 }, new int[] { 3, 1 }));
    }

    @Disabled
    @Test
    public void makeMiddle() {
        assertEquals(new int[] { 2, 3 }, array1.makeMiddle(new int[] { 1, 2, 3, 4 }));
        assertEquals(new int[] { 2, 3 }, array1.makeMiddle(new int[] { 7, 1, 2, 3, 4, 9 }));
        assertEquals(new int[] { 1, 2 }, array1.makeMiddle(new int[] { 1, 2 }));
        assertEquals(new int[] { 2, 4 }, array1.makeMiddle(new int[] { 5, 2, 4, 7 }));
        assertEquals(new int[] { 4, 3 }, array1.makeMiddle(new int[] { 9, 0, 4, 3, 9, 1 }));
    }

    @Disabled
    @Test
    public void plusTwo() {
        assertEquals(new int[] { 1, 2, 3, 4 }, array1.plusTwo(new int[] { 1, 2 }, new int[] { 3, 4 }));
        assertEquals(new int[] { 4, 4, 2, 2 }, array1.plusTwo(new int[] { 4, 4 }, new int[] { 2, 2 }));
        assertEquals(new int[] { 9, 2, 3, 4 }, array1.plusTwo(new int[] { 9, 2 }, new int[] { 3, 4 }));
    }

    @Disabled
    @Test
    public void swapEnds() {
        assertEquals(new int[] { 4, 2, 3, 1 }, array1.swapEnds(new int[] { 1, 2, 3, 4 }));
        assertEquals(new int[] { 3, 2, 1 }, array1.swapEnds(new int[] { 1, 2, 3 }));
        assertEquals(new int[] { 5, 6, 7, 9, 8 }, array1.swapEnds(new int[] { 8, 6, 7, 9, 5 }));
        assertEquals(new int[] { 9, 1, 4, 1, 5, 3 }, array1.swapEnds(new int[] { 3, 1, 4, 1, 5, 9 }));
        assertEquals(new int[] { 2, 1 }, array1.swapEnds(new int[] { 1, 2 }));
        assertEquals(new int[] { 1 }, array1.swapEnds(new int[] { 1 }));
    }

    @Disabled
    @Test
    public void midThree() {
        assertEquals(new int[] { 2, 3, 4 }, array1.midThree(new int[] { 1, 2, 3, 4, 5 }));
        assertEquals(new int[] { 7, 5, 3 }, array1.midThree(new int[] { 8, 6, 7, 5, 3, 0, 9 }));
        assertEquals(new int[] { 1, 2, 3 }, array1.midThree(new int[] { 1, 2, 3 }));
    }

    @Disabled
    @Test
    public void maxTriple() {
        assertEquals(3, array1.maxTriple(new int[] { 1, 2, 3 }));
        assertEquals(5, array1.maxTriple(new int[] { 1, 5, 3 }));
        assertEquals(5, array1.maxTriple(new int[] { 5, 2, 3 }));
        assertEquals(3, array1.maxTriple(new int[] { 1, 2, 3, 1, 1 }));
        assertEquals(5, array1.maxTriple(new int[] { 1, 7, 3, 1, 5 }));
        assertEquals(5, array1.maxTriple(new int[] { 5, 1, 3, 7, 1 }));
        assertEquals(5, array1.maxTriple(new int[] { 5, 1, 7, 3, 7, 8, 1 }));
        assertEquals(9, array1.maxTriple(new int[] { 5, 1, 7, 9, 7, 8, 1 }));
        assertEquals(9, array1.maxTriple(new int[] { 5, 1, 7, 3, 7, 8, 9 }));
        assertEquals(5, array1.maxTriple(new int[] { 2, 2, 5, 1, 1 }));
    }

    @Disabled
    @Test
    public void frontPiece() {
        assertEquals(new int[] { 1, 2 }, array1.frontPiece(new int[] { 1, 2, 3 }));
        assertEquals(new int[] { 1, 2 }, array1.frontPiece(new int[] { 1, 2 }));
        assertEquals(new int[] { 1 }, array1.frontPiece(new int[] { 1 }));
        assertEquals(new int[] {}, array1.frontPiece(new int[] {}));
        assertEquals(new int[] { 6, 5 }, array1.frontPiece(new int[] { 6, 5, 0 }));
        assertEquals(new int[] { 6, 5 }, array1.frontPiece(new int[] { 6, 5 }));
        assertEquals(new int[] { 3, 1 }, array1.frontPiece(new int[] { 3, 1, 4, 1, 5 }));
        assertEquals(new int[] { 6 }, array1.frontPiece(new int[] { 6 }));
    }

    @Disabled
    @Test
    public void unlucky1() {
        assertEquals(true, array1.unlucky1(new int[] { 1, 3, 4, 5 }));
        assertEquals(true, array1.unlucky1(new int[] { 2, 1, 3, 4, 5 }));
        assertEquals(false, array1.unlucky1(new int[] { 1, 1, 1 }));
        assertEquals(true, array1.unlucky1(new int[] { 1, 3, 1 }));
        assertEquals(true, array1.unlucky1(new int[] { 1, 1, 3 }));
        assertEquals(false, array1.unlucky1(new int[] { 1, 2, 3 }));
        assertEquals(false, array1.unlucky1(new int[] { 3, 3, 3 }));
        assertEquals(true, array1.unlucky1(new int[] { 1, 3 }));
        assertEquals(false, array1.unlucky1(new int[] { 1, 4 }));
        assertEquals(false, array1.unlucky1(new int[] { 1 }));
        assertEquals(false, array1.unlucky1(new int[] {}));
        assertEquals(false, array1.unlucky1(new int[] { 1, 1, 1, 3, 1 }));
        assertEquals(true, array1.unlucky1(new int[] { 1, 1, 3, 1, 1 }));
        assertEquals(true, array1.unlucky1(new int[] { 1, 1, 1, 1, 3 }));
        assertEquals(false, array1.unlucky1(new int[] { 1, 4, 1, 5 }));
        assertEquals(false, array1.unlucky1(new int[] { 1, 1, 2, 3 }));
        assertEquals(false, array1.unlucky1(new int[] { 2, 3, 2, 1 }));
        assertEquals(true, array1.unlucky1(new int[] { 2, 3, 1, 3 }));
        assertEquals(true, array1.unlucky1(new int[] { 1, 2, 3, 4, 1, 3 }));
    }

    @Disabled
    @Test
    public void make2() {
        assertEquals(new int[] { 4, 5 }, array1.make2(new int[] { 4, 5 }, new int[] { 1, 2, 3 }));
        assertEquals(new int[] { 4, 1 }, array1.make2(new int[] { 4 }, new int[] { 1, 2, 3 }));
        assertEquals(new int[] { 1, 2 }, array1.make2(new int[] {}, new int[] { 1, 2 }));
        assertEquals(new int[] { 1, 2 }, array1.make2(new int[] { 1, 2 }, new int[] {}));
        assertEquals(new int[] { 3, 1 }, array1.make2(new int[] { 3 }, new int[] { 1, 2, 3 }));
        assertEquals(new int[] { 3, 1 }, array1.make2(new int[] { 3 }, new int[] { 1 }));
        assertEquals(new int[] { 3, 1 }, array1.make2(new int[] { 3, 1, 4 }, new int[] {}));
        assertEquals(new int[] { 1, 1 }, array1.make2(new int[] { 1 }, new int[] { 1 }));
        assertEquals(new int[] { 1, 2 }, array1.make2(new int[] { 1, 2, 3 }, new int[] { 7, 8 }));
        assertEquals(new int[] { 7, 8 }, array1.make2(new int[] { 7, 8 }, new int[] { 1, 2, 3 }));
        assertEquals(new int[] { 7, 1 }, array1.make2(new int[] { 7 }, new int[] { 1, 2, 3 }));
        assertEquals(new int[] { 5, 4 }, array1.make2(new int[] { 5, 4 }, new int[] { 2, 3, 7 }));
    }

    @Disabled
    @Test
    public void front11() {
        assertEquals(new int[] { 1, 7 }, array1.front11(new int[] { 1, 2, 3 }, new int[] { 7, 9, 8 }));
        assertEquals(new int[] { 1, 2 }, array1.front11(new int[] { 1 }, new int[] { 2 }));
        assertEquals(new int[] { 1 }, array1.front11(new int[] { 1, 7 }, new int[] {}));
        assertEquals(new int[] { 2 }, array1.front11(new int[] {}, new int[] { 2, 8 }));
        assertEquals(new int[] {}, array1.front11(new int[] {}, new int[] {}));
        assertEquals(new int[] { 3, 1 }, array1.front11(new int[] { 3 }, new int[] { 1, 4, 1, 9 }));
        assertEquals(new int[] { 1 }, array1.front11(new int[] { 1, 4, 1, 9 }, new int[] {}));
    }

}