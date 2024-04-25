package dawidzapo.behavioral.state.context;

import dawidzapo.behavioral.state.interface_impl.OrderedState;
import dawidzapo.behavioral.state.state_interface.MealState;

public class UberEatsMeal {
    private MealState mealState = new OrderedState();

    public void setMealState(MealState mealState) {
        this.mealState = mealState;
    }

    public void previousState(){
        mealState.previousState(this);
    }
    public void nextState(){
        mealState.nextState(this);
    }
    public void printCurrentStatus(){
        mealState.printCurrentStatus();
    }
}
