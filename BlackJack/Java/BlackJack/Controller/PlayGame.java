package BlackJack.Controller;

import BlackJack.View.Console;

public class PlayGame {


  public boolean Play(BlackJack.Model.Dealer a_dealer, BlackJack.Model.Player a_player, Console a_view) {

    a_view.DisplayWelcomeMessage();    
    a_view.PresentHands(a_dealer, a_player);
    
    switch (a_view.GetEvent()) {
      case StartNewRound:
        a_dealer.StartNewRound(a_player);
      break;
      case Quit:
        return false;
    }
    
    return true;  
  }
}