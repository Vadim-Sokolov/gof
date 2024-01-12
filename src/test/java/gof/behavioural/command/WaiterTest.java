package gof.behavioural.command;

import gof.behavioural.command.command.Command;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class WaiterTest {

    @Test
    void testNotifyChef() {
        // WHEN
        var mockCommand = mock(Command.class);
        Waiter waiter = new Waiter(mockCommand);

        // WHEN
        waiter.notifyChef();

        // THEN
        verify(mockCommand, times(1)).execute();
    }
}
