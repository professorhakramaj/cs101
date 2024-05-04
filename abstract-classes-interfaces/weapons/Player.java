public class Player {
    private String name;
    private double hp;
    private Weapon weapon;

    Player(String name){
        this.name = name;
        this.hp = 100;
    }

    public double getHP(){ return this.hp; }
    public void printHP(){ 
        System.out.println("Player: " + this.name + " has " + this.hp + " hp remaining");
    }
    public Weapon getWeapon(){ return this.weapon; }
    public void equipWeapon(Weapon weapon){ this.weapon = weapon; }
    public boolean isAlive(){ return this.hp > 0; }
    public double dealDamage(){ 
        double myDmg = this.weapon.dealDamage();
        System.out.println("Player: " + this.name + " dealt " + myDmg + " damage");
        return myDmg;
    }

    public void versus(Player opponent){
        do{
            this.hp -= opponent.dealDamage();
            opponent.hp -= this.dealDamage();
            
            this.printHP();
            opponent.printHP();
        }while(this.isAlive() || opponent.isAlive());

        if(this.isAlive()) System.out.println("Victory");
        else System.out.println("Defeated");
    }
}
