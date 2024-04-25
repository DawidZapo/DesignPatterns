package dawidzapo.behavioral.state.interface_impl;

import dawidzapo.behavioral.state.context.UberEatsMeal;
import dawidzapo.behavioral.state.state_interface.MealState;

public class CookedState implements MealState {
    @Override
    public void nextState(UberEatsMeal meal) {
        meal.setMealState(new PackagedState());
    }

    @Override
    public void previousState(UberEatsMeal meal) {
        meal.setMealState(new PreparedState());
    }

    @Override
    public void printCurrentStatus() {
        System.out.println("Meal has already been cooked!");
    }
}
