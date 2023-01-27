public abstract class Character{
    protected int hitPoints;
    protected int armorClass;
    protected ArmorType armorType;
    protected WeaponType weaponType;

    protected void wearArmor(){
        System.out.println(this.armorType);
    }                                               
    protected void useWeapon(){
        System.out.println(weaponType);
    }
    public String toString(){
        return "I am a ";
    }
}