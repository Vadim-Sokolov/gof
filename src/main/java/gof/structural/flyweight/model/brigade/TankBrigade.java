package gof.structural.flyweight.model.brigade;

import gof.structural.flyweight.model.Brigade;
import gof.structural.flyweight.model.unit.Tank;

import java.util.List;

public class TankBrigade implements Brigade<Tank> {

    private final List<Tank> tankBrigade;

    public TankBrigade(List<Tank> tankBrigade) {
        this.tankBrigade = tankBrigade;
    }

    @Override
    public void addUnit(Tank tank) {
        tankBrigade.add(tank);
    }

    @Override
    public void addUnits(List<Tank> tanks) {
        tankBrigade.addAll(tanks);
    }

    @Override
    public void removeUnitById(int id) {
        tankBrigade.removeIf(tank -> tank.getId() == id);
    }

    @Override
    public void removeDestroyedUnits() {
        tankBrigade.removeIf(tank -> tank.getHitPoints() <= 0);
    }

    @Override
    public List<Tank> getListOfUnits() {
        return tankBrigade;
    }
}
