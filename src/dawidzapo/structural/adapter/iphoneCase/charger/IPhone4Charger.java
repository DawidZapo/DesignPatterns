package dawidzapo.structural.adapter.iphoneCase.charger;

public class IPhone4Charger implements Charger {

    public IPhone4Charger(){}
    @Override
    public void charge() {
        System.out.println("Charging with IPhone4 Charger");
    }
}
