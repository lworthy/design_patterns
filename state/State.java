import java.util.ArrayList;

public abstract class State {
    protected MusicBox box;

    public State(MusicBox box) {
        this.box = box;
    }

    public abstract void pressStarButton();

    public abstract void pressHappyButton();

    public abstract void pressEnglishButton();

    public abstract void pressFrenchButton();

    public abstract void pressSpanishButton();

    protected void playSong(String songName, String fileName) {
        ArrayList<String> lyrics = FileReader.getLyrics(fileName);
        System.out.println("\nPlaying: " + songName);
        for (String line : lyrics) {
            System.out.println(line);
            LanguageSongs.sleep(); // Simulate playing the song
        }
    }
}