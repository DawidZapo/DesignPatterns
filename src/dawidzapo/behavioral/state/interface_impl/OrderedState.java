package dawidzapo.behavioral.state.interface_impl;

import dawidzapo.behavioral.state.context.UberEatsMeal;
import dawidzapo.behavioral.state.state_interface.MealState;

public class OrderedState implements MealState {
    @Override
    public void nextState(UberEatsMeal meal) {
        meal.setMealState(new PreparedState());
    }

    @Override
    public void previousState(UberEatsMeal meal) {
        System.out.println("Cannot set previous state (no earlier state)");
    }

    @Override
    public void printCurrentStatus() {
        System.out.println("Meal has been just ordered!");
    }
}
