/**
 * Represents the Spanish state of the MusicBox.
 * This state allows the user to play songs in Spanish and switch to other
 * languages.
 */
public class SpanishState extends State {
    /** File path for the Spanish version of "Twinkle Twinkle Little Star" */
    private static final String TWINKLE_FILE_NAME = "state/songs/twinkle_spanish.txt";

    /* File path for the Spanish version of "If You're Happy and You Know It" */
    private static final String HAPPY_FILE_NAME = "state/songs/happy_spanish.txt";

    /**
     * Constructs a SpanishState object.
     * 
     * @param box The MusicBox instance this state is associated with.
     */
    public SpanishState(MusicBox box) {
        super(box);
    }

    /*
     * Plays "Estrellita, ¿Dónde Estás?" (Spanish version of
     * "Twinkle Twinkle Little Star").
     */
    @Override
    public void pressStarButton() {
        playSong("Estrellita, ¿Dónde Estás?", TWINKLE_FILE_NAME);
    }

    /*
     * Plays "Si Estás Feliz" (Spanish version of
     * "If You're Happy and You Know It").
     */
    @Override
    public void pressHappyButton() {
        playSong("Si Estás Feliz", HAPPY_FILE_NAME);
    }

    /*
     * Switches the MusicBox to English mode.
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("Switching to English...");
        box.setState(box.getEnglishState());
    }

    /*
     * Switches the MusicBox to French mode.
     */
    @Override
    public void pressFrenchButton() {
        System.out.println("Switching to French...");
        box.setState(box.getFrenchState());
    }

    /*
     * Indicates that the MusicBox is already in Spanish mode.
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("Already in Spanish mode.");
    }
}
