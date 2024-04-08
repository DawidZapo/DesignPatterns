package dawidzapo.creational.abstractFactory.factories;

import dawidzapo.creational.abstractFactory.chairs.Chair;
import dawidzapo.creational.abstractFactory.chairs.OldfashionedChair;
import dawidzapo.creational.abstractFactory.sofas.OldfashionedSofa;
import dawidzapo.creational.abstractFactory.sofas.Sofa;
import dawidzapo.creational.abstractFactory.tables.OldFashionedTable;
import dawidzapo.creational.abstractFactory.tables.Table;

public class OldfashionedFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new OldfashionedChair();
    }

    @Override
    public Sofa createSofa() {
        return new OldfashionedSofa();
    }

    @Override
    public Table createTable() {
        return new OldFashionedTable();
    }
}
