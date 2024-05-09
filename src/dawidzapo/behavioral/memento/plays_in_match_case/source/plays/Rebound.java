package dawidzapo.behavioral.memento.plays_in_match_case.source.plays;

import dawidzapo.behavioral.memento.plays_in_match_case.source.Match;

import java.time.LocalDateTime;

public class Rebound extends Play {
    private boolean offensive;

    public Rebound(Long id, LocalDateTime localDateTime, Long playerId, Match matchId, boolean offensive) {
        super(id, localDateTime, playerId, matchId);
        this.offensive = offensive;
    }
}
