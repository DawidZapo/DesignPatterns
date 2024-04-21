package dawidzapo.behavioral.command.controller;

import dawidzapo.behavioral.command.command_interface.Command;

import java.util.Stack;

public class Controller implements Command {
    private Command command;
    private Stack<Command> history;

    public void setCommand(Command command){
        this.command = command;
        this.history = new Stack<>();
    }

    @Override
    public void execute() {
        command.execute();
        push(command);
    }
    public void push(Command command){
        history.push(command);
    }
    public Command pop(){
        return history.pop();
    }
}
