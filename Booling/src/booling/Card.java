package booling;

import java.util.Random;

/**
 * A class for a playing card.
 * 
 * @author Trevor Johnson
 * 
 */
public class Card {
  private int cardNum;
  private String suite;
  private String numName;

  /**
   * This is a parameterless constructor, it will make a 2 of spades for you.
   */
  public Card() {
    cardNum = 2;
    suite = "Spades";
    numName = "2";
  }

  /**
   * This is a constructor that you can use to make a card.
   * 
   * @param n This parameter is what you use to set the card value, can be any number or Jack
   *        through Ace. You can break a card by putting in a random string or int that is not from
   *        2-10.
   * @param s This is how you set the suite, again the card won't be right if you enter a suite that
   *        doesn't exist.
   * @see If you enter a string that is not Jack, Ace, Queen, or King, you get a "scuffed" card.
   *      Avoid that
   */
  public Card(String n, String s) {
    numName = n;
    suite = s;
    try {
      cardNum = Integer.parseInt(n);
    } catch (NumberFormatException ex) {
      switch (n) {
        case "Jack":
          cardNum = 11;
          break;
        case "Queen":
          cardNum = 12;
          break;
        case "King":
          cardNum = 13;
          break;
        case "Ace":
          cardNum = 14;
          break;
        default:
          cardNum = -999;
          System.out.println("Your card is scuffed");
      }
    }
  }

  /**
   * Will generate a random card that could be found in a standard deck.
   */
  public void draw() {
    Random cardGen = new Random();
    int suiteVal = cardGen.nextInt(4);
    switch (suiteVal) {
      case 0:
        suite = "Hearts";
        break;
      case 1:
        suite = "Diamonds";
        break;
      case 2:
        suite = "Spades";
        break;
      case 3:
        suite = "Clubs";
        break;
      default:
        System.out.println("oof");
    }
    int cardVal = cardGen.nextInt(13) + 2;
    switch (cardVal) {
      case 2:
        cardNum = cardVal;
        numName = "2";
        break;
      case 3:
        cardNum = cardVal;
        numName = "3";
        break;
      case 4:
        cardNum = cardVal;
        numName = "4";
        break;
      case 5:
        cardNum = cardVal;
        numName = "5";
        break;
      case 6:
        cardNum = cardVal;
        numName = "6";
        break;
      case 7:
        cardNum = cardVal;
        numName = "7";
        break;
      case 8:
        cardNum = cardVal;
        numName = "8";
        break;
      case 9:
        cardNum = cardVal;
        numName = "9";
        break;
      case 10:
        cardNum = cardVal;
        numName = "10";
        break;
      case 11:
        cardNum = cardVal;
        numName = "Jack";
        break;
      case 12:
        cardNum = cardVal;
        numName = "Queen";
        break;
      case 13:
        cardNum = cardVal;
        numName = "King";
        break;
      case 14:
        cardNum = cardVal;
        numName = "Ace";
        break;
      default:
        System.out.println("it's impossible to get here baka");
    }
  }

  /**
   * Overloading the draw method to draw a card with a specified card value and random suite.
   * 
   * @param n The integer value that you want to give your card, values 11-14 will be assigned Jack
   *        through Ace
   */
  public void draw(int n) {
    Random cardGen = new Random();
    int suiteVal = cardGen.nextInt(4);
    switch (suiteVal) {
      case 0:
        suite = "Hearts";
        break;
      case 1:
        suite = "Diamonds";
        break;
      case 2:
        suite = "Spades";
        break;
      case 3:
        suite = "Clubs";
        break;
      default:
        System.out.println("oof");
    }
    int cardVal = n;
    switch (cardVal) {
      case 2:
        cardNum = cardVal;
        numName = "2";
        break;
      case 3:
        cardNum = cardVal;
        numName = "3";
        break;
      case 4:
        cardNum = cardVal;
        numName = "4";
        break;
      case 5:
        cardNum = cardVal;
        numName = "5";
        break;
      case 6:
        cardNum = cardVal;
        numName = "6";
        break;
      case 7:
        cardNum = cardVal;
        numName = "7";
        break;
      case 8:
        cardNum = cardVal;
        numName = "8";
        break;
      case 9:
        cardNum = cardVal;
        numName = "9";
        break;
      case 10:
        cardNum = cardVal;
        numName = "10";
        break;
      case 11:
        cardNum = cardVal;
        numName = "Jack";
        break;
      case 12:
        cardNum = cardVal;
        numName = "Queen";
        break;
      case 13:
        cardNum = cardVal;
        numName = "King";
        break;
      case 14:
        cardNum = cardVal;
        numName = "Ace";
        break;
      default:
        System.out.println("This card is now broken.");
    }
  }

  public void setSuite(String suite) {
    this.suite = suite;
  }

  public void setNumName(String numName) {
    this.numName = numName;
  }

  public void setCardNum(int cardNum) {
    this.cardNum = cardNum;
  }

  public String getSuite() {
    return suite;
  }

  public String getNumName() {
    return numName;
  }

  public int getCardNum() {
    return cardNum;
  }
}
