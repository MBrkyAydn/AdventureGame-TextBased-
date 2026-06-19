public class Toolstore extends normalLoc{
int slc;
    public Toolstore(Player player) {
        super(player, "Tool Store");

    }
int selItem,buyItem;
    @Override
    public boolean getLocation() {
        System.out.println("Welcome to Tool Store");
        System.out.println();
        System.out.println("Character  : "+player.getChName()+" Gold : "+player.getGold());
        System.out.println("Select Your Choice");
        System.out.println("1- Weapons");
        System.out.println("2- Armors");
        System.out.println("3- Exıt");
        slc =scan.nextInt();
        while(slc<0 || slc>3) {
            System.out.println("Please enter a number between 1 and 3");
            break;
        }switch (slc) {
            case 1: selItem=wMenu(); buyWeapon(selItem); break;

            case 2: selItem=aMenu(); buyArmor(selItem); break;

            case 3:  break;
            default: break;
        }return true;
      
    }
    public void buyArmor(int armorId)
    {int protect=0,price=0; String armName=null;
        while(armorId<0 || armorId>4) {
            System.out.println("Please enter a number between 1 and 4"); break;
        }switch (armorId) {
            case 1: protect=3; price=50; armName="Light";
        break;
        case 2: protect=8; price=150; armName="Mıd";
            break;
        case 3: protect=15; price=300; armName="Heavy"; break;
        case 4:
            System.out.println("Exit.."); break ;
        default:
            System.out.println("Invalid");break;


    }

        if (player.getGold()<price) {
            System.out.println("You need at least gold "+price);
        }else {
            System.out.println("Purchases Successfully   "+armName);
            player.setGold(player.getGold()-price);
            player.getInv().setArmorName(armName);
            player.getInv().setArm(protect);
            player.getInv().setArm(protect);

            System.out.println("Remaining Balance : "+player.getGold());


        }



    }

public void buyWeapon(int weaponId){
        int damage=0,price=0; String wpName=null;
        while (weaponId<0 || weaponId>5){
            System.out.println("Please enter a number between 1 and 4");
}switch (weaponId){
        case 1: damage=4; wpName="Pistol";price=50;break;
        case 2: damage =8; wpName="Sword";price=150;break;
        case 3: damage =15; wpName="Rifle";price=300;break;
        case 4: break;
        default:
            System.out.println("Invalid"); break;
}if (player.getGold()<price) {
        System.out.println("You need at least gold "+price);

    }else {
            System.out.println("Purchases Successfully   "+wpName);
            player.setGold(player.getGold()-price);
            player.getInv().setWeaponName(wpName);
            player.getInv().setDmg(damage);
        System.out.println("Remaining Balance : "+player.getGold());

    }


    }

    public int wMenu(){
        System.out.println("1. Pistol \t <Gold : 50 - Damage : 4>");
        System.out.println("2. Sword \t <Gold :150 - Damage : 3> ");
        System.out.println("3. Rifle \t <Gold : 300 - Damage : 15>");
        System.out.println("4- Exit");
int wpId = scan.nextInt();
return wpId;
    }
    public int aMenu(){
        System.out.println("---------Armors---------");
        System.out.println("Select Your Choice: ");
        System.out.println("1- Light <Protect : 2> <Gold :50>");
        System.out.println("2- Mid <Protect :5> <Gold :150>");
        System.out.println("3- Heavy <Protect :8> <Gold :300>");
        System.out.println("4- Exit");
        int armId = scan.nextInt();
        return armId;
    }

}
