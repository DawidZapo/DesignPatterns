package dawidzapo.structural.flyweight.factory;

import dawidzapo.structural.flyweight.concrete.ConcreteTennisBall;
import dawidzapo.structural.flyweight.flyweight_interface.Brand;
import dawidzapo.structural.flyweight.flyweight_interface.TennisBall;

import java.util.HashMap;
import java.util.Map;

public class TennisBallFactory {
    private Map<Brand, TennisBall> tennisBallCache;

    public TennisBallFactory() {
        this.tennisBallCache = new HashMap<>();
    }

    public TennisBall getTennisBall(Brand brand){
        TennisBall tennisBall = tennisBallCache.get(brand);
        if(tennisBall == null){
            tennisBall = new ConcreteTennisBall(brand);
            tennisBallCache.put(brand,tennisBall);
        }
        return tennisBall;
    }
}
