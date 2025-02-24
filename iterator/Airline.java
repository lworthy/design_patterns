import java.util.ArrayList;
import java.util.Iterator;

/**
 * Represents an airline and manages flights.
 */
public class Airline {
    private String title;
    private ArrayList<Flight> flights;

    /**
     * Constructor for Airline.
     * 
     * @param title Name of the airline.
     */
    public Airline(String title) {
        this.title = title;
        this.flights = FlightLoader.getFlights();
    }

    public String getTitle() {
        return title;
    }

    /**
     * Creates an iterator to filter flights based on origin and destination.
     * 
     * @param fromCode Origin airport code.
     * @param toCode   Destination airport code.
     * @return FlightIterator containing matching flights.
     */
    public Iterator<Flight> createIterator(String fromCode, String toCode) {
        try {
            Airport from = Airport.valueOf(fromCode.toUpperCase());
            Airport to = Airport.valueOf(toCode.toUpperCase());
            return new FlightIterator(flights, from, to);
        } catch (IllegalArgumentException e) {
            System.out.println("Must enter valid airport codes");
            return null;
        }
    }
}