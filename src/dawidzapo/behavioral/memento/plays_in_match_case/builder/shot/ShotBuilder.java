package dawidzapo.behavioral.memento.plays_in_match_case.builder.shot;

import dawidzapo.behavioral.memento.plays_in_match_case.builder.Builder;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.Play;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.ShotPlay;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Contested;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.ShotType;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Zone;

import java.time.LocalDateTime;

public class ShotBuilder implements Builder {
    private ShotPlay shotPlay;

    @Override
    public void reset() {
        this.shotPlay = new ShotPlay();
    }

    @Override
    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.shotPlay.setLocalDateTime(localDateTime);
    }

    @Override
    public void setPlayerId(Long playerId) {
        this.shotPlay.setPlayerId(playerId);
    }

    @Override
    public void setMatchId(Long matchId) {
        this.shotPlay.setMatchId(matchId);
    }

    @Override
    public void setComments(String comments) {
        this.shotPlay.setComments(comments);
    }

    public void setMade(boolean made){
        this.shotPlay.setMade(made);
    }
    public void setContested(Contested contested){
        this.shotPlay.setContested(contested);
    }
    public void setZone(Zone zone){
        this.shotPlay.setZone(zone);
    }
    public void setWorth(int worth){
        this.shotPlay.setWorth(worth);
    }
    public void setShotPlay(ShotType shotPlay){
        this.shotPlay.setShotType(shotPlay);
    }

    @Override
    public Play getResult() {
        return this.shotPlay;
    }
}
