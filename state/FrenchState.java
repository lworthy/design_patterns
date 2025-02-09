public class FrenchState extends State {
    private static final String TWINKLE_FILE_NAME = "state/songs/twinkle_french.txt";
    private static final String HAPPY_FILE_NAME = "state/songs/happy_french.txt";

    public FrenchState(MusicBox box) {
        super(box);
    }

    @Override
    public void pressStarButton() {
        playSong("Brille, Brille, Petite Étoile", TWINKLE_FILE_NAME);
    }

    @Override
    public void pressHappyButton() {
        playSong("Si Tu Aimes le Soleil", HAPPY_FILE_NAME);
    }

    @Override
    public void pressEnglishButton() {
        System.out.println("Switching to English...");
        box.setState(box.getEnglishState());
    }

    @Override
    public void pressFrenchButton() {
        System.out.println("Already in French mode.");
    }

    @Override
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish...");
        box.setState(box.getSpanishState());
    }
}