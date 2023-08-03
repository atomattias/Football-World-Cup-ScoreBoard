package scoreBoard;

import java.util.ArrayList;
import java.util.List;

public class FootballScoreBoard {
    private List<FootballGame> games;

    public FootballScoreBoard() {
        this.games = new ArrayList<>();
    }
    public List<FootballGame> getGames() {
        return games;
    }
    public void startGame(FootballTeam homeTeam, FootballTeam awayTeam) {
        if (homeTeam.equals(awayTeam)) {
            throw new IllegalArgumentException("Home and away teams must be different.");
        }

        FootballGame newGame = new FootballGame(homeTeam, awayTeam);
        games.add(newGame);
    }
    public void updateScore(FootballGame game, int homeScore, int awayScore) {
        if (!games.contains(game)) {
            throw new IllegalArgumentException("Game is not in progress.");
        }

        game.updateScore(homeScore, awayScore);
    }
}
