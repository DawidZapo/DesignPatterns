package dawidzapo.behavioral.command.concrete_command;

import dawidzapo.behavioral.command.command_interface.Command;
import dawidzapo.behavioral.command.receiver.Player;

public class JumpCommand implements Command {
    private Player player;

    public JumpCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.jump();
    }
}
