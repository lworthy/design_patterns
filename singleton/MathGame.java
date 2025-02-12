import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * MathGame class implements the Singleton Design Pattern to create a math game.
 * It generates a set number of random math questions and provides an iterator
 * to access them.
 */
public class MathGame {
    final int NUM_QUESTIONS = 5;
    private static MathGame mathGame;
    private ArrayList<Question> questions;

    /**
     * Private constructor to prevent instantiation.
     * Initializes and generates math questions.
     */
    private MathGame() {
        questions = new ArrayList<>();
        generateQuestions();
    }

    /**
     * Returns the single instance of MathGame.
     * 
     * @return MathGame instance.
     */
    public static MathGame getInstance() {
        if (mathGame == null) {
            mathGame = new MathGame();
        }
        return mathGame;
    }

    /**
     * Generates a list of math questions.
     */
    private void generateQuestions() {
        Random random = new Random();
        Operand[] operands = Operand.values();

        for (int i = 0; i < NUM_QUESTIONS; i++) {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;
            Operand operand = operands[random.nextInt(operands.length)];
            questions.add(new Question(num1, num2, operand));
        }
    }

    /**
     * Returns an iterator for the list of questions.
     * 
     * @return Iterator<Question>
     */
    public Iterator<Question> getIterator() {
        return questions.iterator();
    }

    /**
     * Gets the number of questions in the game.
     * 
     * @return Number of questions.
     */
    public int getNumQuestions() {
        return NUM_QUESTIONS;
    }
}