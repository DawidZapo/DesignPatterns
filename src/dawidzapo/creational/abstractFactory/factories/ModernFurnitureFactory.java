package dawidzapo.creational.abstractFactory.factories;

import dawidzapo.creational.abstractFactory.chairs.Chair;
import dawidzapo.creational.abstractFactory.chairs.ModernChair;
import dawidzapo.creational.abstractFactory.sofas.ModernSofa;
import dawidzapo.creational.abstractFactory.sofas.Sofa;
import dawidzapo.creational.abstractFactory.tables.ModernTable;
import dawidzapo.creational.abstractFactory.tables.Table;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
