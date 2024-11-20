public class BusinessTicket extends Ticket {
    private double surchargeRate = 0.25;

    public BusinessTicket(String passengerName, String destination, double basePrice) {
        super(passengerName, destination, basePrice);
    }

    @Override
    public double calculateFare() {
        return basePrice * (1 + surchargeRate);
    }

    @Override
    public String getClassType() {
        return "Business";
    }

    @Override
    public int getBaggageLimit() {
        return 30;
    }

    @Override
    public String[] getFacilities() {
        return new String[]{
            "Premium meals",
            "Alcoholic beverages",
            "Wider seats",
            "Lounge access",
            "Priority check-in"
        };
    }
}
