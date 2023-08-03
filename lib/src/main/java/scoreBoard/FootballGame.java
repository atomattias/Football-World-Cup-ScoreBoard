package scoreBoard;
import java.time.LocalDateTime;

public class FootballGame {
    private final FootballTeam homeTeam;
    private final FootballTeam awayTeam;
    private int homeScore;
    private int awayScore;


    public FootballGame(FootballTeam homeTeam, FootballTeam awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
    }
    public int getHomeScore() {
        return homeScore;
    }
    public int getAwayScore() {
        return awayScore;
    }


}
