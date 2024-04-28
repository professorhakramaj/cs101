public class Blueberry extends Fruit {
    public static final double caloriesPerGram = 0.57;

    public Blueberry(double grams){
        super(grams, Blueberry.caloriesPerGram);
    }
    
    public void eat(){
        System.out.println("Pick one up and eat");
    }
}