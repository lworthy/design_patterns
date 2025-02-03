import java.util.HashMap;
import java.util.Map;

/**
 * A password decorator that replaces specific characters with corresponding
 * symbols.
 */
public class Symbols extends PasswordDecorator {

    private static final Map<Character, String> symbolMap = new HashMap<>();

    static {
        symbolMap.put('a', "@");
        symbolMap.put('b', "8");
        symbolMap.put('e', "3");
        symbolMap.put('g', "9");
        symbolMap.put('i', "!");
        symbolMap.put('o', "0");
        symbolMap.put('s', "$");
        symbolMap.put('t', "7");
    }

    /**
     * Constructs a Symbols object.
     * 
     * @param passwordBeginning the password to be transformed.
     */
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    /**
     * Retrieves the symbol-replaced password.
     * 
     * @return the transformed password.
     */
    @Override
    public String getPassword() {
        StringBuilder transformed = new StringBuilder();
        for (char c : passwordBeginning.getPassword().toCharArray()) {
            transformed.append(symbolMap.getOrDefault(c, String.valueOf(c)));
        }
        return transformed.toString();
    }
}