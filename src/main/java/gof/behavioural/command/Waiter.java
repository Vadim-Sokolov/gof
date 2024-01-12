package gof.behavioural.command;

import gof.behavioural.command.command.Command;

public class Waiter {

    private final Command command;

    public Waiter(Command command) {
        this.command = command;
    }

    public void notifyChef() {
        command.execute();
    }
}
