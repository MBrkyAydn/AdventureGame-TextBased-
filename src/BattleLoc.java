public class BattleLoc extends Location {
    protected Enemies enemies;
    protected String lName;
    String hit;

    public BattleLoc(Player player, String lName, Enemies enemies) {

        super(player);
        this.lName = lName;
        this.enemies = enemies;
    }

    @Override
    public boolean getLocation() {
        int enemyCount = enemies.countEnemies();
        System.out.println("You are in the " + this.lName);
        System.out.println("There is/are " + enemyCount + " " + enemies.getEnmyName());
        System.out.println("<F>ight or <R>un ");
        hit = scan.nextLine().toUpperCase();

        if (hit.equals("F")) {
            if (combat(enemyCount)) {

                return true;
            } else {
                return false;
            }
        } else if (hit.equals("R")) {
            System.out.println("You had Run");
            return true;
        }
        return true;
    }

    public boolean combat(int enemy) {
        int totalHealth = enemies.getEnmyHealth() * enemy;
        int totalDamage = enemies.getEnmyDamage() * enemy;
        int enmyBasedHealth = enemies.getEnmyHealth();

        for (int i = 0; i < 1; i++) {
            enemyStats();
            playerStats();

            while (player.getHealth() > 0 && totalHealth > 0) {

                System.out.println("<H>it or <R>un.");
                hit = scan.nextLine().toUpperCase();

                if (hit.equals("H")) {
                    System.out.println("Hit the " + enemies.getEnmyName());
                    totalHealth = (totalHealth - player.getTotalDamage());
                    enemies.setEnmyHealth(totalHealth);

                    if (totalHealth > 0) {
                        System.out.println(enemies.getEnmyName() + " Hit You");

                        int netDamage = totalDamage - player.getInv().getArm();
                        if (netDamage < 0) netDamage = 0;

                        player.setHealth(player.getHealth() - netDamage);
                    }
                    afterHit(totalHealth);
                    if (totalHealth <= 0 && player.getHealth() > 0) {
                        System.out.println("Congratulations!!");
                        enemies.setEnmyHealth(enmyBasedHealth);
                        System.out.println("All enemies have been combat!");
                        getLoot();
                        player.setGold(player.getGold() + enemies.getEnmyAward());

                        return true;
                    }

                    if (player.getHealth() <= 0) {
                        System.out.println("You are Dead");
                        enemies.setEnmyHealth(enmyBasedHealth);
                        return false;
                    }

                } else if (hit.equals("R")) {
                    System.out.println("You had Run");
                    enemies.setEnmyHealth(enmyBasedHealth);
                    player.setHealth(player.getHealth());
                    return true;
                }
            }
        }
        return true;
    }

    public void enemyStats() {
        System.out.println("Enemy Stats : ");
        System.out.println("Health : " + enemies.getEnmyHealth());
        System.out.println("Damage: " + enemies.getEnmyDamage());
        System.out.println("Award :" + enemies.getEnmyAward());
        System.out.println("Loot :" + enemies.getLoot());

    }

    public void playerStats() {
        System.out.println("Player Stats : ");
        System.out.println("Health : " + player.getHealth());
        System.out.println("Damage: " + player.getTotalDamage());
        System.out.println("Armor : " + player.getInv().getArm());
    }

    public void getLoot() {
        String loot = enemies.getLoot();
        if (loot.equals("Food")) {
            player.getInv().setFood(true);
        }
        if (loot.equals("Water")) {
            player.getInv().setWater(true);
        }
        if (loot.equals("FireWood")) {
            player.getInv().setFireWood(true);
        }

    }

    public void afterHit(int totalhealth) {
        System.out.println("Health After Hit : " + player.getHealth());
            if(totalhealth <= 0){totalhealth = 0;}
        System.out.println("Enemy Health After Hit : " + totalhealth);

    }
}
