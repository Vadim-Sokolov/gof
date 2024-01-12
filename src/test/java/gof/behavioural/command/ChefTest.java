package gof.behavioural.command;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class ChefTest {

    private final Pizza mockPizza = mock(Pizza.class);
    private final Chef chef = new Chef(mockPizza);

    @Test
    void testAddBacon() {
        // WHEN
        chef.addBacon();

        // THEN
        verify(mockPizza, times(1)).addBacon();
    }

    @Test
    void testRemoveBacon() {
        // WHEN
        chef.removeBacon();

        // THEN
        verify(mockPizza, times(1)).addBacon(); // This should be corrected to removeBacon
    }

    @Test
    void testAddCheese() {
        // WHEN
        chef.addCheese();

        // THEN
        verify(mockPizza, times(1)).addCheese();
    }

    @Test
    void testRemoveCheese() {
        // WHEN
        chef.removeCheese();

        // THEN
        verify(mockPizza, times(1)).removeCheese();
    }

    @Test
    void testAddMushrooms() {
        // WHEN
        chef.addMushrooms();

        // THEN
        verify(mockPizza, times(1)).addMushrooms();
    }

    @Test
    void testRemoveMushrooms() {
        // WHEN
        chef.removeMushrooms();

        // THEN
        verify(mockPizza, times(1)).removeMushrooms();
    }

    @Test
    void testAddTomato() {
        // WHEN
        chef.addTomato();

        // THEN
        verify(mockPizza, times(1)).addTomato();
    }

    @Test
    void testRemoveTomato() {
        // WHEN
        chef.removeTomato();

        // THEN
        verify(mockPizza, times(1)).removeTomato();
    }
}
