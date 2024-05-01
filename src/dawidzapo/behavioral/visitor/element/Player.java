package dawidzapo.behavioral.visitor.element;

import dawidzapo.behavioral.visitor.visitor_interface.Visitor;

public class Player implements Element{
    int points;
    int games;
    int sets;

    public Player() {
        this.points = 0;
        this.games = 0;
        this.sets = 0;
    }

    public int getPoints() {
        return points;
    }

    public int getGames() {
        return games;
    }

    public int getSets() {
        return sets;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
