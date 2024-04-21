package dawidzapo.behavioral.command;

import dawidzapo.behavioral.command.concrete_command.GetHurtCommand;
import dawidzapo.behavioral.command.concrete_command.JumpCommand;
import dawidzapo.behavioral.command.concrete_command.RunCommand;
import dawidzapo.behavioral.command.controller.Controller;
import dawidzapo.behavioral.command.receiver.Player;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player("Mario");
        Controller controller = new Controller();

        GetHurtCommand getHurtCommand = new GetHurtCommand(player);
        JumpCommand jumpCommand = new JumpCommand(player);
        RunCommand runCommand = new RunCommand(player);

        controller.setCommand(getHurtCommand);
        controller.execute();

        controller.setCommand(jumpCommand);
        controller.execute();

        controller.setCommand(runCommand);
        controller.execute();

    }
}
