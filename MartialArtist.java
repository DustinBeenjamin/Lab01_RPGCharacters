public abstract class MartialArtist extends Character{
    protected WeaponType weaponType = WeaponType.Martial;
    protected void useWeapon(){
        System.out.println(this.weaponType);
    }
}
