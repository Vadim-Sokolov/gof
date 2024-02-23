package gof.behavioural.mediator;

public interface Concierge {

    void requestService(Guest guest, String service);
    void addGuest(Guest guest);
}
