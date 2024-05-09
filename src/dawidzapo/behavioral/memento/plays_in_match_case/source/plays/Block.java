package dawidzapo.behavioral.memento.plays_in_match_case.source.plays;

import dawidzapo.behavioral.memento.plays_in_match_case.source.Match;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Zone;

import java.time.LocalDateTime;

public class Block extends Play{
    private Long blockedPlayerId;
    private Zone zone;

    public Block(Long id, LocalDateTime localDateTime, Long playerId, Match matchId, Long blockedPlayerId, Zone zone) {
        super(id, localDateTime, playerId, matchId);
        this.blockedPlayerId = blockedPlayerId;
        this.zone = zone;
    }
}
