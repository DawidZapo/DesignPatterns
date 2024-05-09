package dawidzapo.behavioral.memento.plays_in_match_case.builder.shot;

import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Contested;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.ShotType;
import dawidzapo.behavioral.memento.plays_in_match_case.source.plays.enums.Zone;

import java.time.LocalDateTime;

public class ShotDirector {
    public void buildMissedContestedTopOfTheKeyThree(Long playerId, Long matchId, ShotBuilder shotBuilder){
        shotBuilder.reset();
        setPlayerAndMatchId(shotBuilder,playerId, matchId);
        shotBuilder.setLocalDateTime(LocalDateTime.now());
        shotBuilder.setMade(false);
        shotBuilder.setContested(Contested.HARD_CONTESTED);
        shotBuilder.setZone(Zone.TOP_OF_THE_KEY_3);
        shotBuilder.setWorth(0);
        shotBuilder.setShotPlay(ShotType.JUMP_SHOT);
    }

    public void buildMadeWideOpenRightCornerThree(Long playerId, Long matchId, ShotBuilder shotBuilder){
        shotBuilder.reset();
        setPlayerAndMatchId(shotBuilder,playerId, matchId);
        shotBuilder.setLocalDateTime(LocalDateTime.now());
        shotBuilder.setMade(true);
        shotBuilder.setContested(Contested.WIDE_OPEN);
        shotBuilder.setZone(Zone.RIGHT_CORNER_3);
        shotBuilder.setWorth(3);
        shotBuilder.setShotPlay(ShotType.JUMP_SHOT);
    }
    public void buildMadeHardContestedLeftWingTwo(Long playerId, Long matchId, ShotBuilder shotBuilder){
        shotBuilder.reset();
        setPlayerAndMatchId(shotBuilder,playerId,matchId);
        shotBuilder.setLocalDateTime(LocalDateTime.now());
        shotBuilder.setMade(true);
        shotBuilder.setContested(Contested.HARD_CONTESTED);
        shotBuilder.setZone(Zone.LEFT_WING_2);
        shotBuilder.setWorth(2);
        shotBuilder.setShotPlay(ShotType.JUMP_SHOT);
    }

    private void setPlayerAndMatchId(ShotBuilder shotBuilder, Long playerId, Long matchId){
        shotBuilder.setPlayerId(playerId);
        shotBuilder.setMatchId(matchId);
    }
}
