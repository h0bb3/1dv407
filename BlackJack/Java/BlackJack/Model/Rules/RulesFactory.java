package BlackJack.Model.Rules;

public class RulesFactory {

  public INewGameStrategy GetStartNewGameRule() {
    // complex code here
    return new BlackJack.Model.Rules.EuroNewGameStrategy();
  }

}