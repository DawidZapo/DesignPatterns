package dawidzapo.behavioral.strategy.strategies;

import dawidzapo.behavioral.strategy.strategy_interface.ServeStrategy;

public class TSliceServe implements ServeStrategy {
    @Override
    public void serve() {
        System.out.println("Performing slice serve down the T");
    }
}
