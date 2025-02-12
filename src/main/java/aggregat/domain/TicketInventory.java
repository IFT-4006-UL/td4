package aggregat.domain;

import java.util.ArrayList;
import java.util.List;

public class TicketInventory {
    public final List<Ticket> tickets = new ArrayList<>();

    public void addTickets(int number, String reservationName) {
        for (int i = 0; i < number; i++) {
            tickets.add(new Ticket(reservationName));
        }
    }
}
