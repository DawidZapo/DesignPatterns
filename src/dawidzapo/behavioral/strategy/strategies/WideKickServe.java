package dawidzapo.behavioral.strategy.strategies;

import dawidzapo.behavioral.strategy.strategy_interface.ServeStrategy;

public class WideKickServe implements ServeStrategy {
    @Override
    public void serve() {
        System.out.println("Performing kick serve out wide");
    }
}
