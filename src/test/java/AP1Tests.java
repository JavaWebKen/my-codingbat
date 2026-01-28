
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class AP1Tests {

    AP1 aP1 = new AP1();

    @Disabled
    @Test
    public void scoresIncreasing() {
        assertEquals(true, aP1.scoresIncreasing(new int[] { 1, 3, 4 }));
        assertEquals(false, aP1.scoresIncreasing(new int[] { 1, 3, 2 }));
        assertEquals(true, aP1.scoresIncreasing(new int[] { 1, 1, 4 }));
        assertEquals(true, aP1.scoresIncreasing(new int[] { 1, 1, 2, 4, 4, 7 }));
        assertEquals(false, aP1.scoresIncreasing(new int[] { 1, 1, 2, 4, 3, 7 }));
        assertEquals(true, aP1.scoresIncreasing(new int[] { -5, 4, 11 }));
    }

    @Disabled
    @Test
    public void scores100() {
        assertEquals(true, aP1.scores100(new int[] { 1, 100, 100 }));
        assertEquals(false, aP1.scores100(new int[] { 1, 100, 99, 100 }));
        assertEquals(true, aP1.scores100(new int[] { 100, 1, 100, 100 }));
        assertEquals(false, aP1.scores100(new int[] { 100, 1, 100, 1 }));
        assertEquals(false, aP1.scores100(new int[] { 1, 2, 3, 4, 5 }));
        assertEquals(false, aP1.scores100(new int[] { 1, 2, 100, 4, 5 }));
    }

    @Disabled
    @Test
    public void scoresClump() {
        assertEquals(true, aP1.scoresClump(new int[] { 3, 4, 5 }));
        assertEquals(false, aP1.scoresClump(new int[] { 3, 4, 6 }));
        assertEquals(true, aP1.scoresClump(new int[] { 1, 3, 5, 5 }));
        assertEquals(true, aP1.scoresClump(new int[] { 2, 4, 5, 6 }));
        assertEquals(false, aP1.scoresClump(new int[] { 2, 4, 5, 7 }));
        assertEquals(true, aP1.scoresClump(new int[] { 2, 4, 4, 7 }));
        assertEquals(false, aP1.scoresClump(new int[] { 3, 3, 6, 7, 9 }));
        assertEquals(true, aP1.scoresClump(new int[] { 3, 3, 7, 7, 9 }));
        assertEquals(false, aP1.scoresClump(new int[] { 4, 5, 8 }));
    }

    @Disabled
    @Test
    public void scoresAverage() {
        assertEquals(4, aP1.scoresAverage(new int[] { 2, 2, 4, 4 }));
        assertEquals(4, aP1.scoresAverage(new int[] { 4, 4, 4, 2, 2, 2 }));
        assertEquals(4, aP1.scoresAverage(new int[] { 3, 4, 5, 1, 2, 3 }));
        assertEquals(6, aP1.scoresAverage(new int[] { 5, 6 }));
        assertEquals(5, aP1.scoresAverage(new int[] { 5, 4 }));
        assertEquals(5, aP1.scoresAverage(new int[] { 5, 4, 5, 6, 2, 1, 2, 3 }));
    }

    @Disabled
    @Test
    public void wordsCount() {
        assertEquals(2, aP1.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 1));
        assertEquals(1, aP1.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 3));
        assertEquals(0, aP1.wordsCount(new String[] { "a", "bb", "b", "ccc" }, 4));
        assertEquals(2, aP1.wordsCount(new String[] { "xx", "yyy", "x", "yy", "z" }, 1));
        assertEquals(2, aP1.wordsCount(new String[] { "xx", "yyy", "x", "yy", "z" }, 2));
        assertEquals(1, aP1.wordsCount(new String[] { "xx", "yyy", "x", "yy", "z" }, 3));
    }

    @Disabled
    @Test
    public void wordsFront() {
        assertEquals(new String[] { "a" }, aP1.wordsFront(new String[] { "a", "b", "c", "d" }, 1));
        assertEquals(new String[] { "a", "b" }, aP1.wordsFront(new String[] { "a", "b", "c", "d" }, 2));
        assertEquals(new String[] { "a", "b", "c" }, aP1.wordsFront(new String[] { "a", "b", "c", "d" }, 3));
        assertEquals(new String[] { "a", "b", "c", "d" }, aP1.wordsFront(new String[] { "a", "b", "c", "d" }, 4));
        assertEquals(new String[] { "Hi" }, aP1.wordsFront(new String[] { "Hi", "There" }, 1));
        assertEquals(new String[] { "Hi", "There" }, aP1.wordsFront(new String[] { "Hi", "There" }, 2));
    }

    @Disabled
    @Test
    public void wordsWithoutvoid() {
        assertEquals(new String[] { "bb", "ccc" }, aP1.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 1));
        assertEquals(new String[] { "a", "bb", "b" }, aP1.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 3));
        assertEquals(new String[] { "a", "bb", "b", "ccc" },
                aP1.wordsWithoutList(new String[] { "a", "bb", "b", "ccc" }, 4));
        assertEquals(new String[] { "xx", "yyy", "yy" },
                aP1.wordsWithoutList(new String[] { "xx", "yyy", "x", "yy", "z" }, 1));
        assertEquals(new String[] { "yyy", "x", "z" },
                aP1.wordsWithoutList(new String[] { "xx", "yyy", "x", "yy", "z" }, 2));
    }

    @Disabled
    @Test
    public void hasOne() {
        assertEquals(true, aP1.hasOne(10));
        assertEquals(false, aP1.hasOne(22));
        assertEquals(false, aP1.hasOne(220));
        assertEquals(true, aP1.hasOne(212));
        assertEquals(true, aP1.hasOne(1));
        assertEquals(false, aP1.hasOne(9));
        assertEquals(true, aP1.hasOne(211112));
        assertEquals(true, aP1.hasOne(121121));
        assertEquals(false, aP1.hasOne(222222));
        assertEquals(true, aP1.hasOne(56156));
        assertEquals(false, aP1.hasOne(56556));
    }

    @Disabled
    @Test
    public void dividesSelf() {
        assertEquals(true, aP1.dividesSelf(128));
        assertEquals(true, aP1.dividesSelf(12));
        assertEquals(false, aP1.dividesSelf(120));
        assertEquals(true, aP1.dividesSelf(122));
        assertEquals(false, aP1.dividesSelf(13));
        assertEquals(false, aP1.dividesSelf(32));
        assertEquals(true, aP1.dividesSelf(22));
        assertEquals(false, aP1.dividesSelf(42));
        assertEquals(true, aP1.dividesSelf(212));
        assertEquals(false, aP1.dividesSelf(213));
        assertEquals(true, aP1.dividesSelf(162));
    }

    @Disabled
    @Test
    public void copyEvens() {
        assertEquals(new int[] { 2, 4 }, aP1.copyEvens(new int[] { 3, 2, 4, 5, 8 }, 2));
        assertEquals(new int[] { 2, 4, 8 }, aP1.copyEvens(new int[] { 3, 2, 4, 5, 8 }, 3));
        assertEquals(new int[] { 6, 2, 4 }, aP1.copyEvens(new int[] { 6, 1, 2, 4, 5, 8 }, 3));
        assertEquals(new int[] { 6, 2, 4, 8 }, aP1.copyEvens(new int[] { 6, 1, 2, 4, 5, 8 }, 4));
        assertEquals(new int[] { 4 }, aP1.copyEvens(new int[] { 3, 1, 4, 1, 5 }, 1));
        assertEquals(new int[] { 2 }, aP1.copyEvens(new int[] { 2 }, 1));
        assertEquals(new int[] { 6, 2 }, aP1.copyEvens(new int[] { 6, 2, 4, 8 }, 2));
        assertEquals(new int[] { 6, 2, 4 }, aP1.copyEvens(new int[] { 6, 2, 4, 8 }, 3));
        assertEquals(new int[] { 6, 2, 4, 8 }, aP1.copyEvens(new int[] { 6, 2, 4, 8 }, 4));
        assertEquals(new int[] { 8 }, aP1.copyEvens(new int[] { 1, 8, 4 }, 1));
        assertEquals(new int[] { 8, 4 }, aP1.copyEvens(new int[] { 1, 8, 4 }, 2));
        assertEquals(new int[] { 2, 8 }, aP1.copyEvens(new int[] { 2, 8, 4 }, 2));
    }

    @Disabled
    @Test
    public void copyEndy() {
        assertEquals(new int[] { 9, 90 }, aP1.copyEndy(new int[] { 9, 11, 90, 22, 6 }, 2));
        assertEquals(new int[] { 9, 90, 6 }, aP1.copyEndy(new int[] { 9, 11, 90, 22, 6 }, 3));
        assertEquals(new int[] { 1, 1 }, aP1.copyEndy(new int[] { 12, 1, 1, 13, 0, 20 }, 2));
        assertEquals(new int[] { 1, 1, 0 }, aP1.copyEndy(new int[] { 12, 1, 1, 13, 0, 20 }, 3));
        assertEquals(new int[] { 0 }, aP1.copyEndy(new int[] { 0 }, 1));
        assertEquals(new int[] { 10, 90 }, aP1.copyEndy(new int[] { 10, 11, 90 }, 2));
        assertEquals(new int[] { 90, 100 }, aP1.copyEndy(new int[] { 90, 22, 100 }, 2));
        assertEquals(new int[] { 10 }, aP1.copyEndy(new int[] { 12, 11, 10, 89, 101, 4 }, 1));
        assertEquals(new int[] { 2, 2 }, aP1.copyEndy(new int[] { 13, 2, 2, 0 }, 2));
        assertEquals(new int[] { 2, 2, 0 }, aP1.copyEndy(new int[] { 13, 2, 2, 0 }, 3));
        assertEquals(new int[] { 2, 2 }, aP1.copyEndy(new int[] { 13, 2, 13, 2, 0, 30 }, 2));
        assertEquals(new int[] { 2, 2, 0 }, aP1.copyEndy(new int[] { 13, 2, 13, 2, 0, 30 }, 3));
    }

    @Disabled
    @Test
    public void matchUp() {
        assertEquals(1, aP1.matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "aaa", "xx", "bb" }));
        assertEquals(2, aP1.matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "aaa", "b", "bb" }));
        assertEquals(1, aP1.matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "", "", "ccc" }));
        assertEquals(1, aP1.matchUp(new String[] { "", "", "ccc" }, new String[] { "aa", "bb", "cc" }));
        assertEquals(0, aP1.matchUp(new String[] { "", "", "" }, new String[] { "", "bb", "cc" }));
        assertEquals(0, aP1.matchUp(new String[] { "aa", "bb", "cc" }, new String[] { "", "", "" }));
        assertEquals(1, aP1.matchUp(new String[] { "aa", "", "ccc" }, new String[] { "", "bb", "cc" }));
        assertEquals(0, aP1.matchUp(new String[] { "x", "y", "z" }, new String[] { "y", "z", "x" }));
        assertEquals(1, aP1.matchUp(new String[] { "", "y", "z" }, new String[] { "", "y", "x" }));
        assertEquals(3, aP1.matchUp(new String[] { "x", "y", "z" }, new String[] { "xx", "yyy", "zzz" }));
        assertEquals(2, aP1.matchUp(new String[] { "x", "y", "z" }, new String[] { "xx", "yyy", "" }));
        assertEquals(3, aP1.matchUp(new String[] { "b", "x", "y", "z" }, new String[] { "a", "xx", "yyy", "zzz" }));
        assertEquals(1, aP1.matchUp(new String[] { "aaa", "bb", "c" }, new String[] { "aaa", "xx", "bb" }));
    }

    @Disabled
    @Test
    public void scoreUp() {
        assertEquals(6, aP1.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "a", "c", "b", "c" }));
        assertEquals(11, aP1.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "a", "a", "b", "c" }));
        assertEquals(16, aP1.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "a", "a", "b", "b" }));
        assertEquals(3, aP1.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "?", "c", "b", "?" }));
        assertEquals(-1, aP1.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "?", "c", "?", "?" }));
        assertEquals(7, aP1.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "c", "?", "b", "b" }));
        assertEquals(3, aP1.scoreUp(new String[] { "a", "a", "b", "b" }, new String[] { "c", "?", "b", "?" }));
        assertEquals(2, aP1.scoreUp(new String[] { "a", "b", "c" }, new String[] { "a", "c", "b" }));
        assertEquals(4, aP1.scoreUp(new String[] { "a", "a", "b", "b", "c", "c" },
                new String[] { "a", "c", "a", "c", "a", "c" }));
        assertEquals(6, aP1.scoreUp(new String[] { "a", "a", "b", "b", "c", "c" },
                new String[] { "a", "c", "?", "?", "a", "c" }));
        assertEquals(11, aP1.scoreUp(new String[] { "a", "a", "b", "b", "c", "c" },
                new String[] { "a", "c", "?", "?", "c", "c" }));
        assertEquals(12, aP1.scoreUp(new String[] { "a", "b", "c" }, new String[] { "a", "b", "c" }));
    }

    @Disabled
    @Test
    public void wordsWithout() {
        assertEquals(new String[] { "b", "c" }, aP1.wordsWithout(new String[] { "a", "b", "c", "a" }, "a"));
        assertEquals(new String[] { "a", "c", "a" }, aP1.wordsWithout(new String[] { "a", "b", "c", "a" }, "b"));
        assertEquals(new String[] { "a", "b", "a" }, aP1.wordsWithout(new String[] { "a", "b", "c", "a" }, "c"));
        assertEquals(new String[] { "c", "a", "a" }, aP1.wordsWithout(new String[] { "b", "c", "a", "a" }, "b"));
        assertEquals(new String[] { "xx", "yyy", "yy" },
                aP1.wordsWithout(new String[] { "xx", "yyy", "x", "yy", "x" }, "x"));
        assertEquals(new String[] { "xx", "yyy", "x", "x" },
                aP1.wordsWithout(new String[] { "xx", "yyy", "x", "yy", "x" }, "yy"));
        assertEquals(new String[] { "ab", "ac" }, aP1.wordsWithout(new String[] { "aa", "ab", "ac", "aa" }, "aa"));
    }

    @Disabled
    @Test
    public void scoresSpecial() {
        assertEquals(40, aP1.scoresSpecial(new int[] { 12, 10, 4 }, new int[] { 2, 20, 30 }));
        assertEquals(40, aP1.scoresSpecial(new int[] { 20, 10, 4 }, new int[] { 2, 20, 10 }));
        assertEquals(20, aP1.scoresSpecial(new int[] { 12, 11, 4 }, new int[] { 2, 20, 31 }));
        assertEquals(50, aP1.scoresSpecial(new int[] { 1, 20, 2, 50 }, new int[] { 3, 4, 5 }));
        assertEquals(50, aP1.scoresSpecial(new int[] { 3, 4, 5 }, new int[] { 1, 50, 2, 20 }));
        assertEquals(50, aP1.scoresSpecial(new int[] { 10, 4, 20, 30 }, new int[] { 20 }));
        assertEquals(50, aP1.scoresSpecial(new int[] { 10, 4, 20, 30 }, new int[] { 20 }));
        assertEquals(50, aP1.scoresSpecial(new int[] { 10, 4, 20, 30 }, new int[] { 3, 20, 99 }));
        assertEquals(60, aP1.scoresSpecial(new int[] { 10, 4, 20, 30 }, new int[] { 30, 20, 99 }));
        assertEquals(0, aP1.scoresSpecial(new int[] {}, new int[] { 2 }));
        assertEquals(20, aP1.scoresSpecial(new int[] {}, new int[] { 20 }));
        assertEquals(40, aP1.scoresSpecial(new int[] { 14, 10, 4 }, new int[] { 4, 20, 30 }));
    }

    @Disabled
    @Test
    public void sumHeights() {
        assertEquals(6, aP1.sumHeights(new int[] { 5, 3, 6, 7, 2 }, 2, 4));
        assertEquals(2, aP1.sumHeights(new int[] { 5, 3, 6, 7, 2 }, 0, 1));
        assertEquals(11, aP1.sumHeights(new int[] { 5, 3, 6, 7, 2 }, 0, 4));
        assertEquals(0, aP1.sumHeights(new int[] { 5, 3, 6, 7, 2 }, 1, 1));
        assertEquals(3, aP1.sumHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 0, 3));
        assertEquals(11, aP1.sumHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 4, 8));
        assertEquals(8, aP1.sumHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 7, 8));
        assertEquals(0, aP1.sumHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 8, 8));
        assertEquals(0, aP1.sumHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 2, 2));
        assertEquals(3, aP1.sumHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 3, 6));
        assertEquals(1, aP1.sumHeights(new int[] { 10, 8, 7, 7, 7, 6, 7 }, 1, 4));
        assertEquals(2, aP1.sumHeights(new int[] { 10, 8, 7, 7, 7, 6, 7 }, 1, 5));
    }

    @Disabled
    @Test
    public void sumHeights2() {
        assertEquals(7, aP1.sumHeights2(new int[] { 5, 3, 6, 7, 2 }, 2, 4));
        assertEquals(2, aP1.sumHeights2(new int[] { 5, 3, 6, 7, 2 }, 0, 1));
        assertEquals(15, aP1.sumHeights2(new int[] { 5, 3, 6, 7, 2 }, 0, 4));
        assertEquals(0, aP1.sumHeights2(new int[] { 5, 3, 6, 7, 2 }, 1, 1));
        assertEquals(6, aP1.sumHeights2(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 0, 3));
        assertEquals(19, aP1.sumHeights2(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 4, 8));
        assertEquals(16, aP1.sumHeights2(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 7, 8));
        assertEquals(0, aP1.sumHeights2(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 8, 8));
        assertEquals(0, aP1.sumHeights2(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 2, 2));
        assertEquals(4, aP1.sumHeights2(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 3, 6));
        assertEquals(1, aP1.sumHeights2(new int[] { 10, 8, 7, 7, 7, 6, 7 }, 1, 4));
        assertEquals(2, aP1.sumHeights2(new int[] { 10, 8, 7, 7, 7, 6, 7 }, 1, 5));
    }

    @Disabled
    @Test
    public void bigHeights() {
        assertEquals(1, aP1.bigHeights(new int[] { 5, 3, 6, 7, 2 }, 2, 4));
        assertEquals(0, aP1.bigHeights(new int[] { 5, 3, 6, 7, 2 }, 0, 1));
        assertEquals(1, aP1.bigHeights(new int[] { 5, 3, 6, 7, 2 }, 0, 4));
        assertEquals(0, aP1.bigHeights(new int[] { 5, 3, 6, 7, 3 }, 0, 4));
        assertEquals(0, aP1.bigHeights(new int[] { 5, 3, 6, 7, 2 }, 1, 1));
        assertEquals(1, aP1.bigHeights(new int[] { 5, 13, 6, 7, 2 }, 1, 2));
        assertEquals(2, aP1.bigHeights(new int[] { 5, 13, 6, 7, 2 }, 0, 2));
        assertEquals(2, aP1.bigHeights(new int[] { 5, 13, 6, 7, 2 }, 1, 4));
        assertEquals(3, aP1.bigHeights(new int[] { 5, 13, 6, 7, 2 }, 0, 4));
        assertEquals(2, aP1.bigHeights(new int[] { 5, 13, 6, 7, 2 }, 0, 3));
        assertEquals(0, aP1.bigHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 0, 3));
        assertEquals(1, aP1.bigHeights(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 10 }, 4, 8));
        assertEquals(1, aP1.bigHeights(new int[] { 1, 2, 3, 14, 5, 4, 3, 2, 10 }, 0, 3));
        assertEquals(1, aP1.bigHeights(new int[] { 1, 2, 3, 14, 5, 4, 3, 2, 10 }, 7, 8));
        assertEquals(2, aP1.bigHeights(new int[] { 1, 2, 3, 14, 5, 4, 3, 2, 10 }, 3, 8));
        assertEquals(3, aP1.bigHeights(new int[] { 1, 2, 3, 14, 5, 4, 3, 2, 10 }, 2, 8));
    }

    @Disabled
    @Test
    public void userCompare() {
        assertEquals(-1, aP1.userCompare("bb", 1, "zz", 2));
        assertEquals(1, aP1.userCompare("bb", 1, "aa", 2));
        assertEquals(0, aP1.userCompare("bb", 1, "bb", 1));
        assertEquals(1, aP1.userCompare("bb", 5, "bb", 1));
        assertEquals(-1, aP1.userCompare("bb", 5, "bb", 10));
        assertEquals(-1, aP1.userCompare("adam", 1, "bob", 2));
        assertEquals(-1, aP1.userCompare("bob", 1, "bob", 2));
        assertEquals(1, aP1.userCompare("bzb", 1, "bob", 2));
    }

    @Disabled
    @Test
    public void mergeTwo() {
        assertEquals(new String[] { "a", "b", "c" },
                aP1.mergeTwo(new String[] { "a", "c", "z" }, new String[] { "b", "f", "z" }, 3));
        assertEquals(new String[] { "a", "c", "f" },
                aP1.mergeTwo(new String[] { "a", "c", "z" }, new String[] { "c", "f", "z" }, 3));
        assertEquals(new String[] { "c", "f", "g" },
                aP1.mergeTwo(new String[] { "f", "g", "z" }, new String[] { "c", "f", "g" }, 3));
        assertEquals(new String[] { "a", "c", "z" },
                aP1.mergeTwo(new String[] { "a", "c", "z" }, new String[] { "a", "c", "z" }, 3));
        assertEquals(new String[] { "a", "b", "c" },
                aP1.mergeTwo(new String[] { "a", "b", "c", "z" }, new String[] { "a", "c", "z" }, 3));
        assertEquals(new String[] { "a", "b", "c" },
                aP1.mergeTwo(new String[] { "a", "c", "z" }, new String[] { "a", "b", "c", "z" }, 3));
        assertEquals(new String[] { "a", "c" },
                aP1.mergeTwo(new String[] { "a", "c", "z" }, new String[] { "a", "c", "z" }, 2));
        assertEquals(new String[] { "a", "c", "y" },
                aP1.mergeTwo(new String[] { "a", "c", "z" }, new String[] { "a", "c", "y", "z" }, 3));
        assertEquals(new String[] { "a", "b", "x" },
                aP1.mergeTwo(new String[] { "x", "y", "z" }, new String[] { "a", "b", "z" }, 3));
    }

    @Disabled
    @Test
    public void commonTwo() {
        assertEquals(2, aP1.commonTwo(new String[] { "a", "c", "x" }, new String[] { "b", "c", "d", "x" }));
        assertEquals(3, aP1.commonTwo(new String[] { "a", "c", "x" }, new String[] { "a", "b", "c", "x", "z" }));
        assertEquals(3, aP1.commonTwo(new String[] { "a", "b", "c" }, new String[] { "a", "b", "c" }));
        assertEquals(3, aP1.commonTwo(new String[] { "a", "a", "b", "b", "c" }, new String[] { "a", "b", "c" }));
        assertEquals(3,
                aP1.commonTwo(new String[] { "a", "a", "b", "b", "c" }, new String[] { "a", "b", "b", "b", "c" }));
        assertEquals(3,
                aP1.commonTwo(new String[] { "a", "a", "b", "b", "c" }, new String[] { "a", "b", "b", "c", "c" }));
        assertEquals(2,
                aP1.commonTwo(new String[] { "b", "b", "b", "b", "c" }, new String[] { "a", "b", "b", "b", "c" }));
        assertEquals(4,
                aP1.commonTwo(new String[] { "a", "b", "c", "c", "d" }, new String[] { "a", "b", "b", "c", "d", "d" }));
        assertEquals(1, aP1.commonTwo(new String[] { "a", "a", "b", "b", "c" }, new String[] { "b", "b", "b" }));
        assertEquals(1, aP1.commonTwo(new String[] { "a", "a", "b", "b", "c" }, new String[] { "c", "c" }));
        assertEquals(1, aP1.commonTwo(new String[] { "a", "a", "b", "b", "c" }, new String[] { "b", "b", "b", "x" }));
        assertEquals(1, aP1.commonTwo(new String[] { "a", "a", "b", "b", "c" }, new String[] { "b", "b" }));
        assertEquals(1, aP1.commonTwo(new String[] { "a" }, new String[] { "a", "b" }));
        assertEquals(0, aP1.commonTwo(new String[] { "a" }, new String[] { "b" }));
        assertEquals(0, aP1.commonTwo(new String[] { "a", "a" }, new String[] { "b", "b" }));
        assertEquals(2, aP1.commonTwo(new String[] { "a", "b" }, new String[] { "a", "b" }));
    }

}