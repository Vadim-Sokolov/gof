package gof.behavioural.command.command;

import gof.behavioural.command.Chef;

public class RemoveBaconCommand implements Command {

    public final Chef chef;

    public RemoveBaconCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.removeBacon();
    }

    @Override
    public void undo() {
        chef.addBacon();
    }
}
