package BlackJack.Model;

public class Card {

  public enum Color {
    Hearts,
    Spades,
    Diamonds,
    Clubs,
    Count
  }
  
  public enum Value {
    Two,
    Three,
    Four,
    Five,
    Six,
    Seven,
    Eight,
    Nine,
    Ten,
    Knight,
    Queen,
    King,
    Ace,
    Count
  }
  
  private Color m_color;
  private Value m_value;  

  public Card(Color a_color, Value a_value) {
    m_value = a_value;
    m_color = a_color;
  }
  
  public Color GetColor() {
    return m_color;
  }
  
  public Value GetValue() {
    return m_value;
  }
  
  public void Show() {
  }

}