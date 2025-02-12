package aggregat.application;

import aggregat.domain.Show;
import aggregat.domain.Ticket;

import java.util.List;

public class ShowService {

    private final Show show;

    public ShowService(Show show) {
        this.show = show;
    }

    public boolean sellTickets(int number, String reservationName) {
        if (show.saleOpen && show.maximumCapacity >= show.ticketInventory.tickets.size() + number) {
            show.ticketInventory.addTickets(number, reservationName);
            return true;
        }
        return false;
    }

    public List<String> retrieveTicketsIds(String reservationName) {
        List<Ticket> ticketsWithReservationName = show.ticketInventory.tickets.stream().filter(ticket -> ticket.reservationName.equals(reservationName)).toList();
        return ticketsWithReservationName.stream().map(ticket -> ticket.id).toList();
    }
}
