package dawidzapo.behavioral.memento.plays_in_match_case.builder;

import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.Play;

import java.time.LocalDateTime;

public interface Builder {
    void reset();
    void setLocalDateTime(LocalDateTime localDateTime);
    void setPlayerId(Long playerId);
    void setMatchId(Long matchId);
    void setComments(String comments);
    Play getResult();
}
