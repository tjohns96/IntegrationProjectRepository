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
          continue;
        } else {
          value = false;
          break;
        }
      }
    } else {
      value = false;
    }
    return value;
  }
}
