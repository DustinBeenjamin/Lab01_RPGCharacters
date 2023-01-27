public class Ranger extends Scout{
    public Ranger(){
        hitPoints = 13;
        armorClass = 15;
        armorType = ArmorType.Medium;
        weaponType = WeaponType.Martial;
    }
    public void willToSurvive(){
        System.out.println("I will survive in the wild!");
    }
    public String toString(){
        return super.toString() + "ranger.";
    }
}
