package BlackJack.Model;

import java.util.List;
import java.util.LinkedList;

public class Dealer extends Player {

  Deck m_deck;
  
  public Dealer() {

  }

  public void StartNewRound(Player a_player) {
    m_deck = new Deck();
    
    ClearHand();
    a_player.ClearHand();
    
    Card c = m_deck.GetFirstCard();
    c.Show();
    a_player.DealCard(c);
    
    c = m_deck.GetFirstCard();
    c.Show();
    DealCard(c);
    
    c = m_deck.GetFirstCard();
    c.Show();
    a_player.DealCard(c);
    
    c = m_deck.GetFirstCard();
    DealCard(c);
  }

}