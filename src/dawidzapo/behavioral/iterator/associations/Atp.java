package dawidzapo.behavioral.iterator.associations;

import dawidzapo.behavioral.iterator.player.Association;
import dawidzapo.behavioral.iterator.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Atp {
    private static Atp instance;
    private List<Player> players;
    private Association association;

    private Atp(){
        this.players = new ArrayList<>();
        this.association = Association.ATP;
        populatePlayers();
    }

    private void populatePlayers(){
        if(players == null){
            players = new ArrayList<>();
        }
        players.addAll(List.of(
                new Player("Nick Kyrgios",45, Association.ATP),
                new Player("Novak Djokovic",2, Association.ATP),
                new Player("Jannick Sinner",1, Association.ATP),
                new Player("Stan Wawrinka",76, Association.ATP),
                new Player("Huber Hurkacz",7, Association.ATP),
                new Player("Tommy Paul",12, Association.ATP),
                new Player("Taylor Fritz",11, Association.ATP)));
    }

    public static Atp getInstance(){
        Atp result = instance;
        if(result != null){
            return result;
        }
        synchronized (Atp.class){
            if(instance == null){
                instance = new Atp();
            }
            return instance;
        }
    }

    public List<Player> getPlayers() {
        return players;
    }
}
