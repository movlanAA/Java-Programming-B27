package day38_encapsulation.flight;

public class Airport {
    public static void main(String[] args) {

        FlightTicket ticket1 = new FlightTicket("first", "Chicago", "Virgina");
        System.out.println(ticket1.getType());
        System.out.println(ticket1.getDepartureLocation());
        System.out.println(ticket1.getArrivalLocation());

        FlightTicket ticket2 = new FlightTicket("flying", "New York", "Canada");
        System.out.println(ticket2.getType());

        ticket2.setType("economy");
        System.out.println(ticket2.getType());

    }
}
