import java.util.ArrayList;

public class AppartmentList {
    private ArrayList<Appartment> appartments;
    private SortBehavior sortBehavior;

    public AppartmentList() {
        this.appartments = new ArrayList<>();
        this.sortBehavior = new BubbleSort(); // Default sorting behavior
    }

    public void add(String address, int numBedrooms, int numBathrooms, double price) {
        appartments.add(new Appartment(address, numBedrooms, numBathrooms, price));
    }

    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    public ArrayList<Appartment> getSortedList() {
        ArrayList<Appartment> sortedList = new ArrayList<>(appartments);
        return sortBehavior.sort(sortedList);
    }

    public ArrayList<Appartment> getUnSortedList() {
        return new ArrayList<>(appartments);
    }
}