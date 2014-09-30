package BlackJack;

public class RunBlackJack {

  public static void main(String a_args[]) {
    
    
    //BlackJack.Model.Card c = new BlackJack.Model.Card(BlackJack.Model.Card.Color.Spades, BlackJack.Model.Card.Value.Ace);
    
    //System.out.println("" + c.GetValue() + " of " + c.GetColor());
    //BlackJack.Model.Deck d = new BlackJack.Model.Deck();
    BlackJack.View.Console v = new BlackJack.View.Console();
    BlackJack.Controller.PlayGame c = new BlackJack.Controller.PlayGame();
    
    BlackJack.Model.Dealer d = new BlackJack.Model.Dealer();
    BlackJack.Model.Player p = new BlackJack.Model.Player();
    
    while(c.Play(d, p, v));

  }

}