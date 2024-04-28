public class Blueberry extends Fruit {
    public static final double caloriesPerGram = 0.57;
    public static final int maxDaysToRipen = 21;
    public static final int maxDaysFresh = 14;

    public Blueberry(double grams){
        super(grams, Blueberry.caloriesPerGram);
    }
    
    public int howLongToRipen(){
        return Blueberry.maxDaysToRipen;
    }

    public int howLongToDecay(){
        return Blueberry.maxDaysFresh;
    }
}
