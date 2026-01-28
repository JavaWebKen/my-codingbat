
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Functional2Tests {

    Functional2 functional2 = new Functional2();

    @Disabled
    @Test
    public void noNeg() {

        List<Integer> expectedOutput1 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput1, new Integer[] { 1 });
        List<Integer> input1 = new ArrayList<Integer>();
        Collections.addAll(input1, new Integer[] { 1, -2 });
        assertEquals(expectedOutput1, functional2.noNeg(input1));

        List<Integer> expectedOutput2 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput2, new Integer[] { 3, 3 });
        List<Integer> input2 = new ArrayList<Integer>();
        Collections.addAll(input2, new Integer[] { -3, -3, 3, 3 });
        assertEquals(expectedOutput2, functional2.noNeg(input2));

        List<Integer> expectedOutput3 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput3, new Integer[] {});
        List<Integer> input3 = new ArrayList<Integer>();
        Collections.addAll(input3, new Integer[] { -1, -1, -1 });
        assertEquals(expectedOutput3, functional2.noNeg(input3));

        List<Integer> expectedOutput4 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput4, new Integer[] {});
        List<Integer> input4 = new ArrayList<Integer>();
        Collections.addAll(input4, new Integer[] {});
        assertEquals(expectedOutput4, functional2.noNeg(input4));

        List<Integer> expectedOutput5 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput5, new Integer[] { 0, 1, 2 });
        List<Integer> input5 = new ArrayList<Integer>();
        Collections.addAll(input5, new Integer[] { 0, 1, 2 });
        assertEquals(expectedOutput5, functional2.noNeg(input5));

        List<Integer> expectedOutput6 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput6, new Integer[] { 3, 1, 4 });
        List<Integer> input6 = new ArrayList<Integer>();
        Collections.addAll(input6, new Integer[] { 3, -10, 1, -1, 4, -400 });
        assertEquals(expectedOutput6, functional2.noNeg(input6));

        List<Integer> expectedOutput7 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput7, new Integer[] { 3, 1, 5 });
        List<Integer> input7 = new ArrayList<Integer>();
        Collections.addAll(input7, new Integer[] { -1, 3, 1, -1, -10, -100, -111, 5 });
        assertEquals(expectedOutput7, functional2.noNeg(input7));
    }

    @Disabled
    @Test
    public void no9() {

        List<Integer> expectedOutput1 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput1, new Integer[] { 1, 2 });
        List<Integer> input1 = new ArrayList<Integer>();
        Collections.addAll(input1, new Integer[] { 1, 2, 19 });
        assertEquals(expectedOutput1, functional2.no9(input1));

        List<Integer> expectedOutput2 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput2, new Integer[] { 3 });
        List<Integer> input2 = new ArrayList<Integer>();
        Collections.addAll(input2, new Integer[] { 9, 19, 29, 3 });
        assertEquals(expectedOutput2, functional2.no9(input2));

        List<Integer> expectedOutput3 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput3, new Integer[] { 1, 2, 3 });
        List<Integer> input3 = new ArrayList<Integer>();
        Collections.addAll(input3, new Integer[] { 1, 2, 3 });
        assertEquals(expectedOutput3, functional2.no9(input3));

        List<Integer> expectedOutput4 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput4, new Integer[] { 45, 90, 28, 13, 0 });
        List<Integer> input4 = new ArrayList<Integer>();
        Collections.addAll(input4, new Integer[] { 45, 99, 90, 28, 13, 999, 0 });
        assertEquals(expectedOutput4, functional2.no9(input4));

        List<Integer> expectedOutput5 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput5, new Integer[] {});
        List<Integer> input5 = new ArrayList<Integer>();
        Collections.addAll(input5, new Integer[] {});
        assertEquals(expectedOutput5, functional2.no9(input5));

        List<Integer> expectedOutput6 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput6, new Integer[] {});
        List<Integer> input6 = new ArrayList<Integer>();
        Collections.addAll(input6, new Integer[] { 9 });
        assertEquals(expectedOutput6, functional2.no9(input6));

        List<Integer> expectedOutput7 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput7, new Integer[] { 0, 0 });
        List<Integer> input7 = new ArrayList<Integer>();
        Collections.addAll(input7, new Integer[] { 0, 9, 0 });
        assertEquals(expectedOutput7, functional2.no9(input7));
    }

    @Disabled
    @Test
    public void noTeen() {

        List<Integer> expectedOutput1 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput1, new Integer[] { 12, 20 });
        List<Integer> input1 = new ArrayList<Integer>();
        Collections.addAll(input1, new Integer[] { 12, 13, 19, 20 });
        assertEquals(expectedOutput1, functional2.noTeen(input1));

        List<Integer> expectedOutput2 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput2, new Integer[] { 1, 1 });
        List<Integer> input2 = new ArrayList<Integer>();
        Collections.addAll(input2, new Integer[] { 1, 14, 1 });
        assertEquals(expectedOutput2, functional2.noTeen(input2));

        List<Integer> expectedOutput3 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput3, new Integer[] {});
        List<Integer> input3 = new ArrayList<Integer>();
        Collections.addAll(input3, new Integer[] { 15 });
        assertEquals(expectedOutput3, functional2.noTeen(input3));

        List<Integer> expectedOutput4 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput4, new Integer[] { -15 });
        List<Integer> input4 = new ArrayList<Integer>();
        Collections.addAll(input4, new Integer[] { -15 });
        assertEquals(expectedOutput4, functional2.noTeen(input4));

        List<Integer> expectedOutput5 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput5, new Integer[] {});
        List<Integer> input5 = new ArrayList<Integer>();
        Collections.addAll(input5, new Integer[] {});
        assertEquals(expectedOutput5, functional2.noTeen(input5));

        List<Integer> expectedOutput6 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput6, new Integer[] { 0, 1, 2, -3 });
        List<Integer> input6 = new ArrayList<Integer>();
        Collections.addAll(input6, new Integer[] { 0, 1, 2, -3 });
        assertEquals(expectedOutput6, functional2.noTeen(input6));

        List<Integer> expectedOutput7 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput7, new Integer[] { 21 });
        List<Integer> input7 = new ArrayList<Integer>();
        Collections.addAll(input7, new Integer[] { 15, 17, 19, 21, 19 });
        assertEquals(expectedOutput7, functional2.noTeen(input7));

        List<Integer> expectedOutput8 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput8, new Integer[] { -16, 2, 3, 25 });
        List<Integer> input8 = new ArrayList<Integer>();
        Collections.addAll(input8, new Integer[] { -16, 2, 15, 3, 16, 25 });
        assertEquals(expectedOutput8, functional2.noTeen(input8));
    }

    @Disabled
    @Test
    public void noZ() {

        List<String> expectedOutput1 = new ArrayList<String>();
        Collections.addAll(expectedOutput1, new String[] { "aaa", "bbb" });
        List<String> input1 = new ArrayList<String>();
        Collections.addAll(input1, new String[] { "aaa", "bbb", "aza" });
        assertEquals(expectedOutput1, functional2.noZ(input1));

        List<String> expectedOutput2 = new ArrayList<String>();
        Collections.addAll(expectedOutput2, new String[] { "hi" });
        List<String> input2 = new ArrayList<String>();
        Collections.addAll(input2, new String[] { "hziz", "hzello", "hi" });
        assertEquals(expectedOutput2, functional2.noZ(input2));

        List<String> expectedOutput3 = new ArrayList<String>();
        Collections.addAll(expectedOutput3, new String[] { "hello", "are" });
        List<String> input3 = new ArrayList<String>();
        Collections.addAll(input3, new String[] { "hello", "howz", "are", "youz" });
        assertEquals(expectedOutput3, functional2.noZ(input3));

        List<String> expectedOutput4 = new ArrayList<String>();
        Collections.addAll(expectedOutput4, new String[] {});
        List<String> input4 = new ArrayList<String>();
        Collections.addAll(input4, new String[] {});
        assertEquals(expectedOutput4, functional2.noZ(input4));

        List<String> expectedOutput5 = new ArrayList<String>();
        Collections.addAll(expectedOutput5, new String[] { "" });
        List<String> input5 = new ArrayList<String>();
        Collections.addAll(input5, new String[] { "" });
        assertEquals(expectedOutput5, functional2.noZ(input5));

        List<String> expectedOutput6 = new ArrayList<String>();
        Collections.addAll(expectedOutput6, new String[] { "x", "y" });
        List<String> input6 = new ArrayList<String>();
        Collections.addAll(input6, new String[] { "x", "y", "z" });
        assertEquals(expectedOutput6, functional2.noZ(input6));
    }

    @Disabled
    @Test
    public void noLong() {

        List<String> expectedOutput1 = new ArrayList<String>();
        Collections.addAll(expectedOutput1, new String[] { "not", "too" });
        List<String> input1 = new ArrayList<String>();
        Collections.addAll(input1, new String[] { "this", "not", "too", "long" });
        assertEquals(expectedOutput1, functional2.noLong(input1));

        List<String> expectedOutput2 = new ArrayList<String>();
        Collections.addAll(expectedOutput2, new String[] { "a", "bbb" });
        List<String> input2 = new ArrayList<String>();
        Collections.addAll(input2, new String[] { "a", "bbb", "cccc" });
        assertEquals(expectedOutput2, functional2.noLong(input2));

        List<String> expectedOutput3 = new ArrayList<String>();
        Collections.addAll(expectedOutput3, new String[] {});
        List<String> input3 = new ArrayList<String>();
        Collections.addAll(input3, new String[] { "cccc", "cccc", "cccc" });
        assertEquals(expectedOutput3, functional2.noLong(input3));

        List<String> expectedOutput4 = new ArrayList<String>();
        Collections.addAll(expectedOutput4, new String[] {});
        List<String> input4 = new ArrayList<String>();
        Collections.addAll(input4, new String[] {});
        assertEquals(expectedOutput4, functional2.noLong(input4));

        List<String> expectedOutput5 = new ArrayList<String>();
        Collections.addAll(expectedOutput5, new String[] { "" });
        List<String> input5 = new ArrayList<String>();
        Collections.addAll(input5, new String[] { "" });
        assertEquals(expectedOutput5, functional2.noLong(input5));

        List<String> expectedOutput6 = new ArrayList<String>();
        Collections.addAll(expectedOutput6, new String[] { "" });
        List<String> input6 = new ArrayList<String>();
        Collections.addAll(input6, new String[] { "empty", "", "empty" });
        assertEquals(expectedOutput6, functional2.noLong(input6));

        List<String> expectedOutput7 = new ArrayList<String>();
        Collections.addAll(expectedOutput7, new String[] { "a" });
        List<String> input7 = new ArrayList<String>();
        Collections.addAll(input7, new String[] { "a" });
        assertEquals(expectedOutput7, functional2.noLong(input7));

        List<String> expectedOutput8 = new ArrayList<String>();
        Collections.addAll(expectedOutput8, new String[] { "bbb", "***", "333" });
        List<String> input8 = new ArrayList<String>();
        Collections.addAll(input8, new String[] { "aaaa", "bbb", "***", "333" });
        assertEquals(expectedOutput8, functional2.noLong(input8));
    }

    @Disabled
    @Test
    public void no34() {

        List<String> expectedOutput1 = new ArrayList<String>();
        Collections.addAll(expectedOutput1, new String[] { "a", "bb" });
        List<String> input1 = new ArrayList<String>();
        Collections.addAll(input1, new String[] { "a", "bb", "ccc" });
        assertEquals(expectedOutput1, functional2.no34(input1));

        List<String> expectedOutput2 = new ArrayList<String>();
        Collections.addAll(expectedOutput2, new String[] { "a", "bb" });
        List<String> input2 = new ArrayList<String>();
        Collections.addAll(input2, new String[] { "a", "bb", "ccc", "dddd" });
        assertEquals(expectedOutput2, functional2.no34(input2));

        List<String> expectedOutput3 = new ArrayList<String>();
        Collections.addAll(expectedOutput3, new String[] { "apple" });
        List<String> input3 = new ArrayList<String>();
        Collections.addAll(input3, new String[] { "ccc", "dddd", "apple" });
        assertEquals(expectedOutput3, functional2.no34(input3));

        List<String> expectedOutput4 = new ArrayList<String>();
        Collections.addAll(expectedOutput4, new String[] {});
        List<String> input4 = new ArrayList<String>();
        Collections.addAll(input4, new String[] { "this", "not", "too", "long" });
        assertEquals(expectedOutput4, functional2.no34(input4));

        List<String> expectedOutput5 = new ArrayList<String>();
        Collections.addAll(expectedOutput5, new String[] { "a", "xx" });
        List<String> input5 = new ArrayList<String>();
        Collections.addAll(input5, new String[] { "a", "bbb", "cccc", "xx" });
        assertEquals(expectedOutput5, functional2.no34(input5));

        List<String> expectedOutput6 = new ArrayList<String>();
        Collections.addAll(expectedOutput6, new String[] { "xxxxxxx" });
        List<String> input6 = new ArrayList<String>();
        Collections.addAll(input6, new String[] { "dddd", "ddd", "xxxxxxx" });
        assertEquals(expectedOutput6, functional2.no34(input6));

        List<String> expectedOutput7 = new ArrayList<String>();
        Collections.addAll(expectedOutput7, new String[] {});
        List<String> input7 = new ArrayList<String>();
        Collections.addAll(input7, new String[] {});
        assertEquals(expectedOutput7, functional2.no34(input7));

        List<String> expectedOutput8 = new ArrayList<String>();
        Collections.addAll(expectedOutput8, new String[] { "" });
        List<String> input8 = new ArrayList<String>();
        Collections.addAll(input8, new String[] { "" });
        assertEquals(expectedOutput8, functional2.no34(input8));

        List<String> expectedOutput9 = new ArrayList<String>();
        Collections.addAll(expectedOutput9, new String[] { "empty", "", "empty" });
        List<String> input9 = new ArrayList<String>();
        Collections.addAll(input9, new String[] { "empty", "", "empty" });
        assertEquals(expectedOutput9, functional2.no34(input9));

        List<String> expectedOutput10 = new ArrayList<String>();
        Collections.addAll(expectedOutput10, new String[] { "a" });
        List<String> input10 = new ArrayList<String>();
        Collections.addAll(input10, new String[] { "a" });
        assertEquals(expectedOutput10, functional2.no34(input10));

        List<String> expectedOutput11 = new ArrayList<String>();
        Collections.addAll(expectedOutput11, new String[] { "*****" });
        List<String> input11 = new ArrayList<String>();
        Collections.addAll(input11, new String[] { "aaaa", "bbb", "*****", "333" });
        assertEquals(expectedOutput11, functional2.no34(input11));
    }

    @Disabled
    @Test
    public void noYY() {

        List<String> expectedOutput1 = new ArrayList<String>();
        Collections.addAll(expectedOutput1, new String[] { "ay", "by", "cy" });
        List<String> input1 = new ArrayList<String>();
        Collections.addAll(input1, new String[] { "a", "b", "c" });
        assertEquals(expectedOutput1, functional2.noYY(input1));

        List<String> expectedOutput2 = new ArrayList<String>();
        Collections.addAll(expectedOutput2, new String[] { "ay", "by" });
        List<String> input2 = new ArrayList<String>();
        Collections.addAll(input2, new String[] { "a", "b", "cy" });
        assertEquals(expectedOutput2, functional2.noYY(input2));

        List<String> expectedOutput3 = new ArrayList<String>();
        Collections.addAll(expectedOutput3, new String[] { "xxy", "yay", "zzy" });
        List<String> input3 = new ArrayList<String>();
        Collections.addAll(input3, new String[] { "xx", "ya", "zz" });
        assertEquals(expectedOutput3, functional2.noYY(input3));

        List<String> expectedOutput4 = new ArrayList<String>();
        Collections.addAll(expectedOutput4, new String[] { "xxy", "zzy" });
        List<String> input4 = new ArrayList<String>();
        Collections.addAll(input4, new String[] { "xx", "yay", "zz" });
        assertEquals(expectedOutput4, functional2.noYY(input4));

        List<String> expectedOutput5 = new ArrayList<String>();
        Collections.addAll(expectedOutput5, new String[] { "zzzy" });
        List<String> input5 = new ArrayList<String>();
        Collections.addAll(input5, new String[] { "yyx", "y", "zzz" });
        assertEquals(expectedOutput5, functional2.noYY(input5));

        List<String> expectedOutput6 = new ArrayList<String>();
        Collections.addAll(expectedOutput6, new String[] { "helloy", "therey" });
        List<String> input6 = new ArrayList<String>();
        Collections.addAll(input6, new String[] { "hello", "there" });
        assertEquals(expectedOutput6, functional2.noYY(input6));

        List<String> expectedOutput7 = new ArrayList<String>();
        Collections.addAll(expectedOutput7, new String[] { "yay" });
        List<String> input7 = new ArrayList<String>();
        Collections.addAll(input7, new String[] { "ya" });
        assertEquals(expectedOutput7, functional2.noYY(input7));

        List<String> expectedOutput8 = new ArrayList<String>();
        Collections.addAll(expectedOutput8, new String[] {});
        List<String> input8 = new ArrayList<String>();
        Collections.addAll(input8, new String[] {});
        assertEquals(expectedOutput8, functional2.noYY(input8));

        List<String> expectedOutput9 = new ArrayList<String>();
        Collections.addAll(expectedOutput9, new String[] { "y" });
        List<String> input9 = new ArrayList<String>();
        Collections.addAll(input9, new String[] { "" });
        assertEquals(expectedOutput9, functional2.noYY(input9));

        List<String> expectedOutput10 = new ArrayList<String>();
        Collections.addAll(expectedOutput10, new String[] { "xxy", "zzy" });
        List<String> input10 = new ArrayList<String>();
        Collections.addAll(input10, new String[] { "xx", "yy", "zz" });
        assertEquals(expectedOutput10, functional2.noYY(input10));
    }

    @Disabled
    @Test
    public void two2() {

        List<Integer> expectedOutput1 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput1, new Integer[] { 4, 6 });
        List<Integer> input1 = new ArrayList<Integer>();
        Collections.addAll(input1, new Integer[] { 1, 2, 3 });
        assertEquals(expectedOutput1, functional2.two2(input1));

        List<Integer> expectedOutput2 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput2, new Integer[] { 4 });
        List<Integer> input2 = new ArrayList<Integer>();
        Collections.addAll(input2, new Integer[] { 2, 6, 11 });
        assertEquals(expectedOutput2, functional2.two2(input2));

        List<Integer> expectedOutput3 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput3, new Integer[] { 0 });
        List<Integer> input3 = new ArrayList<Integer>();
        Collections.addAll(input3, new Integer[] { 0 });
        assertEquals(expectedOutput3, functional2.two2(input3));

        List<Integer> expectedOutput4 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput4, new Integer[] {});
        List<Integer> input4 = new ArrayList<Integer>();
        Collections.addAll(input4, new Integer[] {});
        assertEquals(expectedOutput4, functional2.two2(input4));

        List<Integer> expectedOutput5 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput5, new Integer[] {});
        List<Integer> input5 = new ArrayList<Integer>();
        Collections.addAll(input5, new Integer[] { 1, 11, 111, 16 });
        assertEquals(expectedOutput5, functional2.two2(input5));

        List<Integer> expectedOutput6 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput6, new Integer[] { 4, 6, 10, 14 });
        List<Integer> input6 = new ArrayList<Integer>();
        Collections.addAll(input6, new Integer[] { 2, 3, 5, 7, 11 });
        assertEquals(expectedOutput6, functional2.two2(input6));

        List<Integer> expectedOutput7 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput7, new Integer[] { 6, 8, 198, 0 });
        List<Integer> input7 = new ArrayList<Integer>();
        Collections.addAll(input7, new Integer[] { 3, 1, 4, 1, 6, 99, 0 });
        assertEquals(expectedOutput7, functional2.two2(input7));
    }

    @Disabled
    @Test
    public void square56() {

        List<Integer> expectedOutput1 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput1, new Integer[] { 19, 11 });
        List<Integer> input1 = new ArrayList<Integer>();
        Collections.addAll(input1, new Integer[] { 3, 1, 4 });
        assertEquals(expectedOutput1, functional2.square56(input1));

        List<Integer> expectedOutput2 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput2, new Integer[] { 11 });
        List<Integer> input2 = new ArrayList<Integer>();
        Collections.addAll(input2, new Integer[] { 1 });
        assertEquals(expectedOutput2, functional2.square56(input2));

        List<Integer> expectedOutput3 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput3, new Integer[] { 14 });
        List<Integer> input3 = new ArrayList<Integer>();
        Collections.addAll(input3, new Integer[] { 2 });
        assertEquals(expectedOutput3, functional2.square56(input3));

        List<Integer> expectedOutput4 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput4, new Integer[] { 19 });
        List<Integer> input4 = new ArrayList<Integer>();
        Collections.addAll(input4, new Integer[] { 3 });
        assertEquals(expectedOutput4, functional2.square56(input4));

        List<Integer> expectedOutput5 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput5, new Integer[] {});
        List<Integer> input5 = new ArrayList<Integer>();
        Collections.addAll(input5, new Integer[] { 4 });
        assertEquals(expectedOutput5, functional2.square56(input5));

        List<Integer> expectedOutput6 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput6, new Integer[] {});
        List<Integer> input6 = new ArrayList<Integer>();
        Collections.addAll(input6, new Integer[] { 5 });
        assertEquals(expectedOutput6, functional2.square56(input6));

        List<Integer> expectedOutput7 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput7, new Integer[] {});
        List<Integer> input7 = new ArrayList<Integer>();
        Collections.addAll(input7, new Integer[] { 6 });
        assertEquals(expectedOutput7, functional2.square56(input7));

        List<Integer> expectedOutput8 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput8, new Integer[] { 59 });
        List<Integer> input8 = new ArrayList<Integer>();
        Collections.addAll(input8, new Integer[] { 7 });
        assertEquals(expectedOutput8, functional2.square56(input8));

        List<Integer> expectedOutput9 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput9, new Integer[] { 11, 14, 19, 59 });
        List<Integer> input9 = new ArrayList<Integer>();
        Collections.addAll(input9, new Integer[] { 1, 2, 3, 4, 5, 6, 7 });
        assertEquals(expectedOutput9, functional2.square56(input9));

        List<Integer> expectedOutput10 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput10, new Integer[] { 19, 11, 11, 91 });
        List<Integer> input10 = new ArrayList<Integer>();
        Collections.addAll(input10, new Integer[] { 3, -1, -4, 1, 5, 9 });
        assertEquals(expectedOutput10, functional2.square56(input10));
    }

}
