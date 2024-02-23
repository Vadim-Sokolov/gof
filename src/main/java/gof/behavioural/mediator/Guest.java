package gof.behavioural.mediator;

import lombok.Data;

@Data
public abstract class Guest {

    protected ConciergeService concierge;
    protected String name;

    public Guest(ConciergeService concierge, String name) {
        this.concierge = concierge;
        this.name = name;
        concierge.addGuest(this);
    }

    public abstract void requestService(String service);

    public abstract void notifyGuest(String message);
}
