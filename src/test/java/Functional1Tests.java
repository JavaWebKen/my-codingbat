
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Functional1Tests {

    Functional1 functional1 = new Functional1();

    @Disabled
    @Test
    public void doubling() {

        List<Integer> expectedOutput1 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput1, new Integer[] { 2, 4, 6 });
        List<Integer> input1 = new ArrayList<Integer>();
        Collections.addAll(input1, new Integer[] { 1, 2, 3 });
        assertEquals(expectedOutput1, functional1.doubling(input1));

        List<Integer> expectedOutput2 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput2, new Integer[] { 12, 16, 12, 16, -2 });
        List<Integer> input2 = new ArrayList<Integer>();
        Collections.addAll(input2, new Integer[] { 6, 8, 6, 8, -1 });
        assertEquals(expectedOutput2, functional1.doubling(input2));

        List<Integer> expectedOutput3 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput3, new Integer[] {});
        List<Integer> input3 = new ArrayList<Integer>();
        Collections.addAll(input3, new Integer[] {});
        assertEquals(expectedOutput3, functional1.doubling(input3));

        List<Integer> expectedOutput4 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput4, new Integer[] { 10 });
        List<Integer> input4 = new ArrayList<Integer>();
        Collections.addAll(input4, new Integer[] { 5 });
        assertEquals(expectedOutput4, functional1.doubling(input4));

        List<Integer> expectedOutput5 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput5, new Integer[] { 10, 20 });
        List<Integer> input5 = new ArrayList<Integer>();
        Collections.addAll(input5, new Integer[] { 5, 10 });
        assertEquals(expectedOutput5, functional1.doubling(input5));

        List<Integer> expectedOutput6 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput6, new Integer[] { 16, -10, 14, 6, 218 });
        List<Integer> input6 = new ArrayList<Integer>();
        Collections.addAll(input6, new Integer[] { 8, -5, 7, 3, 109 });
        assertEquals(expectedOutput6, functional1.doubling(input6));

        List<Integer> expectedOutput7 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput7, new Integer[] { 12, -6, 24, 46, 8, 2, 38, 22, 4, 6, 4 });
        List<Integer> input7 = new ArrayList<Integer>();
        Collections.addAll(input7, new Integer[] { 6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2 });
        assertEquals(expectedOutput7, functional1.doubling(input7));

        List<Integer> expectedOutput8 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput8, new Integer[] { 6, 2, 8, 2, 10, 18 });
        List<Integer> input8 = new ArrayList<Integer>();
        Collections.addAll(input8, new Integer[] { 3, 1, 4, 1, 5, 9 });
        assertEquals(expectedOutput8, functional1.doubling(input8));
    }

    @Disabled
    @Test
    public void square() {

        List<Integer> expectedOutput1 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput1, new Integer[] { 1, 4, 9 });
        List<Integer> input1 = new ArrayList<Integer>();
        Collections.addAll(input1, new Integer[] { 1, 2, 3 });
        assertEquals(expectedOutput1, functional1.square(input1));

        List<Integer> expectedOutput2 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput2, new Integer[] { 36, 64, 36, 64, 1 });
        List<Integer> input2 = new ArrayList<Integer>();
        Collections.addAll(input2, new Integer[] { 6, 8, -6, -8, 1 });
        assertEquals(expectedOutput2, functional1.square(input2));

        List<Integer> expectedOutput3 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput3, new Integer[] {});
        List<Integer> input3 = new ArrayList<Integer>();
        Collections.addAll(input3, new Integer[] {});
        assertEquals(expectedOutput3, functional1.square(input3));

        List<Integer> expectedOutput4 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput4, new Integer[] { 144 });
        List<Integer> input4 = new ArrayList<Integer>();
        Collections.addAll(input4, new Integer[] { 12 });
        assertEquals(expectedOutput4, functional1.square(input4));

        List<Integer> expectedOutput5 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput5, new Integer[] { 25, 100 });
        List<Integer> input5 = new ArrayList<Integer>();
        Collections.addAll(input5, new Integer[] { 5, 10 });
        assertEquals(expectedOutput5, functional1.square(input5));

        List<Integer> expectedOutput6 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput6, new Integer[] { 36, 9, 144, 529, 16, 1, 361, 121, 4, 9, 4 });
        List<Integer> input6 = new ArrayList<Integer>();
        Collections.addAll(input6, new Integer[] { 6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2 });
        assertEquals(expectedOutput6, functional1.square(input6));
    }

    @Disabled
    @Test
    public void addStar() {

        List<String> expectedOutput1 = new ArrayList<String>();
        Collections.addAll(expectedOutput1, new String[] { "a*", "bb*", "ccc*" });
        List<String> input1 = new ArrayList<String>();
        Collections.addAll(input1, new String[] { "a", "bb", "ccc" });
        assertEquals(expectedOutput1, functional1.addStar(input1));

        List<String> expectedOutput2 = new ArrayList<String>();
        Collections.addAll(expectedOutput2, new String[] { "hello*", "there*" });
        List<String> input2 = new ArrayList<String>();
        Collections.addAll(input2, new String[] { "hello", "there" });
        assertEquals(expectedOutput2, functional1.addStar(input2));

        List<String> expectedOutput3 = new ArrayList<String>();
        Collections.addAll(expectedOutput3, new String[] { "**" });
        List<String> input3 = new ArrayList<String>();
        Collections.addAll(input3, new String[] { "*" });
        assertEquals(expectedOutput3, functional1.addStar(input3));

        List<String> expectedOutput4 = new ArrayList<String>();
        Collections.addAll(expectedOutput4, new String[] {});
        List<String> input4 = new ArrayList<String>();
        Collections.addAll(input4, new String[] {});
        assertEquals(expectedOutput4, functional1.addStar(input4));

        List<String> expectedOutput5 = new ArrayList<String>();
        Collections.addAll(expectedOutput5, new String[] { "kittens*", "and*", "chocolate*", "and*" });
        List<String> input5 = new ArrayList<String>();
        Collections.addAll(input5, new String[] { "kittens", "and", "chocolate", "and" });
        assertEquals(expectedOutput5, functional1.addStar(input5));

        List<String> expectedOutput6 = new ArrayList<String>();
        Collections.addAll(expectedOutput6, new String[] { "empty*", "string*", "*" });
        List<String> input6 = new ArrayList<String>();
        Collections.addAll(input6, new String[] { "empty", "string", "" });
        assertEquals(expectedOutput6, functional1.addStar(input6));
    }

    @Disabled
    @Test
    public void copies3() {

        List<String> expectedOutput1 = new ArrayList<String>();
        Collections.addAll(expectedOutput1, new String[] { "aaa", "bbbbbb", "ccccccccc" });
        List<String> input1 = new ArrayList<String>();
        Collections.addAll(input1, new String[] { "a", "bb", "ccc" });
        assertEquals(expectedOutput1, functional1.copies3(input1));

        List<String> expectedOutput2 = new ArrayList<String>();
        Collections.addAll(expectedOutput2, new String[] { "242424", "aaa", "" });
        List<String> input2 = new ArrayList<String>();
        Collections.addAll(input2, new String[] { "24", "a", "" });
        assertEquals(expectedOutput2, functional1.copies3(input2));

        List<String> expectedOutput3 = new ArrayList<String>();
        Collections.addAll(expectedOutput3, new String[] { "hellohellohello", "theretherethere" });
        List<String> input3 = new ArrayList<String>();
        Collections.addAll(input3, new String[] { "hello", "there" });
        assertEquals(expectedOutput3, functional1.copies3(input3));

        List<String> expectedOutput4 = new ArrayList<String>();
        Collections.addAll(expectedOutput4, new String[] { "nonono" });
        List<String> input4 = new ArrayList<String>();
        Collections.addAll(input4, new String[] { "no" });
        assertEquals(expectedOutput4, functional1.copies3(input4));

        List<String> expectedOutput5 = new ArrayList<String>();
        Collections.addAll(expectedOutput5, new String[] {});
        List<String> input5 = new ArrayList<String>();
        Collections.addAll(input5, new String[] {});
        assertEquals(expectedOutput5, functional1.copies3(input5));

        List<String> expectedOutput6 = new ArrayList<String>();
        Collections.addAll(expectedOutput6, new String[] { "thisthisthis", "andandand", "thatthatthat", "andandand" });
        List<String> input6 = new ArrayList<String>();
        Collections.addAll(input6, new String[] { "this", "and", "that", "and" });
        assertEquals(expectedOutput6, functional1.copies3(input6));
    }

    @Disabled
    @Test
    public void moreY() {

        List<String> expectedOutput1 = new ArrayList<String>();
        Collections.addAll(expectedOutput1, new String[] { "yay", "yby", "ycy" });
        List<String> input1 = new ArrayList<String>();
        Collections.addAll(input1, new String[] { "a", "b", "c" });
        assertEquals(expectedOutput1, functional1.moreY(input1));

        List<String> expectedOutput2 = new ArrayList<String>();
        Collections.addAll(expectedOutput2, new String[] { "yhelloy", "ytherey" });
        List<String> input2 = new ArrayList<String>();
        Collections.addAll(input2, new String[] { "hello", "there" });
        assertEquals(expectedOutput2, functional1.moreY(input2));

        List<String> expectedOutput3 = new ArrayList<String>();
        Collections.addAll(expectedOutput3, new String[] { "yyayy" });
        List<String> input3 = new ArrayList<String>();
        Collections.addAll(input3, new String[] { "yay" });
        assertEquals(expectedOutput3, functional1.moreY(input3));

        List<String> expectedOutput4 = new ArrayList<String>();
        Collections.addAll(expectedOutput4, new String[] { "yy", "yay", "yxxy" });
        List<String> input4 = new ArrayList<String>();
        Collections.addAll(input4, new String[] { "", "a", "xx" });
        assertEquals(expectedOutput4, functional1.moreY(input4));

        List<String> expectedOutput5 = new ArrayList<String>();
        Collections.addAll(expectedOutput5, new String[] {});
        List<String> input5 = new ArrayList<String>();
        Collections.addAll(input5, new String[] {});
        assertEquals(expectedOutput5, functional1.moreY(input5));

        List<String> expectedOutput6 = new ArrayList<String>();
        Collections.addAll(expectedOutput6, new String[] { "yxxy", "yyyy", "yzzy" });
        List<String> input6 = new ArrayList<String>();
        Collections.addAll(input6, new String[] { "xx", "yy", "zz" });
        assertEquals(expectedOutput6, functional1.moreY(input6));
    }

    @Disabled
    @Test
    public void math1() {

        List<Integer> expectedOutput1 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput1, new Integer[] { 20, 30, 40 });
        List<Integer> input1 = new ArrayList<Integer>();
        Collections.addAll(input1, new Integer[] { 1, 2, 3 });
        assertEquals(expectedOutput1, functional1.math1(input1));

        List<Integer> expectedOutput2 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput2, new Integer[] { 70, 90, 70, 90, 20 });
        List<Integer> input2 = new ArrayList<Integer>();
        Collections.addAll(input2, new Integer[] { 6, 8, 6, 8, 1 });
        assertEquals(expectedOutput2, functional1.math1(input2));

        List<Integer> expectedOutput3 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput3, new Integer[] { 110 });
        List<Integer> input3 = new ArrayList<Integer>();
        Collections.addAll(input3, new Integer[] { 10 });
        assertEquals(expectedOutput3, functional1.math1(input3));

        List<Integer> expectedOutput4 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput4, new Integer[] {});
        List<Integer> input4 = new ArrayList<Integer>();
        Collections.addAll(input4, new Integer[] {});
        assertEquals(expectedOutput4, functional1.math1(input4));

        List<Integer> expectedOutput5 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput5, new Integer[] { 60, 110 });
        List<Integer> input5 = new ArrayList<Integer>();
        Collections.addAll(input5, new Integer[] { 5, 10 });
        assertEquals(expectedOutput5, functional1.math1(input5));

        List<Integer> expectedOutput6 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput6, new Integer[] { 0, -10, -20, -10, 0 });
        List<Integer> input6 = new ArrayList<Integer>();
        Collections.addAll(input6, new Integer[] { -1, -2, -3, -2, -1 });
        assertEquals(expectedOutput6, functional1.math1(input6));

        List<Integer> expectedOutput7 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput7, new Integer[] { 70, -20, 130, 240, 50, 20, 200, 120, 30, 40, 30 });
        List<Integer> input7 = new ArrayList<Integer>();
        Collections.addAll(input7, new Integer[] { 6, -3, 12, 23, 4, 1, 19, 11, 2, 3, 2 });
        assertEquals(expectedOutput7, functional1.math1(input7));
    }

    @Disabled
    @Test
    public void rightDigit() {

        List<Integer> expectedOutput1 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput1, new Integer[] { 1, 2, 3 });
        List<Integer> input1 = new ArrayList<Integer>();
        Collections.addAll(input1, new Integer[] { 1, 22, 93 });
        assertEquals(expectedOutput1, functional1.rightDigit(input1));

        List<Integer> expectedOutput2 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput2, new Integer[] { 6, 8, 6, 8, 1 });
        List<Integer> input2 = new ArrayList<Integer>();
        Collections.addAll(input2, new Integer[] { 16, 8, 886, 8, 1 });
        assertEquals(expectedOutput2, functional1.rightDigit(input2));

        List<Integer> expectedOutput3 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput3, new Integer[] { 0, 0 });
        List<Integer> input3 = new ArrayList<Integer>();
        Collections.addAll(input3, new Integer[] { 10, 0 });
        assertEquals(expectedOutput3, functional1.rightDigit(input3));

        List<Integer> expectedOutput4 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput4, new Integer[] {});
        List<Integer> input4 = new ArrayList<Integer>();
        Collections.addAll(input4, new Integer[] {});
        assertEquals(expectedOutput4, functional1.rightDigit(input4));

        List<Integer> expectedOutput5 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput5, new Integer[] { 5, 0 });
        List<Integer> input5 = new ArrayList<Integer>();
        Collections.addAll(input5, new Integer[] { 5, 10 });
        assertEquals(expectedOutput5, functional1.rightDigit(input5));

        List<Integer> expectedOutput6 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput6, new Integer[] { 5, 0, 0, 0, 0 });
        List<Integer> input6 = new ArrayList<Integer>();
        Collections.addAll(input6, new Integer[] { 5, 50, 500, 5000, 5000 });
        assertEquals(expectedOutput6, functional1.rightDigit(input6));

        List<Integer> expectedOutput7 = new ArrayList<Integer>();
        Collections.addAll(expectedOutput7, new Integer[] { 6, 3, 2, 3, 4, 1, 9, 9, 2, 3, 2 });
        List<Integer> input7 = new ArrayList<Integer>();
        Collections.addAll(input7, new Integer[] { 6, 23, 12, 23, 4, 1, 19, 1119, 2, 3, 2 });
        assertEquals(expectedOutput7, functional1.rightDigit(input7));
    }

    @Disabled
    @Test
    public void lower() {

        List<String> expectedOutput1 = new ArrayList<String>();
        Collections.addAll(expectedOutput1, new String[] { "hello", "hi" });
        List<String> input1 = new ArrayList<String>();
        Collections.addAll(input1, new String[] { "Hello", "Hi" });
        assertEquals(expectedOutput1, functional1.lower(input1));

        List<String> expectedOutput2 = new ArrayList<String>();
        Collections.addAll(expectedOutput2, new String[] { "aaa", "bbb", "ccc" });
        List<String> input2 = new ArrayList<String>();
        Collections.addAll(input2, new String[] { "AAA", "BBB", "ccc" });
        assertEquals(expectedOutput2, functional1.lower(input2));

        List<String> expectedOutput3 = new ArrayList<String>();
        Collections.addAll(expectedOutput3, new String[] { "kitten", "chocolate" });
        List<String> input3 = new ArrayList<String>();
        Collections.addAll(input3, new String[] { "KitteN", "ChocolaTE" });
        assertEquals(expectedOutput3, functional1.lower(input3));

        List<String> expectedOutput4 = new ArrayList<String>();
        Collections.addAll(expectedOutput4, new String[] {});
        List<String> input4 = new ArrayList<String>();
        Collections.addAll(input4, new String[] {});
        assertEquals(expectedOutput4, functional1.lower(input4));

        List<String> expectedOutput5 = new ArrayList<String>();
        Collections.addAll(expectedOutput5, new String[] { "empty", "" });
        List<String> input5 = new ArrayList<String>();
        Collections.addAll(input5, new String[] { "EMPTY", "" });
        assertEquals(expectedOutput5, functional1.lower(input5));

        List<String> expectedOutput6 = new ArrayList<String>();
        Collections.addAll(expectedOutput6, new String[] { "aax", "byb", "ycc", "zzz" });
        List<String> input6 = new ArrayList<String>();
        Collections.addAll(input6, new String[] { "aaX", "bYb", "Ycc", "ZZZ" });
        assertEquals(expectedOutput6, functional1.lower(input6));
    }

    @Disabled
    @Test
    public void noX() {

        List<String> expectedOutput1 = new ArrayList<String>();
        Collections.addAll(expectedOutput1, new String[] { "a", "bb", "c" });
        List<String> input1 = new ArrayList<String>();
        Collections.addAll(input1, new String[] { "ax", "bb", "cx" });
        assertEquals(expectedOutput1, functional1.noX(input1));

        List<String> expectedOutput2 = new ArrayList<String>();
        Collections.addAll(expectedOutput2, new String[] { "a", "bb", "c" });
        List<String> input2 = new ArrayList<String>();
        Collections.addAll(input2, new String[] { "xxax", "xbxbx", "xxcx" });
        assertEquals(expectedOutput2, functional1.noX(input2));

        List<String> expectedOutput3 = new ArrayList<String>();
        Collections.addAll(expectedOutput3, new String[] { "" });
        List<String> input3 = new ArrayList<String>();
        Collections.addAll(input3, new String[] { "x" });
        assertEquals(expectedOutput3, functional1.noX(input3));

        List<String> expectedOutput4 = new ArrayList<String>();
        Collections.addAll(expectedOutput4, new String[] { "" });
        List<String> input4 = new ArrayList<String>();
        Collections.addAll(input4, new String[] { "" });
        assertEquals(expectedOutput4, functional1.noX(input4));

        List<String> expectedOutput5 = new ArrayList<String>();
        Collections.addAll(expectedOutput5, new String[] {});
        List<String> input5 = new ArrayList<String>();
        Collections.addAll(input5, new String[] {});
        assertEquals(expectedOutput5, functional1.noX(input5));

        List<String> expectedOutput6 = new ArrayList<String>();
        Collections.addAll(expectedOutput6, new String[] { "the", "tai" });
        List<String> input6 = new ArrayList<String>();
        Collections.addAll(input6, new String[] { "the", "taxi" });
        assertEquals(expectedOutput6, functional1.noX(input6));

        List<String> expectedOutput7 = new ArrayList<String>();
        Collections.addAll(expectedOutput7, new String[] { "the", "tai" });
        List<String> input7 = new ArrayList<String>();
        Collections.addAll(input7, new String[] { "the", "xxtxaxixxx" });
        assertEquals(expectedOutput7, functional1.noX(input7));

        List<String> expectedOutput8 = new ArrayList<String>();
        Collections.addAll(expectedOutput8, new String[] { "this", "is", "the", "" });
        List<String> input8 = new ArrayList<String>();
        Collections.addAll(input8, new String[] { "this", "is", "the", "x" });
        assertEquals(expectedOutput8, functional1.noX(input8));
    }

}