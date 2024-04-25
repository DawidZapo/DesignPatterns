package dawidzapo.behavioral.state.state_interface;

import dawidzapo.behavioral.state.context.UberEatsMeal;

public interface MealState {
    void nextState(UberEatsMeal meal);
    void previousState(UberEatsMeal meal);
    void printCurrentStatus();
}
