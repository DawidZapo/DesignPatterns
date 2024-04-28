package dawidzapo.behavioral.strategy.strategies;

import dawidzapo.behavioral.strategy.strategy_interface.ServeStrategy;

public class TKickServe implements ServeStrategy {
    @Override
    public void serve() {
        System.out.println("Performing kick serve down the T");
    }
}
