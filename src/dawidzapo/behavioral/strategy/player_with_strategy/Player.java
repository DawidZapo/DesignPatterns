package dawidzapo.behavioral.strategy.player_with_strategy;

import dawidzapo.behavioral.strategy.strategy_interface.ServeStrategy;

public class Player{
    private ServeStrategy strategy;

    public Player(ServeStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ServeStrategy strategy) {
        this.strategy = strategy;
    }
    public void serve(){
        strategy.serve();
    }
}
