public class Player {

  public static void main(String a_args[]) {
  
    System.out.println("Hello Dice World");
    
    DiceGame g = new DiceGame();
    
    if (g.Play()) {
      System.out.println("Win");
    } else {
      System.out.println("Loose");
    }
  
  }

}