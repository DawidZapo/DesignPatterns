package dawidzapo.creational.abstractFactory.factories;

import dawidzapo.creational.abstractFactory.chairs.Chair;
import dawidzapo.creational.abstractFactory.sofas.Sofa;
import dawidzapo.creational.abstractFactory.tables.Table;

public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
