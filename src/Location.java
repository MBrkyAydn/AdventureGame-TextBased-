import java.util.Scanner;

public abstract class Location {
 protected    Player player;
    protected String lName;
    public abstract boolean getLocation();
Scanner scan = new Scanner(System.in);
    public Location(Player player) {
        this.player = player;

    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
