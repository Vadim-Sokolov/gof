package gof.behavioural.mediator;

public class RegularGuest extends Guest {

    public RegularGuest(ConciergeService concierge, String name) {
        super(concierge, name);
    }

    @Override
    public void requestService(String service) {
        System.out.println(name + " requests " + service);
        concierge.requestService(this, service);
    }

    @Override
    public void notifyGuest(String message) {
        System.out.println(name + " received notification: " + message);
    }
}
