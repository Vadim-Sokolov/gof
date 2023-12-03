package grasp.polymorphism.animal.behaviour;

public class FishBehaviour implements AnimalBehaviour {
    @Override
    public void performAction() {
        System.out.println("SWIM SWIM SWIM");
    }
}
