package gof.behavioural.command.command;

import gof.behavioural.command.Chef;

public class RemoveTomato implements Command {

    public final Chef chef;

    public RemoveTomato(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.removeTomato();
    }

    @Override
    public void undo() {
        chef.addTomato();
    }
}