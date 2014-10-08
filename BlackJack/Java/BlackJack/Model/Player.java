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
  
  protected boolean HasCards() {
    return m_hand.size() > 0;
  }
  
  protected void ClearHand() {
    m_hand.clear();
  }
  
  public void DealCard(Card c) {
    m_hand.add(c);
  }
  
  public int GetScore() {
    // the number of scores is dependant on the number of scorable values
    // as it seems there is no way to do this check at compile time in java ?!
    // cardScores[13] = {...};
    int cardScores[] = {
        2, 3, 4, 5, 6, 7, 8, 9, 10, 10 ,10 ,10, 11
    };
    assert (cardScores.length == Card.Value.Count.ordinal()) : "Card Scores array size does not match number of card values";
  
    
    int score = 0;

    for(Card c : GetHand()) {
        if (c.GetValue() != Card.Value.Hidden)
        {
            score += cardScores[c.GetValue().ordinal()];
        }
    }

    if (score > 21)
    {
        for(Card c : GetHand())
        {
            if (c.GetValue() == Card.Value.Ace && score > 21)
            {
                score -= 10;
            }
        }
    }
    
    
    return score;
  }
}