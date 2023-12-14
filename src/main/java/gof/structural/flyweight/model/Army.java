package gof.structural.flyweight.model;

import gof.structural.flyweight.controller.SoldierController;
import gof.structural.flyweight.controller.TankController;
import gof.structural.flyweight.model.unit.Soldier;
import gof.structural.flyweight.model.unit.Tank;

import java.util.List;

public class Army {

    private final TankController tankController;
    private final SoldierController soldierController;

    public Army(TankController tankController, SoldierController soldierController) {
        this.tankController = tankController;
        this.soldierController = soldierController;
    }

    public void move() {
        tankController.move();
        soldierController.move();
    }

    public void attack() {
        tankController.attack();
        soldierController.attack();
    }

    public void hold() {
        tankController.hold();
        soldierController.hold();
    }

    public void stop() {
        tankController.stop();
        soldierController.stop();
    }

    public void addUnit(Unit unit) {
        if (unit.getClass().equals(Soldier.class)) {
            soldierController.addUnit((Soldier) unit);
        }
        if (unit.getClass().equals(Tank.class)) {
            tankController.addUnit((Tank) unit);
        }
    }

    public void addSoldiers(List<Soldier> soldiers) {
        soldierController.addUnits(soldiers);
    }

    public void addTanks(List<Tank> tanks) {
        tankController.addUnits(tanks);
    }

    public List<Soldier> getSoldiers() {
        return soldierController.getSoldierBrigade().getListOfUnits();
    }

    public List<Tank> getTanks() {
        return tankController.getTankBrigade().getListOfUnits();
    }
}
