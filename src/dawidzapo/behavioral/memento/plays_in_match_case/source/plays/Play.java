package dawidzapo.behavioral.memento.plays_in_match_case.source.plays;

import dawidzapo.behavioral.memento.plays_in_match_case.source.Match;

import java.time.LocalDateTime;

public abstract class Play {
    protected Long id;
    protected LocalDateTime localDateTime;
    protected Long playerId;
    protected Match matchId;
    protected String comments;
    public Play(Long id, LocalDateTime localDateTime, Long playerId, Match matchId) {
        this.id = id;
        this.localDateTime = localDateTime;
        this.playerId = playerId;
        this.matchId = matchId;
    }
}
