public class Test {
    public static void main(String[] args){
        Knight knight = new Knight();
        Barbarian barbarian = new Barbarian();
        Ranger ranger = new Ranger();
        Rogue rogue = new Rogue();
        Cleric cleric = new Cleric();
        Wizard wizard = new Wizard();


        System.out.println(knight);
        System.out.println(barbarian);
        System.out.println(ranger);
        System.out.println(rogue);
        System.out.println(cleric);
        System.out.println(wizard);

        knight.wearArmor();
        barbarian.wearArmor();
        ranger.wearArmor();
        rogue.wearArmor();
        cleric.wearArmor();
        wizard.wearArmor();

        knight.useWeapon();
        barbarian.useWeapon();
        ranger.useWeapon();
        rogue.useWeapon();
        cleric.useWeapon();
        wizard.useWeapon();

        knight.hasManeuvers();
        barbarian.tendsToRage();
        ranger.sneaksAround();
        rogue.




    }
}
