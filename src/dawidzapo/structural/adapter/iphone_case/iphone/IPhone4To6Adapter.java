package dawidzapo.structural.adapter.iphone_case.iphone;

import dawidzapo.structural.adapter.iphone_case.charger.Charger;
import dawidzapo.structural.adapter.iphone_case.charger.IPhone4Charger;

public class IPhone4To6Adapter implements Charger {
    IPhone4Charger iPhone4Charger;

    public IPhone4To6Adapter() {
        this.iPhone4Charger = new IPhone4Charger();
    }

    @Override
    public void charge() {
        iPhone4Charger.charge();
    }
}
