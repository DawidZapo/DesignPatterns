package dawidzapo.behavioral.iterator.player;

public class Player {
    private String fullName;
    private int ranking;
    private Association association;

    public Player(String fullName, int ranking, Association association) {
        this.fullName = fullName;
        this.ranking = ranking;
        this.association = association;
    }

    @Override
    public String toString() {
        return "Player{" +
                "fullName='" + fullName + '\'' +
                ", ranking=" + ranking +
                ", association=" + association +
                '}';
    }
}
