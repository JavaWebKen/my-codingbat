
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class String1Tests {

    String1 string1 = new String1();

    @Disabled
    @Test
    public void helloName() {
        assertEquals("Hello Bob!", string1.helloName("Bob"));
        assertEquals("Hello Alice!", string1.helloName("Alice"));
        assertEquals("Hello X!", string1.helloName("X"));
        assertEquals("Hello Dolly!", string1.helloName("Dolly"));
        assertEquals("Hello Alpha!", string1.helloName("Alpha"));
        assertEquals("Hello Omega!", string1.helloName("Omega"));
        assertEquals("Hello Goodbye!", string1.helloName("Goodbye"));
        assertEquals("Hello ho ho ho!", string1.helloName("ho ho ho"));
        assertEquals("Hello xyz!!", string1.helloName("xyz!"));
        assertEquals("Hello Hello!", string1.helloName("Hello"));
    }

    @Disabled
    @Test
    public void makeAbba() {
        assertEquals("HiByeByeHi", string1.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", string1.makeAbba("Yo", "Alice"));
        assertEquals("WhatUpUpWhat", string1.makeAbba("What", "Up"));
        assertEquals("aaabbbbbbaaa", string1.makeAbba("aaa", "bbb"));
        assertEquals("xyyx", string1.makeAbba("x", "y"));
        assertEquals("xx", string1.makeAbba("x", ""));
        assertEquals("yy", string1.makeAbba("", "y"));
        assertEquals("BoYaYaBo", string1.makeAbba("Bo", "Ya"));
        assertEquals("YaYaYaYa", string1.makeAbba("Ya", "Ya"));
    }

    @Disabled
    @Test
    public void makeTags() {
        assertEquals("&lt;i&gt;Yay&lt;/i&gt;", string1.makeTags("i", "Yay"));
        assertEquals("&lt;i&gt;Hello&lt;/i&gt;", string1.makeTags("i", "Hello"));
        assertEquals("&lt;cite&gt;Yay&lt;/cite&gt;", string1.makeTags("cite", "Yay"));
        assertEquals("&lt;address&gt;here&lt;/address&gt;", string1.makeTags("address", "here"));
        assertEquals("&lt;body&gt;Heart&lt;/body&gt;", string1.makeTags("body", "Heart"));
        assertEquals("&lt;i&gt;i&lt;/i&gt;", string1.makeTags("i", "i"));
        assertEquals("&lt;i&gt;&lt;/i&gt;", string1.makeTags("i", ""));
    }

    @Disabled
    @Test
    public void makeOutWord() {
        assertEquals("&lt;&lt;Yay&gt;&gt;", string1.makeOutWord("&lt;&lt;&gt;&gt;", "Yay"));
        assertEquals("&lt;&lt;WooHoo&gt;&gt;", string1.makeOutWord("&lt;&lt;&gt;&gt;", "WooHoo"));
        assertEquals("[[word]]", string1.makeOutWord("new int[] {new int[] {}}", "word"));
        assertEquals("HHHellooo", string1.makeOutWord("HHoo", "Hello"));
        assertEquals("abYAYyz", string1.makeOutWord("abyz", "YAY"));
    }

    @Disabled
    @Test
    public void extraEnd() {
        assertEquals("lololo", string1.extraEnd("Hello"));
        assertEquals("ababab", string1.extraEnd("ab"));
        assertEquals("HiHiHi", string1.extraEnd("Hi"));
        assertEquals("dydydy", string1.extraEnd("Candy"));
        assertEquals("dedede", string1.extraEnd("Code"));
    }

    @Disabled
    @Test
    public void firstTwo() {
        assertEquals("He", string1.firstTwo("Hello"));
        assertEquals("ab", string1.firstTwo("abcdefg"));
        assertEquals("ab", string1.firstTwo("ab"));
        assertEquals("a", string1.firstTwo("a"));
        assertEquals("", string1.firstTwo(""));
        assertEquals("Ki", string1.firstTwo("Kitten"));
        assertEquals("hi", string1.firstTwo("hi"));
        assertEquals("hi", string1.firstTwo("hiya"));
    }

    @Disabled
    @Test
    public void firstHalf() {
        assertEquals("Woo", string1.firstHalf("WooHoo"));
        assertEquals("Hello", string1.firstHalf("HelloThere"));
        assertEquals("abc", string1.firstHalf("abcdef"));
        assertEquals("a", string1.firstHalf("ab"));
        assertEquals("", string1.firstHalf(""));
        assertEquals("01234", string1.firstHalf("0123456789"));
        assertEquals("kit", string1.firstHalf("kitten"));
    }

    @Disabled
    @Test
    public void withoutEnd() {
        assertEquals("ell", string1.withoutEnd("Hello"));
        assertEquals("av", string1.withoutEnd("java"));
        assertEquals("odin", string1.withoutEnd("coding"));
        assertEquals("od", string1.withoutEnd("code"));
        assertEquals("", string1.withoutEnd("ab"));
        assertEquals("hocolate", string1.withoutEnd("Chocolate!"));
        assertEquals("itte", string1.withoutEnd("kitten"));
        assertEquals("ooho", string1.withoutEnd("woohoo"));
    }

    @Disabled
    @Test
    public void combovoid() {
        assertEquals("hiHellohi", string1.comboString("Hello", "hi"));
        assertEquals("hiHellohi", string1.comboString("hi", "Hello"));
        assertEquals("baaab", string1.comboString("aaa", "b"));
        assertEquals("baaab", string1.comboString("b", "aaa"));
        assertEquals("aaa", string1.comboString("aaa", ""));
        assertEquals("bb", string1.comboString("", "bb"));
        assertEquals("aaa1234aaa", string1.comboString("aaa", "1234"));
        assertEquals("bbaaabb", string1.comboString("aaa", "bb"));
        assertEquals("abba", string1.comboString("a", "bb"));
        assertEquals("abba", string1.comboString("bb", "a"));
        assertEquals("abxyzab", string1.comboString("xyz", "ab"));
    }

    @Disabled
    @Test
    public void nonStart() {
        assertEquals("ellohere", string1.nonStart("Hello", "There"));
        assertEquals("avaode", string1.nonStart("java", "code"));
        assertEquals("hotlava", string1.nonStart("shotl", "java"));
        assertEquals("by", string1.nonStart("ab", "xy"));
        assertEquals("b", string1.nonStart("ab", "x"));
        assertEquals("c", string1.nonStart("x", "ac"));
        assertEquals("", string1.nonStart("a", "x"));
        assertEquals("itat", string1.nonStart("kit", "kat"));
        assertEquals("artart", string1.nonStart("mart", "dart"));
    }

    @Disabled
    @Test
    public void left2() {
        assertEquals("lloHe", string1.left2("Hello"));
        assertEquals("vaja", string1.left2("java"));
        assertEquals("Hi", string1.left2("Hi"));
        assertEquals("deco", string1.left2("code"));
        assertEquals("tca", string1.left2("cat"));
        assertEquals("34512", string1.left2("12345"));
        assertEquals("ocolateCh", string1.left2("Chocolate"));
        assertEquals("icksbr", string1.left2("bricks"));
    }

    @Disabled
    @Test
    public void right2() {
        assertEquals("loHel", string1.right2("Hello"));
        assertEquals("vaja", string1.right2("java"));
        assertEquals("Hi", string1.right2("Hi"));
        assertEquals("deco", string1.right2("code"));
        assertEquals("atc", string1.right2("cat"));
        assertEquals("45123", string1.right2("12345"));
    }

    @Disabled
    @Test
    public void theEnd() {
        assertEquals("H", string1.theEnd("Hello", true));
        assertEquals("o", string1.theEnd("Hello", false));
        assertEquals("o", string1.theEnd("oh", true));
        assertEquals("h", string1.theEnd("oh", false));
        assertEquals("x", string1.theEnd("x", true));
        assertEquals("x", string1.theEnd("x", false));
        assertEquals("j", string1.theEnd("java", true));
        assertEquals("e", string1.theEnd("chocolate", false));
        assertEquals("1", string1.theEnd("1234", true));
        assertEquals("e", string1.theEnd("code", false));
    }

    @Disabled
    @Test
    public void withouEnd2() {
        assertEquals("ell", string1.withouEnd2("Hello"));
        assertEquals("b", string1.withouEnd2("abc"));
        assertEquals("", string1.withouEnd2("ab"));
        assertEquals("", string1.withouEnd2("a"));
        assertEquals("", string1.withouEnd2(""));
        assertEquals("old", string1.withouEnd2("coldy"));
        assertEquals("ava cod", string1.withouEnd2("java code"));
    }

    @Disabled
    @Test
    public void middleTwo() {
        assertEquals("ri", string1.middleTwo("string"));
        assertEquals("od", string1.middleTwo("code"));
        assertEquals("ct", string1.middleTwo("Practice"));
        assertEquals("ab", string1.middleTwo("ab"));
        assertEquals("45", string1.middleTwo("0123456789"));
    }

    @Disabled
    @Test
    public void endsLy() {
        assertEquals(true, string1.endsLy("oddly"));
        assertEquals(false, string1.endsLy("y"));
        assertEquals(false, string1.endsLy("oddy"));
        assertEquals(false, string1.endsLy("oddl"));
        assertEquals(false, string1.endsLy("olydd"));
        assertEquals(true, string1.endsLy("ly"));
        assertEquals(false, string1.endsLy(""));
        assertEquals(false, string1.endsLy("falsey"));
        assertEquals(true, string1.endsLy("evenly"));
    }

    @Disabled
    @Test
    public void nTwice() {
        assertEquals("Helo", string1.nTwice("Hello", 2));
        assertEquals("Choate", string1.nTwice("Chocolate", 3));
        assertEquals("Ce", string1.nTwice("Chocolate", 1));
        assertEquals("", string1.nTwice("Chocolate", 0));
        assertEquals("Hellello", string1.nTwice("Hello", 4));
        assertEquals("CodeCode", string1.nTwice("Code", 4));
        assertEquals("Code", string1.nTwice("Code", 2));
    }

    @Disabled
    @Test
    public void twoChar() {
        assertEquals("ja", string1.twoChar("java", 0));
        assertEquals("va", string1.twoChar("java", 2));
        assertEquals("ja", string1.twoChar("java", 3));
        assertEquals("ja", string1.twoChar("java", 4));
        assertEquals("ja", string1.twoChar("java", -1));
        assertEquals("He", string1.twoChar("Hello", 0));
        assertEquals("el", string1.twoChar("Hello", 1));
        assertEquals("He", string1.twoChar("Hello", 99));
        assertEquals("lo", string1.twoChar("Hello", 3));
        assertEquals("He", string1.twoChar("Hello", 4));
        assertEquals("He", string1.twoChar("Hello", 5));
        assertEquals("He", string1.twoChar("Hello", -7));
        assertEquals("He", string1.twoChar("Hello", 6));
        assertEquals("He", string1.twoChar("Hello", -1));
        assertEquals("ya", string1.twoChar("yay", 0));
    }

    @Disabled
    @Test
    public void middleThree() {
        assertEquals("and", string1.middleThree("Candy"));
        assertEquals("and", string1.middleThree("and"));
        assertEquals("lvi", string1.middleThree("solving"));
        assertEquals("yet", string1.middleThree("Hi yet Hi"));
        assertEquals("yet", string1.middleThree("java yet java"));
        assertEquals("col", string1.middleThree("Chocolate"));
        assertEquals("xyz", string1.middleThree("XabcxyzabcX"));
    }

    @Disabled
    @Test
    public void hasBad() {
        assertEquals(true, string1.hasBad("badxx"));
        assertEquals(true, string1.hasBad("xbadxx"));
        assertEquals(false, string1.hasBad("xxbadxx"));
        assertEquals(false, string1.hasBad("code"));
        assertEquals(true, string1.hasBad("bad"));
        assertEquals(false, string1.hasBad("ba"));
        assertEquals(false, string1.hasBad("xba"));
        assertEquals(true, string1.hasBad("xbad"));
        assertEquals(false, string1.hasBad(""));
        assertEquals(true, string1.hasBad("badyy"));
    }

    @Disabled
    @Test
    public void atFirst() {
        assertEquals("he", string1.atFirst("hello"));
        assertEquals("hi", string1.atFirst("hi"));
        assertEquals("h@", string1.atFirst("h"));
        assertEquals("@@", string1.atFirst(""));
        assertEquals("ki", string1.atFirst("kitten"));
        assertEquals("ja", string1.atFirst("java"));
        assertEquals("j@", string1.atFirst("j"));
    }

    @Disabled
    @Test
    public void lastChars() {
        assertEquals("ls", string1.lastChars("last", "chars"));
        assertEquals("ya", string1.lastChars("yo", "java"));
        assertEquals("h@", string1.lastChars("hi", ""));
        assertEquals("@o", string1.lastChars("", "hello"));
        assertEquals("@@", string1.lastChars("", ""));
        assertEquals("ki", string1.lastChars("kitten", "hi"));
        assertEquals("kp", string1.lastChars("k", "zip"));
        assertEquals("k@", string1.lastChars("kitten", ""));
        assertEquals("kp", string1.lastChars("kitten", "zip"));
    }

    @Disabled
    @Test
    public void conCat() {
        assertEquals("abcat", string1.conCat("abc", "cat"));
        assertEquals("dogcat", string1.conCat("dog", "cat"));
        assertEquals("abc", string1.conCat("abc", ""));
        assertEquals("cat", string1.conCat("", "cat"));
        assertEquals("pig", string1.conCat("pig", "g"));
        assertEquals("pigdoggy", string1.conCat("pig", "doggy"));
    }

    @Disabled
    @Test
    public void lastTwo() {
        assertEquals("codign", string1.lastTwo("coding"));
        assertEquals("cta", string1.lastTwo("cat"));
        assertEquals("ba", string1.lastTwo("ab"));
        assertEquals("a", string1.lastTwo("a"));
        assertEquals("", string1.lastTwo(""));
    }

    @Disabled
    @Test
    public void seeColor() {
        assertEquals("red", string1.seeColor("redxx"));
        assertEquals("", string1.seeColor("xxred"));
        assertEquals("blue", string1.seeColor("blueTimes"));
        assertEquals("", string1.seeColor("NoColor"));
        assertEquals("red", string1.seeColor("red"));
        assertEquals("", string1.seeColor("re"));
        assertEquals("", string1.seeColor("blu"));
        assertEquals("blue", string1.seeColor("blue"));
        assertEquals("", string1.seeColor("a"));
        assertEquals("", string1.seeColor(""));
        assertEquals("", string1.seeColor("xyzred"));
    }

    @Disabled
    @Test
    public void frontAgain() {
        assertEquals(true, string1.frontAgain("edited"));
        assertEquals(false, string1.frontAgain("edit"));
        assertEquals(true, string1.frontAgain("ed"));
        assertEquals(true, string1.frontAgain("jj"));
        assertEquals(true, string1.frontAgain("jjj"));
        assertEquals(true, string1.frontAgain("jjjj"));
        assertEquals(false, string1.frontAgain("jjjk"));
        assertEquals(false, string1.frontAgain("x"));
        assertEquals(false, string1.frontAgain(""));
        assertEquals(false, string1.frontAgain("java"));
        assertEquals(true, string1.frontAgain("javaja"));
    }

    @Disabled
    @Test
    public void minCat() {
        assertEquals("loHi", string1.minCat("Hello", "Hi"));
        assertEquals("ellojava", string1.minCat("Hello", "java"));
        assertEquals("javaello", string1.minCat("java", "Hello"));
        assertEquals("cx", string1.minCat("abc", "x"));
        assertEquals("xc", string1.minCat("x", "abc"));
        assertEquals("", string1.minCat("abc", ""));
    }

    @Disabled
    @Test
    public void extraFront() {
        assertEquals("HeHeHe", string1.extraFront("Hello"));
        assertEquals("ababab", string1.extraFront("ab"));
        assertEquals("HHH", string1.extraFront("H"));
        assertEquals("", string1.extraFront(""));
        assertEquals("CaCaCa", string1.extraFront("Candy"));
        assertEquals("CoCoCo", string1.extraFront("Code"));
    }

    @Disabled
    @Test
    public void without2() {
        assertEquals("lloHe", string1.without2("HelloHe"));
        assertEquals("HelloHi", string1.without2("HelloHi"));
        assertEquals("", string1.without2("Hi"));
        assertEquals("Chocolate", string1.without2("Chocolate"));
        assertEquals("x", string1.without2("xxx"));
        assertEquals("", string1.without2("xx"));
        assertEquals("x", string1.without2("x"));
        assertEquals("", string1.without2(""));
        assertEquals("Fruits", string1.without2("Fruits"));
    }

    @Disabled
    @Test
    public void deFront() {
        assertEquals("llo", string1.deFront("Hello"));
        assertEquals("va", string1.deFront("java"));
        assertEquals("aay", string1.deFront("away"));
        assertEquals("ay", string1.deFront("axy"));
        assertEquals("abc", string1.deFront("abc"));
        assertEquals("by", string1.deFront("xby"));
        assertEquals("ab", string1.deFront("ab"));
        assertEquals("a", string1.deFront("ax"));
        assertEquals("ab", string1.deFront("axb"));
        assertEquals("aa", string1.deFront("aaa"));
        assertEquals("bc", string1.deFront("xbc"));
        assertEquals("bb", string1.deFront("bbb"));
        assertEquals("zz", string1.deFront("bazz"));
        assertEquals("", string1.deFront("ba"));
        assertEquals("abxyz", string1.deFront("abxyz"));
        assertEquals("", string1.deFront("hi"));
        assertEquals("s", string1.deFront("his"));
        assertEquals("", string1.deFront("xz"));
        assertEquals("z", string1.deFront("zzz"));
    }

    @Disabled
    @Test
    public void startWord() {
        assertEquals("hi", string1.startWord("hippo", "hi"));
        assertEquals("hip", string1.startWord("hippo", "xip"));
        assertEquals("h", string1.startWord("hippo", "i"));
        assertEquals("", string1.startWord("hippo", "ix"));
        assertEquals("", string1.startWord("h", "ix"));
        assertEquals("", string1.startWord("", "i"));
        assertEquals("hi", string1.startWord("hip", "zi"));
        assertEquals("hip", string1.startWord("hip", "zip"));
        assertEquals("", string1.startWord("hip", "zig"));
        assertEquals("h", string1.startWord("h", "z"));
        assertEquals("hippo", string1.startWord("hippo", "xippo"));
        assertEquals("", string1.startWord("hippo", "xyz"));
        assertEquals("hip", string1.startWord("hippo", "hip"));
        assertEquals("kit", string1.startWord("kitten", "cit"));
        assertEquals("kit", string1.startWord("kit", "cit"));
    }

    @Disabled
    @Test
    public void withoutX() {
        assertEquals("Hi", string1.withoutX("xHix"));
        assertEquals("Hi", string1.withoutX("xHi"));
        assertEquals("Hxi", string1.withoutX("Hxix"));
        assertEquals("Hi", string1.withoutX("Hi"));
        assertEquals("xHi", string1.withoutX("xxHi"));
        assertEquals("Hi", string1.withoutX("Hix"));
        assertEquals("axb", string1.withoutX("xaxbx"));
        assertEquals("", string1.withoutX("xx"));
        assertEquals("", string1.withoutX("x"));
        assertEquals("", string1.withoutX(""));
        assertEquals("Hello", string1.withoutX("Hello"));
        assertEquals("Hexllo", string1.withoutX("Hexllo"));
    }

    @Disabled
    @Test
    public void withoutX2() {
        assertEquals("Hi", string1.withoutX2("xHi"));
        assertEquals("Hi", string1.withoutX2("Hxi"));
        assertEquals("Hi", string1.withoutX2("Hi"));
        assertEquals("Hi", string1.withoutX2("xxHi"));
        assertEquals("Hix", string1.withoutX2("Hix"));
        assertEquals("axb", string1.withoutX2("xaxb"));
        assertEquals("", string1.withoutX2("xx"));
        assertEquals("", string1.withoutX2("x"));
        assertEquals("", string1.withoutX2(""));
        assertEquals("Hello", string1.withoutX2("Hello"));
        assertEquals("Hexllo", string1.withoutX2("Hexllo"));
        assertEquals("Hxllo", string1.withoutX2("xHxllo"));
    }

}