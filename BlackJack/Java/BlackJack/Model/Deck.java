package BlackJack.Model;

import java.util.List;
import java.util.LinkedList;


public class Deck {

  List<Card> m_cards;

  public Deck() {
  
    m_cards = new LinkedList<Card>();
  
    for(int cIx = 0; cIx < Card.Color.Count.ordinal(); cIx++) {
      for (int vIx = 0; vIx < Card.Value.Count.ordinal(); vIx++) {
        Card c = new Card(Card.Color.values()[cIx], Card.Value.values()[vIx]);
        Add(c);
      }
    }
    
    Shuffle();
  }
  
  
  private void Add(Card a_toIncludeInDeck) {
    m_cards.add(a_toIncludeInDeck);
    System.out.println("" + a_toIncludeInDeck.GetValue() + " of " + a_toIncludeInDeck.GetColor());  
  }
  
  private void Shuffle() {
  }
}