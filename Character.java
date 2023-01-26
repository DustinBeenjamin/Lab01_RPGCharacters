public abstract class Character{
    protected int hitPoints;
    protected int armorClass;
    protected ArmorType armorType;
    protected WeaponType weaponType;

    public void wearArmor(){
        System.out.println("I wear ");
    }                                               //ARE THESE NECESSARY?????
    public void useWeapon(){
        System.out.println("I wield ");
    }
    public String toString(){
        return "I am a ";
    }
}