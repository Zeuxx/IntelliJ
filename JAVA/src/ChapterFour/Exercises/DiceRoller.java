package ChapterFour.Exercises;

public class DiceRoller
    {
        private static Die one = new Die();
        private static Die two = new Die();

        private static int oneValue = one.getValue();
        private static int twoValue = two.getValue();

        public static void main(String[] args)
            {
                System.out.println("You rolled a " + oneValue + " and a " + twoValue);
            }
    }
