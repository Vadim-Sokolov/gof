package gof.structural.composite;

import java.util.List;

public class Node implements Element {

    private List<Element> children;
    private int index;

    public Node(List<Element> children, int index) {
        this.children = children;
        this.index = index;
    }

    @Override
    public void increment() {
        index++;
        children.forEach(Element::increment);
    }

    public void addChild(Element child) {
        children.add(child);
    }

    public List<Element> getChildren() {
        return children;
    }

    public void setChildren(List<Element> children) {
        this.children = children;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
