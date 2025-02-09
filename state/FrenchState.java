/**
 * Represents the French state of the MusicBox.
 * This state allows the user to play songs in French and switch to other
 * languages.
 */
public class FrenchState extends State {
    /** File path for the French version of "Twinkle Twinkle Little Star" */
    private static final String TWINKLE_FILE_NAME = "state/songs/twinkle_french.txt";

    /** File path for the French version of "If You're Happy and You Know It" */
    private static final String HAPPY_FILE_NAME = "state/songs/happy_french.txt";

    /**
     * Constructs a FrenchState object.
     * 
     * @param box The MusicBox instance this state is associated with.
     */
    public FrenchState(MusicBox box) {
        super(box);
    }

    /*
     * Plays "Brille, Brille, Petite Étoile" (French version of
     * "Twinkle Twinkle Little Star").
     */
    @Override
    public void pressStarButton() {
        playSong("Brille, Brille, Petite Étoile", TWINKLE_FILE_NAME);
    }

    /*
     * Plays "Si Tu Aimes le Soleil" (French version of
     * "If You're Happy and You Know It").
     */
    @Override
    public void pressHappyButton() {
        playSong("Si Tu Aimes le Soleil", HAPPY_FILE_NAME);
    }

    /* Switches the MusicBox to English mode. */
    @Override
    public void pressEnglishButton() {
        System.out.println("Switching to English...");
        box.setState(box.getEnglishState());
    }

    /* Indicates that the MusicBox is already in French mode. */
    @Override
    public void pressFrenchButton() {
        System.out.println("Already in French mode.");
    }

    /*
     * Switches the MusicBox to Spanish mode.
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish...");
        box.setState(box.getSpanishState());
    }
}