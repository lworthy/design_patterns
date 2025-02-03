/**
 * Abstract class representing a Password.
 * This follows the Decorator Pattern to allow for dynamic password
 * modification.
 */
public abstract class Password {
    protected String password;

    /**
     * Retrieves the generated password.
     * 
     * @return the transformed password as a string.
     */
    public abstract String getPassword();
}