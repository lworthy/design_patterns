import java.util.Random;

/**
 * Generates an easy password by replacing spaces with dashes and appending a
 * random number.
 */
public class EasyPassword extends Password {

    /**
     * Constructs an EasyPassword object.
     * 
     * @param phrase the input phrase used to generate the password.
     */
    public EasyPassword(String phrase) {
        Random rand = new Random();
        int randomNum = rand.nextInt(101); // Generates a number between 0-100
        this.password = phrase.replace(" ", "-") + randomNum;
    }

    /**
     * Retrieves the easy password.
     * 
     * @return the transformed password as a string.
     */
    @Override
    public String getPassword() {
        return password;
    }
}