package grasp.polymorphism.animal.behaviour;

public class BirdBehaviour implements AnimalBehaviour {
    @Override
    public void performAction() {
        System.out.println("FLY FLY FLY");
    }
}
