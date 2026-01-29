public class Warmup1 {
    // url :: https://codingbat.com/java/Warmup-1

    // url :: https://codingbat.com/prob/p187868
    /*
     * Statement :: The parameter weekday is true if it is a weekday, and the
     * parameter vacation is true if we are on vacation. We sleep in if it is not a
     * weekday or we're on vacation. Return true if we sleep in.
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }

    // url :: https://codingbat.com/prob/p181646
    /*
     * Statement :: We have two monkeys, a and b, and the parameters aSmile and
     * bSmile indicate if each is smiling. We are in trouble if they are both
     * smiling or if neither of them is smiling. Return true if we are in trouble.
     */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        return (aSmile == bSmile);
    }

    // url :: https://codingbat.com/prob/p154485
    /*
     * Statement :: Given two int values, return their sum. Unless the two values
     * are the same, then return double their sum.
     */
    public int sumDouble(int a, int b) {

        int sum = a + b;

        if (a == b) {
            return sum * 2;
        }
        return sum;
    }

    // url :: https://codingbat.com/prob/p116624
    /*
     * Statement :: Given an int n, return the absolute difference between n and 21,
     * except return double the absolute difference if n is over 21.
     */
    public int diff21(int n) {

        int diff = Math.abs(n - 21);

        return (n > 21) ? diff * 2 : diff;

    }

    // url :: https://codingbat.com/prob/p140449
    /*
     * Statement :: We have a loud talking parrot. The "hour" parameter is the
     * current hour time in the range 0..23. We are in trouble if the parrot is
     * talking and the hour is before 7 or after 20. Return true if we are in
     * trouble.
     */
    public boolean parrotTrouble(boolean talking, int hour) {

        return talking && (hour < 7 || hour > 20);
    }

    // url :: https://codingbat.com/prob/p182873
    /*
     * Statement :: Given 2 ints, a and b, return true if one if them is 10 or if
     * their sum is 10.
     */
    public boolean makes10(int a, int b) {

        int sum = a + b ;

        return a == 10 || b == 10 || sum == 10;
    }

    // url :: https://codingbat.com/prob/p184004
    /*
     * Statement :: Given an int n, return true if it is within 10 of 100 or 200.
     * Note: Math.abs(num) computes the absolute value of a number.
     */
    public boolean nearHundred(int n) {
      //  int diff100 = Math.abs(n - 100);
      //  int diff200 = Math.abs(n - 200);

      //  return diff100 <= 10 || diff200 <= 10;

        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;


    }

    // url :: https://codingbat.com/prob/p159227
    /*
     * Statement :: Given 2 int values, return true if one is negative and one is
     * positive. Except if the parameter "negative" is true, then return true only
     * if both are negative.
     */
    public boolean posNeg(int a, int b, boolean negative) {

        if (negative) {
            return a < 0 && b < 0;
        }

        return (a < 0 && b > 0) || (a > 0 && b < 0);


    }

    // url :: https://codingbat.com/prob/p191914
    /*
     * Statement :: Given a string, return a new string where "not " has been added
     * to the front. However, if the string already begins with "not", return the
     * string unchanged. Note: use .equals() to compare 2 strings.
     */
    public String notString(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p190570
    /*
     * Statement :: Given a non-empty string and an int n, return a new string where
     * the char at index n has been removed. The value of n will be a valid index of
     * a char in the original string (i.e. n will be in the range 0..str.length()-1
     * inclusive).
     */
    public String missingChar(String str, int n) {
        return null;
    }

    // url :: https://codingbat.com/prob/p123384
    /*
     * Statement :: Given a string, return a new string where the first and last
     * chars have been exchanged.
     */
    public String frontBack(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p136351
    /*
     * Statement :: Given a string, we'll say that the front is the first 3 chars of
     * the string. If the string length is less than 3, the front is whatever is
     * there. Return a new string which is 3 copies of the front.
     */
    public String front3(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p161642
    /*
     * Statement :: Given a string, take the last char and return a new string with
     * the last char added at the front and back, so "cat" yields "tcatt". The
     * original string will be length 1 or more.
     */
    public String backAround(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p112564
    /*
     * Statement :: Return true if the given non-negative number is a multiple of 3
     * or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod
     */
    public boolean or35(int n) {
        return false;
    }

    // url :: https://codingbat.com/prob/p183592
    /*
     * Statement :: Given a string, take the first 2 chars and return the string
     * with the 2 chars added at both the front and back, so "kitten"
     * yields"kikittenki". If the string length is less than 2, use whatever chars
     * are there.
     */
    public String front22(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p191022
    /*
     * Statement :: Given a string, return true if the string starts with "hi" and
     * false otherwise.
     */
    public boolean startHi(String str) {
        return false;
    }

    // url :: https://codingbat.com/prob/p192082
    /*
     * Statement :: Given two temperatures, return true if one is less than 0 and
     * the other is greater than 100.
     */
    public boolean icyHot(int temp1, int temp2) {
        return false;
    }

    // url :: https://codingbat.com/prob/p144535
    /*
     * Statement :: Given 2 int values, return true if either of them is in the
     * range 10..20 inclusive.
     */
    public boolean in1020(int a, int b) {
        return false;
    }

    // url :: https://codingbat.com/prob/p178986
    /*
     * Statement :: We'll say that a number is "teen" if it is in the range 13..19
     * inclusive. Given 3 int values, return true if 1 or more of them are teen.
     */
    public boolean hasTeen(int a, int b, int c) {
        return false;
    }

    // url :: https://codingbat.com/prob/p165701
    /*
     * Statement :: We'll say that a number is "teen" if it is in the range 13..19
     * inclusive. Given 2 int values, return true if one or the other is teen, but
     * not both.
     */
    public boolean loneTeen(int a, int b) {
        return false;
    }

    // url :: https://codingbat.com/prob/p100905
    /*
     * Statement :: Given a string, if the string "del" appears starting at index 1,
     * return a string where that "del" has been deleted. Otherwise, return the
     * string unchanged.
     */
    public String delDel(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p151713
    /*
     * Statement :: Return true if the given string begins with "mix", except the
     * 'm' can be anything, so "pix", "9ix" .. all count.
     */
    public boolean mixStart(String str) {
        return false;
    }

    // url :: https://codingbat.com/prob/p199720
    /*
     * Statement :: Given a string, return a string made of the first 2 chars (if
     * present), however include first char only if it is 'o' and include the second
     * only if it is 'z', so "ozymandias" yields "oz".
     */
    public String startOz(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p101887
    /*
     * Statement :: Given three int values, a b c, return the largest.
     */
    public int intMax(int a, int b, int c) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p172021
    /*
     * Statement :: Given 2 int values, return whichever value is nearest to the
     * value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns
     * the absolute value of a number.
     */
    public int close10(int a, int b) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p132134
    /*
     * Statement :: Given 2 int values, return true if they are both in the range
     * 30..40 inclusive, or they are both in the range 40..50 inclusive.
     */
    public boolean in3050(int a, int b) {
        return false;
    }

    // url :: https://codingbat.com/prob/p177372
    /*
     * Statement :: Given 2 positive int values, return the larger value that is in
     * the range 10..20 inclusive, or return 0 if neither is in that range.
     */
    public int max1020(int a, int b) {
        return 0;
    }

    // url :: https://codingbat.com/prob/p173784
    /*
     * Statement :: Return true if the given string contains between 1 and 3 'e'
     * chars.
     */
    public boolean stringE(String str) {
        return false;
    }

    // url :: https://codingbat.com/prob/p125339
    /*
     * Statement :: Given two non-negative int values, return true if they have the
     * same last digit, such as with 27 and 57. Note that the % "mod" operator
     * computes remainders, so 17 % 10 is 7.
     */
    public boolean lastDigit(int a, int b) {
        return false;
    }

    // url :: https://codingbat.com/prob/p125268
    /*
     * Statement :: Given a string, return a new string where the last 3 chars are
     * now in upper case. If the string has less than 3 chars, uppercase whatever is
     * there. Note that str.toUpperCase() returns the uppercase version of a string.
     */
    public String endUp(String str) {
        return null;
    }

    // url :: https://codingbat.com/prob/p196441
    /*
     * Statement :: Given a non-empty string and an int N, return the string made
     * starting with char 0, and then every Nth char of the string. So if N is 3,
     * use char 0, 3, 6, ... and so on. N is 1 or more.
     */
    public String everyNth(String str, int n) {
        return null;
    }


}
