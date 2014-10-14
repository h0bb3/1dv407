package BlackJack.Controller;

import BlackJack.View.Console;

public class PlayGame {


  public boolean Play(BlackJack.Model.GameFacade a_gameModel, Console a_view) {

    a_view.DisplayWelcomeMessage();    
    a_view.PresentHands(a_gameModel.GetDealerHand(), a_gameModel.GetDealerScore(), a_gameModel.GetPlayerHand(), a_gameModel.GetPlayerScore());

    if (a_gameModel.IsGameOver()) {
      a_view.DisplayWinner(a_gameModel.IsPlayerWinner());
    }
    
    switch (a_view.GetEvent()) {
      case StartNewRound:
        a_gameModel.StartGame();
      break;
      case Hit:
        a_gameModel.Hit();
      break;
      case Stand:
        a_gameModel.Stand();
      break;
      case Quit:
        return false;
    }
    
    return true;  
  }
}