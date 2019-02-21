package integration_Project;
import java.util.Random;
public class Card {
private String suite;
private String number;
public void draw() {
  Random cardGen = new Random();
  int suiteNum = cardGen.nextInt(4);
  switch(suiteNum) {
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
  int cardNum = cardGen.nextInt(13)+2;
  switch(cardNum) {
    case 2:
      number = "2";
      break;
    case 3:
      number = "3";
      break;
    case 4:
      number = "4";
      break;
    case 5:
      number = "5";
      break;
    case 6:
      number = "6";
      break;
    case 7:
      number = "7";
      break;
    case 8:
      number = "8";
      break;
    case 9:
      number = "9";
      break;
    case 10:
      number = "10";
      break;
    case 11:
      number = "Jack";
      break;
    case 12:
      number = "Queen";
      break;
    case 13:
      number = "King";
      break;
    case 14:
      number = "Ace";
      break;
  }
}
  
public void setSuite(String s) {
  suite = s;
}
public void setNumber(String n) {
  number = n;
}
public String getSuite(){
  return suite;
}
public String getNumber() {
  return number;
}
}
