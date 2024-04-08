package dawidzapo.creational.abstractFactory.tables;

public class OldFashionedTable implements Table{
    @Override
    public void serveDinner() {
        System.out.println("Eating at old-fashioned table");
    }
}
