package gof.structural.flyweight.controller;

import gof.structural.flyweight.model.brigade.SoldierBrigade;
import gof.structural.flyweight.model.unit.Soldier;

import java.util.List;
import java.util.stream.Collectors;

public class SoldierController implements UnitController<Soldier> {

    private final SoldierBrigade soldierBrigade;

    public SoldierController(SoldierBrigade soldierBrigade) {
        this.soldierBrigade = soldierBrigade;
    }

    @Override
    public List<String> move() {
        return soldierBrigade.getListOfUnits().stream()
                .map(Soldier::move)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> attack() {
        return soldierBrigade.getListOfUnits().stream()
                .map(Soldier::attack)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> hold() {
        return soldierBrigade.getListOfUnits().stream()
                .map(Soldier::hold)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> stop() {
        return soldierBrigade.getListOfUnits().stream()
                .map(Soldier::stop)
                .collect(Collectors.toList());
    }

    @Override
    public void addUnit(Soldier soldier) {
        soldierBrigade.addUnit(soldier);
    }

    @Override
    public void addUnits(List<Soldier> soldiers) {
        soldierBrigade.addUnits(soldiers);
    }

    public SoldierBrigade getSoldierBrigade() {
        return soldierBrigade;
    }
}
