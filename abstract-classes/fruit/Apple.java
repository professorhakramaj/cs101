public class Apple extends Fruit {
    public static final double caloriesPerGram = 0.52;
    public static final int maxDaysToRipen = 125;
    public static final int maxDaysFresh = 30;

    public Apple(double grams){
        super(grams, Apple.caloriesPerGram);
    }
    
    public int howLongToRipen(){
        return Apple.maxDaysToRipen;
    }

    public int howLongToDecay(){
        return Apple.maxDaysFresh;
    }
}
