import java.util.ArrayList;

public class StudentGovPoll implements Subject {
    private ArrayList<Observer> observers;
    private ArrayList<Candidate> candidates;
    private String school;

    public StudentGovPoll(String school) {
        this.school = school;
        this.observers = new ArrayList<>();
        this.candidates = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(candidates);
        }
    }

    public void addCandidate(String firstName, String lastName) {
        candidates.add(new Candidate(firstName, lastName));
    }

    public void enterVotes(int firstPlace, int secondPlace, int thirdPlace) {
        candidates.get(firstPlace - 1).addFirstPlaceVote();
        candidates.get(secondPlace - 1).addSecondPlaceVote();
        candidates.get(thirdPlace - 1).addThirdPlaceVote();
        notifyObservers();
    }

    public String getSchool() {
        return school;
    }
}