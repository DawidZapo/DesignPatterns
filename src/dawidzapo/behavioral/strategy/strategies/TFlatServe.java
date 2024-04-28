package dawidzapo.behavioral.strategy.strategies;

import dawidzapo.behavioral.strategy.strategy_interface.ServeStrategy;

public class TFlatServe implements ServeStrategy {
    @Override
    public void serve() {
        System.out.println("Performing flat serve down the T");
    }
}
