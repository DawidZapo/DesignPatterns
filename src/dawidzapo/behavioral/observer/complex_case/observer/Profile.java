package dawidzapo.behavioral.observer.complex_case.observer;

import dawidzapo.behavioral.observer.complex_case.helper_class.Club;
import dawidzapo.behavioral.observer.complex_case.subject.Game;

import java.util.ArrayList;
import java.util.List;

public class Profile implements Observer{
    private String fullName;
    private List<Club> favouriteClubs;

    public Profile(String fullName) {
        this.fullName = fullName;
        favouriteClubs = new ArrayList<>();
    }

    public List<Club> getFavouriteClubs() {
        return favouriteClubs;
    }

    public Profile(String fullName, List<Club> favouriteClubs) {
        this(fullName);
        this.favouriteClubs = favouriteClubs;
    }
    public void addFavouriteClub(Club club){
        favouriteClubs.add(club);
    }
    public void removeFavouriteClub(Club club){
        favouriteClubs.remove(club);
    }

    @Override
    public void getNotification(String message, Game game) {
        System.out.println(message + "\n" + game);
    }
}
