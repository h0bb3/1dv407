using System;

namespace DiceGame
{
    class Player
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello Dice World");

            DiceGame g = new DiceGame();

            if (g.Play()) 
            {
                Console.WriteLine("Win");
            } 
            else 
            {
                Console.WriteLine("Loose");
            }

            Console.ReadLine();
        }
    }
}