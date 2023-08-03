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
}
