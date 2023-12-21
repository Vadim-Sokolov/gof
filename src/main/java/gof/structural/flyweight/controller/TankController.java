package gof.structural.flyweight.controller;

import gof.structural.flyweight.model.brigade.TankBrigade;
import gof.structural.flyweight.model.unit.Tank;

import java.util.List;
import java.util.stream.Collectors;

public class TankController implements UnitController<Tank> {

    private final TankBrigade tankBrigade;

    public TankController(TankBrigade tankBrigade) {
        this.tankBrigade = tankBrigade;
    }

    @Override
    public List<String> move() {
        return tankBrigade.getListOfUnits().stream()
                .map(Tank::move)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> attack() {
        return tankBrigade.getListOfUnits().stream()
                .map(Tank::attack)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> hold() {
        return tankBrigade.getListOfUnits().stream()
                .map(Tank::hold)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> stop() {
        return tankBrigade.getListOfUnits().stream()
                .map(Tank::stop)
                .collect(Collectors.toList());
    }

    @Override
    public void addUnit(Tank tank) {
        tankBrigade.addUnit(tank);
    }

    @Override
    public void addUnits(List<Tank> tanks) {
        tankBrigade.addUnits(tanks);
    }

    public TankBrigade getTankBrigade() {
        return tankBrigade;
    }
}
