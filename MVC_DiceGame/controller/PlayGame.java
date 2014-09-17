package MVC_DiceGame.controller;

public class PlayGame {
  
  public void Play(MVC_DiceGame.model.DiceGame a_game, MVC_DiceGame.view.Console a_view) {
    
    a_view.PresentWelcomeMessage();
    a_view.PresentInstructions();
    
    while (a_view.WantsToQuit() != true) {
      a_view.PresentResult(a_game.Play(), a_game.GetDie1Value(), a_game.GetDie2Value()); 
      a_view.PresentInstructions();
    } 
  }

}