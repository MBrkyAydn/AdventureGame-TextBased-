public class SafeHouse extends normalLoc {

    public SafeHouse(Player player) {
        super(player, "SafeHouse");


    }

    boolean lot;

    public boolean getLocation() {
        check();
        player.setHealth(player.getBasedHealth());
        System.out.println("Welcome to Safe House");

        System.out.println("Remaining Balance :" + player.getGold() + " Gold");
        return true;
    }

    public void check() {
        if (player.getInv().isFood()) {
            System.out.println("You have Food");
        }
        if (player.getInv().isWater()) {
            System.out.println("You have Water");
        }
        if (player.getInv().isFireWood()) {
            System.out.println("You have Firewood");
        }
        if (player.getInv().getWeaponName() != null) {
            System.out.println("Weapon : " + player.getInv().getWeaponName() + " Damage : " + player.getDamage() + " Total Damage: " + player.getTotalDamage());
        }
        if (player.getInv().getArmorName() != null) {
            System.out.println("Armor : " + player.getInv().getArmorName() + " Protect : " + player.getInv().getArm());
        }
        if (player.getHealth()!=player.getBasedHealth()){
        System.out.println("You are healed " + player.getHealth());
        }
    }
}
