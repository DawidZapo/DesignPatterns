package dawidzapo.structural.composite.department;

public class SingleDepartment implements Department{
    private int id;
    private String name;

    public SingleDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Here is: " + this.id + " : " + this.name + " department");
    }
}
