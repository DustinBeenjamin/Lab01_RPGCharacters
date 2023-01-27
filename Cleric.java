public class Cleric extends Magii{
    public Cleric(){
        hitPoints = 14;
        armorClass = 17;
        armorType = ArmorType.Medium;
        weaponType = WeaponType.Simple;
    }
        public void healsOthers(){
            System.out.println("My friends rely on my medical skills!");
        }
        public String toString(){
            return super.toString() + "cleric.";
        }
}
