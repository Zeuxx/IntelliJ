package ChapterFour.Exercises;

// 1. Holds an integer data field for a value (from 1 to 6)
// 2. Include a constructor that randomly assigns a value to a Die object
// 3. Include a method in the class to return a die's value
public class Die
    {
        private final int value;

        public Die()
            {
                int HIGHEST_DIE_VALUE = 6;
                int LOWEST_DIE_VALUE = 1;
                value = ((int) (Math.random() * 100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
            }

        public int getValue()
            {
                return value;
            }
    }
