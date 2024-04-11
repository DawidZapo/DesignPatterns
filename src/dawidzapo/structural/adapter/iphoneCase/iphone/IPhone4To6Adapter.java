package dawidzapo.structural.adapter.iphoneCase.iphone;

import dawidzapo.structural.adapter.iphoneCase.charger.Charger;
import dawidzapo.structural.adapter.iphoneCase.charger.IPhone4Charger;

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
