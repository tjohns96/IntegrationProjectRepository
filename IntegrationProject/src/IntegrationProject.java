package booling;

/*
 * My name is Trevor Johnson This is my Integration Project for COP2006. Java has 8 built in data
 * types: Char: A data type holding a single 16 bit Unicode character Byte: A data type holding
 * integers from -128 to 127, or 2^8 values Short: A data type holding 2^16 possible integer values
 * Int: A data type holding 2^32 possible integer values Long: A data type that holds 2^64 possible
 * integer values Float: A data type that holds decimal numbers, but this one is bad. Double: A data
 * type that holds decimal numbers, and this one is good. Boolean: Holds either a value of true or
 * false. Variable is like a box that holds a value assigned to it of a certain type. Scope is which
 * methods have access to which variables. The final keyword means a variable's value cannot be
 * changed anywhere in the program. Casting is converting one data type into another data type.
 */


import java.util.*;

public class Booling {

  public static void main(String[] args) {
    final double tau = Math.PI * 2;

    System.out.println(
        "Hello user, and welcome to my integration project.\nTau is superior to pi, and it is equal to: "
            + tau);
    boolean theTruth = true;
    String thread = "I don't like snakes";
    int myAge = 17;
    double myAgeButWithAZero = (double) myAge;
    System.out.println("The truth is " + theTruth);
    System.out.println(thread);
    System.out.println("My age is " + myAge + " but now it has a zero " + myAgeButWithAZero);

    Scanner sc = new Scanner(System.in);
    Card myCard = new Card();
    myCard.draw();
    System.out.println("Your card is the " + myCard.getNumber() + " of " + myCard.getSuite());

    System.out.println("Would you like to play war? Enter y for yes: ");
    String war = sc.nextLine();
    /*
     * You want to use the equals methods, because if you use ==, it will compare if the two objects
     * point to the same object in memory, instead of checking if the two strings are the same in
     * the way that I want
     */
    if (war.toLowerCase().equals("y")) {
      System.out.println("Please enter the number of rounds you wish to play: ");
      int rounds = sc.nextInt();
      int cardVal1 = 0;
      int cardVal2 = 0;
      for (int i = 0; i < rounds; i++) {
        Card card1 = new Card();
        card1.draw();
        Card card2 = new Card();
        card2.draw();
        switch (card1.getNumber()) {
          case "Ace":
            cardVal1 = 14;
            break;
          case "King":
            cardVal1 = 13;
            break;
          case "Queen":
            cardVal1 = 12;
            break;
          case "Jack":
            cardVal1 = 11;
            break;
          default:
            cardVal1 = Integer.valueOf(card1.getNumber());
        }
        switch (card2.getNumber()) {
          case "Ace":
            cardVal2 = 14;
            break;
          case "King":
            cardVal2 = 13;
            break;
          case "Queen":
            cardVal2 = 12;
            break;
          case "Jack":
            cardVal2 = 11;
            break;
          default:
            cardVal2 = Integer.valueOf(card2.getNumber());
        }
        System.out.println("Your card is the " + card1.getNumber() + " of " + card1.getSuite());
        System.out.println(
            "Your opponent's card is the " + card2.getNumber() + " of " + card2.getSuite());
        if (cardVal1 > cardVal2) {
          System.out.println("You win!!!");
        }
          else {
            System.out.println("You lose");
          }
        }
      }
    System.out.println("Enter your grade: ");
    int grade = sc.nextInt();
    String result = (!(grade < 0 || grade > 100)) ? "Your number is from 0-100."
        : "Your number is not in the range.";
    System.out.println(result);
    sc.close();
  }
}
