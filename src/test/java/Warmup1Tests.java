import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Warmup1Tests {

    Warmup1 warmup1 = new Warmup1();

    @Disabled
    @Test
    public void sleepIn() {
        assertTrue(warmup1.sleepIn(false, false));
        assertFalse(warmup1.sleepIn(true, false));
        assertTrue(warmup1.sleepIn(false, true));
        assertTrue(warmup1.sleepIn(true, true));
    }

    @Disabled
    @Test
    public void monkeyTrouble() {
        assertTrue(warmup1.monkeyTrouble(true, true));
        assertTrue(warmup1.monkeyTrouble(false, false));
        assertFalse(warmup1.monkeyTrouble(true, false));
        assertFalse(warmup1.monkeyTrouble(false, true));
    }


    @Disabled
    @Test
    public void sumDouble() {
        assertEquals(3, warmup1.sumDouble(1, 2));
        assertEquals(5, warmup1.sumDouble(3, 2));
        assertEquals(8, warmup1.sumDouble(2, 2));
        assertEquals(-1, warmup1.sumDouble(-1, 0));
        assertEquals(12, warmup1.sumDouble(3, 3));
        assertEquals(0, warmup1.sumDouble(0, 0));
        assertEquals(1, warmup1.sumDouble(0, 1));
        assertEquals(7, warmup1.sumDouble(3, 4));
    }

    @Disabled
    @Test
    public void diff21() {
        assertEquals(2, warmup1.diff21(19));
        assertEquals(11, warmup1.diff21(10));
        assertEquals(0, warmup1.diff21(21));
        assertEquals(2, warmup1.diff21(22));
        assertEquals(8, warmup1.diff21(25));
        assertEquals(18, warmup1.diff21(30));
        assertEquals(21, warmup1.diff21(0));
        assertEquals(20, warmup1.diff21(1));
        assertEquals(19, warmup1.diff21(2));
        assertEquals(22, warmup1.diff21(-1));
        assertEquals(23, warmup1.diff21(-2));
        assertEquals(58, warmup1.diff21(50));
    }

    @Disabled
    @Test
    public void parrotTrouble() {
        assertTrue(warmup1.parrotTrouble(true, 6));
        assertFalse(warmup1.parrotTrouble(true, 7));
        assertFalse(warmup1.parrotTrouble(false, 6));
        assertTrue(warmup1.parrotTrouble(true, 21));
        assertFalse(warmup1.parrotTrouble(false, 21));
        assertFalse(warmup1.parrotTrouble(false, 20));
        assertTrue(warmup1.parrotTrouble(true, 23));
        assertFalse(warmup1.parrotTrouble(false, 23));
        assertFalse(warmup1.parrotTrouble(true, 20));
        assertFalse(warmup1.parrotTrouble(false, 12));
    }

    @Disabled
    @Test
    public void makes10() {
        assertTrue(warmup1.makes10(9, 10));
        assertFalse(warmup1.makes10(9, 9));
        assertTrue(warmup1.makes10(1, 9));
        assertTrue(warmup1.makes10(10, 1));
        assertTrue(warmup1.makes10(10, 10));
        assertTrue(warmup1.makes10(8, 2));
        assertFalse(warmup1.makes10(8, 3));
        assertTrue(warmup1.makes10(10, 42));
        assertTrue(warmup1.makes10(12, -2));
    }

    @Disabled
    @Test
    public void nearHundred() {
        assertTrue(warmup1.nearHundred(93));
        assertTrue(warmup1.nearHundred(90));
        assertFalse(warmup1.nearHundred(89));
        assertTrue(warmup1.nearHundred(110));
        assertFalse(warmup1.nearHundred(111));
        assertFalse(warmup1.nearHundred(121));
        assertFalse(warmup1.nearHundred(-101));
        assertFalse(warmup1.nearHundred(-209));
        assertTrue(warmup1.nearHundred(190));
        assertTrue(warmup1.nearHundred(209));
        assertFalse(warmup1.nearHundred(0));
        assertFalse(warmup1.nearHundred(5));
        assertFalse(warmup1.nearHundred(-50));
        assertTrue(warmup1.nearHundred(191));
        assertFalse(warmup1.nearHundred(189));
        assertTrue(warmup1.nearHundred(200));
        assertTrue(warmup1.nearHundred(210));
        assertFalse(warmup1.nearHundred(211));
        assertFalse(warmup1.nearHundred(290));
    }

    @Disabled
    @Test
    public void posNeg() {
        assertTrue(warmup1.posNeg(1, -1, false));
        assertTrue(warmup1.posNeg(-1, 1, false));
        assertTrue(warmup1.posNeg(-4, -5, true));
        assertFalse(warmup1.posNeg(-4, -5, false));
        assertTrue(warmup1.posNeg(-4, 5, false));
        assertFalse(warmup1.posNeg(-4, 5, true));
        assertFalse(warmup1.posNeg(1, 1, false));
        assertFalse(warmup1.posNeg(-1, -1, false));
        assertFalse(warmup1.posNeg(1, -1, true));
        assertFalse(warmup1.posNeg(-1, 1, true));
        assertFalse(warmup1.posNeg(1, 1, true));
        assertTrue(warmup1.posNeg(-1, -1, true));
        assertTrue(warmup1.posNeg(5, -5, false));
        assertTrue(warmup1.posNeg(-6, 6, false));
        assertFalse(warmup1.posNeg(-5, -6, false));
        assertFalse(warmup1.posNeg(-2, -1, false));
        assertFalse(warmup1.posNeg(1, 2, false));
        assertFalse(warmup1.posNeg(-5, 6, true));
        assertTrue(warmup1.posNeg(-5, -5, true));
    }

    @Disabled
    @Test
    public void notvoid() {
        assertEquals("not candy", warmup1.notString("candy"));
        assertEquals("not x", warmup1.notString("x"));
        assertEquals("not bad", warmup1.notString("not bad"));
        assertEquals("not bad", warmup1.notString("bad"));
        assertEquals("not", warmup1.notString("not"));
        assertEquals("not is not", warmup1.notString("is not"));
        assertEquals("not no", warmup1.notString("no"));
    }

    @Disabled
    @Test
    public void missingChar() {
        assertEquals("ktten", warmup1.missingChar("kitten", 1));
        assertEquals("itten", warmup1.missingChar("kitten", 0));
        assertEquals("kittn", warmup1.missingChar("kitten", 4));
        assertEquals("i", warmup1.missingChar("Hi", 0));
        assertEquals("H", warmup1.missingChar("Hi", 1));
        assertEquals("ode", warmup1.missingChar("code", 0));
        assertEquals("cde", warmup1.missingChar("code", 1));
        assertEquals("coe", warmup1.missingChar("code", 2));
        assertEquals("cod", warmup1.missingChar("code", 3));
        assertEquals("chocolat", warmup1.missingChar("chocolate", 8));
    }

    @Disabled
    @Test
    public void frontBack() {
        assertEquals("eodc", warmup1.frontBack("code"));
        assertEquals("a", warmup1.frontBack("a"));
        assertEquals("ba", warmup1.frontBack("ab"));
        assertEquals("cba", warmup1.frontBack("abc"));
        assertEquals("", warmup1.frontBack(""));
        assertEquals("ehocolatC", warmup1.frontBack("Chocolate"));
        assertEquals("Java", warmup1.frontBack("aavJ"));
        assertEquals("oellh", warmup1.frontBack("hello"));
    }

    @Disabled
    @Test
    public void front3() {
        assertEquals("JavJavJav", warmup1.front3("Java"));
        assertEquals("ChoChoCho", warmup1.front3("Chocolate"));
        assertEquals("abcabcabc", warmup1.front3("abc"));
        assertEquals("abcabcabc", warmup1.front3("abcXYZ"));
        assertEquals("ababab", warmup1.front3("ab"));
        assertEquals("aaa", warmup1.front3("a"));
        assertEquals("", warmup1.front3(""));
    }

    @Disabled
    @Test
    public void backAround() {
        assertEquals("tcatt", warmup1.backAround("cat"));
        assertEquals("oHelloo", warmup1.backAround("Hello"));
        assertEquals("aaa", warmup1.backAround("a"));
        assertEquals("cabcc", warmup1.backAround("abc"));
        assertEquals("dreadd", warmup1.backAround("read"));
        assertEquals("obooo", warmup1.backAround("boo"));
    }

    @Disabled
    @Test
    public void or35() {
        assertTrue(warmup1.or35(3));
        assertTrue(warmup1.or35(10));
        assertFalse(warmup1.or35(8));
        assertTrue(warmup1.or35(15));
        assertTrue(warmup1.or35(5));
        assertTrue(warmup1.or35(9));
        assertFalse(warmup1.or35(4));
        assertFalse(warmup1.or35(7));
        assertTrue(warmup1.or35(6));
        assertFalse(warmup1.or35(17));
        assertTrue(warmup1.or35(18));
        assertFalse(warmup1.or35(29));
        assertTrue(warmup1.or35(20));
        assertTrue(warmup1.or35(21));
        assertFalse(warmup1.or35(22));
        assertTrue(warmup1.or35(45));
        assertTrue(warmup1.or35(99));
        assertTrue(warmup1.or35(100));
        assertFalse(warmup1.or35(101));
        assertFalse(warmup1.or35(121));
        assertFalse(warmup1.or35(122));
        assertTrue(warmup1.or35(123));
    }

    @Disabled
    @Test
    public void front22() {
        assertEquals("kikittenki", warmup1.front22("kitten"));
        assertEquals("HaHaHa", warmup1.front22("Ha"));
        assertEquals("ababcab", warmup1.front22("abc"));
        assertEquals("ababab", warmup1.front22("ab"));
        assertEquals("aaa", warmup1.front22("a"));
        assertEquals("", warmup1.front22(""));
        assertEquals("LoLogicLo", warmup1.front22("Logic"));
    }

    @Disabled
    @Test
    public void startHi() {
        assertTrue(warmup1.startHi("hi there"));
        assertTrue(warmup1.startHi("hi"));
        assertFalse(warmup1.startHi("hello hi"));
        assertFalse(warmup1.startHi("he"));
        assertFalse(warmup1.startHi("h"));
        assertFalse(warmup1.startHi(""));
        assertFalse(warmup1.startHi("ho hi"));
        assertTrue(warmup1.startHi("hi ho"));
    }

    @Disabled
    @Test
    public void icyHot() {
        assertTrue(warmup1.icyHot(120, -1));
        assertTrue(warmup1.icyHot(-1, 120));
        assertFalse(warmup1.icyHot(2, 120));
        assertFalse(warmup1.icyHot(-1, 100));
        assertFalse(warmup1.icyHot(-2, -2));
        assertFalse(warmup1.icyHot(120, 120));
    }

    @Disabled
    @Test
    public void in1020() {
        assertTrue(warmup1.in1020(12, 99));
        assertTrue(warmup1.in1020(21, 12));
        assertFalse(warmup1.in1020(8, 99));
        assertTrue(warmup1.in1020(99, 10));
        assertTrue(warmup1.in1020(20, 20));
        assertFalse(warmup1.in1020(21, 21));
        assertFalse(warmup1.in1020(9, 9));
    }

    @Disabled
    @Test
    public void hasTeen() {
        assertTrue(warmup1.hasTeen(13, 20, 10));
        assertTrue(warmup1.hasTeen(20, 19, 10));
        assertTrue(warmup1.hasTeen(20, 10, 13));
        assertFalse(warmup1.hasTeen(1, 20, 12));
        assertTrue(warmup1.hasTeen(19, 20, 12));
        assertTrue(warmup1.hasTeen(12, 20, 19));
        assertFalse(warmup1.hasTeen(12, 9, 20));
        assertTrue(warmup1.hasTeen(12, 18, 20));
        assertTrue(warmup1.hasTeen(14, 2, 20));
        assertFalse(warmup1.hasTeen(4, 2, 20));
        assertFalse(warmup1.hasTeen(11, 22, 22));
    }

    @Disabled
    @Test
    public void loneTeen() {
        assertTrue(warmup1.loneTeen(13, 99));
        assertTrue(warmup1.loneTeen(21, 19));
        assertFalse(warmup1.loneTeen(13, 13));
        assertTrue(warmup1.loneTeen(14, 20));
        assertTrue(warmup1.loneTeen(20, 15));
        assertFalse(warmup1.loneTeen(16, 17));
        assertTrue(warmup1.loneTeen(16, 9));
        assertFalse(warmup1.loneTeen(16, 18));
        assertFalse(warmup1.loneTeen(13, 19));
        assertTrue(warmup1.loneTeen(13, 20));
        assertTrue(warmup1.loneTeen(6, 18));
        assertTrue(warmup1.loneTeen(99, 13));
        assertFalse(warmup1.loneTeen(99, 99));
    }

    @Disabled
    @Test
    public void delDel() {
        assertEquals("abc", warmup1.delDel("adelbc"));
        assertEquals("aHello", warmup1.delDel("adelHello"));
        assertEquals("adedbc", warmup1.delDel("adedbc"));
        assertEquals("abcdel", warmup1.delDel("abcdel"));
        assertEquals("add", warmup1.delDel("add"));
        assertEquals("ad", warmup1.delDel("ad"));
        assertEquals("a", warmup1.delDel("a"));
        assertEquals("", warmup1.delDel(""));
        assertEquals("del", warmup1.delDel("del"));
        assertEquals("a", warmup1.delDel("adel"));
        assertEquals("aadelbb", warmup1.delDel("aadelbb"));
    }

    @Disabled
    @Test
    public void mixStart() {
        assertTrue(warmup1.mixStart("mix snacks"));
        assertTrue(warmup1.mixStart("pix snacks"));
        assertFalse(warmup1.mixStart("piz snacks"));
        assertTrue(warmup1.mixStart("nix"));
        assertFalse(warmup1.mixStart("ni"));
        assertFalse(warmup1.mixStart("n"));
        assertFalse(warmup1.mixStart(""));
    }

    @Disabled
    @Test
    public void startOz() {
        assertEquals("oz", warmup1.startOz("ozymandias"));
        assertEquals("z", warmup1.startOz("bzoo"));
        assertEquals("o", warmup1.startOz("oxx"));
        assertEquals("oz", warmup1.startOz("oz"));
        assertEquals("o", warmup1.startOz("ounce"));
        assertEquals("o", warmup1.startOz("o"));
        assertEquals("", warmup1.startOz("abc"));
        assertEquals("", warmup1.startOz(""));
        assertEquals("", warmup1.startOz("zoo"));
        assertEquals("z", warmup1.startOz("aztec"));
        assertEquals("z", warmup1.startOz("zzzz"));
        assertEquals("oz", warmup1.startOz("oznic"));
    }

    @Disabled
    @Test
    public void voidMax() {
        assertEquals(3, warmup1.intMax(1, 2, 3));
        assertEquals(3, warmup1.intMax(1, 3, 2));
        assertEquals(3, warmup1.intMax(3, 2, 1));
        assertEquals(9, warmup1.intMax(9, 3, 3));
        assertEquals(9, warmup1.intMax(3, 9, 3));
        assertEquals(9, warmup1.intMax(3, 3, 9));
        assertEquals(8, warmup1.intMax(8, 2, 3));
        assertEquals(-1, warmup1.intMax(-3, -1, -2));
        assertEquals(6, warmup1.intMax(6, 2, 5));
        assertEquals(6, warmup1.intMax(5, 6, 2));
        assertEquals(6, warmup1.intMax(5, 2, 6));
    }

    @Disabled
    @Test
    public void close10() {
        assertEquals(8, warmup1.close10(8, 13));
        assertEquals(8, warmup1.close10(13, 8));
        assertEquals(0, warmup1.close10(13, 7));
        assertEquals(0, warmup1.close10(7, 13));
        assertEquals(9, warmup1.close10(9, 13));
        assertEquals(8, warmup1.close10(13, 8));
        assertEquals(10, warmup1.close10(10, 12));
        assertEquals(10, warmup1.close10(11, 10));
        assertEquals(5, warmup1.close10(5, 21));
        assertEquals(0, warmup1.close10(0, 20));
        assertEquals(0, warmup1.close10(10, 10));
    }

    @Disabled
    @Test
    public void in3050() {
        assertTrue(warmup1.in3050(30, 31));
        assertFalse(warmup1.in3050(30, 41));
        assertTrue(warmup1.in3050(40, 50));
        assertFalse(warmup1.in3050(40, 51));
        assertFalse(warmup1.in3050(39, 50));
        assertFalse(warmup1.in3050(50, 39));
        assertTrue(warmup1.in3050(40, 39));
        assertTrue(warmup1.in3050(49, 48));
        assertTrue(warmup1.in3050(50, 40));
        assertFalse(warmup1.in3050(50, 51));
        assertTrue(warmup1.in3050(35, 36));
        assertFalse(warmup1.in3050(35, 45));
    }

    @Disabled
    @Test
    public void max1020() {
        assertEquals(19, warmup1.max1020(11, 19));
        assertEquals(19, warmup1.max1020(19, 11));
        assertEquals(11, warmup1.max1020(11, 9));
        assertEquals(0, warmup1.max1020(9, 21));
        assertEquals(10, warmup1.max1020(10, 21));
        assertEquals(10, warmup1.max1020(21, 10));
        assertEquals(11, warmup1.max1020(9, 11));
        assertEquals(10, warmup1.max1020(23, 10));
        assertEquals(20, warmup1.max1020(20, 10));
        assertEquals(20, warmup1.max1020(7, 20));
        assertEquals(17, warmup1.max1020(17, 16));
    }

    @Disabled
    @Test
    public void stringE() {
        assertTrue(warmup1.stringE("Hello"));
        assertTrue(warmup1.stringE("Heelle"));
        assertFalse(warmup1.stringE("Heelele"));
        assertFalse(warmup1.stringE("Hll"));
        assertTrue(warmup1.stringE("e"));
        assertFalse(warmup1.stringE(""));
    }

    @Disabled
    @Test
    public void lastDigit() {
        assertTrue(warmup1.lastDigit(7, 17));
        assertFalse(warmup1.lastDigit(6, 17));
        assertTrue(warmup1.lastDigit(3, 113));
        assertFalse(warmup1.lastDigit(114, 113));
        assertTrue(warmup1.lastDigit(114, 4));
        assertTrue(warmup1.lastDigit(10, 0));
        assertFalse(warmup1.lastDigit(11, 0));
    }

    @Disabled
    @Test
    public void endUp() {
        assertEquals("HeLLO", warmup1.endUp("Hello"));
        assertEquals("hi thERE", warmup1.endUp("hi there"));
        assertEquals("HI", warmup1.endUp("hi"));
        assertEquals("woo HOO", warmup1.endUp("woo hoo"));
        assertEquals("xyZ12", warmup1.endUp("xyz12"));
        assertEquals("X", warmup1.endUp("x"));
        assertEquals("", warmup1.endUp(""));
    }

    @Disabled
    @Test
    public void everyNth() {
        assertEquals("Mrce", warmup1.everyNth("Miracle", 2));
        assertEquals("aceg", warmup1.everyNth("abcdefg", 2));
        assertEquals("adg", warmup1.everyNth("abcdefg", 3));
        assertEquals("Cca", warmup1.everyNth("Chocolate", 3));
        assertEquals("Ccas", warmup1.everyNth("Chocolates", 3));
        assertEquals("Coe", warmup1.everyNth("Chocolates", 4));
        assertEquals("C", warmup1.everyNth("Chocolates", 100));
    }

}
