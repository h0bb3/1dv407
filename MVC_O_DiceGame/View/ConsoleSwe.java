package MVC_O_DiceGame.View;

public class ConsoleSwe extends Console {
  
  public boolean WantsToQuit() {
    return GetInputChar() == 's';
  }
  
  public void PresentWelcomeMessage() {
    System.out.println("Hej Spelt�rningsv�rlden");
  }
  
  public void PresentInstructions() {
    System.out.println("Tryck en tangent f�r att spela 's' f�r att sluta");
  }

  public void PresentResult(boolean a_didWin) {
    if (a_didWin) {
      System.out.println("Du Vann!");
    } else {
      System.out.println("Du f�rlorade!");
    }     
  }

}