/**
 * Abstract decorator class for Password transformations.
 */
public abstract class PasswordDecorator extends Password {
    protected Password passwordBeginning;

    /**
     * Constructor that takes an existing password and decorates it.
     * 
     * @param passwordBeginning the base password to decorate.
     */
    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
    }
}