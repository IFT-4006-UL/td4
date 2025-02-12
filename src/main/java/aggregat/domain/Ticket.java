package aggregat.domain;

import java.util.UUID;

public class Ticket {
    public final String id;
    public final String reservationName;
    public Ticket(String reservationName) {
        this.id = UUID.randomUUID().toString();
        this.reservationName = reservationName;
    }
}
