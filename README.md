# Football-World-Cup-ScoreBoard
A simple java library to create, update and display summary of football game for the football game

The board supports the following operations:
Start a game. When a game starts, it should capture (being initial score 0 – 0): a. Home team b. Away team
Finish game. It will remove a match from the scoreboard.
Update score. Receiving the pair score;home team score and away team score updates a game score.
Get a summary of games by total score. Those games with the same total score will be returned ordered by the most recently added to our system. As an example, being the current data in the system:
1. Mexico - Canada: 0 - 5
2. Spain - Brazil: 10 – 2
3. Germany - France: 2 – 2
4. Uruguay - Italy: 6 – 6
5. Argentina - Australia: 3 - 1
   The summary would provide with the following information:
1. Uruguay 6 - Italy 6
2. Spain 10 - Brazil 2
3. Mexico 0 - Canada 5
4. Argentina 3 - Australia 1
5. Germany 2 - France 2
