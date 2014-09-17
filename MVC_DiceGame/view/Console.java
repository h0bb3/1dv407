package MVC_DiceGame.view;

public class Console {
  
  private int GetInputChar() {
    try {
      int c = System.in.read();
      while (c == '\r' || c =='\n') {
        c = System.in.read();
      }
      return c;
    } catch (java.io.IOException e) {
      System.out.println("" + e);
      return 0;
    }
  }
  
  public boolean WantsToQuit() {
    return GetInputChar() == 'q';
  }
  
  public void PresentWelcomeMessage() {
    System.out.println("Hello Dice World");
  }
  
  public void PresentInstructions() {
    System.out.println("Any key to play 'q' to quit");
  }

  public void PresentResult(boolean a_didWin, int a_dice1Value, int a_dice2Value) {
    if (a_didWin) {
      System.out.println("Win: " + a_dice1Value + " " + a_dice2Value);
    } else {
      System.out.println("Lose:" + a_dice1Value + " " + a_dice2Value);
    }     
  }

}