package grasp.polymorphism.animal.model;

import grasp.polymorphism.animal.behaviour.AnimalBehaviour;

public abstract class Animal {

    private final AnimalBehaviour behaviour;

    public Animal(AnimalBehaviour behaviour) {
        this.behaviour = behaviour;
    }

    public void run() {
        behaviour.performAction();
    }
}
