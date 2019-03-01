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
 * addition operator +. For example, 3%2+1=2, instead of 0, if + was higher than %.
 */

import java.util.*;

public class Booling {

  public static void main(String[] args) {

    // This stuff is garbage to get requirements out of the way.
    final double tau = Math.PI * 2;
    Scanner sc = new Scanner(System.in);
    System.out.println(
        "Hello user, and welcome to my integration project.\nTau is superior to pi, and it is equal to: "
            + tau);
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
    // I would use this to write an accumulator but I don't need one for what I did in the rest of the program.
    anotha1+=anotha1;
    System.out.println("5+(9-7)*3/4%2+6+5+2 = " + (5 + (9 - 7) * 3 / 4 % 2 + incrementer + decrementer+anotha1));
    System.out.println("Enter 2 numbers to see if the first is lexicographically larger.");
    System.out.println("Word 1: ");
    System.out.println("Word 2: ");
    String word1 = sc.nextLine();
    String word2 = sc.nextLine();
    // Here I am lazy, so I use the ternary operator and the compareTo method in one line of code to
    // satisfy two requirements
    // I could not think of a good use for them in my program so I'm just getting it out of the way
    System.out.println((word1.compareTo(word2)) == 1 ? "The first word is lexicographically higher."
        : "The first word is not lexicographically higher.");

    String again = "y";
    // here I use the equals method because if I used == it would check whether or not the objects
    // point to the same location in memory, instead of checking whether the string are equal in the
    // way I want them to
    while (again.equals("y")) {
      System.out.println("You have several options in this program.");
      System.out.println("Enter 1 to play War: ");
      System.out.println("Enter 2 to check if a grade is from 0-100: ");
      System.out.println("Enter 3 to check if two words are anagrams: ");

      int option = sc.nextInt();
      // Clearing the scanner because I'm going from int to string in some options.
      sc.nextLine();
      switch (option) {

        case 1:
          System.out.println("Please enter the number of rounds you wish to play: ");
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
            System.out.println(
                "Your opponent's card is the " + card2.getNumName() + " of " + card2.getSuite());
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
          break;

        case 2:
          System.out.println("Enter your grade: ");
          int grade = sc.nextInt();
          sc.nextLine();
          String result = (!(grade < 0 || grade > 100)) ? "Your number is from 0-100."
              : "Your number is not in the range.";
          System.out.println(result);
          break;

        case 3:
          AnagramChecker checker = new AnagramChecker();
          System.out.println(
              "This checks if two strings are anagrams! Enter any two words, and you will know if they they"
                  + " are anagrams, regardless of case!");
          System.out.println("Word 1: ");
          String a = sc.nextLine();
          System.out.println("Word 2: ");
          String b = sc.nextLine();
          // Here I call the isAnagram method, and pass string a and b as arguments to the method,
          // to check if they are anagrams of course.
          if (checker.isAnagram(a, b)) {
            System.out.println("These words are anagrams.");
          } else {
            System.out.println("These words are not anagrams.");
          }
          break;
      }
      System.out.println("Would you like to run the program again? Y for yes: ");
      again = sc.nextLine();
      again = again.toLowerCase();
    }
    System.out.println("Goodbye User!");
    sc.close();
  }
}
