import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Warmup1Tests {

    Warmup1 warmup1 = new Warmup1();

    @Test
    public void sleepIn() {
        assertEquals(true, warmup1.sleepIn(false, false));
        assertEquals(false, warmup1.sleepIn(true, false));
        assertEquals(true, warmup1.sleepIn(false, true));
        assertEquals(true, warmup1.sleepIn(true, true));
    }

    @Test
    public void monkeyTrouble() {
        assertEquals(true, warmup1.monkeyTrouble(true, true));
        assertEquals(true, warmup1.monkeyTrouble(false, false));
        assertEquals(false, warmup1.monkeyTrouble(true, false));
        assertEquals(false, warmup1.monkeyTrouble(false, true));
    }

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

    @Test
    public void parrotTrouble() {
        assertEquals(true, warmup1.parrotTrouble(true, 6));
        assertEquals(false, warmup1.parrotTrouble(true, 7));
        assertEquals(false, warmup1.parrotTrouble(false, 6));
        assertEquals(true, warmup1.parrotTrouble(true, 21));
        assertEquals(false, warmup1.parrotTrouble(false, 21));
        assertEquals(false, warmup1.parrotTrouble(false, 20));
        assertEquals(true, warmup1.parrotTrouble(true, 23));
        assertEquals(false, warmup1.parrotTrouble(false, 23));
        assertEquals(false, warmup1.parrotTrouble(true, 20));
        assertEquals(false, warmup1.parrotTrouble(false, 12));
    }

    @Test
    public void makes10() {
        assertEquals(true, warmup1.makes10(9, 10));
        assertEquals(false, warmup1.makes10(9, 9));
        assertEquals(true, warmup1.makes10(1, 9));
        assertEquals(true, warmup1.makes10(10, 1));
        assertEquals(true, warmup1.makes10(10, 10));
        assertEquals(true, warmup1.makes10(8, 2));
        assertEquals(false, warmup1.makes10(8, 3));
        assertEquals(true, warmup1.makes10(10, 42));
        assertEquals(true, warmup1.makes10(12, -2));
    }

    @Test
    public void nearHundred() {
        assertEquals(true, warmup1.nearHundred(93));
        assertEquals(true, warmup1.nearHundred(90));
        assertEquals(false, warmup1.nearHundred(89));
        assertEquals(true, warmup1.nearHundred(110));
        assertEquals(false, warmup1.nearHundred(111));
        assertEquals(false, warmup1.nearHundred(121));
        assertEquals(false, warmup1.nearHundred(-101));
        assertEquals(false, warmup1.nearHundred(-209));
        assertEquals(true, warmup1.nearHundred(190));
        assertEquals(true, warmup1.nearHundred(209));
        assertEquals(false, warmup1.nearHundred(0));
        assertEquals(false, warmup1.nearHundred(5));
        assertEquals(false, warmup1.nearHundred(-50));
        assertEquals(true, warmup1.nearHundred(191));
        assertEquals(false, warmup1.nearHundred(189));
        assertEquals(true, warmup1.nearHundred(200));
        assertEquals(true, warmup1.nearHundred(210));
        assertEquals(false, warmup1.nearHundred(211));
        assertEquals(false, warmup1.nearHundred(290));
    }

    @Test
    public void posNeg() {
        assertEquals(true, warmup1.posNeg(1, -1, false));
        assertEquals(true, warmup1.posNeg(-1, 1, false));
        assertEquals(true, warmup1.posNeg(-4, -5, true));
        assertEquals(false, warmup1.posNeg(-4, -5, false));
        assertEquals(true, warmup1.posNeg(-4, 5, false));
        assertEquals(false, warmup1.posNeg(-4, 5, true));
        assertEquals(false, warmup1.posNeg(1, 1, false));
        assertEquals(false, warmup1.posNeg(-1, -1, false));
        assertEquals(false, warmup1.posNeg(1, -1, true));
        assertEquals(false, warmup1.posNeg(-1, 1, true));
        assertEquals(false, warmup1.posNeg(1, 1, true));
        assertEquals(true, warmup1.posNeg(-1, -1, true));
        assertEquals(true, warmup1.posNeg(5, -5, false));
        assertEquals(true, warmup1.posNeg(-6, 6, false));
        assertEquals(false, warmup1.posNeg(-5, -6, false));
        assertEquals(false, warmup1.posNeg(-2, -1, false));
        assertEquals(false, warmup1.posNeg(1, 2, false));
        assertEquals(false, warmup1.posNeg(-5, 6, true));
        assertEquals(true, warmup1.posNeg(-5, -5, true));
    }

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

    @Test
    public void backAround() {
        assertEquals("tcatt", warmup1.backAround("cat"));
        assertEquals("oHelloo", warmup1.backAround("Hello"));
        assertEquals("aaa", warmup1.backAround("a"));
        assertEquals("cabcc", warmup1.backAround("abc"));
        assertEquals("dreadd", warmup1.backAround("read"));
        assertEquals("obooo", warmup1.backAround("boo"));
    }

    @Test
    public void or35() {
        assertEquals(true, warmup1.or35(3));
        assertEquals(true, warmup1.or35(10));
        assertEquals(false, warmup1.or35(8));
        assertEquals(true, warmup1.or35(15));
        assertEquals(true, warmup1.or35(5));
        assertEquals(true, warmup1.or35(9));
        assertEquals(false, warmup1.or35(4));
        assertEquals(false, warmup1.or35(7));
        assertEquals(true, warmup1.or35(6));
        assertEquals(false, warmup1.or35(17));
        assertEquals(true, warmup1.or35(18));
        assertEquals(false, warmup1.or35(29));
        assertEquals(true, warmup1.or35(20));
        assertEquals(true, warmup1.or35(21));
        assertEquals(false, warmup1.or35(22));
        assertEquals(true, warmup1.or35(45));
        assertEquals(true, warmup1.or35(99));
        assertEquals(true, warmup1.or35(100));
        assertEquals(false, warmup1.or35(101));
        assertEquals(false, warmup1.or35(121));
        assertEquals(false, warmup1.or35(122));
        assertEquals(true, warmup1.or35(123));
    }

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

    @Test
    public void startHi() {
        assertEquals(true, warmup1.startHi("hi there"));
        assertEquals(true, warmup1.startHi("hi"));
        assertEquals(false, warmup1.startHi("hello hi"));
        assertEquals(false, warmup1.startHi("he"));
        assertEquals(false, warmup1.startHi("h"));
        assertEquals(false, warmup1.startHi(""));
        assertEquals(false, warmup1.startHi("ho hi"));
        assertEquals(true, warmup1.startHi("hi ho"));
    }

    @Test
    public void icyHot() {
        assertEquals(true, warmup1.icyHot(120, -1));
        assertEquals(true, warmup1.icyHot(-1, 120));
        assertEquals(false, warmup1.icyHot(2, 120));
        assertEquals(false, warmup1.icyHot(-1, 100));
        assertEquals(false, warmup1.icyHot(-2, -2));
        assertEquals(false, warmup1.icyHot(120, 120));
    }

    @Test
    public void in1020() {
        assertEquals(true, warmup1.in1020(12, 99));
        assertEquals(true, warmup1.in1020(21, 12));
        assertEquals(false, warmup1.in1020(8, 99));
        assertEquals(true, warmup1.in1020(99, 10));
        assertEquals(true, warmup1.in1020(20, 20));
        assertEquals(false, warmup1.in1020(21, 21));
        assertEquals(false, warmup1.in1020(9, 9));
    }

    @Test
    public void hasTeen() {
        assertEquals(true, warmup1.hasTeen(13, 20, 10));
        assertEquals(true, warmup1.hasTeen(20, 19, 10));
        assertEquals(true, warmup1.hasTeen(20, 10, 13));
        assertEquals(false, warmup1.hasTeen(1, 20, 12));
        assertEquals(true, warmup1.hasTeen(19, 20, 12));
        assertEquals(true, warmup1.hasTeen(12, 20, 19));
        assertEquals(false, warmup1.hasTeen(12, 9, 20));
        assertEquals(true, warmup1.hasTeen(12, 18, 20));
        assertEquals(true, warmup1.hasTeen(14, 2, 20));
        assertEquals(false, warmup1.hasTeen(4, 2, 20));
        assertEquals(false, warmup1.hasTeen(11, 22, 22));
    }

    @Test
    public void loneTeen() {
        assertEquals(true, warmup1.loneTeen(13, 99));
        assertEquals(true, warmup1.loneTeen(21, 19));
        assertEquals(false, warmup1.loneTeen(13, 13));
        assertEquals(true, warmup1.loneTeen(14, 20));
        assertEquals(true, warmup1.loneTeen(20, 15));
        assertEquals(false, warmup1.loneTeen(16, 17));
        assertEquals(true, warmup1.loneTeen(16, 9));
        assertEquals(false, warmup1.loneTeen(16, 18));
        assertEquals(false, warmup1.loneTeen(13, 19));
        assertEquals(true, warmup1.loneTeen(13, 20));
        assertEquals(true, warmup1.loneTeen(6, 18));
        assertEquals(true, warmup1.loneTeen(99, 13));
        assertEquals(false, warmup1.loneTeen(99, 99));
    }

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

    @Test
    public void mixStart() {
        assertEquals(true, warmup1.mixStart("mix snacks"));
        assertEquals(true, warmup1.mixStart("pix snacks"));
        assertEquals(false, warmup1.mixStart("piz snacks"));
        assertEquals(true, warmup1.mixStart("nix"));
        assertEquals(false, warmup1.mixStart("ni"));
        assertEquals(false, warmup1.mixStart("n"));
        assertEquals(false, warmup1.mixStart(""));
    }

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

    @Test
    public void in3050() {
        assertEquals(true, warmup1.in3050(30, 31));
        assertEquals(false, warmup1.in3050(30, 41));
        assertEquals(true, warmup1.in3050(40, 50));
        assertEquals(false, warmup1.in3050(40, 51));
        assertEquals(false, warmup1.in3050(39, 50));
        assertEquals(false, warmup1.in3050(50, 39));
        assertEquals(true, warmup1.in3050(40, 39));
        assertEquals(true, warmup1.in3050(49, 48));
        assertEquals(true, warmup1.in3050(50, 40));
        assertEquals(false, warmup1.in3050(50, 51));
        assertEquals(true, warmup1.in3050(35, 36));
        assertEquals(false, warmup1.in3050(35, 45));
    }

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

    @Test
    public void stringE() {
        assertEquals(true, warmup1.stringE("Hello"));
        assertEquals(true, warmup1.stringE("Heelle"));
        assertEquals(false, warmup1.stringE("Heelele"));
        assertEquals(false, warmup1.stringE("Hll"));
        assertEquals(true, warmup1.stringE("e"));
        assertEquals(false, warmup1.stringE(""));
    }

    @Test
    public void lastDigit() {
        assertEquals(true, warmup1.lastDigit(7, 17));
        assertEquals(false, warmup1.lastDigit(6, 17));
        assertEquals(true, warmup1.lastDigit(3, 113));
        assertEquals(false, warmup1.lastDigit(114, 113));
        assertEquals(true, warmup1.lastDigit(114, 4));
        assertEquals(true, warmup1.lastDigit(10, 0));
        assertEquals(false, warmup1.lastDigit(11, 0));
    }

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
