package scoreBoard;

import java.util.ArrayList;
import java.util.List;

public class FootballScoreBoard {
    private List<FootballGame> gamesInProgress;
    private List<FootballGame> finishedGames;


    public FootballScoreBoard() {
        this.gamesInProgress = new ArrayList<>();
        this.finishedGames = new ArrayList<>();

    }
    public List<FootballGame> getGamesInProgress() {
        return gamesInProgress;
    }
    public List<FootballGame> finishedGames() {
        return gamesInProgress;
    }
    public void startGame(FootballTeam homeTeam, FootballTeam awayTeam) {
        if (homeTeam.equals(awayTeam)) {
            throw new IllegalArgumentException("Home and away teams must be different.");
        }

        FootballGame newGame = new FootballGame(homeTeam, awayTeam);
        gamesInProgress.add(newGame);
    }
    public void updateScore(FootballGame game, int homeScore, int awayScore) {
        if (!gamesInProgress.contains(game)) {
            throw new IllegalArgumentException("Game is not in progress.");
        }

        game.updateScore(homeScore, awayScore);
    }
    public void finishGame(FootballGame game) {
        if (!gamesInProgress.contains(game)) {
            throw new IllegalArgumentException("Game is not in progress.");
        }

        game.finishGame();
        finishedGames.add(game);

    }
}
