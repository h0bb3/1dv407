package MVC_DiceGame;

public class Player {
  
  public static void main(String a_args[]) {
    MVC_DiceGame.model.DiceGame g = new MVC_DiceGame.model.DiceGame();
    MVC_DiceGame.view.Console v = new MVC_DiceGame.view.Console();
    MVC_DiceGame.controller.PlayGame c = new MVC_DiceGame.controller.PlayGame();
    
    c.Play(g, v);
  }

}