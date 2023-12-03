package grasp.polymorphism;

import grasp.polymorphism.animal.behaviour.BirdBehaviour;
import grasp.polymorphism.animal.behaviour.FishBehaviour;
import grasp.polymorphism.animal.behaviour.WormBehaviour;
import grasp.polymorphism.animal.model.Animal;
import grasp.polymorphism.animal.model.Bird;
import grasp.polymorphism.animal.model.Fish;
import grasp.polymorphism.animal.model.Worm;

public class Runner {

    public static void main(String[] args) {

        Animal bird = new Bird(new BirdBehaviour());
        Animal worm = new Worm(new WormBehaviour());
        Animal fish = new Fish(new FishBehaviour());

        bird.run();
        worm.run();
        fish.run();
    }
}
