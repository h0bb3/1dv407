package MVC_O_DiceGame.Model;

import java.util.LinkedList;
import java.util.List;

public class DiceGame {

  private List<DieRolledListener> m_subscribers;
  private Die m_d1;
  private Die m_d2;
  
  public DiceGame() {
    m_d1 = new Die();
    m_d2 = new Die();
    m_subscribers = new LinkedList<DieRolledListener>();
  }
  
  public void Register(DieRolledListener a_subscriber) {
    m_subscribers.add(a_subscriber);
  }
  
  private void RollDie(Die a_die) {
    a_die.Roll();
    for(DieRolledListener l : m_subscribers) {
      l.DieRolled(a_die.GetValue());
    }
  }
  
  public boolean Play() {
    RollDie(m_d1);
    RollDie(m_d2);
    
    return m_d1.GetValue() + m_d2.GetValue() == 7;
  }

}