package dawidzapo.behavioral.observer.complex_case.helper_class;

import dawidzapo.behavioral.observer.complex_case.observer.Profile;
import dawidzapo.behavioral.observer.complex_case.subject.Game;

import java.util.ArrayList;
import java.util.List;

public class GameHistory {
    private List<Game> games;

    public GameHistory() {
        this.games = new ArrayList<>();
    }
    public void addMatch(Game game){
        games.add(game);
    }
    public void removeMatch(Game game){
        games.remove(game);
    }
    public void viewProfileForFavouriteClub(Profile profile) {
        games.stream()
                .filter(game -> profile.getFavouriteClubs().contains(game.getClub1()) || profile.getFavouriteClubs().contains(game.getClub2()))
                .forEach(game -> game.subscribeToAll(profile));
    }

}
