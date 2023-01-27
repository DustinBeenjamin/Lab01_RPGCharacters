public class Wizard extends Magii {
    public Wizard(){
        hitPoints = 9;
        armorClass = 10;
        armorType = ArmorType.Light;
        weaponType = WeaponType.Staff;
    }
    public void solvesProblems(){
        System.out.println("I am the best problem solver in the party!");
    }
    public String toString(){
        return super.toString() + "wizard.";
    }
}
