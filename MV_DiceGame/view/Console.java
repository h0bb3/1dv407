package MV_DiceGame.view;

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

  public void Play(MV_DiceGame.model.DiceGame a_game) {
    
    System.out.println("Hello Dice World");
    System.out.println("Any key to play 'q' to quit");
    while (GetInputChar()!='q') {
      if (a_game.Play()) {
        System.out.println("Win: " + a_game.GetDie1Value() + " " + a_game.GetDie2Value());
      } else {
        System.out.println("Lose:" + a_game.GetDie1Value() + " " + a_game.GetDie2Value());
      }
      
      System.out.println("Any key to play 'q' to quit");
    } 
  }

}