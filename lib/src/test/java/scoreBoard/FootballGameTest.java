/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package scoreBoard;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FootballGameTest {
    private FootballTeam teamA;
    private FootballTeam teamB;
    private FootballGame game;

    @BeforeEach
    public void setup() {
        teamA = new FootballTeam("Canada");
        teamB = new FootballTeam("Spain");
        game = new FootballGame(teamA, teamB);


    }
    @Test
    public void testGameCreateWithZeroScore() {

        assertEquals(0, game.getHomeScore());
        assertEquals(0, game.getAwayScore());

    }
    @Test
    public void testGameCreateTeamName() {

        assertEquals(game.getHomeTeam().getName(), "Canada");
        assertEquals(game.getAwayTeam().getName(), "Spain");

    }
    @Test
    public void testUpdateScoreWithValidValues() {
        game.updateScore(2, 1);
        assertEquals(2, game.getHomeScore());
        assertEquals(1, game.getAwayScore());
    }
    @Test
    public void testUpdateScoreWithNegativeValuesThrowsException() {
        // Attempt to update scores with negative values
        assertThrows(IllegalArgumentException.class, () -> game.updateScore(-1, 2));
        assertThrows(IllegalArgumentException.class, () -> game.updateScore(3, -2));
        assertThrows(IllegalArgumentException.class, () -> game.updateScore(-1, -2));
    }

    @Test
    public void testUpdateScoreThrowsExceptionForFinishedGame() {
        game.finishGame();

        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> game.updateScore(2, 1));

        assertEquals("Cannot update score for a finished game.", exception.getMessage());
    }

}