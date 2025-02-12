import java.util.Random;

/* 
 Represents a single math question with two numbers and a randomly chosen
 operand. It checks if the user's answer is correct.
 */
public class Question {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_BLACK = "\u001B[30m";

    private int num1;
    private int num2;
    private int answer;
    private int userAnswer;
    private Operand operand;

    /**
     * Constructs a Question with two numbers and an operand.
     * 
     * @param num1    First number.
     * @param num2    Second number.
     * @param operand The math operation.
     */
    public Question(int num1, int num2, Operand operand) {
        this.num1 = num1;
        this.num2 = num2;
        this.operand = operand;
        this.answer = calculateAnswer();
    }

    /**
     * Calculates the correct answer based on the operand.
     * 
     * @return The result of the math operation.
     */
    private int calculateAnswer() {
        switch (operand) {
            case PLUS:
                return num1 + num2;
            case MINUS:
                return num1 - num2;
            case MULTIPLY:
                return num1 * num2;
            default:
                return 0;
        }
    }

    /**
     * Returns the question as a formatted string.
     * 
     * @return The question string.
     */
    public String getQuestion() {
        return num1 + " " + operand.label + " " + num2 + " = ";
    }

    /**
     * Sets the user's answer.
     * 
     * @param answer The user's answer.
     */
    public void setUserAnswer(int answer) {
        this.userAnswer = answer;
    }

    /**
     * Checks if the user's answer is correct.
     * 
     * @return true if correct, false otherwise.
     */
    public boolean isCorrect() {
        return userAnswer == answer;
    }

    /**
     * Returns a formatted string of the question and user's answer.
     * 
     * @return The formatted result.
     */
    @Override
    public String toString() {
        String result = num1 + " " + operand.label + " " + num2 + " = " + answer;

        if (userAnswer != answer) {
            // If the answer is incorrect, color the entire line red
            result = ANSI_RED + result + " You answered " + userAnswer + ANSI_BLACK;
        } else {
            // If the answer is correct, color the entire line green
            result = ANSI_GREEN + result + ANSI_BLACK;
        }

        return result;
    }
}