package booling;

import java.util.Locale;

/**
 * This is a class that checks if two words are anagrams.
 * 
 * @author Trevor Johnson
 *
 */
public class AnagramChecker {
  /**
   * A method to check if two words are anagrams.
   * 
   * @param a The first string that you check to see if it is an anagram with b.
   * @param b The other string that you want to check against a.
   * @return Returns true if the words are anagrams, false if not.
   */
  boolean isAnagram(String a, String b) {
    char[] a1List = a.toLowerCase(Locale.ENGLISH).toCharArray();
    char[] b1List = b.toLowerCase(Locale.ENGLISH).toCharArray();
    java.util.Arrays.sort(a1List);
    java.util.Arrays.sort(b1List);
    boolean value = false;
    if (a1List.length == b1List.length) {
      for (int i = 0; i < a1List.length; i++) {
        if (a1List[i] == b1List[i]) {
          value = true;
          // I think this continue here is redundant, but it makes it so that the loop starts a new
          // iteration as soon as it hits the continue statement
          continue;
        } else {
          value = false;
          // since I want the loop to stop as soon as I find a pair of chars that don't match,
          // I put a break statement here so that the loop ends and a false value is immediately
          // returned
          break;
        }
      }
    } else {
      value = false;
    }
    return value;
  }
}
