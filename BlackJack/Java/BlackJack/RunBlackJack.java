package BlackJack;

public class RunBlackJack {

  public static void main(String a_args[]) {
    
    
    BlackJack.View.Console v = new BlackJack.View.Console();
    BlackJack.Controller.PlayGame c = new BlackJack.Controller.PlayGame();
    BlackJack.Model.GameFacade m = new BlackJack.Model.GameFacade(); 
    
    while(c.Play(m, v));

  }

}