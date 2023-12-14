package gof.structural.flyweight.model;

import gof.structural.flyweight.model.Unit;

import java.util.List;

public interface Brigade<T extends Unit> {

    void addUnit(T unit);

    void addUnits(List<T> units);

    void removeUnitById(int id);

    void removeDestroyedUnits();

    List<T> getListOfUnits();
}
