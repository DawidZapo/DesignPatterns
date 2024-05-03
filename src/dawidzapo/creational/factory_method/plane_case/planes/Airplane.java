package dawidzapo.creational.factory_method.plane_case.planes;

public abstract class Airplane implements Plane {
    private String brand;
    private String model;
    private boolean fastenSeatbeltSign = true;
    private boolean inAir = false;

    public Airplane(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    @Override
    public void takeOff() {
        this.inAir = true;
    }

    @Override
    public void land() {
        this.inAir = false;
    }

    @Override
    public void switchFastenSeatbeltSign() {
        this.fastenSeatbeltSign = !fastenSeatbeltSign;
    }

    @Override
    public void getInfo() {
        System.out.println("Airplane{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}');
    }
}
