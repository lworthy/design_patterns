public class SpanishState extends State {
    private static final String TWINKLE_FILE_NAME = "state/songs/twinkle_spanish.txt";
    private static final String HAPPY_FILE_NAME = "state/songs/happy_spanish.txt";

    public SpanishState(MusicBox box) {
        super(box);
    }

    @Override
    public void pressStarButton() {
        playSong("Estrellita, ¿Dónde Estás?", TWINKLE_FILE_NAME);
    }

    @Override
    public void pressHappyButton() {
        playSong("Si Estás Feliz", HAPPY_FILE_NAME);
    }

    @Override
    public void pressEnglishButton() {
        System.out.println("Switching to English...");
        box.setState(box.getEnglishState());
    }

    @Override
    public void pressFrenchButton() {
        System.out.println("Switching to French...");
        box.setState(box.getFrenchState());
    }

    @Override
    public void pressSpanishButton() {
        System.out.println("Already in Spanish mode.");
    }
}