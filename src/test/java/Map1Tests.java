
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class Map1Tests {

    Map1 map1 = new Map1();
    Map<String, String> input = null;
    Map<String, String> expectedOutput = null;

    @Disabled
    @Test
    public void mapBully() {

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "");
        expectedOutput.put("b", "candy");
        input = new HashMap<String, String>();
        input.put("a", "candy");
        input.put("b", "dirt");
        assertEquals(expectedOutput, map1.mapBully(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "");
        expectedOutput.put("b", "candy");
        input = new HashMap<String, String>();
        input.put("a", "candy");
        assertEquals(expectedOutput, map1.mapBully(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "");
        expectedOutput.put("b", "candy");
        expectedOutput.put("c", "meh");
        input = new HashMap<String, String>();
        input.put("a", "candy");
        input.put("b", "carrot");
        input.put("c", "meh");
        assertEquals(expectedOutput, map1.mapBully(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("b", "carrot");
        input = new HashMap<String, String>();
        input.put("b", "carrot");
        assertEquals(expectedOutput, map1.mapBully(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("c", "meh");
        input = new HashMap<String, String>();
        input.put("c", "meh");
        assertEquals(expectedOutput, map1.mapBully(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "");
        expectedOutput.put("b", "sparkle");
        expectedOutput.put("c", "meh");
        input = new HashMap<String, String>();
        input.put("a", "sparkle");
        input.put("c", "meh");
        assertEquals(expectedOutput, map1.mapBully(input));
    }

    @Disabled
    @Test
    public void mapShare() {

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "aaa");
        expectedOutput.put("b", "aaa");
        input = new HashMap<String, String>();
        input.put("a", "aaa");
        input.put("b", "bbb");
        input.put("c", "ccc");
        assertEquals(expectedOutput, map1.mapShare(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("b", "xyz");
        input = new HashMap<String, String>();
        input.put("b", "xyz");
        input.put("c", "ccc");
        assertEquals(expectedOutput, map1.mapShare(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "aaa");
        expectedOutput.put("b", "aaa");
        expectedOutput.put("d", "hi");
        input = new HashMap<String, String>();
        input.put("a", "aaa");
        input.put("c", "meh");
        input.put("d", "hi");
        assertEquals(expectedOutput, map1.mapShare(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "xyz");
        expectedOutput.put("b", "xyz");
        expectedOutput.put("z", "zzz");
        input = new HashMap<String, String>();
        input.put("a", "xyz");
        input.put("b", "1234");
        input.put("c", "yo");
        input.put("z", "zzz");
        assertEquals(expectedOutput, map1.mapShare(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "xyz");
        expectedOutput.put("b", "xyz");
        expectedOutput.put("d", "ddd");
        expectedOutput.put("e", "everything");
        input = new HashMap<String, String>();
        input.put("a", "xyz");
        input.put("b", "1234");
        input.put("c", "yo");
        input.put("d", "ddd");
        input.put("e", "everything");
        assertEquals(expectedOutput, map1.mapShare(input));
    }

    @Disabled
    @Test
    public void mapAB() {

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "Hi");
        expectedOutput.put("ab", "HiThere");
        expectedOutput.put("b", "There");
        input = new HashMap<String, String>();
        input.put("a", "Hi");
        input.put("b", "There");
        assertEquals(expectedOutput, map1.mapAB(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "Hi");
        input = new HashMap<String, String>();
        input.put("a", "Hi");
        assertEquals(expectedOutput, map1.mapAB(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("b", "There");
        input = new HashMap<String, String>();
        input.put("b", "There");
        assertEquals(expectedOutput, map1.mapAB(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("c", "meh");
        input = new HashMap<String, String>();
        input.put("c", "meh");
        assertEquals(expectedOutput, map1.mapAB(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "aaa");
        expectedOutput.put("ab", "aaabbb");
        expectedOutput.put("b", "bbb");
        expectedOutput.put("c", "ccc");
        input = new HashMap<String, String>();
        input.put("a", "aaa");
        input.put("ab", "nope");
        input.put("b", "bbb");
        input.put("c", "ccc");
        assertEquals(expectedOutput, map1.mapAB(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("ab", "nope");
        expectedOutput.put("b", "bbb");
        expectedOutput.put("c", "ccc");
        input = new HashMap<String, String>();
        input.put("ab", "nope");
        input.put("b", "bbb");
        input.put("c", "ccc");
        assertEquals(expectedOutput, map1.mapAB(input));
    }

    @Disabled
    @Test
    public void topping1() {

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("bread", "butter");
        expectedOutput.put("ice cream", "cherry");
        input = new HashMap<String, String>();
        input.put("ice cream", "peanuts");
        assertEquals(expectedOutput, map1.topping1(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("bread", "butter");
        input = new HashMap<String, String>();
        assertEquals(expectedOutput, map1.topping1(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("bread", "butter");
        expectedOutput.put("pancake", "syrup");
        input = new HashMap<String, String>();
        input.put("pancake", "syrup");
        assertEquals(expectedOutput, map1.topping1(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("bread", "butter");
        expectedOutput.put("ice cream", "cherry");
        input = new HashMap<String, String>();
        input.put("bread", "dirt");
        input.put("ice cream", "strawberries");
        assertEquals(expectedOutput, map1.topping1(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("bread", "butter");
        expectedOutput.put("ice cream", "cherry");
        expectedOutput.put("salad", "oil");
        input = new HashMap<String, String>();
        input.put("bread", "jam");
        input.put("ice cream", "strawberries");
        input.put("salad", "oil");
        assertEquals(expectedOutput, map1.topping1(input));
    }

    @Disabled
    @Test
    public void topping2() {

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("yogurt", "cherry");
        expectedOutput.put("ice cream", "cherry");
        input = new HashMap<String, String>();
        input.put("ice cream", "cherry");
        assertEquals(expectedOutput, map1.topping2(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("yogurt", "cherry");
        expectedOutput.put("spinach", "nuts");
        expectedOutput.put("ice cream", "cherry");
        input = new HashMap<String, String>();
        input.put("spinach", "dirt");
        input.put("ice cream", "cherry");
        assertEquals(expectedOutput, map1.topping2(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("yogurt", "salt");
        input = new HashMap<String, String>();
        input.put("yogurt", "salt");
        assertEquals(expectedOutput, map1.topping2(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("yogurt", "salt");
        expectedOutput.put("bread", "butter");
        input = new HashMap<String, String>();
        input.put("yogurt", "salt");
        input.put("bread", "butter");
        assertEquals(expectedOutput, map1.topping2(input));

        expectedOutput = new HashMap<String, String>();
        input = new HashMap<String, String>();
        assertEquals(expectedOutput, map1.topping2(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("yogurt", "air");
        expectedOutput.put("ice cream", "air");
        expectedOutput.put("salad", "oil");
        input = new HashMap<String, String>();
        input.put("ice cream", "air");
        input.put("salad", "oil");
        assertEquals(expectedOutput, map1.topping2(input));
    }

    @Disabled
    @Test
    public void topping3() {

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("potato", "ketchup");
        expectedOutput.put("fries", "ketchup");
        input = new HashMap<String, String>();
        input.put("potato", "ketchup");
        assertEquals(expectedOutput, map1.topping3(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("potato", "butter");
        expectedOutput.put("fries", "butter");
        input = new HashMap<String, String>();
        input.put("potato", "butter");
        assertEquals(expectedOutput, map1.topping3(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("spinach", "oil");
        expectedOutput.put("salad", "oil");
        expectedOutput.put("potato", "ketchup");
        expectedOutput.put("fries", "ketchup");
        input = new HashMap<String, String>();
        input.put("salad", "oil");
        input.put("potato", "ketchup");
        assertEquals(expectedOutput, map1.topping3(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("toast", "butter");
        expectedOutput.put("spinach", "oil");
        expectedOutput.put("salad", "oil");
        expectedOutput.put("potato", "ketchup");
        expectedOutput.put("fries", "ketchup");
        input = new HashMap<String, String>();
        input.put("toast", "butter");
        input.put("salad", "oil");
        input.put("potato", "ketchup");
        assertEquals(expectedOutput, map1.topping3(input));

        expectedOutput = new HashMap<String, String>();
        input = new HashMap<String, String>();
        assertEquals(expectedOutput, map1.topping3(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("spinach", "pepper");
        expectedOutput.put("salad", "pepper");
        expectedOutput.put("fries", "salt");
        input = new HashMap<String, String>();
        input.put("salad", "pepper");
        input.put("fries", "salt");
        assertEquals(expectedOutput, map1.topping3(input));
    }

    @Disabled
    @Test
    public void mapAB2() {

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("c", "cake");
        input = new HashMap<String, String>();
        input.put("a", "aaa");
        input.put("b", "aaa");
        input.put("c", "cake");
        assertEquals(expectedOutput, map1.mapAB2(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "aaa");
        expectedOutput.put("b", "bbb");
        input = new HashMap<String, String>();
        input.put("a", "aaa");
        input.put("b", "bbb");
        assertEquals(expectedOutput, map1.mapAB2(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "aaa");
        expectedOutput.put("b", "bbb");
        expectedOutput.put("c", "aaa");
        input = new HashMap<String, String>();
        input.put("a", "aaa");
        input.put("b", "bbb");
        input.put("c", "aaa");
        assertEquals(expectedOutput, map1.mapAB2(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "aaa");
        input = new HashMap<String, String>();
        input.put("a", "aaa");
        assertEquals(expectedOutput, map1.mapAB2(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("b", "bbb");
        input = new HashMap<String, String>();
        input.put("b", "bbb");
        assertEquals(expectedOutput, map1.mapAB2(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("c", "ccc");
        input = new HashMap<String, String>();
        input.put("a", "");
        input.put("b", "");
        input.put("c", "ccc");
        assertEquals(expectedOutput, map1.mapAB2(input));

        expectedOutput = new HashMap<String, String>();
        input = new HashMap<String, String>();
        assertEquals(expectedOutput, map1.mapAB2(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "a");
        expectedOutput.put("b", "b");
        expectedOutput.put("z", "zebra");
        input = new HashMap<String, String>();
        input.put("a", "a");
        input.put("b", "b");
        input.put("z", "zebra");
        assertEquals(expectedOutput, map1.mapAB2(input));
    }

    @Disabled
    @Test
    public void mapAB3() {

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "aaa");
        expectedOutput.put("b", "aaa");
        expectedOutput.put("c", "cake");
        input = new HashMap<String, String>();
        input.put("a", "aaa");
        input.put("c", "cake");
        assertEquals(expectedOutput, map1.mapAB3(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "bbb");
        expectedOutput.put("b", "bbb");
        expectedOutput.put("c", "cake");
        input = new HashMap<String, String>();
        input.put("b", "bbb");
        input.put("c", "cake");
        assertEquals(expectedOutput, map1.mapAB3(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "aaa");
        expectedOutput.put("b", "bbb");
        expectedOutput.put("c", "cake");
        input = new HashMap<String, String>();
        input.put("a", "aaa");
        input.put("b", "bbb");
        input.put("c", "cake");
        assertEquals(expectedOutput, map1.mapAB3(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("ccc", "ccc");
        input = new HashMap<String, String>();
        input.put("ccc", "ccc");
        assertEquals(expectedOutput, map1.mapAB3(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("c", "a");
        expectedOutput.put("d", "b");
        input = new HashMap<String, String>();
        input.put("c", "a");
        input.put("d", "b");
        assertEquals(expectedOutput, map1.mapAB3(input));

        expectedOutput = new HashMap<String, String>();
        input = new HashMap<String, String>();
        assertEquals(expectedOutput, map1.mapAB3(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "");
        expectedOutput.put("b", "");
        input = new HashMap<String, String>();
        input.put("a", "");
        assertEquals(expectedOutput, map1.mapAB3(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "");
        expectedOutput.put("b", "");
        input = new HashMap<String, String>();
        input.put("b", "");
        assertEquals(expectedOutput, map1.mapAB3(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "");
        expectedOutput.put("b", "");
        input = new HashMap<String, String>();
        input.put("a", "");
        input.put("b", "");
        assertEquals(expectedOutput, map1.mapAB3(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("aa", "aa");
        expectedOutput.put("a", "apple");
        expectedOutput.put("b", "apple");
        expectedOutput.put("z", "zzz");
        input = new HashMap<String, String>();
        input.put("aa", "aa");
        input.put("a", "apple");
        input.put("z", "zzz");
        assertEquals(expectedOutput, map1.mapAB3(input));
    }

    @Disabled
    @Test
    public void mapAB4() {

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "aaa");
        expectedOutput.put("b", "bb");
        expectedOutput.put("c", "aaa");
        input = new HashMap<String, String>();
        input.put("a", "aaa");
        input.put("b", "bb");
        input.put("c", "cake");
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "aa");
        expectedOutput.put("b", "bbb");
        expectedOutput.put("c", "bbb");
        input = new HashMap<String, String>();
        input.put("a", "aa");
        input.put("b", "bbb");
        input.put("c", "cake");
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "aa");
        expectedOutput.put("b", "bbb");
        expectedOutput.put("c", "bbb");
        input = new HashMap<String, String>();
        input.put("a", "aa");
        input.put("b", "bbb");
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "aaa");
        input = new HashMap<String, String>();
        input.put("a", "aaa");
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("b", "bbb");
        input = new HashMap<String, String>();
        input.put("b", "bbb");
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "");
        expectedOutput.put("b", "");
        expectedOutput.put("c", "cake");
        input = new HashMap<String, String>();
        input.put("a", "aaa");
        input.put("b", "bbb");
        input.put("c", "cake");
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "");
        expectedOutput.put("b", "");
        expectedOutput.put("c", "cake");
        input = new HashMap<String, String>();
        input.put("a", "a");
        input.put("b", "b");
        input.put("c", "cake");
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "");
        expectedOutput.put("b", "b");
        expectedOutput.put("c", "b");
        input = new HashMap<String, String>();
        input.put("a", "");
        input.put("b", "b");
        input.put("c", "cake");
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "a");
        expectedOutput.put("b", "");
        expectedOutput.put("c", "a");
        input = new HashMap<String, String>();
        input.put("a", "a");
        input.put("b", "");
        input.put("c", "cake");
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("c", "cat");
        expectedOutput.put("d", "dog");
        input = new HashMap<String, String>();
        input.put("c", "cat");
        input.put("d", "dog");
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("ccc", "ccc");
        input = new HashMap<String, String>();
        input.put("ccc", "ccc");
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("c", "a");
        expectedOutput.put("d", "b");
        input = new HashMap<String, String>();
        input.put("c", "a");
        input.put("d", "b");
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        input = new HashMap<String, String>();
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("a", "");
        expectedOutput.put("z", "z");
        input = new HashMap<String, String>();
        input.put("a", "");
        input.put("z", "z");
        assertEquals(expectedOutput, map1.mapAB4(input));

        expectedOutput = new HashMap<String, String>();
        expectedOutput.put("b", "");
        expectedOutput.put("z", "z");
        input = new HashMap<String, String>();
        input.put("b", "");
        input.put("z", "z");
        assertEquals(expectedOutput, map1.mapAB4(input));
    }

}
