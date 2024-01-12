package gof.behavioural.command.command;

import gof.behavioural.command.Chef;

public class RemoveMushrooms implements Command {

    public final Chef chef;

    public RemoveMushrooms(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.removeMushrooms();
    }

    @Override
    public void undo() {
        chef.addMushrooms();
    }
}