package MVC_O_DiceGame;

public class Player {
  
  public static void main(String a_args[]) {
    MVC_O_DiceGame.Model.DiceGame g = new MVC_O_DiceGame.Model.DiceGame();
    MVC_O_DiceGame.View.Console v = new MVC_O_DiceGame.View.ConsoleEng();
    MVC_O_DiceGame.Controller.PlayGame c = new MVC_O_DiceGame.Controller.PlayGame(v);
   
    g.Register(c);
    c.Play(g);
  }

}