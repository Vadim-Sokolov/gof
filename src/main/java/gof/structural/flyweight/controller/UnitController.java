package gof.structural.flyweight.controller;

import gof.structural.flyweight.model.Unit;

import java.util.List;

public interface UnitController<T extends Unit> {

    List<String> move();

    List<String> attack();

    List<String> hold();

    List<String> stop();

    void addUnit(T unit);

    void addUnits(List<T> units);
}
