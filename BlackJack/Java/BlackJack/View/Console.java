package BlackJack.View;

public class Console {

  public enum Event {
    StartNewRound,
    Quit
  }
  
  public void DisplayWelcomeMessage() {
    System.out.println("Hello Black Jack World\n");
    System.out.println("n for new game round, q to quit\n");
  }
  
  public Event GetEvent() {
    while (true) {
      int c = GetInputChar();
      if (c == 'n') {
        return Event.StartNewRound;
      } else if (c == 'q') {
        return Event.Quit;
      }
    }
  }
  
  public void PresentHands(BlackJack.Model.Dealer a_dealer, BlackJack.Model.Player a_player) {
  
    System.out.print("Dealer Cards:");
    for(BlackJack.Model.Card c : a_dealer.GetHand()) {
      System.out.print("" + c.GetValue() + " of " + c.GetColor() + " ");
    }
    System.out.println(": " + a_dealer.GetScore());
    
    
    System.out.print("Player Cards:");
    for(BlackJack.Model.Card c : a_player.GetHand()) {
      System.out.print("" + c.GetValue() + " of " + c.GetColor() + " ");
    }
    System.out.println(": " + a_player.GetScore());
    
  }
  
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
}