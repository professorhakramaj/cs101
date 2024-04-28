public class Peach extends Fruit {
    public static final double caloriesPerGram = 0.39;
    public static final int maxDaysToRipen = 74;
    public static final int maxDaysFresh = 14;

    public Peach(double grams){
        super(grams, Peach.caloriesPerGram);
    }
    
    public int howLongToRipen(){
        return Peach.maxDaysToRipen;
    }

    public int howLongToDecay(){
        return Peach.maxDaysFresh;
    }
}
