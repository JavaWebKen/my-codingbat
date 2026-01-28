import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Warmup2Tests {

    Warmup2 warmup2 = new Warmup2();

    @Disabled
    @Test
    public void stringTimes() {
        assertEquals("HiHi", warmup2.stringTimes("Hi", 2));
        assertEquals("HiHiHi", warmup2.stringTimes("Hi", 3));
        assertEquals("Hi", warmup2.stringTimes("Hi", 1));
        assertEquals("", warmup2.stringTimes("Hi", 0));
        assertEquals("HiHiHiHiHi", warmup2.stringTimes("Hi", 5));
        assertEquals("Oh Boy!Oh Boy!", warmup2.stringTimes("Oh Boy!", 2));
        assertEquals("xxxx", warmup2.stringTimes("x", 4));
        assertEquals("", warmup2.stringTimes("", 4));
        assertEquals("codecode", warmup2.stringTimes("code", 2));
        assertEquals("codecodecode", warmup2.stringTimes("code", 3));
    }

    @Disabled
    @Test
    public void frontTimes() {
        assertEquals("ChoCho", warmup2.frontTimes("Chocolate", 2));
        assertEquals("ChoChoCho", warmup2.frontTimes("Chocolate", 3));
        assertEquals("AbcAbcAbc", warmup2.frontTimes("Abc", 3));
        assertEquals("AbAbAbAb", warmup2.frontTimes("Ab", 4));
        assertEquals("AAAA", warmup2.frontTimes("A", 4));
        assertEquals("", warmup2.frontTimes("", 4));
        assertEquals("", warmup2.frontTimes("Abc", 0));
    }

    @Disabled
    @Test
    public void countXX() {
        assertEquals(1, warmup2.countXX("abcxx"));
        assertEquals(2, warmup2.countXX("xxx"));
        assertEquals(3, warmup2.countXX("xxxx"));
        assertEquals(0, warmup2.countXX("abc"));
        assertEquals(0, warmup2.countXX("Hello there"));
        assertEquals(2, warmup2.countXX("Hexxo thxxe"));
        assertEquals(0, warmup2.countXX(""));
        assertEquals(0, warmup2.countXX("Kittens"));
        assertEquals(2, warmup2.countXX("Kittensxxx"));
    }

    @Disabled
    @Test
    public void doubleX() {
        assertEquals(true, warmup2.doubleX("axxbb"));
        assertEquals(false, warmup2.doubleX("axaxax"));
        assertEquals(true, warmup2.doubleX("xxxxx"));
        assertEquals(false, warmup2.doubleX("xaxxx"));
        assertEquals(false, warmup2.doubleX("aaaax"));
        assertEquals(false, warmup2.doubleX(""));
        assertEquals(false, warmup2.doubleX("abc"));
        assertEquals(false, warmup2.doubleX("x"));
        assertEquals(true, warmup2.doubleX("xx"));
        assertEquals(false, warmup2.doubleX("xax"));
        assertEquals(false, warmup2.doubleX("xaxx"));
    }

    @Disabled
    @Test
    public void stringBits() {
        assertEquals("Hlo", warmup2.stringBits("Hello"));
        assertEquals("H", warmup2.stringBits("Hi"));
        assertEquals("Hello", warmup2.stringBits("Heeololeo"));
        assertEquals("HHH", warmup2.stringBits("HiHiHi"));
        assertEquals("", warmup2.stringBits(""));
        assertEquals("Getns", warmup2.stringBits("Greetings"));
        assertEquals("Coot", warmup2.stringBits("Chocoate"));
        assertEquals("p", warmup2.stringBits("pi"));
        assertEquals("HloKte", warmup2.stringBits("Hello Kitten"));
        assertEquals("happy", warmup2.stringBits("hxaxpxpxy"));
    }

    @Disabled
    @Test
    public void stringSplosion() {
        assertEquals("CCoCodCode", warmup2.stringSplosion("Code"));
        assertEquals("aababc", warmup2.stringSplosion("abc"));
        assertEquals("aab", warmup2.stringSplosion("ab"));
        assertEquals("x", warmup2.stringSplosion("x"));
        assertEquals("ffafadfade", warmup2.stringSplosion("fade"));
        assertEquals("TThTheTherThere", warmup2.stringSplosion("There"));
        assertEquals("KKiKitKittKitteKitten", warmup2.stringSplosion("Kitten"));
        assertEquals("BByBye", warmup2.stringSplosion("Bye"));
        assertEquals("GGoGooGood", warmup2.stringSplosion("Good"));
        assertEquals("BBaBad", warmup2.stringSplosion("Bad"));
    }

    @Disabled
    @Test
    public void last2() {
        assertEquals(1, warmup2.last2("hixxhi"));
        assertEquals(1, warmup2.last2("xaxxaxaxx"));
        assertEquals(2, warmup2.last2("axxxaaxx"));
        assertEquals(3, warmup2.last2("xxaxxaxxaxx"));
        assertEquals(0, warmup2.last2("xaxaxaxx"));
        assertEquals(2, warmup2.last2("xxxx"));
        assertEquals(1, warmup2.last2("13121312"));
        assertEquals(1, warmup2.last2("11212"));
        assertEquals(0, warmup2.last2("13121311"));
        assertEquals(2, warmup2.last2("1717171"));
        assertEquals(0, warmup2.last2("hi"));
        assertEquals(0, warmup2.last2("h"));
        assertEquals(0, warmup2.last2(""));
    }

    @Disabled
    @Test
    public void arrayCount9() {
        assertEquals(1, warmup2.arrayCount9(new int[] { 1, 2, 9 }));
        assertEquals(2, warmup2.arrayCount9(new int[] { 1, 9, 9 }));
        assertEquals(3, warmup2.arrayCount9(new int[] { 1, 9, 9, 3, 9 }));
        assertEquals(0, warmup2.arrayCount9(new int[] { 1, 2, 3 }));
        assertEquals(0, warmup2.arrayCount9(new int[] {}));
        assertEquals(0, warmup2.arrayCount9(new int[] { 4, 2, 4, 3, 1 }));
        assertEquals(1, warmup2.arrayCount9(new int[] { 9, 2, 4, 3, 1 }));
    }

    @Disabled
    @Test
    public void arrayFront9() {
        assertEquals(true, warmup2.arrayFront9(new int[] { 1, 2, 9, 3, 4 }));
        assertEquals(false, warmup2.arrayFront9(new int[] { 1, 2, 3, 4, 9 }));
        assertEquals(false, warmup2.arrayFront9(new int[] { 1, 2, 3, 4, 5 }));
        assertEquals(true, warmup2.arrayFront9(new int[] { 9, 2, 3 }));
        assertEquals(true, warmup2.arrayFront9(new int[] { 1, 9, 9 }));
        assertEquals(false, warmup2.arrayFront9(new int[] { 1, 2, 3 }));
        assertEquals(true, warmup2.arrayFront9(new int[] { 1, 9 }));
        assertEquals(false, warmup2.arrayFront9(new int[] { 5, 5 }));
        assertEquals(false, warmup2.arrayFront9(new int[] { 2 }));
        assertEquals(true, warmup2.arrayFront9(new int[] { 9 }));
        assertEquals(false, warmup2.arrayFront9(new int[] {}));
        assertEquals(true, warmup2.arrayFront9(new int[] { 3, 9, 2, 3, 3 }));
    }

    @Disabled
    @Test
    public void array123() {
        assertEquals(true, warmup2.array123(new int[] { 1, 1, 2, 3, 1 }));
        assertEquals(false, warmup2.array123(new int[] { 1, 1, 2, 4, 1 }));
        assertEquals(true, warmup2.array123(new int[] { 1, 1, 2, 1, 2, 3 }));
        assertEquals(false, warmup2.array123(new int[] { 1, 1, 2, 1, 2, 1 }));
        assertEquals(true, warmup2.array123(new int[] { 1, 2, 3, 1, 2, 3 }));
        assertEquals(true, warmup2.array123(new int[] { 1, 2, 3 }));
        assertEquals(false, warmup2.array123(new int[] { 1, 1, 1 }));
        assertEquals(false, warmup2.array123(new int[] { 1, 2 }));
        assertEquals(false, warmup2.array123(new int[] { 1 }));
        assertEquals(false, warmup2.array123(new int[] {}));
    }

    @Disabled
    @Test
    public void stringMatch() {
        assertEquals(3, warmup2.stringMatch("xxcaazz", "xxbaaz"));
        assertEquals(2, warmup2.stringMatch("abc", "abc"));
        assertEquals(0, warmup2.stringMatch("abc", "axc"));
        assertEquals(1, warmup2.stringMatch("hello", "he"));
        assertEquals(1, warmup2.stringMatch("he", "hello"));
        assertEquals(0, warmup2.stringMatch("h", "hello"));
        assertEquals(0, warmup2.stringMatch("", "hello"));
        assertEquals(1, warmup2.stringMatch("aabbccdd", "abbbxxd"));
        assertEquals(3, warmup2.stringMatch("aaxxaaxx", "iaxxai"));
        assertEquals(3, warmup2.stringMatch("iaxxai", "aaxxaaxx"));
    }

    @Disabled
    @Test
    public void stringX() {
        assertEquals("xHix", warmup2.stringX("xxHxix"));
        assertEquals("abcd", warmup2.stringX("abxxxcd"));
        assertEquals("xabcdx", warmup2.stringX("xabxxxcdx"));
        assertEquals("xKittenx", warmup2.stringX("xKittenx"));
        assertEquals("Hello", warmup2.stringX("Hello"));
        assertEquals("xx", warmup2.stringX("xx"));
        assertEquals("x", warmup2.stringX("x"));
        assertEquals("", warmup2.stringX(""));
    }

    @Disabled
    @Test
    public void altPairs() {
        assertEquals("kien", warmup2.altPairs("kitten"));
        assertEquals("Chole", warmup2.altPairs("Chocolate"));
        assertEquals("Congrr", warmup2.altPairs("CodingHorror"));
        assertEquals("ya", warmup2.altPairs("yak"));
        assertEquals("ya", warmup2.altPairs("ya"));
        assertEquals("y", warmup2.altPairs("y"));
        assertEquals("", warmup2.altPairs(""));
        assertEquals("ThThThth", warmup2.altPairs("ThisThatTheOther"));
    }

    @Disabled
    @Test
    public void stringYak() {
        assertEquals("pak", warmup2.stringYak("yakpak"));
        assertEquals("pak", warmup2.stringYak("pakyak"));
        assertEquals("123ya", warmup2.stringYak("yak123ya"));
        assertEquals("", warmup2.stringYak("yak"));
        assertEquals("xxx", warmup2.stringYak("yakxxxyak"));
        assertEquals("HiHi", warmup2.stringYak("HiyakHi"));
        assertEquals("xxxyyzzz", warmup2.stringYak("xxxyakyyyakzzz"));
    }

    @Disabled
    @Test
    public void array667() {
        assertEquals(1, warmup2.array667(new int[] { 6, 6, 2 }));
        assertEquals(1, warmup2.array667(new int[] { 6, 6, 2, 6 }));
        assertEquals(1, warmup2.array667(new int[] { 6, 7, 2, 6 }));
        assertEquals(2, warmup2.array667(new int[] { 6, 6, 2, 6, 7 }));
        assertEquals(0, warmup2.array667(new int[] { 1, 6, 3 }));
        assertEquals(0, warmup2.array667(new int[] { 6, 1 }));
        assertEquals(0, warmup2.array667(new int[] {}));
        assertEquals(1, warmup2.array667(new int[] { 3, 6, 7, 6 }));
        assertEquals(2, warmup2.array667(new int[] { 3, 6, 6, 7 }));
        assertEquals(1, warmup2.array667(new int[] { 6, 3, 6, 6 }));
        assertEquals(2, warmup2.array667(new int[] { 6, 7, 6, 6 }));
        assertEquals(0, warmup2.array667(new int[] { 1, 2, 3, 5, 6 }));
        assertEquals(1, warmup2.array667(new int[] { 1, 2, 3, 6, 6 }));
    }

    @Disabled
    @Test
    public void noTriples() {
        assertEquals(true, warmup2.noTriples(new int[] { 1, 1, 2, 2, 1 }));
        assertEquals(false, warmup2.noTriples(new int[] { 1, 1, 2, 2, 2, 1 }));
        assertEquals(false, warmup2.noTriples(new int[] { 1, 1, 1, 2, 2, 2, 1 }));
        assertEquals(true, warmup2.noTriples(new int[] { 1, 1, 2, 2, 1, 2, 1 }));
        assertEquals(true, warmup2.noTriples(new int[] { 1, 2, 1 }));
        assertEquals(false, warmup2.noTriples(new int[] { 1, 1, 1 }));
        assertEquals(true, warmup2.noTriples(new int[] { 1, 1 }));
        assertEquals(true, warmup2.noTriples(new int[] { 1 }));
        assertEquals(true, warmup2.noTriples(new int[] {}));
    }

    @Disabled
    @Test
    public void has271() {
        assertEquals(true, warmup2.has271(new int[] { 1, 2, 7, 1 }));
        assertEquals(false, warmup2.has271(new int[] { 1, 2, 8, 1 }));
        assertEquals(true, warmup2.has271(new int[] { 2, 7, 1 }));
        assertEquals(true, warmup2.has271(new int[] { 3, 8, 2 }));
        assertEquals(true, warmup2.has271(new int[] { 2, 7, 3 }));
        assertEquals(false, warmup2.has271(new int[] { 2, 7, 4 }));
        assertEquals(true, warmup2.has271(new int[] { 2, 7, -1 }));
        assertEquals(false, warmup2.has271(new int[] { 2, 7, -2 }));
        assertEquals(true, warmup2.has271(new int[] { 4, 5, 3, 8, 0 }));
        assertEquals(true, warmup2.has271(new int[] { 2, 7, 5, 10, 4 }));
        assertEquals(true, warmup2.has271(new int[] { 2, 7, -2, 4, 9, 3 }));
        assertEquals(false, warmup2.has271(new int[] { 2, 7, 5, 10, 1 }));
        assertEquals(false, warmup2.has271(new int[] { 2, 7, -2, 4, 10, 2 }));
        assertEquals(false, warmup2.has271(new int[] { 1, 1, 4, 9, 0 }));
        assertEquals(true, warmup2.has271(new int[] { 1, 1, 4, 9, 4, 9, 2 }));
    }

}