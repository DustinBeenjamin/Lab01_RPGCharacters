public class Knight extends MartialArtist{
    public Knight(){
        hitPoints = 17;
        armorClass = 17;
        armorType = ArmorType.Heavy;
    }
    public void hasManeuvers(){
        System.out.println("I have some pretty cool fighting moves!");
    }
    public String toString(){
        return super.toString() + "knight.";
    }
    
}
