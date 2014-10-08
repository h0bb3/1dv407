package BlackJack.Model;

import java.util.List;
import java.util.LinkedList;

public class Dealer extends Player {

  Deck m_deck;
  BlackJack.Model.Rules.INewGameStrategy m_startNewGameRules;
  
  
  public Dealer(BlackJack.Model.Rules.INewGameStrategy a_startGameRules) {
    m_startNewGameRules = a_startGameRules;
    m_deck = null;
  }

  public void PlayerHit(Player a_player) {
    if (m_deck != null && m_deck.HasCards()) {
      Card c = m_deck.GetFirstCard();
      c.Show();
      a_player.DealCard(c);
    }
  }
  
  public void PlayerStand() {
 
   if (m_deck != null && m_deck.HasCards()) {
   
      for(Card c : GetHand()) {
        c.Show();
      }
    
      while (DoDealerHit()) {
        PlayerHit(this);
      }
      
      m_deck = null;
    }
  }
  
  public boolean IsGameOver() {
  
    return m_deck == null && HasCards();
  }
  
  
  public boolean IsPlayerWinner(Player a_player) {
  
    int a_playerScore = a_player.GetScore();
    int a_dealerScore = GetScore();
    
    if (a_playerScore > 21) {
      return false;
    }
    
    if (a_dealerScore > 21) {
      return true;
    }
    
    return a_playerScore > a_dealerScore;
  }
  
  private boolean DoDealerHit() {
    return GetScore() < 17;
  }

  public void StartNewRound(Player a_player) {
    m_deck = new Deck();
    
    ClearHand();
    a_player.ClearHand();
    
    m_startNewGameRules.StartNewGame(m_deck, this, a_player);
  
  }

}