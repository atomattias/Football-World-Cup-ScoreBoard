package scoreBoard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class FootballScoreBoardTest {
    private FootballScoreBoard scoreBoard;
    private FootballTeam teamA;
    private FootballTeam teamB;

    @BeforeEach
    public void setup() {
        scoreBoard = new FootballScoreBoard();

        teamA = new FootballTeam("Canada");
        teamB = new FootballTeam("Spain");
    }

    @Test
    public void testStartGameAddsGameToScoreBoard() {
        scoreBoard.startGame(teamA, teamB);

        assertEquals(1, scoreBoard.getGames().size());
        FootballGame game = scoreBoard.getGames().get(0);
        assertEquals(teamA, game.getHomeTeam());
        assertEquals(teamB, game.getAwayTeam());
    }
}
