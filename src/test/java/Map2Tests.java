
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Map2Tests {

    Map2 map2 = new Map2();

    @Disabled
    @Test
    public void word0() {

        Map<String, Integer> expectedOutput1 = new HashMap<String, Integer>();
        expectedOutput1.put("a", 0);
        expectedOutput1.put("b", 0);
        String[] input1 = { "a", "b", "a", "b" };
        assertEquals(expectedOutput1, map2.word0(input1));

        Map<String, Integer> expectedOutput2 = new HashMap<String, Integer>();
        expectedOutput2.put("a", 0);
        expectedOutput2.put("b", 0);
        expectedOutput2.put("c", 0);
        String[] input2 = { "a", "b", "a", "c", "b" };
        assertEquals(expectedOutput2, map2.word0(input2));

        Map<String, Integer> expectedOutput3 = new HashMap<String, Integer>();
        expectedOutput3.put("a", 0);
        expectedOutput3.put("b", 0);
        expectedOutput3.put("c", 0);
        String[] input3 = { "c", "b", "a" };
        assertEquals(expectedOutput3, map2.word0(input3));

        Map<String, Integer> expectedOutput4 = new HashMap<String, Integer>();
        expectedOutput4.put("c", 0);
        String[] input4 = { "c", "c", "c", "c" };
        assertEquals(expectedOutput4, map2.word0(input4));

        Map<String, Integer> expectedOutput5 = new HashMap<String, Integer>();
        String[] input5 = {};
        assertEquals(expectedOutput5, map2.word0(input5));
    }

    @Disabled
    @Test
    public void wordLen() {

        Map<String, Integer> expectedOutput1 = new HashMap<String, Integer>();
        expectedOutput1.put("bb", 2);
        expectedOutput1.put("a", 1);
        String[] input1 = { "a", "bb", "a", "bb" };
        assertEquals(expectedOutput1, map2.wordLen(input1));

        Map<String, Integer> expectedOutput2 = new HashMap<String, Integer>();
        expectedOutput2.put("that", 4);
        expectedOutput2.put("and", 3);
        expectedOutput2.put("this", 4);
        String[] input2 = { "this", "and", "that", "and" };
        assertEquals(expectedOutput2, map2.wordLen(input2));

        Map<String, Integer> expectedOutput3 = new HashMap<String, Integer>();
        expectedOutput3.put("code", 4);
        expectedOutput3.put("bug", 3);
        String[] input3 = { "code", "code", "code", "bug" };
        assertEquals(expectedOutput3, map2.wordLen(input3));

        Map<String, Integer> expectedOutput4 = new HashMap<String, Integer>();
        String[] input4 = {};
        assertEquals(expectedOutput4, map2.wordLen(input4));

        Map<String, Integer> expectedOutput5 = new HashMap<String, Integer>();
        expectedOutput5.put("z", 1);
        String[] input5 = { "z" };
        assertEquals(expectedOutput5, map2.wordLen(input5));
    }

    @Disabled
    @Test
    public void pairs() {

        Map<String, String> expectedOutput1 = new HashMap<String, String>();
        expectedOutput1.put("b", "g");
        expectedOutput1.put("c", "e");
        String[] input1 = { "code", "bug" };
        assertEquals(expectedOutput1, map2.pairs(input1));

        Map<String, String> expectedOutput2 = new HashMap<String, String>();
        expectedOutput2.put("m", "n");
        String[] input2 = { "man", "moon", "main" };
        assertEquals(expectedOutput2, map2.pairs(input2));

        Map<String, String> expectedOutput3 = new HashMap<String, String>();
        expectedOutput3.put("g", "d");
        expectedOutput3.put("m", "n");
        expectedOutput3.put("n", "t");
        String[] input3 = { "man", "moon", "good", "night" };
        assertEquals(expectedOutput3, map2.pairs(input3));

        Map<String, String> expectedOutput4 = new HashMap<String, String>();
        String[] input4 = {};
        assertEquals(expectedOutput4, map2.pairs(input4));

        Map<String, String> expectedOutput5 = new HashMap<String, String>();
        expectedOutput5.put("a", "a");
        expectedOutput5.put("b", "b");
        String[] input5 = { "a", "b" };
        assertEquals(expectedOutput5, map2.pairs(input5));

        Map<String, String> expectedOutput6 = new HashMap<String, String>();
        expectedOutput6.put("a", "d");
        expectedOutput6.put("c", "s");
        String[] input6 = { "are", "codes", "and", "cods" };
        assertEquals(expectedOutput6, map2.pairs(input6));

        Map<String, String> expectedOutput7 = new HashMap<String, String>();
        expectedOutput7.put("a", "e");
        expectedOutput7.put("b", "a");
        expectedOutput7.put("c", "e");
        expectedOutput7.put("t", "a");
        String[] input7 = { "apple", "banana", "tea", "coffee" };
        assertEquals(expectedOutput7, map2.pairs(input7));
    }

    @Disabled
    @Test
    public void wordCount() {

        Map<String, Integer> expectedOutput1 = new HashMap<String, Integer>();
        expectedOutput1.put("a", 2);
        expectedOutput1.put("b", 2);
        expectedOutput1.put("c", 1);
        String[] input1 = { "a", "b", "a", "c", "b" };
        assertEquals(expectedOutput1, map2.wordCount(input1));

        Map<String, Integer> expectedOutput2 = new HashMap<String, Integer>();
        expectedOutput2.put("a", 1);
        expectedOutput2.put("b", 1);
        expectedOutput2.put("c", 1);
        String[] input2 = { "c", "b", "a" };
        assertEquals(expectedOutput2, map2.wordCount(input2));

        Map<String, Integer> expectedOutput3 = new HashMap<String, Integer>();
        expectedOutput3.put("c", 4);
        String[] input3 = { "c", "c", "c", "c" };
        assertEquals(expectedOutput3, map2.wordCount(input3));

        Map<String, Integer> expectedOutput4 = new HashMap<String, Integer>();
        String[] input4 = {};
        assertEquals(expectedOutput4, map2.wordCount(input4));

        Map<String, Integer> expectedOutput5 = new HashMap<String, Integer>();
        expectedOutput5.put("", 1);
        expectedOutput5.put("and", 1);
        expectedOutput5.put("this", 2);
        String[] input5 = { "this", "and", "this", "" };
        assertEquals(expectedOutput5, map2.wordCount(input5));

        Map<String, Integer> expectedOutput6 = new HashMap<String, Integer>();
        expectedOutput6.put("x", 2);
        expectedOutput6.put("X", 1);
        expectedOutput6.put("y", 1);
        expectedOutput6.put("Y", 1);
        String[] input6 = { "x", "y", "x", "Y", "X" };
        assertEquals(expectedOutput6, map2.wordCount(input6));

        Map<String, Integer> expectedOutput7 = new HashMap<String, Integer>();
        expectedOutput7.put("0", 1);
        expectedOutput7.put("1", 1);
        expectedOutput7.put("123", 2);
        String[] input7 = { "123", "0", "123", "1" };
        assertEquals(expectedOutput7, map2.wordCount(input7));

        Map<String, Integer> expectedOutput8 = new HashMap<String, Integer>();
        expectedOutput8.put("a", 4);
        expectedOutput8.put("b", 5);
        expectedOutput8.put("d", 3);
        expectedOutput8.put("e", 1);
        expectedOutput8.put("f", 1);
        expectedOutput8.put("one", 1);
        expectedOutput8.put("x", 2);
        expectedOutput8.put("z", 2);
        expectedOutput8.put("two", 2);
        String[] input8 = { "d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x", "b", "f", "x", "two",
                "b", "one", "two" };
        assertEquals(expectedOutput8, map2.wordCount(input8));

        Map<String, Integer> expectedOutput9 = new HashMap<String, Integer>();
        expectedOutput9.put("banana", 2);
        expectedOutput9.put("apple", 3);
        expectedOutput9.put("tea", 1);
        expectedOutput9.put("coffee", 1);
        String[] input9 = { "apple", "banana", "apple", "apple", "tea", "coffee", "banana" };
        assertEquals(expectedOutput8, map2.wordCount(input9));
    }

    @Disabled
    @Test
    public void firstChar() {

        Map<String, String> expectedOutput1 = new HashMap<String, String>();
        expectedOutput1.put("s", "saltsoda");
        expectedOutput1.put("t", "teatoast");
        String[] input1 = { "salt", "tea", "soda", "toast" };
        assertEquals(expectedOutput1, map2.firstChar(input1));

        Map<String, String> expectedOutput2 = new HashMap<String, String>();
        expectedOutput2.put("a", "aaaAA");
        expectedOutput2.put("b", "bb");
        expectedOutput2.put("c", "cccCC");
        expectedOutput2.put("d", "d");
        String[] input2 = { "aa", "bb", "cc", "aAA", "cCC", "d" };
        assertEquals(expectedOutput2, map2.firstChar(input2));

        Map<String, String> expectedOutput3 = new HashMap<String, String>();
        String[] input3 = {};
        assertEquals(expectedOutput3, map2.firstChar(input3));

        Map<String, String> expectedOutput4 = new HashMap<String, String>();
        expectedOutput4.put("a", "appleaardvark");
        expectedOutput4.put("b", "bellsbellsbells");
        expectedOutput4.put("s", "saltsun");
        expectedOutput4.put("z", "zen");
        String[] input4 = { "apple", "bells", "salt", "aardvark", "bells", "sun", "zen", "bells" };
        assertEquals(expectedOutput4, map2.firstChar(input4));
    }

    @Disabled
    @Test
    public void wordAppend() {

        String expectedOutput1 = "a";
        String[] input1 = { "a", "b", "a" };
        assertEquals(expectedOutput1, map2.wordAppend(input1));

        String expectedOutput2 = "aa";
        String[] input2 = { "a", "b", "a", "c", "a", "d", "a" };
        assertEquals(expectedOutput2, map2.wordAppend(input2));

        String expectedOutput3 = "a";
        String[] input3 = { "a", "", "a" };
        assertEquals(expectedOutput3, map2.wordAppend(input3));

        String expectedOutput4 = "";
        String[] input4 = {};
        assertEquals(expectedOutput4, map2.wordAppend(input4));

        String expectedOutput5 = "ba";
        String[] input5 = { "a", "b", "b", "a", "a" };
        assertEquals(expectedOutput5, map2.wordAppend(input5));

        String expectedOutput6 = "baa";
        String[] input6 = { "a", "b", "b", "b", "a", "c", "a", "a" };
        assertEquals(expectedOutput6, map2.wordAppend(input6));

        String expectedOutput7 = "baaba";
        String[] input7 = { "a", "b", "b", "b", "a", "c", "a", "a", "a", "b", "a" };
        assertEquals(expectedOutput7, map2.wordAppend(input7));

        String expectedOutput8 = "andornot";
        String[] input8 = { "not", "and", "or", "and", "this", "and", "or", "that", "not" };
        assertEquals(expectedOutput8, map2.wordAppend(input8));

        String expectedOutput9 = "";
        String[] input9 = { "a", "b", "c" };
        assertEquals(expectedOutput9, map2.wordAppend(input9));

        String expectedOutput10 = "thisandthat";
        String[] input10 = { "this", "or", "that", "and", "this", "and", "that" };
        assertEquals(expectedOutput10, map2.wordAppend(input10));

        String expectedOutput11 = "xxyyzzxx";
        String[] input11 = { "xx", "xx", "yy", "xx", "zz", "yy", "zz", "xx" };
        assertEquals(expectedOutput11, map2.wordAppend(input11));
    }

    @Disabled
    @Test
    public void wordMultiple() {

        Map<String, Boolean> expectedOutput1 = new HashMap<String, Boolean>();
        expectedOutput1.put("a", true);
        expectedOutput1.put("b", true);
        expectedOutput1.put("c", false);
        String[] input1 = { "a", "b", "a", "c", "b" };
        assertEquals(expectedOutput1, map2.wordMultiple(input1));

        Map<String, Boolean> expectedOutput2 = new HashMap<String, Boolean>();
        expectedOutput2.put("a", false);
        expectedOutput2.put("b", false);
        expectedOutput2.put("c", false);
        String[] input2 = { "c", "b", "a" };
        assertEquals(expectedOutput2, map2.wordMultiple(input2));

        Map<String, Boolean> expectedOutput3 = new HashMap<String, Boolean>();
        expectedOutput3.put("c", true);
        String[] input3 = { "c", "c", "c", "c" };
        assertEquals(expectedOutput3, map2.wordMultiple(input3));

        Map<String, Boolean> expectedOutput4 = new HashMap<String, Boolean>();
        String[] input4 = {};
        assertEquals(expectedOutput4, map2.wordMultiple(input4));

        Map<String, Boolean> expectedOutput5 = new HashMap<String, Boolean>();
        expectedOutput5.put("and", false);
        expectedOutput5.put("this", true);
        String[] input5 = { "this", "and", "this" };
        assertEquals(expectedOutput5, map2.wordMultiple(input5));

        Map<String, Boolean> expectedOutput6 = new HashMap<String, Boolean>();
        expectedOutput6.put("a", true);
        expectedOutput6.put("b", true);
        expectedOutput6.put("d", true);
        expectedOutput6.put("e", false);
        expectedOutput6.put("x", false);
        expectedOutput6.put("z", true);
        String[] input6 = { "d", "a", "e", "d", "a", "d", "b", "b", "z", "a", "a", "b", "z", "x" };
        assertEquals(expectedOutput6, map2.wordMultiple(input6));
    }

    @Disabled
    @Test
    public void allSwap() {
        String[] input1 = { "ab", "ac" };
        String[] input2 = { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" };
        String[] input3 = { "ax", "bx", "ay", "by", "ai", "aj", "bx", "by" };
        String[] input4 = { "ax", "bx", "cx", "ay", "cy", "aaa", "abb" };
        String[] input5 = { "easy", "does", "it", "every", "ice", "eaten" };
        String[] input6 = { "list", "of", "words", "swims", "over", "lily", "water", "wait" };
        String[] input7 = { "4", "8", "15", "16", "23", "42" };
        String[] input8 = { "aaa" };
        String[] input9 = {};
        String[] input10 = { "a", "b", "c", "xx", "yy", "zz" };

        String[] expectedOutput1 = { "ac", "ab" };
        String[] expectedOutput2 = { "ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa" };
        String[] expectedOutput3 = { "ay", "by", "ax", "bx", "aj", "ai", "by", "bx" };
        String[] expectedOutput4 = { "ay", "bx", "cy", "ax", "cx", "abb", "aaa" };
        String[] expectedOutput5 = { "every", "does", "ice", "easy", "it", "eaten" };
        String[] expectedOutput6 = { "lily", "over", "water", "swims", "of", "list", "words", "wait" };
        String[] expectedOutput7 = { "42", "8", "16", "15", "23", "4" };
        String[] expectedOutput8 = { "aaa" };
        String[] expectedOutput9 = {};
        String[] expectedOutput10 = { "a", "b", "c", "xx", "yy", "zz" };

        assertEquals(expectedOutput1, map2.allSwap(input1));
        assertEquals(expectedOutput2, map2.allSwap(input2));
        assertEquals(expectedOutput3, map2.allSwap(input3));
        assertEquals(expectedOutput4, map2.allSwap(input4));
        assertEquals(expectedOutput5, map2.allSwap(input5));
        assertEquals(expectedOutput6, map2.allSwap(input6));
        assertEquals(expectedOutput7, map2.allSwap(input7));
        assertEquals(expectedOutput8, map2.allSwap(input8));
        assertEquals(expectedOutput9, map2.allSwap(input9));
        assertEquals(expectedOutput10, map2.allSwap(input10));
    }

    @Disabled
    @Test
    public void firstSwap() {

        String[] input1 = { "ab", "ac" };
        String[] input2 = { "ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz" };
        String[] input3 = { "ax", "bx", "ay", "by", "ai", "aj", "bx", "by" };
        String[] input4 = { "ax", "bx", "cx", "ay", "cy", "aaa", "abb" };
        String[] input5 = { "easy", "does", "it", "every", "ice", "eaten" };
        String[] input6 = { "list", "of", "words", "swims", "over", "lily", "water", "wait" };
        String[] input7 = { "4", "8", "15", "16", "23", "42" };
        String[] input8 = { "aaa" };
        String[] input9 = {};
        String[] input10 = { "a", "b", "c", "xx", "yy", "zz" };

        String[] expectedOutput1 = { "ac", "ab" };
        String[] expectedOutput2 = { "ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz" };
        String[] expectedOutput3 = { "ay", "by", "ax", "bx", "ai", "aj", "bx", "by" };
        String[] expectedOutput4 = { "ay", "bx", "cy", "ax", "cx", "aaa", "abb" };
        String[] expectedOutput5 = { "every", "does", "ice", "easy", "it", "eaten" };
        String[] expectedOutput6 = { "lily", "over", "water", "swims", "of", "list", "words", "wait" };
        String[] expectedOutput7 = { "42", "8", "16", "15", "23", "4" };
        String[] expectedOutput8 = { "aaa" };
        String[] expectedOutput9 = {};
        String[] expectedOutput10 = { "a", "b", "c", "xx", "yy", "zz" };

        assertEquals(expectedOutput1, map2.firstSwap(input1));
        assertEquals(expectedOutput2, map2.firstSwap(input2));
        assertEquals(expectedOutput3, map2.firstSwap(input3));
        assertEquals(expectedOutput4, map2.firstSwap(input4));
        assertEquals(expectedOutput5, map2.firstSwap(input5));
        assertEquals(expectedOutput6, map2.firstSwap(input6));
        assertEquals(expectedOutput7, map2.firstSwap(input7));
        assertEquals(expectedOutput8, map2.firstSwap(input8));
        assertEquals(expectedOutput9, map2.firstSwap(input9));
        assertEquals(expectedOutput10, map2.firstSwap(input10));

    }

}
