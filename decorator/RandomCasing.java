import java.util.Random;

/**
 * A password decorator that randomly changes the casing of letters.
 */
public class RandomCasing extends PasswordDecorator {

    /**
     * Constructs a RandomCasing object.
     * 
     * @param passwordBeginning the password to be transformed.
     */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Retrieves the password with randomly altered casing.
     * 
     * @return the transformed password.
     */
    @Override
    public String getPassword() {
        StringBuilder transformed = new StringBuilder();
        Random rand = new Random();

        for (char c : passwordBeginning.getPassword().toCharArray()) {
            if (Character.isLetter(c)) {
                transformed.append(rand.nextBoolean() ? Character.toUpperCase(c) : Character.toLowerCase(c));
            } else {
                transformed.append(c);
            }
        }
        return transformed.toString();
    }
}