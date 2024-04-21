package dawidzapo.behavioral.command.controller;

import dawidzapo.behavioral.command.command_interface.Command;

public class Controller implements Command {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    @Override
    public void execute() {
        command.execute();
    }
}
