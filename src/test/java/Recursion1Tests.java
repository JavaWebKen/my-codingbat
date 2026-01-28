
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Recursion1Tests {

    Recursion1 recursion1 = new Recursion1();

    @Disabled
    @Test
    public void factorial() {
        assertEquals(1, recursion1.factorial(1));
        assertEquals(2, recursion1.factorial(2));
        assertEquals(6, recursion1.factorial(3));
        assertEquals(24, recursion1.factorial(4));
        assertEquals(120, recursion1.factorial(5));
        assertEquals(720, recursion1.factorial(6));
        assertEquals(5040, recursion1.factorial(7));
        assertEquals(40320, recursion1.factorial(8));
        assertEquals(479001600, recursion1.factorial(12));
    }

    @Disabled
    @Test
    public void bunnyEars() {
        assertEquals(0, recursion1.bunnyEars(0));
        assertEquals(2, recursion1.bunnyEars(1));
        assertEquals(4, recursion1.bunnyEars(2));
        assertEquals(6, recursion1.bunnyEars(3));
        assertEquals(8, recursion1.bunnyEars(4));
        assertEquals(10, recursion1.bunnyEars(5));
        assertEquals(24, recursion1.bunnyEars(12));
        assertEquals(100, recursion1.bunnyEars(50));
        assertEquals(468, recursion1.bunnyEars(234));
    }

    @Disabled
    @Test
    public void fibonacci() {
        assertEquals(0, recursion1.fibonacci(0));
        assertEquals(1, recursion1.fibonacci(1));
        assertEquals(1, recursion1.fibonacci(2));
        assertEquals(2, recursion1.fibonacci(3));
        assertEquals(3, recursion1.fibonacci(4));
        assertEquals(5, recursion1.fibonacci(5));
        assertEquals(8, recursion1.fibonacci(6));
        assertEquals(13, recursion1.fibonacci(7));
    }

    @Disabled
    @Test
    public void bunnyEars2() {
        assertEquals(0, recursion1.bunnyEars2(0));
        assertEquals(2, recursion1.bunnyEars2(1));
        assertEquals(5, recursion1.bunnyEars2(2));
        assertEquals(7, recursion1.bunnyEars2(3));
        assertEquals(10, recursion1.bunnyEars2(4));
        assertEquals(12, recursion1.bunnyEars2(5));
        assertEquals(15, recursion1.bunnyEars2(6));
        assertEquals(25, recursion1.bunnyEars2(10));
    }

    @Disabled
    @Test
    public void triangle() {
        assertEquals(0, recursion1.triangle(0));
        assertEquals(1, recursion1.triangle(1));
        assertEquals(3, recursion1.triangle(2));
        assertEquals(6, recursion1.triangle(3));
        assertEquals(10, recursion1.triangle(4));
        assertEquals(15, recursion1.triangle(5));
        assertEquals(21, recursion1.triangle(6));
        assertEquals(28, recursion1.triangle(7));
    }

    @Disabled
    @Test
    public void sumDigits() {
        assertEquals(9, recursion1.sumDigits(126));
        assertEquals(13, recursion1.sumDigits(49));
        assertEquals(3, recursion1.sumDigits(12));
        assertEquals(1, recursion1.sumDigits(10));
        assertEquals(1, recursion1.sumDigits(1));
        assertEquals(0, recursion1.sumDigits(0));
        assertEquals(10, recursion1.sumDigits(730));
        assertEquals(4, recursion1.sumDigits(1111));
        assertEquals(5, recursion1.sumDigits(11111));
        assertEquals(3, recursion1.sumDigits(10110));
        assertEquals(10, recursion1.sumDigits(235));
    }

    @Disabled
    @Test
    public void count7() {
        assertEquals(2, recursion1.count7(717));
        assertEquals(1, recursion1.count7(7));
        assertEquals(0, recursion1.count7(123));
        assertEquals(2, recursion1.count7(77));
        assertEquals(1, recursion1.count7(7123));
        assertEquals(3, recursion1.count7(771237));
        assertEquals(4, recursion1.count7(771737));
        assertEquals(2, recursion1.count7(47571));
        assertEquals(6, recursion1.count7(777777));
        assertEquals(4, recursion1.count7(70701277));
        assertEquals(5, recursion1.count7(777576197));
        assertEquals(0, recursion1.count7(99999));
        assertEquals(1, recursion1.count7(99799));
    }

    @Disabled
    @Test
    public void count8() {
        assertEquals(1, recursion1.count8(8));
        assertEquals(2, recursion1.count8(818));
        assertEquals(4, recursion1.count8(8818));
        assertEquals(4, recursion1.count8(8088));
        assertEquals(0, recursion1.count8(123));
        assertEquals(2, recursion1.count8(81238));
        assertEquals(6, recursion1.count8(88788));
        assertEquals(1, recursion1.count8(8234));
        assertEquals(1, recursion1.count8(2348));
        assertEquals(3, recursion1.count8(23884));
        assertEquals(0, recursion1.count8(0));
        assertEquals(5, recursion1.count8(1818188));
        assertEquals(5, recursion1.count8(8818181));
        assertEquals(1, recursion1.count8(1080));
        assertEquals(3, recursion1.count8(188));
        assertEquals(9, recursion1.count8(88888));
        assertEquals(2, recursion1.count8(9898));
        assertEquals(1, recursion1.count8(78));
    }

    @Disabled
    @Test
    public void powerN() {
        assertEquals(3, recursion1.powerN(3, 1));
        assertEquals(9, recursion1.powerN(3, 2));
        assertEquals(27, recursion1.powerN(3, 3));
        assertEquals(2, recursion1.powerN(2, 1));
        assertEquals(4, recursion1.powerN(2, 2));
        assertEquals(8, recursion1.powerN(2, 3));
        assertEquals(16, recursion1.powerN(2, 4));
        assertEquals(32, recursion1.powerN(2, 5));
        assertEquals(10, recursion1.powerN(10, 1));
        assertEquals(100, recursion1.powerN(10, 2));
        assertEquals(1000, recursion1.powerN(10, 3));
    }

    @Disabled
    @Test
    public void countX() {
        assertEquals(4, recursion1.countX("xxhixx"));
        assertEquals(3, recursion1.countX("xhixhix"));
        assertEquals(0, recursion1.countX("hi"));
        assertEquals(0, recursion1.countX("h"));
        assertEquals(1, recursion1.countX("x"));
        assertEquals(0, recursion1.countX(""));
        assertEquals(0, recursion1.countX("hihi"));
        assertEquals(0, recursion1.countX("hiAAhi12hi"));
    }

    @Disabled
    @Test
    public void countHi() {
        assertEquals(1, recursion1.countHi("xxhixx"));
        assertEquals(2, recursion1.countHi("xhixhix"));
        assertEquals(1, recursion1.countHi("hi"));
        assertEquals(2, recursion1.countHi("hihih"));
        assertEquals(0, recursion1.countHi("h"));
        assertEquals(0, recursion1.countHi(""));
        assertEquals(4, recursion1.countHi("ihihihihih"));
        assertEquals(5, recursion1.countHi("ihihihihihi"));
        assertEquals(3, recursion1.countHi("hiAAhi12hi"));
        assertEquals(3, recursion1.countHi("xhixhxihihhhih"));
        assertEquals(1, recursion1.countHi("ship"));
    }

    @Disabled
    @Test
    public void changeXY() {
        assertEquals("codey", recursion1.changeXY("codex"));
        assertEquals("yyhiyy", recursion1.changeXY("xxhixx"));
        assertEquals("yhiyhiy", recursion1.changeXY("xhixhix"));
        assertEquals("hiy", recursion1.changeXY("hiy"));
        assertEquals("h", recursion1.changeXY("h"));
        assertEquals("y", recursion1.changeXY("x"));
        assertEquals("", recursion1.changeXY(""));
        assertEquals("yyy", recursion1.changeXY("xxx"));
        assertEquals("yyhyyi", recursion1.changeXY("yyhxyi"));
        assertEquals("hihi", recursion1.changeXY("hihi"));
    }

    @Disabled
    @Test
    public void changePi() {
        assertEquals("x3.14x", recursion1.changePi("xpix"));
        assertEquals("3.143.14", recursion1.changePi("pipi"));
        assertEquals("3.14p", recursion1.changePi("pip"));
        assertEquals("3.14", recursion1.changePi("pi"));
        assertEquals("hip", recursion1.changePi("hip"));
        assertEquals("p", recursion1.changePi("p"));
        assertEquals("x", recursion1.changePi("x"));
        assertEquals("", recursion1.changePi(""));
        assertEquals("3.14xx", recursion1.changePi("pixx"));
        assertEquals("xyzzy", recursion1.changePi("xyzzy"));
    }

    @Disabled
    @Test
    public void noX() {
        assertEquals("ab", recursion1.noX("xaxb"));
        assertEquals("abc", recursion1.noX("abc"));
        assertEquals("", recursion1.noX("xx"));
        assertEquals("", recursion1.noX(""));
        assertEquals("ab", recursion1.noX("axxbxx"));
        assertEquals("Hello", recursion1.noX("Hellox"));
    }

    @Disabled
    @Test
    public void array6() {
        assertEquals(true, recursion1.array6(new int[] { 1, 6, 4 }, 0));
        assertEquals(false, recursion1.array6(new int[] { 1, 4 }, 0));
        assertEquals(true, recursion1.array6(new int[] { 6 }, 0));
        assertEquals(false, recursion1.array6(new int[] {}, 0));
        assertEquals(true, recursion1.array6(new int[] { 6, 2, 2 }, 0));
        assertEquals(false, recursion1.array6(new int[] { 2, 5 }, 0));
        assertEquals(true, recursion1.array6(new int[] { 1, 9, 4, 6, 6 }, 0));
        assertEquals(true, recursion1.array6(new int[] { 2, 5, 6 }, 0));
    }

    @Disabled
    @Test
    public void array11() {
        assertEquals(1, recursion1.array11(new int[] { 1, 2, 11 }, 0));
        assertEquals(2, recursion1.array11(new int[] { 11, 11 }, 0));
        assertEquals(0, recursion1.array11(new int[] { 1, 2, 3, 4 }, 0));
        assertEquals(3, recursion1.array11(new int[] { 1, 11, 3, 11, 11 }, 0));
        assertEquals(1, recursion1.array11(new int[] { 11 }, 0));
        assertEquals(0, recursion1.array11(new int[] { 1 }, 0));
        assertEquals(0, recursion1.array11(new int[] {}, 0));
        assertEquals(2, recursion1.array11(new int[] { 11, 2, 3, 4, 11, 5 }, 0));
        assertEquals(2, recursion1.array11(new int[] { 11, 5, 11 }, 0));
    }

    @Disabled
    @Test
    public void array220() {
        assertEquals(true, recursion1.array220(new int[] { 1, 2, 20 }, 0));
        assertEquals(true, recursion1.array220(new int[] { 3, 30 }, 0));
        assertEquals(false, recursion1.array220(new int[] { 3 }, 0));
        assertEquals(false, recursion1.array220(new int[] {}, 0));
        assertEquals(true, recursion1.array220(new int[] { 3, 3, 30, 4 }, 0));
        assertEquals(false, recursion1.array220(new int[] { 2, 19, 4 }, 0));
        assertEquals(false, recursion1.array220(new int[] { 20, 2, 21 }, 0));
        assertEquals(true, recursion1.array220(new int[] { 20, 2, 21, 210 }, 0));
        assertEquals(true, recursion1.array220(new int[] { 2, 200, 2000 }, 0));
        assertEquals(true, recursion1.array220(new int[] { 0, 0 }, 0));
        assertEquals(false, recursion1.array220(new int[] { 1, 2, 3, 4, 5, 6 }, 0));
        assertEquals(true, recursion1.array220(new int[] { 1, 2, 3, 4, 5, 50, 6 }, 0));
        assertEquals(false, recursion1.array220(new int[] { 1, 2, 3, 4, 5, 51, 6 }, 0));
        assertEquals(true, recursion1.array220(new int[] { 1, 2, 3, 4, 4, 50, 500, 6 }, 0));
    }

    @Disabled
    @Test
    public void allStar() {
        assertEquals("h*e*l*l*o", recursion1.allStar("hello"));
        assertEquals("a*b*c", recursion1.allStar("abc"));
        assertEquals("a*b", recursion1.allStar("ab"));
        assertEquals("a", recursion1.allStar("a"));
        assertEquals("", recursion1.allStar(""));
        assertEquals("3*.*1*4", recursion1.allStar("3.14"));
        assertEquals("C*h*o*c*o*l*a*t*e", recursion1.allStar("Chocolate"));
        assertEquals("1*2*3*4", recursion1.allStar("1234"));
    }

    @Disabled
    @Test
    public void pairStar() {
        assertEquals("hel*lo", recursion1.pairStar("hello"));
        assertEquals("x*xy*y", recursion1.pairStar("xxyy"));
        assertEquals("a*a*a*a", recursion1.pairStar("aaaa"));
        assertEquals("a*a*ab", recursion1.pairStar("aaab"));
        assertEquals("a*a", recursion1.pairStar("aa"));
        assertEquals("a", recursion1.pairStar("a"));
        assertEquals("", recursion1.pairStar(""));
        assertEquals("noadjacent", recursion1.pairStar("noadjacent"));
        assertEquals("ab*ba", recursion1.pairStar("abba"));
        assertEquals("ab*b*ba", recursion1.pairStar("abbba"));
    }

    @Disabled
    @Test
    public void endX() {
        assertEquals("rexx", recursion1.endX("xxre"));
        assertEquals("hixxxx", recursion1.endX("xxhixx"));
        assertEquals("hihixxx", recursion1.endX("xhixhix"));
        assertEquals("hiy", recursion1.endX("hiy"));
        assertEquals("h", recursion1.endX("h"));
        assertEquals("x", recursion1.endX("x"));
        assertEquals("xx", recursion1.endX("xx"));
        assertEquals("", recursion1.endX(""));
        assertEquals("bxx", recursion1.endX("bxx"));
        assertEquals("baxx", recursion1.endX("bxax"));
        assertEquals("aaaxxx", recursion1.endX("axaxax"));
        assertEquals("hixxx", recursion1.endX("xxhxi"));
    }

    @Disabled
    @Test
    public void countPairs() {
        assertEquals(1, recursion1.countPairs("axa"));
        assertEquals(2, recursion1.countPairs("axax"));
        assertEquals(1, recursion1.countPairs("axbx"));
        assertEquals(0, recursion1.countPairs("hi"));
        assertEquals(3, recursion1.countPairs("hihih"));
        assertEquals(3, recursion1.countPairs("ihihhh"));
        assertEquals(0, recursion1.countPairs("ihjxhh"));
        assertEquals(0, recursion1.countPairs(""));
        assertEquals(0, recursion1.countPairs("a"));
        assertEquals(0, recursion1.countPairs("aa"));
        assertEquals(1, recursion1.countPairs("aaa"));
    }

    @Disabled
    @Test
    public void countAbc() {
        assertEquals(1, recursion1.countAbc("abc"));
        assertEquals(2, recursion1.countAbc("abcxxabc"));
        assertEquals(2, recursion1.countAbc("abaxxaba"));
        assertEquals(2, recursion1.countAbc("ababc"));
        assertEquals(0, recursion1.countAbc("abxbc"));
        assertEquals(1, recursion1.countAbc("aaabc"));
        assertEquals(0, recursion1.countAbc("hello"));
        assertEquals(0, recursion1.countAbc(""));
        assertEquals(0, recursion1.countAbc("ab"));
        assertEquals(1, recursion1.countAbc("aba"));
        assertEquals(0, recursion1.countAbc("aca"));
        assertEquals(0, recursion1.countAbc("aaa"));
    }

    @Disabled
    @Test
    public void count11() {
        assertEquals(2, recursion1.count11("11abc11"));
        assertEquals(3, recursion1.count11("abc11x11x11"));
        assertEquals(1, recursion1.count11("111"));
        assertEquals(2, recursion1.count11("1111"));
        assertEquals(0, recursion1.count11("1"));
        assertEquals(0, recursion1.count11(""));
        assertEquals(0, recursion1.count11("hi"));
        assertEquals(4, recursion1.count11("11x111x1111"));
        assertEquals(1, recursion1.count11("1x111"));
        assertEquals(0, recursion1.count11("1Hello1"));
        assertEquals(0, recursion1.count11("Hello"));
    }

    @Disabled
    @Test
    public void stringClean() {
        assertEquals("yza", recursion1.stringClean("yyzzza"));
        assertEquals("abcd", recursion1.stringClean("abbbcdd"));
        assertEquals("Helo", recursion1.stringClean("Hello"));
        assertEquals("XabcY", recursion1.stringClean("XXabcYY"));
        assertEquals("12ab45", recursion1.stringClean("112ab445"));
        assertEquals("Helo Bokeper", recursion1.stringClean("Hello Bookkeeper"));
    }

    @Disabled
    @Test
    public void countHi2() {
        assertEquals(1, recursion1.countHi2("ahixhi"));
        assertEquals(2, recursion1.countHi2("ahibhi"));
        assertEquals(0, recursion1.countHi2("xhixhi"));
        assertEquals(1, recursion1.countHi2("hixhi"));
        assertEquals(2, recursion1.countHi2("hixhhi"));
        assertEquals(3, recursion1.countHi2("hihihi"));
        assertEquals(3, recursion1.countHi2("hihihix"));
        assertEquals(2, recursion1.countHi2("xhihihix"));
        assertEquals(0, recursion1.countHi2("xxhi"));
        assertEquals(1, recursion1.countHi2("hixxhi"));
        assertEquals(1, recursion1.countHi2("hi"));
        assertEquals(0, recursion1.countHi2("xxxx"));
        assertEquals(0, recursion1.countHi2("h"));
        assertEquals(0, recursion1.countHi2("x"));
        assertEquals(0, recursion1.countHi2(""));
        assertEquals(1, recursion1.countHi2("Hellohi"));
    }

    @Disabled
    @Test
    public void parenBit() {
        assertEquals("(abc)", recursion1.parenBit("xyz(abc)123"));
        assertEquals("(hello)", recursion1.parenBit("x(hello)"));
        assertEquals("(xy)", recursion1.parenBit("(xy)1"));
        assertEquals("(possible)", recursion1.parenBit("not really (possible)"));
        assertEquals("(abc)", recursion1.parenBit("(abc)"));
        assertEquals("(abc)", recursion1.parenBit("(abc)xyz"));
        assertEquals("(abc)", recursion1.parenBit("(abc)x"));
        assertEquals("(x)", recursion1.parenBit("(x)"));
        assertEquals("()", recursion1.parenBit("()"));
        assertEquals("(ipsa)", recursion1.parenBit("res (ipsa) loquitor"));
        assertEquals("(not really)", recursion1.parenBit("hello(not really)there"));
        assertEquals("(ab)", recursion1.parenBit("ab(ab)ab"));
    }

    @Disabled
    @Test
    public void nestParen() {
        assertEquals(true, recursion1.nestParen("(())"));
        assertEquals(true, recursion1.nestParen("((()))"));
        assertEquals(false, recursion1.nestParen("(((x))"));
        assertEquals(false, recursion1.nestParen("((())"));
        assertEquals(false, recursion1.nestParen("((()()"));
        assertEquals(true, recursion1.nestParen("()"));
        assertEquals(true, recursion1.nestParen(""));
        assertEquals(false, recursion1.nestParen("(yy)"));
        assertEquals(true, recursion1.nestParen("(())"));
        assertEquals(false, recursion1.nestParen("(((y))"));
        assertEquals(false, recursion1.nestParen("((y)))"));
        assertEquals(true, recursion1.nestParen("((()))"));
        assertEquals(false, recursion1.nestParen("(())))"));
        assertEquals(false, recursion1.nestParen("((yy())))"));
        assertEquals(true, recursion1.nestParen("(((())))"));
    }

    @Disabled
    @Test
    public void strCount() {
        assertEquals(2, recursion1.strCount("catcowcat", "cat"));
        assertEquals(1, recursion1.strCount("catcowcat", "cow"));
        assertEquals(0, recursion1.strCount("catcowcat", "dog"));
        assertEquals(2, recursion1.strCount("cacatcowcat", "cat"));
        assertEquals(2, recursion1.strCount("xyx", "x"));
        assertEquals(4, recursion1.strCount("iiiijj", "i"));
        assertEquals(2, recursion1.strCount("iiiijj", "ii"));
        assertEquals(1, recursion1.strCount("iiiijj", "iii"));
        assertEquals(2, recursion1.strCount("iiiijj", "j"));
        assertEquals(1, recursion1.strCount("iiiijj", "jj"));
        assertEquals(4, recursion1.strCount("aaabababab", "ab"));
        assertEquals(1, recursion1.strCount("aaabababab", "aa"));
        assertEquals(6, recursion1.strCount("aaabababab", "a"));
        assertEquals(4, recursion1.strCount("aaabababab", "b"));
    }

    @Disabled
    @Test
    public void strCopies() {
        assertEquals(true, recursion1.strCopies("catcowcat", "cat", 2));
        assertEquals(false, recursion1.strCopies("catcowcat", "cow", 2));
        assertEquals(true, recursion1.strCopies("catcowcat", "cow", 1));
        assertEquals(true, recursion1.strCopies("iiijjj", "i", 3));
        assertEquals(false, recursion1.strCopies("iiijjj", "i", 4));
        assertEquals(true, recursion1.strCopies("iiijjj", "ii", 2));
        assertEquals(false, recursion1.strCopies("iiijjj", "ii", 3));
        assertEquals(false, recursion1.strCopies("iiijjj", "x", 3));
        assertEquals(true, recursion1.strCopies("iiijjj", "x", 0));
        assertEquals(true, recursion1.strCopies("iiiiij", "iii", 3));
        assertEquals(false, recursion1.strCopies("iiiiij", "iii", 4));
        assertEquals(true, recursion1.strCopies("ijiiiiij", "iiii", 2));
        assertEquals(false, recursion1.strCopies("ijiiiiij", "iiii", 3));
        assertEquals(true, recursion1.strCopies("dogcatdogcat", "dog", 2));
    }

    @Disabled
    @Test
    public void strDist() {
        assertEquals(9, recursion1.strDist("catcowcat", "cat"));
        assertEquals(3, recursion1.strDist("catcowcat", "cow"));
        assertEquals(9, recursion1.strDist("cccatcowcatxx", "cat"));
        assertEquals(12, recursion1.strDist("abccatcowcatcatxyz", "cat"));
        assertEquals(3, recursion1.strDist("xyx", "x"));
        assertEquals(1, recursion1.strDist("xyx", "y"));
        assertEquals(0, recursion1.strDist("xyx", "z"));
        assertEquals(1, recursion1.strDist("z", "z"));
        assertEquals(0, recursion1.strDist("x", "z"));
        assertEquals(0, recursion1.strDist("", "z"));
        assertEquals(13, recursion1.strDist("hiHellohihihi", "hi"));
        assertEquals(5, recursion1.strDist("hiHellohihihi", "hih"));
        assertEquals(1, recursion1.strDist("hiHellohihihi", "o"));
        assertEquals(2, recursion1.strDist("hiHellohihihi", "ll"));
    }

}