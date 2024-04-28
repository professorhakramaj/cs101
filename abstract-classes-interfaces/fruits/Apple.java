public class Apple extends Fruit {
    public static final double caloriesPerGram = 0.52;

    public Apple(double grams){
        super(grams, Apple.caloriesPerGram);
    }
    
    public void eat(){
        System.out.println("Take a bite out of one and eat");
    }
}