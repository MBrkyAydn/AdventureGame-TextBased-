import java.util.Scanner;

public class Player {
    Scanner scan = new Scanner(System.in);
    private String name, chName;
    private int damage, health, gold, basedHealth;
    private Inventory inv;
    int slc;

    public Player(String name) {
        this.inv = new Inventory();
        this.name = name;

    }

    public void init(String chName, int damage, int health, int gold) {
        setChName(chName);
        setDamage(damage);
        setHealth(health);
        setGold(gold);
        setBasedHealth(health);
    }

    public int getTotalDamage() {

        return this.getDamage() + this.getInv().getDmg();
    }

    public int chMenu() {
        System.out.println("Select Your Character..." + this.name);
        System.out.println("1- Samurai \t Damage : 6  \t Health :30 \t Value : 100 ");
        System.out.println("2- Bowman \t Damage : 8  \t Health :24 \t Value : 100 ");
        System.out.println("3- Knight \t Damage : 4  \t Health :45 \t Value : 150 ");
        slc = scan.nextInt();
        if (slc < 1 || slc > 3) {
            System.out.println("Invalid Input,Try Again");
            slc = scan.nextInt();

        }
        return slc;
    }

    public int getBasedHealth() {
        return basedHealth;
    }

    public void setBasedHealth(int basedHealth) {
        this.basedHealth = basedHealth;
    }

    public void chSelect() {
        switch (chMenu()) {
            case 1:
                init("Samurai", 6, 30, 100);
                break;
            case 2:
                init("Bowman", 8, 24, 100);
                break;
            case 3:
                init("Knight", 4, 45, 150);
                break;
            default:
                init("Samurai", 6, 130, 100);
                break;

        }
        System.out.println("Character Selected : " + chName);


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }
}
