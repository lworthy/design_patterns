/**
 * Represents the English state of the MusicBox.
 * This state allows the user to play songs in English and switch to other
 * languages.
 */
public class EnglishState extends State {
    /** File path for the English version of "Twinkle Twinkle Little Star" */
    private static final String TWINKLE_FILE_NAME = "state/songs/twinkle_english.txt";

    /** File path for the English version of "If You're Happy and You Know It" */
    private static final String HAPPY_FILE_NAME = "state/songs/happy_english.txt";

    /**
     * Constructs an EnglishState object.
     * 
     * @param box The MusicBox instance this state is associated with.
     */
    public EnglishState(MusicBox box) {
        super(box);
    }

    /*
     * Plays "Twinkle Twinkle Little Star" in English.
     */
    @Override
    public void pressStarButton() {
        playSong("Twinkle Twinkle Little Star (English)", TWINKLE_FILE_NAME);
    }

    /*
     * Plays "If You're Happy and You Know It" in English.
     */
    @Override
    public void pressHappyButton() {
        playSong("If You're Happy and You Know It (English)", HAPPY_FILE_NAME);
    }

    /*
     * Indicates that the MusicBox is already in English mode.
     */
    @Override
    public void pressEnglishButton() {
        System.out.println("Already in English mode.");
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
     * Switches the MusicBox to Spanish mode.
     */
    @Override
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish...");
        box.setState(box.getSpanishState());
    }
}