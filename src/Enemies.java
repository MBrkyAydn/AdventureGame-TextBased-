import java.util.Random;

public abstract class Enemies {
private String enmyName,loot;
private int maxNumber,enmyHealth,enmyAward,enmyDamage;

    public Enemies(String enmyName, String loot, int maxNumber, int enmyHealth, int enmyAward, int enmyDamage) {
        this.enmyName = enmyName;
        this.loot = loot;
        this.maxNumber = maxNumber;
        this.enmyHealth = enmyHealth;
        this.enmyAward = enmyAward;
        this.enmyDamage = enmyDamage;
    }
public int countEnemies(){
    Random rand = new Random();
    return rand.nextInt(maxNumber)+1;
    }
    public String getEnmyName() {
        return enmyName;
    }

    public int getEnmyDamage() {
        return enmyDamage;
    }

    public void setEnmyDamage(int enmyDamage) {
        this.enmyDamage = enmyDamage;
    }

    public void setEnmyName(String enmyName) {
        this.enmyName = enmyName;
    }

    public String getLoot() {
        return loot;
    }

    public void setLoot(String loot) {
        this.loot = loot;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getEnmyHealth() {
        return enmyHealth;
    }

    public void setEnmyHealth(int enmyHealth) {
        this.enmyHealth = enmyHealth;
    }

    public int getEnmyAward() {
        return enmyAward;
    }

    public void setEnmyAward(int enmyAward) {
        this.enmyAward = enmyAward;
    }
}
