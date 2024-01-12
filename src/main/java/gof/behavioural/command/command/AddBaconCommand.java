package gof.behavioural.command.command;

import gof.behavioural.command.Chef;

public class AddBaconCommand implements Command {

    public final Chef chef;

    public AddBaconCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.addBacon();
    }

    @Override
    public void undo() {
        chef.removeBacon();
    }
}
