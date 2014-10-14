package BlackJack.Model.Rules;

class EuroNewGameStrategy implements INewGameStrategy {

  public void StartNewGame(BlackJack.Model.Deck a_deck, BlackJack.Model.Player a_dealer, BlackJack.Model.Player a_player) {
    BlackJack.Model.Card c = a_deck.GetFirstCard();
    c.Show();
    a_player.DealCard(c);
    
    c = a_deck.GetFirstCard();
    c.Show();
    a_dealer.DealCard(c);
    
    c = a_deck.GetFirstCard();
    c.Show();
    a_player.DealCard(c);
    
    c = a_deck.GetFirstCard();
    c.Show();
    a_dealer.DealCard(c);
  }

}