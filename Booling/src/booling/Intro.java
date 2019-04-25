package booling;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This is the parent class for SecretInfo.
 * @author Trevor Johnson
 *
 */
public class Intro {
  /**
   * This plays the intro for the user when they are greeted in my program. Also it gets an array
   * requirement done.
   */
  public void rollIntro() {
    final double tau = Math.PI * 2;
    System.out.println("Hello user, and welcome to my integration project.\nTau is superior to pi, "
        + "and it is equal to: " + tau);
    String thread = "I don't like snakes";
    int myAge = 17;
    double myAgeButWithAZero = (double) myAge;
    System.out.println(thread);
    System.out.println("My age is " + myAge + " but now it has a zero " + myAgeButWithAZero);
    int incrementer = 5;
    int decrementer = 6;
    incrementer++;
    decrementer--;
    int anotha1 = 1;
    // I would use this to write an accumulator but I don't need one for what I did in the rest of
    // the program.
    anotha1 += anotha1;
    System.out.println(
        "5+(9-7)*3/4%2+6+5+2 = " + (5 + (9 - 7) * 3 / 4 % 2 + incrementer + decrementer + anotha1));
    int[] siblingAges = {18, 14, 12};
    ArrayList<Integer> siblingAges1 = new ArrayList<>(Arrays.asList(18, 14, 12));
    System.out.println("My age is " + siblingAges[0] + ", my brother's age is " + siblingAges[1]
        + ", and my sister's age is " + siblingAges[2] + ". The youngest age is "
        + ArrayStuff.findLowest(siblingAges) + ". The total of all our ages added is "
        + ArrayStuff.arraySum(siblingAges1) + ".");
  }
}
