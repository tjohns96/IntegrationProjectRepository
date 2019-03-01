package booling;

public class AnagramChecker {
  boolean isAnagram(String a, String b) {
    char[] aList = a.toLowerCase().toCharArray();
    char[] bList = b.toLowerCase().toCharArray();
    java.util.Arrays.sort(aList);
    java.util.Arrays.sort(bList);
    boolean value = false;
    if (aList.length == bList.length) {
      for (int i = 0; i < aList.length; i++) {
        if (aList[i] == bList[i]) {
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
