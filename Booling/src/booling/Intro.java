package booling;

public class Intro {
  public void rollIntro() {
    final double tau = Math.PI * 2;
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
    // I would use this to write an accumulator but I don't need one for what I did in the rest of
    // the program.
    anotha1 += anotha1;
    System.out.println(
        "5+(9-7)*3/4%2+6+5+2 = " + (5 + (9 - 7) * 3 / 4 % 2 + incrementer + decrementer + anotha1));
  }
}
