public class EnglishState extends State {
    private static final String TWINKLE_FILE_NAME = "state/songs/twinkle_english.txt";
    private static final String HAPPY_FILE_NAME = "state/songs/happy_english.txt";

    public EnglishState(MusicBox box) {
        super(box);
    }

    @Override
    public void pressStarButton() {
        playSong("Twinkle Twinkle Little Star (English)", TWINKLE_FILE_NAME);
    }

    @Override
    public void pressHappyButton() {
        playSong("If You're Happy and You Know It (English)", HAPPY_FILE_NAME);
    }

    @Override
    public void pressEnglishButton() {
        System.out.println("Already in English mode.");
    }

    @Override
    public void pressFrenchButton() {
        System.out.println("Switching to French...");
        box.setState(box.getFrenchState());
    }

    @Override
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish...");
        box.setState(box.getSpanishState());
    }
}