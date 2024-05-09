package dawidzapo.behavioral.memento.plays_in_match_case.source.plays;

import dawidzapo.behavioral.memento.plays_in_match_case.source.Match;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.FoulType;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Zone;

import java.time.LocalDateTime;

public class Foul extends Play{
    private Long foulOnPlayerId;
    private FoulType foulType;
    private Zone zone;

    public Foul(Long id, LocalDateTime localDateTime, Long playerId, Match matchId, Long foulOnPlayerId, FoulType foulType, Zone zone) {
        super(id, localDateTime, playerId, matchId);
        this.foulOnPlayerId = foulOnPlayerId;
        this.foulType = foulType;
        this.zone = zone;
    }
}
