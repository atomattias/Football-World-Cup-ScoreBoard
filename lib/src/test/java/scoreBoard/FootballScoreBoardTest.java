package scoreBoard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
public class FootballScoreBoardTest {
    private FootballScoreBoard scoreBoard;
    private FootballTeam teamA;
    private FootballTeam teamB;
    private FootballTeam teamC;
    private FootballTeam teamD;
    private FootballTeam teamE;
    private FootballTeam teamF;



    @BeforeEach
    public void setup() {
        scoreBoard = new FootballScoreBoard();

        teamA = new FootballTeam("Canada");
        teamB = new FootballTeam("Spain");
        teamC = new FootballTeam("Brazil");
        teamD = new FootballTeam("France");
        teamE = new FootballTeam("Argentina");
        teamF = new FootballTeam("Ghana");

    }

    @Test
    public void testStartGameAddsGameToScoreBoard() {
        scoreBoard.startGame(teamA, teamB);

        assertEquals(1, scoreBoard.getGamesInProgress().size());
        FootballGame game = scoreBoard.getGamesInProgress().get(0);
        assertEquals(teamA, game.getHomeTeam());
        assertEquals(teamB, game.getAwayTeam());
    }
    @Test
    public void testUpdateScoreUpdatesGameScore() {
        scoreBoard.startGame(teamA, teamB);
        FootballGame game = scoreBoard.getGamesInProgress().get(0);

        scoreBoard.updateScore(game, 2, 1);

        assertEquals(2, game.getHomeScore());
        assertEquals(1, game.getAwayScore());
    }
    @Test
    public void testFinishGameRemovesGameFromScoreBoard() {
        scoreBoard.startGame(teamA, teamB);
        FootballGame game = scoreBoard.getGamesInProgress().get(0);

        scoreBoard.finishGame(game);

        assertTrue(game.isFinished());
        assertTrue(scoreBoard.finishedGames().contains(game));
    }


}
