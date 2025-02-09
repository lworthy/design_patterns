import java.util.ArrayList;

/*
Represents the abstract state in the State Design Pattern.
Each concrete state (English, French, Spanish) will extend this class
 to define language-specific behavior for the MusicBox.
 */
public abstract class State {
    /* Reference to the MusicBox to allow state transitions */
    protected MusicBox box;

    /*
     * Constructs a State object and associates it with a MusicBox.
     * 
     * @param box The MusicBox instance this state is associated with.
     */
    public State(MusicBox box) {
        this.box = box;
    }

    /*
     * Plays the "Twinkle Twinkle Little Star" song in the current language.
     * This method must be implemented by concrete state classes.
     */
    public abstract void pressStarButton();

    /*
     * Plays the "If You're Happy and You Know It" song in the current language.
     * This method must be implemented by concrete state classes.
     */
    public abstract void pressHappyButton();

    /*
     * Switches the MusicBox to English mode.
     * This method must be implemented by concrete state classes.
     */
    public abstract void pressEnglishButton();

    /*
     * Switches the MusicBox to French mode.
     * This method must be implemented by concrete state classes.
     */
    public abstract void pressFrenchButton();

    /*
     * Switches the MusicBox to Spanish mode.
     * This method must be implemented by concrete state classes.
     */
    public abstract void pressSpanishButton();

    /**
     * Plays a song by retrieving lyrics from a file and displaying them line by
     * line.
     * 
     * @param songName The name of the song being played.
     * @param fileName The file name containing the song lyrics.
     */
    protected void playSong(String songName, String fileName) {
        ArrayList<String> lyrics = FileReader.getLyrics(fileName);
        System.out.println("\nPlaying: " + songName);
        for (String line : lyrics) {
            System.out.println(line);
            LanguageSongs.sleep(); // Simulate playing the song
        }
    }
}
