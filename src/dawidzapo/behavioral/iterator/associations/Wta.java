package dawidzapo.behavioral.iterator.associations;

import dawidzapo.behavioral.iterator.player.Association;
import dawidzapo.behavioral.iterator.player.Player;

import java.util.ArrayList;
import java.util.List;

public class Wta extends TennisAssociation{
    protected static TennisAssociation instance;
    protected List<Player> players;
    protected Association association;
    private Wta(){
        this.association = Association.WTA;
        populatePlayers();
    }

    public void populatePlayers(){
        if(players == null){
            players = new ArrayList<>();
        }
        players.addAll(List.of(
                new Player("Caroline Wozniacki",45, Association.WTA),
                new Player("Aryna Sabalenka",2, Association.WTA),
                new Player("Elena Rybakina",1, Association.WTA),
                new Player("Ons Jabeur",76, Association.WTA),
                new Player("Magda Linetty",7, Association.WTA),
                new Player("Magda Frech",12, Association.WTA),
                new Player("Coco Gauff",11, Association.WTA)));
    }
    public static TennisAssociation getInstance(){
        TennisAssociation result = instance;
        if(result != null){
            return result;
        }
        synchronized (Atp.class){
            if(instance == null){
                instance = new Wta();
            }
            return instance;
        }
    }
    public List<Player> getPlayers() {
        return players;
    }
}
