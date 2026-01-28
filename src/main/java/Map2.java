
import java.util.Map;

public class Map2 {
    // url :: https://codingbat.com/java/Map-2

    // url :: https://codingbat.com/prob/p152303
    /*
     * Statement :: Given an array of strings, return a Map<String, Integer>
     * containing a key for every different string in the array, always with the
     * value 0. For example the string "hello" makes the pair "hello":0. We'll do
     * more complicated counting later, but for this problem the value is simply 0.
     */
    public Map<String, Integer> word0(String[] strings) {
        return null;
    }

    // url :: https://codingbat.com/prob/p125327
    /*
     * Statement :: Given an array of strings, return a Map<String, Integer>
     * containing a key for every different string in the array, and the value is
     * that string's length.
     */
    public Map<String, Integer> wordLen(String[] strings) {
        return null;
    }

    // url :: https://codingbat.com/prob/p126332
    /*
     * Statement :: Given an array of non-empty strings, create and return a
     * Map<String, String> as follows: for each string add its first character as a
     * key with its last character as the value.
     */
    public Map<String, String> pairs(String[] strings) {
        return null;
    }

    // url :: https://codingbat.com/prob/p117630
    /*
     * Statement :: The classic word-count algorithm: given an array of strings,
     * return a Map<String, Integer> with a key for each different string, with the
     * value the number of times that string appears in the array.
     */
    public Map<String, Integer> wordCount(String[] strings) {
        return null;
    }

    // url :: https://codingbat.com/prob/p168493
    /*
     * Statement :: Given an array of non-empty strings, return a Map<String,
     * String> with a key for every different first character seen, with the value
     * of all the strings starting with that character appended together in the
     * order they appear in the array.
     */
    public Map<String, String> firstChar(String[] strings) {
        return null;
    }

    // url :: https://codingbat.com/prob/p103593
    /*
     * Statement :: Loop over the given array of strings to build a result string
     * like this: when a string appears the 2nd, 4th, 6th, etc. time in the array,
     * append the string to the result. Return the empty string if no string appears
     * a 2nd time.
     */
    public String wordAppend(String[] strings) {
        return null;
    }

    // url :: https://codingbat.com/prob/p190862
    /*
     * Statement :: Given an array of strings, return a Map<String, Boolean> where
     * each different string is a key and its value is true if that string appears 2
     * or more times in the array.
     */
    public Map<String, Boolean> wordMultiple(String[] strings) {
        return null;
    }

    // url :: https://codingbat.com/prob/p134133
    /*
     * Statement :: We'll say that 2 strings "match" if they are non-empty and their
     * first chars are the same. Loop over and then return the given array of
     * non-empty strings as follows: if a string matches an earlier string in the
     * array, swap the 2 strings in the array. When a position in the array has been
     * swapped, it no longer matches anything. Using a map, this can be solved
     * making just one pass over the array. More difficult than it looks.
     */
    public String[] allSwap(String[] strings) {
        return null;
    }

    // url :: https://codingbat.com/prob/p150113
    /*
     * Statement :: We'll say that 2 strings "match" if they are non-empty and their
     * first chars are the same. Loop over and then return the given array of
     * non-empty strings as follows: if a string matches an earlier string in the
     * array, swap the 2 strings in the array. A particular first char can only
     * cause 1 swap, so once a char has caused a swap, its later swaps are disabled.
     * Using a map, this can be solved making just one pass over the array. More
     * difficult than it looks.
     */
    public String[] firstSwap(String[] strings) {
        return null;
    }

}

