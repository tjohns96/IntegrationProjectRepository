package booling;

/*
 * My name is Trevor Johnson. This is my Integration Project for COP2006. Java has 8 built in data
 * types: Char: A data type holding a single 16 bit Unicode character Byte: A data type holding
 * integers from -128 to 127, or 2^8 values Short: A data type holding 2^16 possible integer values
 * Int: A data type holding 2^32 possible integer values Long: A data type that holds 2^64 possible
 * integer values Float: A data type that holds decimal numbers, but this one is bad. Double: A data
 * type that holds decimal numbers, and this one is good. Boolean: Holds either a value of true or
 * false. Variable is like a box that holds a value assigned to it of a certain type. Scope is which
 * methods have access to which variables. The final keyword means a variable's value cannot be
 * changed anywhere in the program. Casting is converting one data type into another data type.
 * Operator precedence is the idea that in Java certain operators will occur before others. A whole
 * list of this would require a table, but for example, the modulus operator % will occur before the
 * addition operator +. For example, 3%2+1=2, instead of 0, if + was higher than %. Inheritance is a
 * feature of object oriented programming. It means that objects can inherit both fields and methods
 * of other classes. This makes the new class a subclass of the parent class. This has multiple
 * benefits. It allows you to create a broader framework that you can then pass onto other, more
 * specific classes. It makes it easier to design programs because you can pass on functionality
 * really easily. Also, inheritance is how you take advantage of polymorphism.
 */

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class Booling {
  /**
   * My main driver class. The point is to do some random stuff that is required of me.
   * 
   * @author Trevor Johnson
   * @version 1.0
   * 
   */
  public static void main(String[] args) {
    System.out.println("Guess the password:");
    // This stuff is garbage to get requirements out of the way.
    Scanner sc = new Scanner(System.in, "UTF-8");
    String password = sc.nextLine();
    SecretIntro intro = new SecretIntro();
    intro.rollIntro(password);
    System.out.println("Enter 2 words to see if the first is lexicographically larger.");
    System.out.println("Word 1: ");
    System.out.println("Word 2: ");
    String word1 = sc.nextLine();
    String word2 = sc.nextLine();
    // Here I am lazy, so I use the ternary operator and the compareTo method in one line of code to
    // satisfy two requirements
    // I could not think of a good use for them in my program so I'm just getting it out of the way
    System.out.println((word1.compareTo(word2)) >= 1 ? "The first word is lexicographically larger."
        : "The first word is not lexcicographically larger.");
    int[][] anArray = {{0, 1, 2, 3}, {3, 2, 1, 0}, {3, 5, 6, 1}, {3, 8, 3, 4}};
    System.out.println(Arrays.deepToString(anArray));
    System.out.println(
        "Enter a number you see in this array that you would like to know the coordinates of.");
    int find = 0;
    boolean goodInput0 = false;
    do {
      try {
        find = sc.nextInt();
        sc.nextLine();
        goodInput0 = true;
      } catch (InputMismatchException ex) {
        System.out.println("Please enter a number.");
        sc.nextLine();
      }
    } while (goodInput0 == false);
    System.out.println("Your results are: " + ArrayStuff.findCoordinates(anArray, find));


    String again = "y";
    // here I use the equals method because if I used == it would check whether or not the objects
    // point to the same location in memory, instead of checking whether the string are equal in the
    // way I want them to
    while (again.equals("y")) {
      System.out.println("You have several options in this program.");
      System.out.println("Enter 1 to play War: ");
      System.out.println("Enter 2 to check if a grade is from 0-100: ");
      System.out.println("Enter 3 to check if two words are anagrams: ");
      int option = 0;
      do {
        try {
          option = sc.nextInt();
          sc.nextLine();
          if (option != 1 && option != 2 && option != 3) {
            System.out.println("You need to enter a number 1-3. Try again.");
          }
        } catch (InputMismatchException ex) {
          System.out.println("You need to enter a number 1-3. Try again.");
          // Clearing the scanner because I'm going from int to string in some options.
          sc.nextLine();
        }
      } while (option != 1 && option != 2 && option != 3);
      switch (option) {

        case 1:
          System.out.println("Please enter the number of rounds you wish to play: ");
          boolean goodInput = false;
          do {

            try {

              int rounds = sc.nextInt();
              sc.nextLine();
              for (int i = 0; i < rounds; i++) {
                Card card1 = new Card();
                Card card2 = new Card();
                // I was actually surprised I found a use for the do-while loop. This
                // keeps generating cards until they are different cards
                do {
                  card1.draw();
                  card2.draw();
                } while (card1.getSuite().equals(card2.getSuite())
                    && card1.getCardNum() == card2.getCardNum());
                System.out
                    .println("Your card is the " + card1.getNumName() + " of " + card1.getSuite());
                System.out.println("Your opponent's card is the " + card2.getNumName() + " of "
                    + card2.getSuite());
                int card1Value = card1.getCardNum();
                int card2Value = card2.getCardNum();
                if (card1Value > card2Value) {
                  System.out.println("You win!!!");
                } else if (card1Value == card2Value) {
                  System.out.println("It was a draw!");
                } else {
                  System.out.println("You lose");
                }
              }
              goodInput = true;
            } catch (InputMismatchException ex) {
              System.out.println("Please enter an integer.");
              sc.nextLine();
            }

          } while (goodInput == false);
          break;

        case 2:
          System.out.println("Enter your grade: ");
          boolean goodInput2 = false;
          do {

            try {

              double grade = sc.nextDouble();
              sc.nextLine();
              String result = (!(grade < 0 || grade > 100)) ? "Your number is from 0-100."
                  : "Your number is not in the range.";
              System.out.println(result);
              goodInput2 = true;
            } catch (InputMismatchException ex) {
              System.out.println("Please enter a number.");
              sc.nextLine();
            }
          } while (goodInput2 == false);
          break;

        case 3:
          System.out
              .println("This checks if two strings are anagrams! Enter any two words, and you will "
                  + "know if they they" + " are anagrams, regardless of case!");
          System.out.println("Word 1: ");
          String a = sc.nextLine();
          System.out.println("Word 2: ");
          String b = sc.nextLine();
          AnagramChecker checker = new AnagramChecker();
          // Here I call the isAnagram method, and pass string a and b as arguments to the method,
          // to check if they are anagrams of course.
          if (checker.isAnagram(a, b)) {
            System.out.println("These words are anagrams.");
          } else {
            System.out.println("These words are not anagrams.");
          }
          break;
        default:
          System.out.println("You shouldn't be here.");
      }
      System.out.println("Would you like to run the program again? Y for yes: ");
      again = sc.nextLine();
      again = again.toLowerCase(Locale.ENGLISH);
    }
    System.out.println("Goodbye User!");
    sc.close();
  }
}
