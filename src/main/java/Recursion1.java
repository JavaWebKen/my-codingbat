
public class Recursion1 {
    // url :: https://codingbat.com/java/Recursion-1

    // url :: https://codingbat.com/prob/p154669
    /*
     * Statement :: Given n of 1 or more, return the factorial of n, which is n *
     * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
     */
    public int factorial(int n) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p183649
    /*
     * Statement :: We have a number of bunnies and each bunny has two big floppy
     * ears. We want to compute the total number of ears across all the bunnies
     * recursively (without loops or multiplication).
     */
    public int bunnyEars(int bunnies) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p120015
    /*
     * Statement :: The fibonacci sequence is a famous bit of mathematics, and it
     * happens to have a recursive definition. The first two values in the sequence
     * are 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of
     * the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
     * 21 and so on. Define a recursive fibonacci(n) method that returns the nth
     * fibonacci number, with n=0 representing the start of the sequence.
     */
    public int fibonacci(int n) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p107330
    /*
     * Statement :: We have bunnies standing in a line, numbered 1, 2, ... The odd
     * bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll
     * say have 3 ears, because they each have a raised foot. Recursively return the
     * number of "ears" in the bunny line 1, 2, ... n (without loops or
     * multiplication).
     */
    public int bunnyEars2(int bunnies) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p194781
    /*
     * Statement :: We have triangle made of blocks. The topmost row has 1 block,
     * the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute
     * recursively (no loops or multiplication) the total number of blocks in such a
     * triangle with the given number of rows.
     */
    public int triangle(int rows) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p163932
    /*
     * Statement :: Given a non-negative int n, return the sum of its digits
     * recursively (no loops). Note that mod (%) by 10 yields the rightmost digit
     * (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10
     * is 12).
     */
    public int sumDigits(int n) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p101409
    /*
     * Statement :: Given a non-negative int n, return the count of the occurrences
     * of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%)
     * by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
     * removes the rightmost digit (126 / 10 is 12).
     */
    public int count7(int n) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p192383
    /*
     * Statement :: Given a non-negative int n, compute recursively (no loops) the
     * count of the occurrences of 8 as a digit, except that an 8 with another 8
     * immediately to its left counts double, so 8818 yields 4. Note that mod (%) by
     * 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes
     * the rightmost digit (126 / 10 is 12).
     */
    public int count8(int n) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p158888
    /*
     * Statement :: Given base and n that are both 1 or more, compute recursively
     * (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3
     * squared).
     */
    public int powerN(int base, int n) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p170371
    /*
     * Statement :: Given a string, compute recursively (no loops) the number of
     * lowercase 'x' chars in the string.
     */
    public int countX(String str) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p184029
    /*
     * Statement :: Given a string, compute recursively (no loops) the number of
     * times lowercase "hi" appears in the string.
     */
    public int countHi(String str) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p101372
    /*
     * Statement :: Given a string, compute recursively (no loops) a new string
     * where all the lowercase 'x' chars have been changed to 'y' chars.
     */
    public String changeXY(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p170924
    /*
     * Statement :: Given a string, compute recursively (no loops) a new string
     * where all appearances of "pi" have been replaced by "3.14".
     */
    public String changePi(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p118230
    /*
     * Statement :: Given a string, compute recursively a new string where all the
     * 'x' chars have been removed.
     */
    public String noX(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p108997
    /*
     * Statement :: Given an array of ints, compute recursively if the array
     * contains a 6. We'll use the convention of considering only the part of the
     * array that begins at the given index. In this way, a recursive call can pass
     * index+1 to move down the array. The initial call will pass in index as 0.
     */
    public boolean array6(int[] nums, int index) {
        return false;
    }

    // url :: https://codingbat.com/prob/p135988
    /*
     * Statement :: Given an array of ints, compute recursively the number of times
     * that the value 11 appears in the array. We'll use the convention of
     * considering only the part of the array that begins at the given index. In
     * this way, a recursive call can pass index+1 to move down the array. The
     * initial call will pass in index as 0.
     */
    public int array11(int[] nums, int index) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p173469
    /*
     * Statement :: Given an array of ints, compute recursively if the array
     * contains somewhere a value followed in the array by that value times 10.
     * We'll use the convention of considering only the part of the array that
     * begins at the given index. In this way, a recursive call can pass index+1 to
     * move down the array. The initial call will pass in index as 0.
     */
    public boolean array220(int[] nums, int index) {
        return false;
    }

    // url :: https://codingbat.com/prob/p183394
    /*
     * Statement :: Given a string, compute recursively a new string where all the
     * adjacent chars are now separated by a "*".
     */
    public String allStar(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p158175
    /*
     * Statement :: Given a string, compute recursively a new string where identical
     * chars that are adjacent in the original string are separated from each other
     * by a "*".
     */
    public String pairStar(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p105722
    /*
     * Statement :: Given a string, compute recursively a new string where all the
     * lowercase 'x' chars have been moved to the end of the string.
     */
    public String endX(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p154048
    /*
     * Statement :: We'll say that a "pair" in a string is two instances of a char
     * separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so
     * "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the
     * number of pairs in the given string.
     */
    public int countPairs(String str) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p161124
    /*
     * Statement :: Count recursively the total number of "abc" and "aba" substrings
     * that appear in the given string.
     */
    public int countAbc(String str) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p167015
    /*
     * Statement :: Given a string, compute recursively (no loops) the number of
     * "11" substrings in the string. The "11" substrings should not overlap.
     */
    public int count11(String str) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p104029
    /*
     * Statement :: Given a string, return recursively a "cleaned" string where
     * adjacent chars that are the same have been reduced to a single char. So
     * "yyzzza" yields "yza".
     */
    public String stringClean(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p143900
    /*
     * Statement :: Given a string, compute recursively the number of times
     * lowercase "hi" appears in the string, however do not count "hi" that have an
     * 'x' immedately before them.
     */
    public int countHi2(String str) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p137918
    /*
     * Statement :: Given a string that contains a single pair of parenthesis,
     * compute recursively a new string made of only of the parenthesis and their
     * contents, so "xyz(abc)123" yields "(abc)".
     */
    public String parenBit(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p183174
    /*
     * Statement :: Given a string, return true if it is a nesting of zero or more
     * pairs of parenthesis, like "(())" or "((()))". Suggestion: check the first
     * and last chars, and then recur on what's inside them.
     */
    public boolean nestParen(String str) {
        return false;
    }

    // url :: https://codingbat.com/prob/p186177
    /*
     * Statement :: Given a string and a non-empty substring sub, compute
     * recursively the number of times that sub appears in the string, without the
     * sub strings overlapping.
     */
    public int strCount(String str, String sub) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p118182
    /*
     * Statement :: Given a string and a non-empty substring sub, compute
     * recursively if at least n copies of sub appear in the string somewhere,
     * possibly with overlapping. N will be non-negative.
     */
    public boolean strCopies(String str, String sub, int n) {
        return false;
    }

    // url :: https://codingbat.com/prob/p195413
    /*
     * Statement :: Given a string and a non-empty substring sub, compute
     * recursively the largest substring which starts and ends with sub and return
     * its length.
     */
    public int strDist(String str, String sub) {
        return 0;
    }

}
