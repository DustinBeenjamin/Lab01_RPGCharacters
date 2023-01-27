public class Barbarian extends MartialArtist{
    public Barbarian(){
        hitPoints = 21;
        armorClass = 13;
        armorType = ArmorType.Medium;
    }
    public void tendsToRage(){
        System.out.println("When I get angry, I fight better!");
    }
    public String toString(){
        return super.toString() + "barbarian.";
    }
}
