package MV_DiceGame;

public class Player {
  
  public static void main(String a_args[]) {
    MV_DiceGame.model.DiceGame g = new MV_DiceGame.model.DiceGame();
    MV_DiceGame.view.Console v = new MV_DiceGame.view.Console();
    
    v.Play(g);
  }

}