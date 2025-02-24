import java.util.ArrayList;
import java.util.Iterator;

/**
 * Iterator for filtering flights between two airports.
 */
public class FlightIterator implements Iterator<Flight> {
    private ArrayList<Flight> flights;
    private int position;
    private Airport from;
    private Airport to;

    /**
     * Constructor for FlightIterator.
     * 
     * @param flights List of all flights.
     * @param from    Origin airport.
     * @param to      Destination airport.
     */
    public FlightIterator(ArrayList<Flight> flights, Airport from, Airport to) {
        this.flights = flights;
        this.position = 0;
        this.from = from;
        this.to = to;
    }

    /**
     * Checks if there are more flights matching the criteria.
     */
    @Override
    public boolean hasNext() {
        while (position < flights.size()) {
            Flight flight = flights.get(position);
            if (flight.sameLoc(from, to)) {
                return true;
            }
            position++;
        }
        return false;
    }

    /**
     * Returns the next matching flight.
     */
    @Override
    public Flight next() {
        if (!hasNext()) {
            return null;
        }
        return flights.get(position++);
    }
}