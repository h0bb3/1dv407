package MVC_O_DiceGame.View;

public class ConsoleEng extends Console {
  
  public boolean WantsToQuit() {
    return GetInputChar() == 'q';
  }
  
  public void PresentWelcomeMessage() {
    System.out.println("Hello Dice World");
  }
  
  public void PresentInstructions() {
    System.out.println("Any key to play 'q' to quit");
  }

  public void PresentResult(boolean a_didWin) {
    if (a_didWin) {
      System.out.println("You Won!");
    } else {
      System.out.println("You Lost!");
    }     
  }
}