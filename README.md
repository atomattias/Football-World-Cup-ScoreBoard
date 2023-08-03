# Football-World-Cup-ScoreBoard
The Football World Cup Score Board is a Java library that provides functionality for managing football games, their scores, and summaries of finished games. This library is designed with a focus on Object-Oriented Design, Clean Code, and adherence to SOLID principles.

### Assumptions
The Football World Cup Score Board is designed for managing football games in a single tournament or event.
Each game involves two teams: a home team and an away team.
The score of a game is represented by the number of goals scored by the home team and the away team.
A game can be in progress or finished. Once a game is finished, its score cannot be updated.
The score board keeps track of games in progress and finished games separately.
The score board provides functionality to start a new game between two teams, finish a game, update the score of a game in progress, and get summaries of finished games.
The summary of finished games is sorted first by the total score (sum of home team score and away team score) in descending order. If two games have the same total score, they are further sorted by the most recently finished game first.
The library assumes that the FootballGame class holds the basic information for each football game, such as the home team, away team, scores and finished status.
The library assumes that the FootballTeam class represents a football team and holds relevant information about the team, such as the team name.
### Usage
#### Start a Game
To start a new game between two teams, use the startGame method of the FootballScoreBoard class, providing the FootballTeam objects for the home team and away team.

````
```
FootballTeam teamA = new FootballTeam("Canada");
FootballTeam teamB = new FootballTeam("Spain");

FootballScoreBoard scoreBoard = new FootballScoreBoard();
scoreBoard.startGame(teamA, teamB);```
````

#### Finish a Game
To finish a game, use the finishGame method of the FootballScoreBoard class, passing the FootballGame object representing the game to finish.

````
```
FootballGame gameToFinish = ... // Get the FootballGame object to finish from the score board or other sources.

FootballScoreBoard scoreBoard = new FootballScoreBoard();
scoreBoard.finishGame(gameToFinish);```
````

#### Update Score
To update the score of a game in progress, use the updateScore method of the FootballScoreBoard class, passing the FootballGame object and the updated home score and away score.

````
```
FootballGame gameToUpdateScore = ... // Get the FootballGame object to update from the score board or other sources.
int updatedHomeScore = ...; // The updated home score.
int updatedAwayScore = ...; // The updated away score.

FootballScoreBoard scoreBoard = new FootballScoreBoard();
scoreBoard.updateScore(gameToUpdateScore, updatedHomeScore, updatedAwayScore);```
````

#### Get Summary of Finished Games
To get a summary of all finished games sorted by total score and most recently finished game, use the getFinishedGamesSortedByTotalScoreAndRecentlyAdded method of the FootballScoreBoard class.


````
```
FootballScoreBoard scoreBoard = new FootballScoreBoard();
List<FootballGame> finishedGamesSummary = scoreBoard.getFinishedGamesSortedByTotalScoreAndRecentlyAdded();```
````
Contributing
We welcome contributions to enhance the Football World Cup Score Board library. If you find any issues or have suggestions for improvement, please feel free to open an issue or submit a pull request on our GitHub repository.

License
This project is licensed under the MIT License. Feel free to use, modify, and distribute the library following the terms of the license.



