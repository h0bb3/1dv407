public class Die {

  private int m_value;
  
  
  public Die() {
    m_value = 0;
  }
  
  public void Roll() {
    m_value = (int)(Math.random() * 171717.0*6.0) % 6;
  }
  
  public int GetValue() {
    return m_value;
  }
}