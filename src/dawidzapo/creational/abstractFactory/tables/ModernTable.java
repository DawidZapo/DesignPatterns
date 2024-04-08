package dawidzapo.creational.abstractFactory.tables;

public class ModernTable implements Table{
    @Override
    public void serveDinner() {
        System.out.println("Eating at modern table");
    }
}
