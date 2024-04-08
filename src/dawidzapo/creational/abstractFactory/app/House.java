package dawidzapo.creational.abstractFactory.app;

import dawidzapo.creational.abstractFactory.chairs.Chair;
import dawidzapo.creational.abstractFactory.factories.FurnitureFactory;
import dawidzapo.creational.abstractFactory.sofas.Sofa;
import dawidzapo.creational.abstractFactory.tables.Table;

public class House {
    private Chair chair;
    private Sofa sofa;
    private Table table;

    public House(FurnitureFactory factory){
        chair = factory.createChair();
        sofa = factory.createSofa();
        table = factory.createTable();
    }

    public void haveParty(){
        chair.sit();
        sofa.sit();
        table.serveDinner();
    }
}
