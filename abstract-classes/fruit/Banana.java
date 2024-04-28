public class Banana extends Fruit {
    public static final double caloriesPerGram = 0.89;
    public static final int maxDaysToRipen = 3;
    public static final int maxDaysFresh = 7;

    public Banana(double grams){
        super(grams, Banana.caloriesPerGram);
    }
    
    public int howLongToRipen(){
        return Banana.maxDaysToRipen;
    }

    public int howLongToDecay(){
        return Banana.maxDaysFresh;
    }
}
