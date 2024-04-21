package dawidzapo.behavioral.command.concrete_command;

import dawidzapo.behavioral.command.command_interface.Command;
import dawidzapo.behavioral.command.receiver.Player;

public class RunCommand implements Command {
    private Player player;

    public RunCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.run();
    }
}
