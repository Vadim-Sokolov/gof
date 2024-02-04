package gof.behavioural.observer;

import gof.behavioural.observer.observer.AirportObserver;
import gof.behavioural.observer.observer.RoadObserver;
import gof.behavioural.observer.observer.SchoolObserver;

import java.util.stream.IntStream;

public class Runner {

    public static void main(String[] args) {
        var publisher = new Publisher();

        var airportObserver = new AirportObserver();
        var schoolObserver = new SchoolObserver();
        var roadObserver = new RoadObserver();

        publisher.register(airportObserver);
        publisher.register(schoolObserver);
        publisher.register(roadObserver);

        IntStream.range(0, 10)
                .forEach(i -> {
                    publisher.updateForecast();
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.getMessage();
                    }
                });
    }
}
