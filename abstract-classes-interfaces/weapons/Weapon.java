public abstract class Weapon implements Damage, Comparable<Weapon>{
    protected double minDmg;
    protected double maxDmg;
    public Weapon(double minDmg, double maxDmg){
        this.minDmg = minDmg;
        this.maxDmg = maxDmg;
    }

    @Override
    public double dealDamage(){
        return (Math.random() * (this.maxDmg - this.minDmg) + this.minDmg); 
    }

    @Override
    public int compareTo(Weapon w){
        double thisDmg = this.dealDamage();
        double thierDmg = w.dealDamage();

        if(thisDmg > thierDmg) return 1;
        else if(thisDmg < thierDmg) return -1;
        else return 0;
    }
}
