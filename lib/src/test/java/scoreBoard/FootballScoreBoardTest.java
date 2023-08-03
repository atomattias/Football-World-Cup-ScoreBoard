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
    @Test
    public void testGetFinishedGamesSortedByTotalScoreAndRecentlyAdded() {
        // Create finished games with different total scores and finish dates
        FootballGame game1 = new FootballGame(teamA, teamB);
        FootballGame game2 = new FootballGame(teamC, teamD);
        FootballGame game3 = new FootballGame(teamE, teamF);
        scoreBoard.startGame(game1);
        scoreBoard.startGame(game2);
        scoreBoard.startGame(game3);

        scoreBoard.updateScore(game1,3, 1); // Total score: 4
        scoreBoard.updateScore(game2,2, 2); // Total score: 4
        scoreBoard.updateScore(game3, 1, 0); // Total score: 1


        scoreBoard.finishGame(game1);
        scoreBoard.finishGame(game2);
        scoreBoard.finishGame(game3);

        List<FootballGame> sortedGames = scoreBoard.getFinishedGamesSortedByTotalScoreAndRecentlyAdded();

        // Test sorting by total score (descending order)
        assertEquals(4, sortedGames.get(0).getTotalScore());
        assertEquals(4, sortedGames.get(1).getTotalScore());
        assertEquals(1, sortedGames.get(2).getTotalScore());

        // Test sorting by most recently added game (descending order)
        assertEquals(game2, sortedGames.get(0));
        assertEquals(game1, sortedGames.get(1));
        assertEquals(game3, sortedGames.get(2));

    }

}
