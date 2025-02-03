/**
 * A password decorator that appends the reverse of the string to itself.
 */
public class Pallendrome extends PasswordDecorator {

    /**
     * Constructs a Pallendrome object.
     * 
     * @param passwordBeginning the password to be transformed.
     */
    public Pallendrome(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Retrieves the palindrome-transformed password.
     * 
     * @return the transformed password.
     */
    @Override
    public String getPassword() {
        String original = passwordBeginning.getPassword();
        String reversed = new StringBuilder(original).reverse().toString();
        return original + reversed;
    }
}