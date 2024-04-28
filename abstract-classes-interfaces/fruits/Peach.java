public class Peach extends Fruit {
    public static final double caloriesPerGram = 0.39;

    public Peach(double grams){
        super(grams, Peach.caloriesPerGram);
    }

    public void eat(){
        System.out.println("Slice one and eat");
    }
}