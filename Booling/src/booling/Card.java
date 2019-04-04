package booling;

import java.util.Random;

public class Card {
  private int cardNum;
  private String suite;
  private String numName;
  
  public Card(){
    cardNum = 2;
    suite = "Spades";
    numName = "2";
  }
public Card(String n, String s) {
    numName = n;
    suite = s;
    try{
      cardNum = Integer.parseInt(n);
    }
    catch(NumberFormatException ex) {
      switch(n) {
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
    }
  }

  public void setSuite(String s) {
    suite = s;
  }

  public void setNumName(String n) {
    numName = n;
  }

  public void setCardNum(int n) {
    cardNum = n;
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
