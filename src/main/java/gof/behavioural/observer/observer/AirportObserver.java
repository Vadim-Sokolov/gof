package gof.behavioural.observer.observer;

import gof.behavioural.observer.Warning;

public class AirportObserver implements Observer {

    @Override
    public void update(Warning warning) {
        if (warning.equals(Warning.ORANGE) || warning.equals(Warning.RED)) {
            soundAlarm();
        }
    }

    private void soundAlarm() {
        System.out.println("AIRPORT STORM WARNING");
    }
}
