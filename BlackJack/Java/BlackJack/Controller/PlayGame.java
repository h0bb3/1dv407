package BlackJack.Controller;

import BlackJack.View.Console;

public class PlayGame {


  public boolean Play(BlackJack.Model.Dealer a_dealer, BlackJack.Model.Player a_player, Console a_view) {

    a_view.DisplayWelcomeMessage();    
    a_view.PresentHands(a_dealer.GetHand(), a_dealer.GetScore(), a_player.GetHand(), a_player.GetScore());

    if (a_dealer.IsGameOver()) {
      a_view.DisplayWinner(a_dealer.IsPlayerWinner(a_player));
    }
    
    switch (a_view.GetEvent()) {
      case StartNewRound:
        a_dealer.StartNewRound(a_player);
      break;
      case Hit:
        a_dealer.PlayerHit(a_player);
      break;
      case Stand:
        a_dealer.PlayerStand();
      break;
      case Quit:
        return false;
    }
    
    return true;  
  }
}