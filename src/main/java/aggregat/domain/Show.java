package aggregat.domain;

public class Show {
    public final int maximumCapacity;
    public final boolean saleOpen;
    public final TicketInventory ticketInventory;

    public Show(int maximumCapacity, boolean saleOpen, TicketInventory ticketInventory) {
        this.maximumCapacity = maximumCapacity;
        this.saleOpen = saleOpen;
        this.ticketInventory = ticketInventory;
    }
}
