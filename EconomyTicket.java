public class EconomyTicket extends Ticket {
    private double discountRate = 0.10;

    public EconomyTicket(String passengerName, String destination, double basePrice) {
        super(passengerName, destination, basePrice);
    }

    @Override
    public double calculateFare() {
        return basePrice * (1 - discountRate);
    }

    @Override
    public String getClassType() {
        return "Economy";
    }

    @Override
    public int getBaggageLimit() {
        return 20;
    }

    @Override
    public String[] getFacilities() {
        return new String[]{
            "Light snacks",
            "Mineral water",
            "In-flight magazine"
        };
    }
}
