import java.util.ArrayList;

@SuppressWarnings("unused")
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}