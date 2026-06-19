public abstract class normalLoc extends Location{

    public normalLoc(Player player,String lName) {
        super(player);
this.lName = lName;
    }
@Override
    public boolean getLocation(){

        return true;
    }

}
