// CSE 110     : 74845 / ONLINE 
// Assignment  : 07
// Author      : MORRIS, CHRIS & 1223564576
// Description : MONSTERS AND WEAPONS

public class Monster {
    private String name;
    private int healthScore;
    private Weapon weapon;

    public Monster(String name, int healthScore, Weapon weapon){
        this.name = name;
        this.healthScore = healthScore;
        this.weapon = weapon;
    }

    public String getName(){
        return this.name;
    }

    public int getHealthScore(){
        return this.healthScore;
    }

    public String getWeaponName(){
        return this.weapon.getName();
    }

    public int attack(Monster monster){
        int damageDealt = (int)Math.random() * this.weapon.getMaxDamage();
         monster.healthScore -= damageDealt;
         return damageDealt;
    }
}
