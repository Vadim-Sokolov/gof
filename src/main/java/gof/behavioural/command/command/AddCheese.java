package gof.behavioural.command.command;

import gof.behavioural.command.Chef;

public class AddCheese implements Command {

    public final Chef chef;

    public AddCheese(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.addCheese();
    }

    @Override
    public void undo() {
        chef.removeCheese();
    }
}