package dawidzapo.behavioral.template_method.player;

public class Player {
    private String fullName;
    private boolean serving;
    private int points;
    private int games;

    public Player(String fullName) {
        this.fullName = fullName;
        this.serving = false;
        this.points = 0;
        this.games = 0;
    }
    public void addPoint(){
        this.points += 1;
    }
    public void addGame(){
        this.games += 1;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isServing() {
        return serving;
    }

    public int getPoints() {
        return points;
    }

    public int getGames() {
        return games;
    }

    public void setServing(boolean serving) {
        this.serving = serving;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
