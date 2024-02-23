package gof.behavioural.command.command;

import gof.behavioural.command.Chef;

public class AddTomato  implements Command {

    public final Chef chef;

    public AddTomato(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.addTomato();
    }

    @Override
    public void undo() {
        chef.removeTomato();
    }
}