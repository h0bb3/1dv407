package BlackJack.View;

public class Console {

  public enum Event {
    StartNewRound,
    Hit,
    Stand,
    Quit
  }
  
  public void DisplayWelcomeMessage() {
    System.out.println("Hello Black Jack World\n");
    System.out.println("n for New game round, q to Quit, h to Hit, s to Stand\n");
  }
  
  public void DisplayWinner(boolean a_isPlayerWinner) {
  
    if (a_isPlayerWinner) {
      System.out.println("You won!");
    } else {
      System.out.println("You lost!");
    }
  }
  
  public Event GetEvent() {
    while (true) {
      int c = GetInputChar();
      if (c == 'n') {
        return Event.StartNewRound;
      } else if (c == 'q') {
        return Event.Quit;
      } else if (c == 'h') {
        return Event.Hit;
      } else if (c == 's') {
        return Event.Stand;
      }
    }
  }
  
  private void DisplayHand(String a_playerText, Iterable<BlackJack.Model.Card> a_hand, int a_score) {
    System.out.print(a_playerText);
    for(BlackJack.Model.Card c : a_hand) {
      System.out.print("" + c.GetValue() + " of " + c.GetColor() + " ");
    }
    System.out.println(": " + a_score);  
  }
  
  public void PresentHands(Iterable<BlackJack.Model.Card> a_dealerHand, int a_dealerScore, Iterable<BlackJack.Model.Card> a_playerHand, int a_playerScore) {
    DisplayHand("Dealer Cards:", a_dealerHand, a_dealerScore);
    DisplayHand("Player Cards:", a_playerHand, a_playerScore);
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