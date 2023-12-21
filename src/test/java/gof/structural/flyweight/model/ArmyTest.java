package gof.structural.flyweight.model;

import gof.structural.flyweight.controller.SoldierController;
import gof.structural.flyweight.controller.TankController;
import gof.structural.flyweight.model.brigade.SoldierBrigade;
import gof.structural.flyweight.model.brigade.TankBrigade;
import gof.structural.flyweight.model.sharedinfo.SoldierSharedInfo;
import gof.structural.flyweight.model.sharedinfo.TankSharedInfo;
import gof.structural.flyweight.model.unit.Soldier;
import gof.structural.flyweight.model.unit.Tank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ArmyTest {

    private final Random random = new Random();
    private Army army;
    private final TankSharedInfo tankSharedInfo = TankSharedInfo.getInstance();
    private final SoldierSharedInfo soldierSharedInfo = SoldierSharedInfo.getInstance();

    @BeforeEach
    void setUp() {
        army = new Army(
                new TankController(new TankBrigade(createAndPopulateTankList(5))),
                new SoldierController(new SoldierBrigade(createAndPopulateSoldierList(5))));
    }

    @Test
    void tanks_shouldAllReferenceTheSameInstanceOfSharedInfo() {
        // WHEN
        var actualTextures = army.getTanks().stream()
                .map(Tank::getTankSharedInfo)
                .collect(Collectors.toList());

        // THEN
        assertTrue(actualTextures.stream().allMatch(s -> s == tankSharedInfo));
    }

    @Test
    void soldiers_shouldAllReferenceTheSameInstanceOfSharedInfo() {
        // WHEN
        var actualTextures = army.getSoldiers().stream()
                .map(Soldier::getSoldierSharedInfo)
                .collect(Collectors.toList());

        // THEN
        assertTrue(actualTextures.stream().allMatch(s -> s == soldierSharedInfo));
    }

    private List<Tank> createAndPopulateTankList(int numberOfTanks) {
        List<Tank> tanks = new ArrayList<>();

        for (int i = 0; i < numberOfTanks; i++) {
            int randomId = random.nextInt(1000);
            Tank tank = new Tank(randomId);
            tanks.add(tank);
        }
        return tanks;
    }

    private List<Soldier> createAndPopulateSoldierList(int numberOfSoldiers) {
        List<Soldier> soldiers = new ArrayList<>();

        for (int i = 0; i < numberOfSoldiers; i++) {
            int randomId = random.nextInt(1000);
            Soldier soldier = new Soldier(randomId);
            soldiers.add(soldier);
        }
        return soldiers;
    }
}