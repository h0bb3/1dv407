package MVC_O_DiceGame.Controller;

public class PlayGame implements MVC_O_DiceGame.Model.DieRolledListener {
  private MVC_O_DiceGame.View.Console m_view;
  
  
  public PlayGame(MVC_O_DiceGame.View.Console a_view) {
    m_view = a_view;  
  } 
  
  public void Play(MVC_O_DiceGame.Model.DiceGame a_game) {
    
    m_view.PresentWelcomeMessage();
    m_view.PresentInstructions();
    
    while (m_view.WantsToQuit() != true) {
      m_view.PresentResult(a_game.Play()); 
      m_view.PresentInstructions();
    } 
  }
  
  public void DieRolled(int a_value) {
 
    m_view.PresentDieValue(a_value);
  }

}