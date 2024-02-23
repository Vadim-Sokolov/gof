package gof.behavioural.command.command;

import gof.behavioural.command.Chef;

public class RemoveCheese implements Command {

    public final Chef chef;

    public RemoveCheese(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.removeCheese();
    }

    @Override
    public void undo() {
        chef.addCheese();
    }
}