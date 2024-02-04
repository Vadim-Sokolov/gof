package gof.behavioural.observer.observer;

import gof.behavioural.observer.Warning;

public class RoadObserver implements Observer {

    @Override
    public void update(Warning warning) {
        if (!warning.equals(Warning.GREEN)) {
            soundAlarm();
        }
    }

    private void soundAlarm() {
        System.out.println("ROAD STORM WARNING");
    }
}
