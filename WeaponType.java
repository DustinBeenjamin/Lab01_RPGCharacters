public enum WeaponType {
    Martial("I wield martial weapons against monsters."), 
    Simple("I kill monsters with simple weapons."), 
    Staff("I can hit monsters with my staff.");

    private String weaponDescription;

    private WeaponType(String weaponDescription){
        this.weaponDescription = weaponDescription;
    }
    public String toString(){
        return this.weaponDescription;
    }
}
