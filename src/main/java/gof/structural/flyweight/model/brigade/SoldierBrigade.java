package gof.structural.flyweight.model.brigade;

import gof.structural.flyweight.model.Brigade;
import gof.structural.flyweight.model.unit.Soldier;

import java.util.List;

public class SoldierBrigade implements Brigade<Soldier> {

    private final List<Soldier> soldierBrigade;

    public SoldierBrigade(List<Soldier> soldierBrigade) {
        this.soldierBrigade = soldierBrigade;
    }

    @Override
    public void addUnit(Soldier soldier) {
        soldierBrigade.add(soldier);
    }

    @Override
    public void addUnits(List<Soldier> soldiers) {
        soldierBrigade.addAll(soldiers);
    }

    @Override
    public void removeUnitById(int id) {
        soldierBrigade.removeIf(soldier -> soldier.getId() == id);
    }

    @Override
    public void removeDestroyedUnits() {
        soldierBrigade.removeIf(soldier -> soldier.getHitPoints() <= 0);
    }

    @Override
    public List<Soldier> getListOfUnits() {
        return soldierBrigade;
    }
}
