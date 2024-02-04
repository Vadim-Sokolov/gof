package gof.behavioural.observer;

import gof.behavioural.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Publisher {

    private final Random random = new Random();
    private final Warning[] values = Warning.values();
    private final List<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void updateForecast() {
        notifyObservers(values[random.nextInt(values.length)]);
    }

    private void notifyObservers(Warning warning) {
        System.out.println("\nForecast update: code " + warning + "\n");
        observers.forEach(o -> o.update(warning));
    }
}
