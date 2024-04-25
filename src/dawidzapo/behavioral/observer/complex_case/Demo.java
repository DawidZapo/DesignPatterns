package dawidzapo.behavioral.observer.complex_case;

import dawidzapo.behavioral.observer.complex_case.helper_class.Club;
import dawidzapo.behavioral.observer.complex_case.helper_class.GameHistory;
import dawidzapo.behavioral.observer.complex_case.helper_class.League;
import dawidzapo.behavioral.observer.complex_case.observer.Profile;
import dawidzapo.behavioral.observer.complex_case.subject.Game;

import java.util.Random;

public class Demo {
    private static Random random = new Random();
    public static void main(String[] args) {
        Club celtics = new Club("Boston Celtics", "Boston", League.NBA);
        Club bulls = new Club("Chicago Bulls", "Chicago", League.NBA);
        Club gtk = new Club("GTK Gliwice", "Gliwice", League.EBL);
        Club legia = new Club("Legia Warszawa", "Warszawa", League.EBL);

        Profile profile = new Profile("jkowalski");
        profile.addFavouriteClub(celtics);
        profile.addFavouriteClub(gtk);

        Game game1 = new Game(celtics,bulls);
        Game game2 = new Game(gtk, legia);

        GameHistory gameHistory = new GameHistory();
        gameHistory.addMatch(game1);
        gameHistory.addMatch(game2);

        gameHistory.viewProfileForFavouriteClub(profile);

        simulateGame(game1);
        simulateGame(game2);

    }

    public static void simulateGame(Game game){
        int a = random.nextInt(50) + 50;
        int b = random.nextInt(50) + 50;
        String score = a + " : " + b;

        game.matchReminder();
        game.startMatch();
        game.callClutchTime();
        game.endMatch(score);
    }
}
