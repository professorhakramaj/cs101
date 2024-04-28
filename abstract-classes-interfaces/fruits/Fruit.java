public abstract class Fruit implements Edible, Comparable<Fruit>{
    protected String name;
    protected double grams;
    protected double calories;

    protected Fruit(double grams, double calories){
        this.name = this.getClass().getName();
        this.grams = grams;
        this.calories = calories;
    }
    
    public double calculateCalories(){
        return this.grams * this.calories;	   
    };
    
    @Override
    public String toString(){
        return ( 
            "This fruit is a " + this.name + ".\n" +
            "It's total caloric content is : " + this.calculateCalories()
        );
    }

    @Override
    public boolean equals(Object o){
        return this.compareTo((Fruit) o) == 0;
    }

    @Override
    public int compareTo(Fruit f){
        double thisCalorieCount = this.calculateCalories();
        double theirCalorieCount = f.calculateCalories();

        if(thisCalorieCount > theirCalorieCount) return 1;
        else if(thisCalorieCount < theirCalorieCount) return -1;
        else return 0;
    }
}
    