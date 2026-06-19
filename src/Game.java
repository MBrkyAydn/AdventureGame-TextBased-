
import java.util.Scanner;

public class Game {
    Player player;
    Inventory inv;
    Location location;
    private String pName;
    Scanner scan = new Scanner(System.in);
    int selLoc;


    public void login() {
        System.out.println("------------Welcome To Adventure------------");
        System.out.println("Please Enter Player Name : ");
        pName = scan.nextLine();
        player = new Player(pName);
        player.chSelect();
        start();


    }

    public void start() {
        boolean gameOver = false;
        while (!gameOver) {
        System.out.println();
        System.out.println("*******************");
        System.out.println("Select Your Locations...");
        System.out.println();
        System.out.println("1- Safe House------>Heal Yourself And Deliver the Loots.");
        System.out.println("2- Jungle-------> Zombie Area");
        System.out.println("3- River-------> Vampire Area");
        System.out.println("4- Cave------->  Bear Area");
        System.out.println("5- Tool Stoe------->Buy Weapns and Armors.");
        selLoc = scan.nextInt();
        while (selLoc < 1 || selLoc > 5) {
            System.out.println("Select Between 1-5");
            selLoc = scan.nextInt();
        }
        switch (selLoc) {
            case 1:
                location = new SafeHouse(player);
                break;
            case 2:
                location = new Jungle(player);
                break;
            case 3:
                location = new River(player);
                break;
            case 4:
                location = new Cave(player);
                break;

            case 5:
                location = new Toolstore(player);
                break;


        }

        if (location.getLocation()) {
                gameOver = finish();
        }else {gameOver = true;}

        }
        }
    public boolean finish(){
        if (location instanceof SafeHouse) {
            if(player.getInv().isFood() && player.getInv().isWater() && player.getInv().isFireWood()) {
                System.out.println("The Game Over!");
                System.out.println("You Won, Congratulations");
return  true;
            }
        }return false;
    }

}
