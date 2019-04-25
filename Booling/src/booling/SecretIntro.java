package booling;

/**
 * This is an easter egg for all my epic hackers.
 * 
 * @author Trevor Johnson
 *
 */

public class SecretIntro extends Intro {
  /**
   * This runs a secret message if the password is guessed.
   * @param password The password the user must guess to get the secret message.
   */
  public void rollIntro(String password) {
    System.out
        .println(password.equals("hacker") ? "Okay, ur an epic hacker >:)" : "Sorry, wrong guess.");
    super.rollIntro();
  }
}
