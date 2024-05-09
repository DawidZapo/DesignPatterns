package dawidzapo.behavioral.memento.plays_in_match_case.source.plays;

import dawidzapo.behavioral.memento.plays_in_match_case.source.Match;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Contested;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.ShotType;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Zone;

import java.time.LocalDateTime;

public class ShotPlay extends Play {
    private ShotType shotType;
    private Zone zone;
    private boolean made;
    private Contested contested;
    private int worth;

    public ShotPlay(Long id, LocalDateTime localDateTime, Long playerId, Match matchId, ShotType shotType, Zone zone, boolean made, Contested contested, int worth) {
        super(id, localDateTime, playerId, matchId);
        this.shotType = shotType;
        this.zone = zone;
        this.made = made;
        this.contested = contested;
        this.worth = worth;
    }
}
