import java.util.Random;

/**
 * A password decorator that randomly inserts special characters.
 */
public class SpecialChars extends PasswordDecorator {

    private static final char[] specialChars = { '*', '!', '%', '+', '.', '{', '}' };

    /**
     * Constructs a SpecialChars object.
     * 
     * @param passwordBeginning the password to be transformed.
     */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Retrieves the password with randomly inserted special characters.
     * 
     * @return the transformed password.
     */
    @Override
    public String getPassword() {
        StringBuilder transformed = new StringBuilder();
        Random rand = new Random();

        for (char c : passwordBeginning.getPassword().toCharArray()) {
            transformed.append(c);
            if (rand.nextInt(100) < 30) { // 30% chance to add a special character
                transformed.append(specialChars[rand.nextInt(specialChars.length)]);
            }
        }
        return transformed.toString();
    }
}