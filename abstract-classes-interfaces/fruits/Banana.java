public class Banana extends Fruit {
    public static final double caloriesPerGram = 0.89;

    public Banana(double grams){
        super(grams, Banana.caloriesPerGram);
    }
    
    public void eat(){
        System.out.println("Peel one and eat");
    }
}