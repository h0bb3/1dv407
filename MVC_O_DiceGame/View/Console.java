package MVC_O_DiceGame.View;

public abstract class Console {
  
  protected int GetInputChar() {
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
  
  public abstract boolean WantsToQuit();
  
  public abstract void PresentWelcomeMessage();
  
  public abstract void PresentInstructions();

  public abstract void PresentResult(boolean a_didWin);
  
  public void PresentDieValue(int a_dieValue) {
    System.out.print("" + a_dieValue + " ");       
  }

}