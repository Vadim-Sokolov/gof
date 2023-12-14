package gof.structural.flyweight.model.unit;

import gof.structural.flyweight.model.Unit;
import gof.structural.flyweight.model.sharedinfo.TankSharedInfo;

public class Tank implements Unit {

    private final int id;
    private final TankSharedInfo tankSharedInfo;

    private String coordinates = "Factory";
    private String state = "Hold";
    private int hitPoints = 100;

    public Tank(int id) {
        this.id = id;
        this.tankSharedInfo = TankSharedInfo.getInstance();
    }

    @Override
    public String move() {
        return "Tank id: " + id + "is moving";
    }

    @Override
    public String attack() {
        return "Tank id: " + id + "is attacking";
    }

    @Override
    public String hold() {
        return "Tank id: " + id + "is holding";
    }

    @Override
    public String stop() {
        return "Tank id: " + id + "is stopping";
    }

    public String getType() {
        return "Tank";
    }

    public int getId() {
        return id;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public TankSharedInfo getTankSharedInfo() {
        return tankSharedInfo;
    }
}
