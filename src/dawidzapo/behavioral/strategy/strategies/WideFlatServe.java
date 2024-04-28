package dawidzapo.behavioral.strategy.strategies;

import dawidzapo.behavioral.strategy.strategy_interface.ServeStrategy;

public class WideFlatServe implements ServeStrategy {
    @Override
    public void serve() {
        System.out.println("Performing flat serve out wide");
    }
}
