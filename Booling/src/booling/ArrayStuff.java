package booling;

import java.util.ArrayList;

/**
 * This does different things with arrays and ArrayLists.
 * 
 * @author Trevor Johnson
 *
 */
public class ArrayStuff {
  /**
   * This method is to find all the coordinates of a given number in a two dimensional integer
   * array.
   * 
   * @param array A two dimensional integer array to be searched.
   * @param n The number that all of the coordinates will be found for.
   * @return Returns all of the coordinates in a Stringbuilder.
   */
  public static StringBuilder findCoordinates(int[][] array, int n) {
    StringBuilder coordinates = new StringBuilder();
    for (int i = 0; i < array.length; i++) {
      for (int i2 = 0; i2 < array[i].length; i2++) {
        if (array[i][i2] == n) {
          coordinates.append("(" + Integer.toString(i) + ", " + Integer.toString(i2) + ") ");
        }
      }
    }
    if (coordinates.length() == 0) {
      coordinates.append("This value is not found.");
    }
    return (coordinates);
  }

  /**
   * This is a method to sum up the elements of an int array.
   * 
   * @param array This is the array that you want to know the sum of.
   * @return This returns the sum of all ints in the array.
   */
  public static int arraySum(ArrayList<Integer> array) {
    int total = 0;
    for (int i : array) {
      total += i;
    }
    return total;
  }

  /**
   * A method to find the lowest value in an integer array.
   * 
   * @param array A one dimensional integer array that you want to find the lowest value of.
   * @return Returns the integer with the lowest value in the array.
   */
  public static int findLowest(int[] array) {
    int lowest = array[0];
    for (int i : array) {
      if (i < lowest) {
        lowest = i;
      }
    }
    return lowest;
  }
}
