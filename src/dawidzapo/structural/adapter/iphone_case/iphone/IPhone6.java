package dawidzapo.structural.adapter.iphone_case.iphone;

import dawidzapo.structural.adapter.iphone_case.charger.Charger;

public class IPhone6 implements IPhone {
    Charger iPhone4to6Adapter;

    public IPhone6(Charger iPhone4to6Adapter) {
        this.iPhone4to6Adapter = iPhone4to6Adapter;
    }

    @Override
    public void onCharge() {
        this.iPhone4to6Adapter.charge();
    }
}
