package MVC_DiceGame.model;

public class DiceGame {

  private Die m_d1;
  private Die m_d2;
  
  public DiceGame() {
    m_d1 = new Die();
    m_d2 = new Die();
  }
  
  public boolean Play() {
    m_d1.Roll();
    m_d2.Roll();
    
    return m_d1.GetValue() + m_d2.GetValue() == 7;
  }
  
  public int GetDie1Value() {
    return m_d1.GetValue();
  }
  
  public int GetDie2Value() {
    return m_d2.GetValue();
  }

}