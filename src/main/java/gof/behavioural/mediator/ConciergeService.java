package gof.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConciergeService implements Concierge {

    private final List<Guest> guests;

    public ConciergeService() {
        this.guests = new ArrayList<>();
    }

    @Override
    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    @Override
    public void requestService(Guest guest, String service) {
        switch (service) {
            case "Call taxi" -> {
                System.out.println("Service Desk: Calling a taxi for " + guest.getName());
                guest.notifyGuest("Taxi has been called for you.");
            }
            case "Order flowers" -> {
                System.out.println("Service Desk: Ordering flowers for " + guest.getName());
                guest.notifyGuest("Flowers have been ordered for you.");
            }
            default -> System.out.println("Service Desk: Unknown service request");
        }
    }
}
