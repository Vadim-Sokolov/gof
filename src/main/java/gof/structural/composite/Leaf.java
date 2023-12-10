package gof.structural.composite;

public class Leaf implements Element {

    private int index;

    public Leaf(int index) {
        this.index = index;
    }

    @Override
    public void increment() {
        index++;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
