package dawidzapo.behavioral.state.interface_impl;

import dawidzapo.behavioral.state.context.UberEatsMeal;
import dawidzapo.behavioral.state.state_interface.MealState;

public class PreparedState implements MealState {
    @Override
    public void nextState(UberEatsMeal meal) {
        meal.setMealState(new CookedState());
    }

    @Override
    public void previousState(UberEatsMeal meal) {
        meal.setMealState(new OrderedState());
    }

    @Override
    public void printCurrentStatus() {
        System.out.println("Meal is currently being prepared!");
    }
}
