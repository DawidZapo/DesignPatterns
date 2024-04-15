package dawidzapo.structural.adapter.iphone_case.charger;

public class IPhone4Charger implements Charger {

    public IPhone4Charger(){}
    @Override
    public void charge() {
        System.out.println("Charging with IPhone4 Charger");
    }
}
