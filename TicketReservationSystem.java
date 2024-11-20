public class TicketReservationSystem {
    public static void main(String[] args) {
        Ticket economyTicket = new EconomyTicket("Budi Arie", "Surabaya - Jakarta", 1000000);
        Ticket businessTicket = new BusinessTicket("Ketut Pakok", "Surabaya - Sydney", 3000000);
        Ticket firstClassTicket = new FirstClassTicket("Putu James", "Surabaya - Japan", 15000000);

        economyTicket.displayTicketDetails();
        businessTicket.displayTicketDetails();
        firstClassTicket.displayTicketDetails();
    }
}
