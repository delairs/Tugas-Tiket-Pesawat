public abstract class Ticket {
    protected String passengerName;
    protected String destination;
    protected double basePrice;

    public Ticket(String passengerName, String destination, double basePrice) {
        this.passengerName = passengerName;
        this.destination = destination;
        this.basePrice = basePrice;
    }

    public abstract double calculateFare();
    public abstract String getClassType();
    public abstract int getBaggageLimit();
    public abstract String[] getFacilities();

    public String getPassengerName() {
        return passengerName;
    }

    public String getDestination() {
        return destination;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void displayTicketDetails() {
        System.out.println("\n====== Ticket Details ======");
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Destination: " + destination);
        System.out.println("Class: " + getClassType());
        System.out.println("Base Price: Rp " + basePrice);
        System.out.println("Final Price: Rp " + calculateFare());
        System.out.println("Baggage Limit: " + getBaggageLimit() + " kg");
        System.out.println("Facilities:");
        for (String facility : getFacilities()) {
            System.out.println("- " + facility);
        }
    }
}
