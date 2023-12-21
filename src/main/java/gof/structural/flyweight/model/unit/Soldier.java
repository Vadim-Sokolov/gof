package gof.structural.flyweight.model.unit;

import gof.structural.flyweight.model.Unit;
import gof.structural.flyweight.model.sharedinfo.SoldierSharedInfo;

public class Soldier implements Unit {

    private final int id;
    private final SoldierSharedInfo soldierSharedInfo;

    private String coordinates = "Barracks";
    private String state = "Hold";
    private int hitPoints = 100;

    public Soldier(int id) {
        this.id = id;
        this.soldierSharedInfo = SoldierSharedInfo.getInstance();
    }

    @Override
    public String move() {
        return "Soldier id: " + id + "is moving";
    }

    @Override
    public String attack() {
        return "Soldier id: " + id + "is attacking";
    }

    @Override
    public String hold() {
        return "Soldier id: " + id + "is holding";
    }

    @Override
    public String stop() {
        return "Soldier id: " + id + "is stopping";
    }

    public String getType() {
        return "Soldier";
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

    public SoldierSharedInfo getSoldierSharedInfo() {
        return soldierSharedInfo;
    }
}
