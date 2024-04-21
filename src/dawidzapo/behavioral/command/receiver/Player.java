package dawidzapo.behavioral.command.receiver;

public class Player {
    private String name;
    private int stamina;

    public Player(String name) {
        this.name = name;
        this.stamina = 100;
    }
    public void jump(){
        System.out.println("Player " + name + "jumping...");
    }
    public void run(){
        System.out.println("Player " + name + " running...");
    }
    public void getHurt(){
        stamina = stamina - 10;
        System.out.println("Stamina reduced... level: " + stamina);
    }
}
