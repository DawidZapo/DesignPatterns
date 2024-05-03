package dawidzapo.creational.factory_method.racket_case;

import dawidzapo.creational.factory_method.racket_case.factory.Factory;
import dawidzapo.creational.factory_method.racket_case.factory.WilsonFactory;
import dawidzapo.creational.factory_method.racket_case.factory.YonexFactory;

public class Demo {

    private static Factory factory;

    public static void main(String[] args) {
        chooseFactory("Yonex");
        testRacket();

        chooseFactory("Wilson");
        testRacket();
    }

    private static void chooseFactory(String brand){
        if(brand.equals("Yonex")){
            factory = new YonexFactory();
        }
        else{
            factory = new WilsonFactory();
        }
    }

    private static void testRacket(){
        factory.renderRacket();
    }
}
