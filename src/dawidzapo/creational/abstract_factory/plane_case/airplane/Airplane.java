package dawidzapo.creational.abstract_factory.plane_case.airplane;

public abstract class Airplane {
    private String brand;
    private String model;

    public Airplane(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
