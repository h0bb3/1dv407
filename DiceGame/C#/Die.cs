using System;

namespace DiceGame
{
    class Die
    {
        private int m_value;

        public Die()
        {
            m_value = 0;
        }
        public void Roll()
        {
            // Using GUID to avoid same timeseed if several dice are thrown.
            Random random = new Random(int.Parse(Guid.NewGuid().ToString().Substring(0, 8), System.Globalization.NumberStyles.HexNumber));
            m_value = (int)random.Next(1,7);
        }
        public int GetValue()
        {
            return m_value;
        }
    }
}