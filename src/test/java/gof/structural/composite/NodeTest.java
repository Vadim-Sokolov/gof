package gof.structural.composite;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void shouldIncrementAllElementsOfTheTree() {
        // GIVEN
        Node rootNode = new Node(new ArrayList<>(), 0);

        Node node1 = new Node(new ArrayList<>(), 1);
        Node node2 = new Node(new ArrayList<>(), 2);

        Leaf leaf1 = new Leaf(3);
        Leaf leaf2 = new Leaf(4);
        Leaf leaf3 = new Leaf(5);

        rootNode.addChild(node1);
        rootNode.addChild(node2);
        rootNode.addChild(leaf1);

        node1.addChild(leaf2);
        node1.addChild(leaf3);

        // WHEN
        rootNode.increment();

        // THEN
        assertEquals(1, rootNode.getIndex());
        assertEquals(2, node1.getIndex());
        assertEquals(3, node2.getIndex());
        assertEquals(4, leaf1.getIndex());
        assertEquals(5, leaf2.getIndex());
        assertEquals(6, leaf3.getIndex());
    }
}
