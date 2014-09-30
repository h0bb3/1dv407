package BlackJack.Model;

import java.util.List;
import java.util.LinkedList;

public class Dealer {

  Deck m_deck;
  List<Card> m_hand;
  
  public Dealer() {
    m_hand = new LinkedList<Card>();
  }

  public void StartNewRound(Player a_player) {
    m_deck = new Deck();
    
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
    c.Show();
    DealCard(c);
  }
  
  public Iterable<Card> GetHand() {
      return m_hand;
  }
  
  
  private void DealCard(Card c) {
    m_hand.add(c);
  }
}