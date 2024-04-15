package dawidzapo.structural.adapter.iphone_case;

import dawidzapo.structural.adapter.iphone_case.iphone.IPhone4To6Adapter;
import dawidzapo.structural.adapter.iphone_case.iphone.IPhone6;

public class Demo {
    public static void main(String[] args) {
        IPhone6 iPhone6 = new IPhone6(new IPhone4To6Adapter());
        iPhone6.onCharge();
    }
}
