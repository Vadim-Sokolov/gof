package gof.behavioural.observer.observer;

import gof.behavioural.observer.Warning;

public class SchoolObserver implements Observer {

    @Override
    public void update(Warning warning) {
        if (warning.equals(Warning.RED)) {
            soundAlarm();
        }
    }

    private void soundAlarm() {
        System.out.println("SCHOOL STORM WARNING");
    }

}
