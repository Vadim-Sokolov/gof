package grasp.polymorphism.animal.behaviour;

public class WormBehaviour implements AnimalBehaviour {
    @Override
    public void performAction() {
        System.out.println("CRAWL CRAWL CRAWL");
    }
}
