package dawidzapo.creational.builder.plane_case;

import dawidzapo.creational.builder.plane_case.builder.BoeingBuilder;
import dawidzapo.creational.builder.plane_case.builder.Builder;
import dawidzapo.creational.builder.plane_case.director.BoeingDirector;
import dawidzapo.creational.builder.plane_case.plane.Boeing;

public class Demo {
    public static void main(String[] args) {
        BoeingDirector boeingDirector = new BoeingDirector();
        Builder boeingBuilder = new BoeingBuilder();

        boeingDirector.buildBoeing737_800(boeingBuilder);
        Boeing boeing1 = boeingBuilder.getResult();

        boeingDirector.buildBoeing777_300ER(boeingBuilder);
        Boeing boeing2 = boeingBuilder.getResult();

        System.out.println(boeing1);
        System.out.println(boeing2);
    }
}
