package dawidzapo.behavioral.memento.plays_in_match_case.source.plays;

import java.time.LocalDateTime;

public abstract class Play {
    protected Long id;
    protected LocalDateTime localDateTime;
    protected Long playerId;
    protected Long matchId;
    protected String comments;

    public Play() {
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Play{" +
                "id=" + id +
                ", localDateTime=" + localDateTime +
                ", playerId=" + playerId +
                ", matchId=" + matchId +
                ", comments='" + comments + '\'' +
                '}';
    }
}
