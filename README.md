# rock-paper-scissors

Rock-Paper-Scissors is a hand game played between two people, in which each player simultaneously forms one of three shapes with an outstretched hand. These shapes are **rock**, **paper** and **scissors**, whereas the following rules apply:

* scissors beats paper
* rock beats scissors
* paper beats rock
* same shapes result in a tie

The *rock-paper-scissors* application simulates two players with different strategies challenging each other for a certain number of rounds. The result of each round is added to a scorecard and printed at the end of the game.

## Build
The project is build with [Maven](https://maven.apache.org/).

	$ cd rock-paper-scissors
	$ mvn clean install
	
## Run
The Maven build creates a *rock-paper-scissors-\<version>.jar* file inlcuding all dependencies in the *target* directory that can be run without any command line arguments.

	$ cd rock-paper-scissors
	$ java -jar target/rock-paper-scissors-1.0.0.jar
	
You should see an outcome similar to:

	Player A wins 35 of 100 games
	Player B wins 31 of 100 games
	Tie: 34 of 100 games