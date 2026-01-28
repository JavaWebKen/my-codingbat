import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class String3Tests {

    String3 string3 = new String3();

    @Disabled
    @Test
    public void countYZ() {
        assertEquals(2, string3.countYZ("fez day"));
        assertEquals(2, string3.countYZ("day fez"));
        assertEquals(2, string3.countYZ("day fyyyz"));
        assertEquals(1, string3.countYZ("day yak"));
        assertEquals(1, string3.countYZ("day:yak"));
        assertEquals(2, string3.countYZ("!!day--yaz!!"));
        assertEquals(0, string3.countYZ("yak zak"));
        assertEquals(2, string3.countYZ("DAY abc XYZ"));
        assertEquals(3, string3.countYZ("aaz yyz my"));
        assertEquals(2, string3.countYZ("y2bz"));
        assertEquals(0, string3.countYZ("zxyx"));
    }

    @Disabled
    @Test
    public void withoutvoid() {
        assertEquals("He there", string3.withoutString("Hello there", "llo"));
        assertEquals("Hllo thr", string3.withoutString("Hello there", "e"));
        assertEquals("Hello there", string3.withoutString("Hello there", "x"));
        assertEquals("Th a FH", string3.withoutString("This is a FISH", "IS"));
        assertEquals("TH a FH", string3.withoutString("THIS is a FISH", "is"));
        assertEquals("TH a FH", string3.withoutString("THIS is a FISH", "iS"));
        assertEquals("abab", string3.withoutString("abxxxxab", "xx"));
        assertEquals("abxab", string3.withoutString("abxxxab", "xx"));
        assertEquals("abab", string3.withoutString("abxxxab", "x"));
        assertEquals("", string3.withoutString("xxx", "x"));
        assertEquals("x", string3.withoutString("xxx", "xx"));
        assertEquals("xzz", string3.withoutString("xyzzy", "Y"));
        assertEquals("", string3.withoutString("", "x"));
        assertEquals("acac", string3.withoutString("abcabc", "b"));
        assertEquals("AAbb", string3.withoutString("AA22bb", "2"));
        assertEquals("", string3.withoutString("1111", "1"));
        assertEquals("", string3.withoutString("1111", "11"));
        assertEquals("jtx", string3.withoutString("MkjtMkx", "Mk"));
        assertEquals("Hi ", string3.withoutString("Hi HoHo", "Ho"));
    }

    @Disabled
    @Test
    public void equalIsNot() {
        assertEquals(false, string3.equalIsNot("This is not"));
        assertEquals(true, string3.equalIsNot("This is notnot"));
        assertEquals(true, string3.equalIsNot("noisxxnotyynotxisi"));
        assertEquals(false, string3.equalIsNot("noisxxnotyynotxsi"));
        assertEquals(true, string3.equalIsNot("xxxyyyzzzintint"));
        assertEquals(true, string3.equalIsNot(""));
        assertEquals(true, string3.equalIsNot("isisnotnot"));
        assertEquals(false, string3.equalIsNot("isisnotno7Not"));
        assertEquals(false, string3.equalIsNot("isnotis"));
        assertEquals(false, string3.equalIsNot("mis3notpotbotis"));
    }

    @Disabled
    @Test
    public void gHappy() {
        assertEquals(true, string3.gHappy("xxggxx"));
        assertEquals(false, string3.gHappy("xxgxx"));
        assertEquals(false, string3.gHappy("xxggyygxx"));
        assertEquals(false, string3.gHappy("g"));
        assertEquals(true, string3.gHappy("gg"));
        assertEquals(true, string3.gHappy(""));
        assertEquals(true, string3.gHappy("xxgggxyz"));
        assertEquals(false, string3.gHappy("xxgggxyg"));
        assertEquals(true, string3.gHappy("xxgggxygg"));
        assertEquals(false, string3.gHappy("mgm"));
        assertEquals(true, string3.gHappy("mggm"));
        assertEquals(true, string3.gHappy("yyygggxyy"));
    }

    @Disabled
    @Test
    public void countTriple() {
        assertEquals(1, string3.countTriple("abcXXXabc"));
        assertEquals(3, string3.countTriple("xxxabyyyycd"));
        assertEquals(0, string3.countTriple("a"));
        assertEquals(0, string3.countTriple(""));
        assertEquals(1, string3.countTriple("XXXabc"));
        assertEquals(2, string3.countTriple("XXXXabc"));
        assertEquals(3, string3.countTriple("XXXXXabc"));
        assertEquals(3, string3.countTriple("222abyyycdXXX"));
        assertEquals(4, string3.countTriple("abYYYabXXXXXab"));
        assertEquals(0, string3.countTriple("abYYXabXXYXXab"));
        assertEquals(0, string3.countTriple("abYYXabXXYXXab"));
        assertEquals(1, string3.countTriple("122abhhh2"));
    }

    @Disabled
    @Test
    public void sumDigits() {
        assertEquals(6, string3.sumDigits("aa1bc2d3"));
        assertEquals(8, string3.sumDigits("aa11b33"));
        assertEquals(0, string3.sumDigits("Chocolate"));
        assertEquals(7, string3.sumDigits("5hoco1a1e"));
        assertEquals(12, string3.sumDigits("123abc123"));
        assertEquals(0, string3.sumDigits(""));
        assertEquals(0, string3.sumDigits("Hello"));
        assertEquals(12, string3.sumDigits("X1z9b2"));
        assertEquals(14, string3.sumDigits("5432a"));
    }

    @Disabled
    @Test
    public void sameEnds() {
        assertEquals("ab", string3.sameEnds("abXYab"));
        assertEquals("x", string3.sameEnds("xx"));
        assertEquals("x", string3.sameEnds("xxx"));
        assertEquals("xx", string3.sameEnds("xxxx"));
        assertEquals("java", string3.sameEnds("javaXYZjava"));
        assertEquals("java", string3.sameEnds("javajava"));
        assertEquals("", string3.sameEnds("xavaXYZjava"));
        assertEquals("Hello!", string3.sameEnds("Hello! and Hello!"));
        assertEquals("", string3.sameEnds("x"));
        assertEquals("", string3.sameEnds(""));
        assertEquals("", string3.sameEnds("abcb"));
        assertEquals("my", string3.sameEnds("mymmy"));
    }

    @Disabled
    @Test
    public void mirrorEnds() {
        assertEquals("ab", string3.mirrorEnds("abXYZba"));
        assertEquals("a", string3.mirrorEnds("abca"));
        assertEquals("aba", string3.mirrorEnds("aba"));
        assertEquals("", string3.mirrorEnds("abab"));
        assertEquals("xxx", string3.mirrorEnds("xxx"));
        assertEquals("xxYxx", string3.mirrorEnds("xxYxx"));
        assertEquals("Hi ", string3.mirrorEnds("Hi and iH"));
        assertEquals("x", string3.mirrorEnds("x"));
        assertEquals("", string3.mirrorEnds(""));
        assertEquals("123", string3.mirrorEnds("123and then 321"));
        assertEquals("ba", string3.mirrorEnds("band andab"));
    }

    @Disabled
    @Test
    public void maxBlock() {
        assertEquals(2, string3.maxBlock("hoopla"));
        assertEquals(3, string3.maxBlock("abbCCCddBBBxx"));
        assertEquals(0, string3.maxBlock(""));
        assertEquals(1, string3.maxBlock("xyz"));
        assertEquals(2, string3.maxBlock("xxyz"));
        assertEquals(2, string3.maxBlock("xyzz"));
        assertEquals(3, string3.maxBlock("abbbcbbbxbbbx"));
        assertEquals(3, string3.maxBlock("XXBBBbbxx"));
        assertEquals(4, string3.maxBlock("XXBBBBbbxx"));
        assertEquals(4, string3.maxBlock("XXBBBbbxxXXXX"));
        assertEquals(4, string3.maxBlock("XX2222BBBbbXX2222"));
    }

    @Disabled
    @Test
    public void sumNumbers() {
        assertEquals(123, string3.sumNumbers("abc123xyz"));
        assertEquals(44, string3.sumNumbers("aa11b33"));
        assertEquals(18, string3.sumNumbers("7 11"));
        assertEquals(0, string3.sumNumbers("Chocolate"));
        assertEquals(7, string3.sumNumbers("5hoco1a1e"));
        assertEquals(7, string3.sumNumbers("5$$1;;1!!"));
        assertEquals(1245, string3.sumNumbers("a1234bb11"));
        assertEquals(0, string3.sumNumbers(""));
        assertEquals(25, string3.sumNumbers("a22bbb3"));
    }

    @Disabled
    @Test
    public void notReplace() {
        assertEquals("is not test", string3.notReplace("is test"));
        assertEquals("is not-is not", string3.notReplace("is-is"));
        assertEquals("This is not right", string3.notReplace("This is right"));
        assertEquals("This is not isabell", string3.notReplace("This is isabell"));
        assertEquals("", string3.notReplace(""));
        assertEquals("is not", string3.notReplace("is"));
        assertEquals("isis", string3.notReplace("isis"));
        assertEquals("Dis is not bliss is not", string3.notReplace("Dis is bliss is"));
        assertEquals("is not his", string3.notReplace("is his"));
        assertEquals("xis yis", string3.notReplace("xis yis"));
        assertEquals("AAAis is not", string3.notReplace("AAAis is"));
    }

}