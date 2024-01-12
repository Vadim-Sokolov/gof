package gof.behavioural.command.command;

import gof.behavioural.command.Chef;

public class AddMushrooms implements Command {

    public final Chef chef;

    public AddMushrooms(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.addMushrooms();
    }

    @Override
    public void undo() {
        chef.removeMushrooms();
    }
}