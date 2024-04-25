package dawidzapo.behavioral.state.interface_impl;

import dawidzapo.behavioral.state.context.UberEatsMeal;
import dawidzapo.behavioral.state.state_interface.MealState;

public class DeliveredState implements MealState {
    @Override
    public void nextState(UberEatsMeal meal) {
        System.out.println("Cannot set next state (no next state)");
    }

    @Override
    public void previousState(UberEatsMeal meal) {
        meal.setMealState(new PackagedState());
    }

    @Override
    public void printCurrentStatus() {
        System.out.println("Meal has been delivered!");
    }
}
