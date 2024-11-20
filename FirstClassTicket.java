public class FirstClassTicket extends Ticket {
    private double surchargeRate = 0.50;

    public FirstClassTicket(String passengerName, String destination, double basePrice) {
        super(passengerName, destination, basePrice);
    }

    @Override
    public double calculateFare() {
        return basePrice * (1 + surchargeRate);
    }

    @Override
    public String getClassType() {
        return "First Class";
    }

    @Override
    public int getBaggageLimit() {
        return 40;
    }

    @Override
    public String[] getFacilities() {
        return new String[]{
            "Personalized menu",
            "Private bar",
            "Private suite",
            "Spa shower",
            "Concierge service",
            "Priority check-in"
        };
    }
}
