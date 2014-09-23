package MVC_O_DiceGame.Model;

class Die {

  private int m_value;
  
  
  public Die() {
    m_value = 0;
  }
  
  public void Roll() {
    try {
      Thread.sleep(2000);
    } catch (Exception e) {
    }
    m_value = (int)(Math.random() * 171717.0*6.0) % 6 + 1;
  }
  
  public int GetValue() {
    return m_value;
  }
}