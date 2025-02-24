import java.time.LocalTime;

/**
 * Represents a flight between two airports.
 */
public class Flight {
    @SuppressWarnings("unused")
    private String flightNum;
    private Airport from;
    private Airport to;
    private LocalTime startTime;
    private LocalTime endTime;
    private int numTransfers;

    /**
     * Constructor for Flight object.
     * 
     * @param flightNum    Flight number.
     * @param from         Origin airport.
     * @param to           Destination airport.
     * @param startTime    Departure time.
     * @param endTime      Arrival time.
     * @param numTransfers Number of transfers.
     */
    public Flight(String flightNum, Airport from, Airport to, LocalTime startTime, LocalTime endTime,
            int numTransfers) {
        this.flightNum = flightNum;
        this.from = from;
        this.to = to;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numTransfers = numTransfers;
    }

    public Airport getFrom() {
        return from;
    }

    public Airport getTo() {
        return to;
    }

    /**
     * Checks if the flight matches given origin and destination airports.
     */
    public boolean sameLoc(Airport from, Airport to) {
        return this.from == from && this.to == to;
    }

    /**
     * Returns a formatted string representing flight details.
     */
    @Override
    public String toString() {
        String transfersText = (numTransfers == 0) ? "Direct Flight" : numTransfers + " Transfers";
        return String.format("%s to %s %s - %s (%dh %dm) %s",
                from, to, startTime, endTime,
                java.time.Duration.between(startTime, endTime).toHours(),
                java.time.Duration.between(startTime, endTime).toMinutesPart(),
                transfersText);
    }
}