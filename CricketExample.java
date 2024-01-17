// Abstract class representing a CricketPlayer
abstract class CricketPlayer {
    String name;
    int age;

    public CricketPlayer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to play the game
    abstract void play();
}

// Concrete class representing a Batsman
class Batsman extends CricketPlayer {
    int runsScored;

    public Batsman(String name, int age, int runsScored) {
        super(name, age);
        this.runsScored = runsScored;
    }

    @Override
    void play() {
        System.out.println(name + " is batting and has scored " + runsScored + " runs.");
    }
}

// Concrete class representing a Bowler
class Bowler extends CricketPlayer {
    int wicketsTaken;

    public Bowler(String name, int age, int wicketsTaken) {
        super(name, age);
        this.wicketsTaken = wicketsTaken;
    }

    @Override
    void play() {
        System.out.println(name + " is bowling and has taken " + wicketsTaken + " wickets.");
    }
}

public class CricketExample {
    public static void main(String[] args) {
        Batsman batsman = new Batsman("Sachin", 45, 18426);
        Bowler bowler = new Bowler("Muralitharan", 49, 1347);

        batsman.play();
        bowler.play();

       /*  CricketPlayer[] players = { batsman, bowler };

        for (CricketPlayer player : players) {
            player.play();
        }*/
    }
}
