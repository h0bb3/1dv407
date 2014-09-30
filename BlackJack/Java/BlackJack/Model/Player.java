package BlackJack.Model;

import java.util.List;
import java.util.LinkedList;

public class Player {

  List<Card> m_hand;

  public Player() {
    m_hand = new LinkedList<Card>();
  }

  public Iterable<Card> GetHand() {
      return m_hand;
  }
  
  
  public void DealCard(Card c) {
    m_hand.add(c);
  }
}