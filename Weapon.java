// CSE 110     : 74845 / ONLINE 
// Assignment  : 07
// Author      : MORRIS, CHRIS & 1223564576
// Description : MONSTERS AND WEAPONS

class Weapon {
    private String name;
    private int maxDamage;
    
    public Weapon(){
        this.name = "Pointy Stick";
        this.maxDamage = 1;
    }

    public Weapon(String newName, int newMaxDamage){
        this.name = newName;
        this.maxDamage = newMaxDamage;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public int getMaxDamage(){
        return this.maxDamage;
    }

    public void setMaxDamage(int newMaxDamage){
        this.maxDamage = newMaxDamage;
    }


}
