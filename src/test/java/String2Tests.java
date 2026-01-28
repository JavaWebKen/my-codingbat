import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class String2Tests {

    String2 string2 = new String2();

    @Disabled
    @Test
    public void doubleChar() {
        assertEquals("TThhee", string2.doubleChar("The"));
        assertEquals("AAAAbbbb", string2.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", string2.doubleChar("Hi-There"));
        assertEquals("WWoorrdd!!", string2.doubleChar("Word!"));
        assertEquals("!!!!", string2.doubleChar("!!"));
        assertEquals("", string2.doubleChar(""));
        assertEquals("aa", string2.doubleChar("a"));
        assertEquals("..", string2.doubleChar("."));
        assertEquals("aaaa", string2.doubleChar("aa"));
    }

    @Disabled
    @Test
    public void countHi() {
        assertEquals(1, string2.countHi("abc hi ho"));
        assertEquals(2, string2.countHi("ABChi hi"));
        assertEquals(2, string2.countHi("hihi"));
        assertEquals(2, string2.countHi("hiHIhi"));
        assertEquals(0, string2.countHi(""));
        assertEquals(0, string2.countHi("h"));
        assertEquals(1, string2.countHi("hi"));
        assertEquals(0, string2.countHi("Hi is no HI on ahI"));
        assertEquals(2, string2.countHi("hiho not HOHIhi"));
    }

    @Disabled
    @Test
    public void catDog() {
        assertEquals(true, string2.catDog("catdog"));
        assertEquals(false, string2.catDog("catcat"));
        assertEquals(true, string2.catDog("1cat1cadodog"));
        assertEquals(false, string2.catDog("catxxdogxxxdog"));
        assertEquals(true, string2.catDog("catxdogxdogxcat"));
        assertEquals(false, string2.catDog("catxdogxdogxca"));
        assertEquals(false, string2.catDog("dogdogcat"));
        assertEquals(true, string2.catDog("dogogcat"));
        assertEquals(false, string2.catDog("dog"));
        assertEquals(false, string2.catDog("cat"));
        assertEquals(true, string2.catDog("ca"));
        assertEquals(true, string2.catDog("c"));
        assertEquals(true, string2.catDog(""));
    }

    @Disabled
    @Test
    public void countCode() {
        assertEquals(1, string2.countCode("aaacodebbb"));
        assertEquals(2, string2.countCode("codexxcode"));
        assertEquals(2, string2.countCode("cozexxcope"));
        assertEquals(1, string2.countCode("cozfxxcope"));
        assertEquals(1, string2.countCode("xxcozeyycop"));
        assertEquals(0, string2.countCode("cozcop"));
        assertEquals(0, string2.countCode("abcxyz"));
        assertEquals(1, string2.countCode("code"));
        assertEquals(0, string2.countCode("ode"));
        assertEquals(0, string2.countCode("c"));
        assertEquals(0, string2.countCode(""));
        assertEquals(3, string2.countCode("AAcodeBBcoleCCccoreDD"));
        assertEquals(2, string2.countCode("AAcodeBBcoleCCccorfDD"));
        assertEquals(3, string2.countCode("coAcodeBcoleccoreDD"));
    }

    @Disabled
    @Test
    public void endOther() {
        assertEquals(true, string2.endOther("Hiabc", "abc"));
        assertEquals(true, string2.endOther("AbC", "HiaBc"));
        assertEquals(true, string2.endOther("abc", "abXabc"));
        assertEquals(false, string2.endOther("Hiabc", "abcd"));
        assertEquals(true, string2.endOther("Hiabc", "bc"));
        assertEquals(false, string2.endOther("Hiabcx", "bc"));
        assertEquals(true, string2.endOther("abc", "abc"));
        assertEquals(true, string2.endOther("xyz", "12xyz"));
        assertEquals(false, string2.endOther("yz", "12xz"));
        assertEquals(true, string2.endOther("Z", "12xz"));
        assertEquals(true, string2.endOther("12", "12"));
        assertEquals(false, string2.endOther("abcXYZ", "abcDEF"));
        assertEquals(false, string2.endOther("ab", "ab12"));
        assertEquals(true, string2.endOther("ab", "12ab"));
    }

    @Disabled
    @Test
    public void xyzThere() {
        assertEquals(true, string2.xyzThere("abcxyz"));
        assertEquals(false, string2.xyzThere("abc.xyz"));
        assertEquals(true, string2.xyzThere("xyz.abc"));
        assertEquals(false, string2.xyzThere("abcxy"));
        assertEquals(true, string2.xyzThere("xyz"));
        assertEquals(false, string2.xyzThere("xy"));
        assertEquals(false, string2.xyzThere("x"));
        assertEquals(false, string2.xyzThere(""));
        assertEquals(true, string2.xyzThere("abc.xyzxyz"));
        assertEquals(true, string2.xyzThere("abc.xxyz"));
        assertEquals(false, string2.xyzThere(".xyz"));
        assertEquals(false, string2.xyzThere("12.xyz"));
        assertEquals(true, string2.xyzThere("12xyz"));
        assertEquals(false, string2.xyzThere("1.xyz.xyz2.xyz"));
    }

    @Disabled
    @Test
    public void bobThere() {
        assertEquals(true, string2.bobThere("abcbob"));
        assertEquals(true, string2.bobThere("b9b"));
        assertEquals(false, string2.bobThere("bac"));
        assertEquals(true, string2.bobThere("bbb"));
        assertEquals(false, string2.bobThere("abcdefb"));
        assertEquals(true, string2.bobThere("123abcbcdbabxyz"));
        assertEquals(false, string2.bobThere("b12"));
        assertEquals(true, string2.bobThere("b1b"));
        assertEquals(true, string2.bobThere("b12b1b"));
        assertEquals(false, string2.bobThere("bbc"));
        assertEquals(true, string2.bobThere("bbb"));
        assertEquals(false, string2.bobThere("bb"));
        assertEquals(false, string2.bobThere("b"));
    }

    @Disabled
    @Test
    public void xyBalance() {
        assertEquals(true, string2.xyBalance("aaxbby"));
        assertEquals(false, string2.xyBalance("aaxbb"));
        assertEquals(false, string2.xyBalance("yaaxbb"));
        assertEquals(true, string2.xyBalance("yaaxbby"));
        assertEquals(true, string2.xyBalance("xaxxbby"));
        assertEquals(false, string2.xyBalance("xaxxbbyx"));
        assertEquals(true, string2.xyBalance("xxbxy"));
        assertEquals(false, string2.xyBalance("xxbx"));
        assertEquals(true, string2.xyBalance("bbb"));
        assertEquals(false, string2.xyBalance("bxbb"));
        assertEquals(true, string2.xyBalance("bxyb"));
        assertEquals(true, string2.xyBalance("xy"));
        assertEquals(true, string2.xyBalance("y"));
        assertEquals(false, string2.xyBalance("x"));
        assertEquals(true, string2.xyBalance(""));
        assertEquals(false, string2.xyBalance("yxyxyxyx"));
        assertEquals(true, string2.xyBalance("yxyxyxyxy"));
        assertEquals(true, string2.xyBalance("12xabxxydxyxyzz"));
    }

    @Disabled
    @Test
    public void mixvoid() {
        assertEquals("axbycz", string2.mixString("abc", "xyz"));
        assertEquals("HTihere", string2.mixString("Hi", "There"));
        assertEquals("xTxhxexre", string2.mixString("xxxx", "There"));
        assertEquals("xXxx", string2.mixString("xxx", "X"));
        assertEquals("22/7 around", string2.mixString("2/", "27 around"));
        assertEquals("Hello", string2.mixString("", "Hello"));
        assertEquals("Abc", string2.mixString("Abc", ""));
        assertEquals("", string2.mixString("", ""));
        assertEquals("ab", string2.mixString("a", "b"));
        assertEquals("abx", string2.mixString("ax", "b"));
        assertEquals("abx", string2.mixString("a", "bx"));
        assertEquals("SLoong", string2.mixString("So", "Long"));
        assertEquals("LSoong", string2.mixString("Long", "So"));
    }

    @Disabled
    @Test
    public void repeatEnd() {
        assertEquals("llollollo", string2.repeatEnd("Hello", 3));
        assertEquals("lolo", string2.repeatEnd("Hello", 2));
        assertEquals("o", string2.repeatEnd("Hello", 1));
        assertEquals("", string2.repeatEnd("Hello", 0));
        assertEquals("abcabcabc", string2.repeatEnd("abc", 3));
        assertEquals("3434", string2.repeatEnd("1234", 2));
        assertEquals("234234234", string2.repeatEnd("1234", 3));
        assertEquals("", string2.repeatEnd("", 0));
    }

    @Disabled
    @Test
    public void repeatFront() {
        assertEquals("ChocChoChC", string2.repeatFront("Chocolate", 4));
        assertEquals("ChoChC", string2.repeatFront("Chocolate", 3));
        assertEquals("IcI", string2.repeatFront("Ice Cream", 2));
        assertEquals("I", string2.repeatFront("Ice Cream", 1));
        assertEquals("", string2.repeatFront("Ice Cream", 0));
        assertEquals("xyzxyx", string2.repeatFront("xyz", 3));
        assertEquals("", string2.repeatFront("", 0));
        assertEquals("JavaJavJaJ", string2.repeatFront("Java", 4));
        assertEquals("J", string2.repeatFront("Java", 1));
    }

    @Disabled
    @Test
    public void repeatSeparator() {
        assertEquals("WordXWordXWord", string2.repeatSeparator("Word", "X", 3));
        assertEquals("ThisAndThis", string2.repeatSeparator("This", "And", 2));
        assertEquals("This", string2.repeatSeparator("This", "And", 1));
        assertEquals("Hi-n-Hi", string2.repeatSeparator("Hi", "-n-", 2));
        assertEquals("AAA", string2.repeatSeparator("AAA", "", 1));
        assertEquals("", string2.repeatSeparator("AAA", "", 0));
        assertEquals("ABABABABA", string2.repeatSeparator("A", "B", 5));
        assertEquals("abcXXabcXXabc", string2.repeatSeparator("abc", "XX", 3));
        assertEquals("abcXXabc", string2.repeatSeparator("abc", "XX", 2));
        assertEquals("abc", string2.repeatSeparator("abc", "XX", 1));
        assertEquals("XYZaXYZ", string2.repeatSeparator("XYZ", "a", 2));
    }

    @Disabled
    @Test
    public void prefixAgain() {
        assertEquals(true, string2.prefixAgain("abXYabc", 1));
        assertEquals(true, string2.prefixAgain("abXYabc", 2));
        assertEquals(false, string2.prefixAgain("abXYabc", 3));
        assertEquals(true, string2.prefixAgain("xyzxyxyxy", 2));
        assertEquals(false, string2.prefixAgain("xyzxyxyxy", 3));
        assertEquals(true, string2.prefixAgain("Hi12345Hi6789Hi10", 1));
        assertEquals(true, string2.prefixAgain("Hi12345Hi6789Hi10", 2));
        assertEquals(true, string2.prefixAgain("Hi12345Hi6789Hi10", 3));
        assertEquals(false, string2.prefixAgain("Hi12345Hi6789Hi10", 4));
        assertEquals(false, string2.prefixAgain("a", 1));
        assertEquals(true, string2.prefixAgain("aa", 1));
        assertEquals(false, string2.prefixAgain("ab", 1));
    }

    @Disabled
    @Test
    public void xyzMiddle() {
        assertEquals(true, string2.xyzMiddle("AAxyzBB"));
        assertEquals(true, string2.xyzMiddle("AxyzBB"));
        assertEquals(false, string2.xyzMiddle("AxyzBBB"));
        assertEquals(false, string2.xyzMiddle("AxyzBBBB"));
        assertEquals(false, string2.xyzMiddle("AAAxyzB"));
        assertEquals(true, string2.xyzMiddle("AAAxyzBB"));
        assertEquals(false, string2.xyzMiddle("AAAAxyzBB"));
        assertEquals(false, string2.xyzMiddle("AAAAAxyzBBB"));
        assertEquals(true, string2.xyzMiddle("1x345xyz12x4"));
        assertEquals(true, string2.xyzMiddle("xyzAxyzBBB"));
        assertEquals(true, string2.xyzMiddle("xyzAxyzBxyz"));
        assertEquals(true, string2.xyzMiddle("xyzxyzAxyzBxyzxyz"));
        assertEquals(true, string2.xyzMiddle("xyzxyzxyzBxyzxyz"));
        assertEquals(true, string2.xyzMiddle("xyzxyzAxyzxyzxyz"));
        assertEquals(false, string2.xyzMiddle("xyzxyzAxyzxyzxy"));
        assertEquals(false, string2.xyzMiddle("AxyzxyzBB"));
        assertEquals(false, string2.xyzMiddle(""));
        assertEquals(false, string2.xyzMiddle("x"));
        assertEquals(false, string2.xyzMiddle("xy"));
        assertEquals(true, string2.xyzMiddle("xyz"));
        assertEquals(true, string2.xyzMiddle("xyzz"));
    }

    @Disabled
    @Test
    public void getSandwich() {
        assertEquals("jam", string2.getSandwich("breadjambread"));
        assertEquals("jam", string2.getSandwich("xxbreadjambreadyy"));
        assertEquals("", string2.getSandwich("xxbreadyy"));
        assertEquals("breadjam", string2.getSandwich("xxbreadbreadjambreadyy"));
        assertEquals("A", string2.getSandwich("breadAbread"));
        assertEquals("", string2.getSandwich("breadbread"));
        assertEquals("", string2.getSandwich("abcbreaz"));
        assertEquals("", string2.getSandwich("xyz"));
        assertEquals("", string2.getSandwich(""));
        assertEquals("breax", string2.getSandwich("breadbreaxbread"));
        assertEquals("y", string2.getSandwich("breaxbreadybread"));
        assertEquals("breadbread", string2.getSandwich("breadbreadbreadbread"));
    }

    @Disabled
    @Test
    public void sameStarChar() {
        assertEquals(true, string2.sameStarChar("xy*yzz"));
        assertEquals(false, string2.sameStarChar("xy*zzz"));
        assertEquals(true, string2.sameStarChar("*xa*az"));
        assertEquals(false, string2.sameStarChar("*xa*bz"));
        assertEquals(true, string2.sameStarChar("*xa*a*"));
        assertEquals(true, string2.sameStarChar(""));
        assertEquals(true, string2.sameStarChar("*xa*a*a"));
        assertEquals(false, string2.sameStarChar("*xa*a*b"));
        assertEquals(true, string2.sameStarChar("*12*2*2"));
        assertEquals(false, string2.sameStarChar("12*2*3*"));
        assertEquals(true, string2.sameStarChar("abcDEF"));
        assertEquals(false, string2.sameStarChar("XY*YYYY*Z*"));
        assertEquals(true, string2.sameStarChar("XY*YYYY*Y*"));
        assertEquals(false, string2.sameStarChar("12*2*3*"));
        assertEquals(true, string2.sameStarChar("*"));
        assertEquals(true, string2.sameStarChar("**"));
    }

    @Disabled
    @Test
    public void oneTwo() {
        assertEquals("bca", string2.oneTwo("abc"));
        assertEquals("cat", string2.oneTwo("tca"));
        assertEquals("catdog", string2.oneTwo("tcagdo"));
        assertEquals("hocolctea", string2.oneTwo("chocolate"));
        assertEquals("231564897", string2.oneTwo("1234567890"));
        assertEquals("abxabxabxabxabxabxabx", string2.oneTwo("xabxabxabxabxabxabxab"));
        assertEquals("bcaefd", string2.oneTwo("abcdefx"));
        assertEquals("bcaefd", string2.oneTwo("abcdefxy"));
        assertEquals("bcaefdyzx", string2.oneTwo("abcdefxyz"));
        assertEquals("", string2.oneTwo(""));
        assertEquals("", string2.oneTwo("x"));
        assertEquals("", string2.oneTwo("xy"));
        assertEquals("yzx", string2.oneTwo("xyz"));
        assertEquals("bcaefdhigkljmnkpqostrvwuyzx231564897", string2.oneTwo("abcdefghijklkmnopqrstuvwxyz1234567890"));
        assertEquals("bcaefdhigkljmnkpqostrvwuyzx231564897", string2.oneTwo("abcdefghijklkmnopqrstuvwxyz123456789"));
        assertEquals("bcaefdhigkljmnkpqostrvwuyzx231564", string2.oneTwo("abcdefghijklkmnopqrstuvwxyz12345678"));
    }

    @Disabled
    @Test
    public void zipZap() {
        assertEquals("zpXzp", string2.zipZap("zipXzap"));
        assertEquals("zpzp", string2.zipZap("zopzop"));
        assertEquals("zzzpzp", string2.zipZap("zzzopzop"));
        assertEquals("zibzp", string2.zipZap("zibzap"));
        assertEquals("zp", string2.zipZap("zip"));
        assertEquals("zi", string2.zipZap("zi"));
        assertEquals("z", string2.zipZap("z"));
        assertEquals("", string2.zipZap(""));
        assertEquals("zp", string2.zipZap("zzp"));
        assertEquals("abcppp", string2.zipZap("abcppp"));
        assertEquals("azbcppp", string2.zipZap("azbcppp"));
        assertEquals("azbcpzp", string2.zipZap("azbcpzpp"));
    }

    @Disabled
    @Test
    public void starOut() {
        assertEquals("ad", string2.starOut("ab*cd"));
        assertEquals("ad", string2.starOut("ab**cd"));
        assertEquals("silly", string2.starOut("sm*eilly"));
        assertEquals("siy", string2.starOut("sm*eil*ly"));
        assertEquals("siy", string2.starOut("sm**eil*ly"));
        assertEquals("siy", string2.starOut("sm***eil*ly"));
        assertEquals("string", string2.starOut("stringy*"));
        assertEquals("tringy", string2.starOut("*stringy"));
        assertEquals("ty", string2.starOut("*str*in*gy"));
        assertEquals("abc", string2.starOut("abc"));
        assertEquals("c", string2.starOut("a*bc"));
        assertEquals("ab", string2.starOut("ab"));
        assertEquals("", string2.starOut("a*b"));
        assertEquals("a", string2.starOut("a"));
        assertEquals("", string2.starOut("a*"));
        assertEquals("", string2.starOut("*a"));
        assertEquals("", string2.starOut("*"));
        assertEquals("", string2.starOut(""));
    }

    @Disabled
    @Test
    public void plusOut() {
        assertEquals("++xy++", string2.plusOut("12xy34", "xy"));
        assertEquals("1+++++", string2.plusOut("12xy34", "1"));
        assertEquals("++xy++xy+++xy", string2.plusOut("12xy34xyabcxy", "xy"));
        assertEquals("ab++ab++++", string2.plusOut("abXYabcXYZ", "ab"));
        assertEquals("++++abc+++", string2.plusOut("abXYabcXYZ", "abc"));
        assertEquals("++XY+++XY+", string2.plusOut("abXYabcXYZ", "XY"));
        assertEquals("+++++++XYZ", string2.plusOut("abXYxyzXYZ", "XYZ"));
        assertEquals("++++++", string2.plusOut("--++ab", "++"));
        assertEquals("++xxxx++", string2.plusOut("aaxxxxbb", "xx"));
        assertEquals("++3++3", string2.plusOut("123123", "3"));
    }

    @Disabled
    @Test
    public void wordEnds() {
        assertEquals("c13i", string2.wordEnds("abcXY123XYijk", "XY"));
        assertEquals("13", string2.wordEnds("XY123XY", "XY"));
        assertEquals("11", string2.wordEnds("XY1XY", "XY"));
        assertEquals("XY", string2.wordEnds("XYXY", "XY"));
        assertEquals("", string2.wordEnds("XY", "XY"));
        assertEquals("", string2.wordEnds("Hi", "XY"));
        assertEquals("", string2.wordEnds("", "XY"));
        assertEquals("cxziij", string2.wordEnds("abc1xyz1i1j", "1"));
        assertEquals("cxz", string2.wordEnds("abc1xyz1", "1"));
        assertEquals("cxz11", string2.wordEnds("abc1xyz11", "1"));
        assertEquals("11", string2.wordEnds("abc1xyz1abc", "abc"));
        assertEquals("acac", string2.wordEnds("abc1xyz1abc", "b"));
        assertEquals("1111", string2.wordEnds("abc1abc1abc", "abc"));
    }

}