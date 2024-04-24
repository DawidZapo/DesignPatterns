package dawidzapo.behavioral.observer.complex_case.helper_class;

public class Club {
    private String name;
    private String location;
    private League league;
    private int points;

    public Club(String name, String location, League league) {
        this.name = name;
        this.location = location;
        this.league = league;
    }
    public void add1Point(){
        points = points + 1;
    }
    public void add2Points(){
        points = points + 2;
    }
    public void add3Points(){
        points = points + 3;
    }
}
