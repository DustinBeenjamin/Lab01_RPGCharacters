public class Rogue extends Scout{
    public Rogue(){
        hitPoints = 11;
        armorClass = 16;
        armorType = ArmorType.Light;
        weaponType = WeaponType.Simple;
    }
    public void picksLock(){
        System.out.println("Picking locks is my speciality!");
    }
}
