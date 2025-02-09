/**
 * The MusicBox class represents a music-playing device that supports multiple
 * languages.
 * It uses the State Design Pattern to switch between different language states.
 */
public class MusicBox {
    /* The English state of the MusicBox */
    private State englishState;

    /* The French state of the MusicBox */
    private State frenchState;

    /* The Spanish state of the MusicBox */
    private State spanishState;

    /* The current state of the MusicBox */
    private State state;

    /**
     * Constructs a MusicBox and initializes the available language states.
     * The default state is set to English.
     */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState; // Default state
    }

    /*
     * Plays the "Twinkle Twinkle Little Star" song in the current language state.
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /*
     * Plays the "If You're Happy and You Know It" song in the current language
     * state.
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /*
     * Switches the MusicBox to English mode.
     */
    public void pressEnglishButton() {
        state.pressEnglishButton();
    }

    /*
     * Switches the MusicBox to French mode.
     */
    public void pressFrenchButton() {
        state.pressFrenchButton();
    }

    /*
     * Switches the MusicBox to Spanish mode.
     */
    public void pressSpanishButton() {
        state.pressSpanishButton();
    }

    /**
     * Updates the current state of the MusicBox.
     * 
     * @param state The new state to be set.
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Retrieves the English state of the MusicBox.
     * 
     * @return The EnglishState instance.
     */
    public State getEnglishState() {
        return englishState;
    }

    /**
     * Retrieves the French state of the MusicBox.
     * 
     * @return The FrenchState instance.
     */
    public State getFrenchState() {
        return frenchState;
    }

    /**
     * Retrieves the Spanish state of the MusicBox.
     * 
     * @return The SpanishState instance.
     */
    public State getSpanishState() {
        return spanishState;
    }
}