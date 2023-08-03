package scoreBoard;

public class FootballGame {
    private final FootballTeam homeTeam;
    private final FootballTeam awayTeam;
    private int homeScore;
    private int awayScore;
    private boolean finished;



    public FootballGame(FootballTeam homeTeam, FootballTeam awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
        this.finished = false;
    }
    public int getHomeScore() {
        return homeScore;
    }
    public int getAwayScore() {
        return awayScore;
    }


    public FootballTeam getHomeTeam() {
        return homeTeam;
    }

    public FootballTeam getAwayTeam() {
        return awayTeam;
    }
    public void updateScore(int homeScore, int awayScore) {
        if (homeScore < 0 || awayScore < 0) {
            throw new IllegalArgumentException("Scores cannot be negative.");
        }
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }
    public void finishGame() {
        finished = true;
    }

    public boolean isFinished() {
        return finished;
    }
}
