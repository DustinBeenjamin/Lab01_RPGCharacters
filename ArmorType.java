public enum ArmorType {
    Heavy("heavy"), 
    Medium("medium"), 
    Light("light"), 
    None("no");

    private String armorWeight;

    private ArmorType(String armorWeight){
        this.armorWeight = armorWeight;
    }

    public String toString(){
        return "I wear " + armorWeight + " armor!";
    }
}
