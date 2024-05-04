package dawidzapo.creational.builder.plane_case.director;

import dawidzapo.creational.builder.plane_case.builder.Builder;

public class BoeingDirector {
    public void buildBoeing737_800(Builder builder){
        builder.reset();
        builder.setModel("737-800");
        builder.setCapacity(189);
        builder.setRange(5750);
        builder.setLength(39.5);
        builder.setWingspan(35.8);
        builder.setMaxSpeed(0.82);
    }
    public void buildBoeing747_8(Builder builder){
        builder.reset();
        builder.setModel("747-8");
        builder.setCapacity(467);
        builder.setRange(14300);
        builder.setLength(76.3);
        builder.setWingspan(68.4);
        builder.setMaxSpeed(0.855);
    }
    public void buildBoeing789_9(Builder builder){
        builder.reset();
        builder.setModel("789-9");
        builder.setCapacity(290);
        builder.setRange(13950);
        builder.setLength(63);
        builder.setWingspan(60.1);
        builder.setMaxSpeed(0.85);
    }
    public void buildBoeing777_300ER(Builder builder){
        builder.reset();
        builder.setModel("777-300ER");
        builder.setCapacity(396);
        builder.setRange(13650);
        builder.setLength(73.9);
        builder.setWingspan(64.8);
        builder.setMaxSpeed(0.89);
    }
}
