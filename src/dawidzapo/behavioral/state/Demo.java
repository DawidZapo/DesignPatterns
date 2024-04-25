package dawidzapo.behavioral.state;

import dawidzapo.behavioral.state.context.UberEatsMeal;

public class Demo {
    public static void main(String[] args) {
        UberEatsMeal meal = new UberEatsMeal();
        meal.printCurrentStatus();

        for(int i=0; i < 5; i++){
            meal.nextState();
            meal.printCurrentStatus();
        }
    }
}
