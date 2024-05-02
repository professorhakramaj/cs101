public class Walking implements Transportation{
    private double mph;
    private double destination;
    public Walking(double mph, double destination){
        this.mph = mph;
        this.destination = destination;
    }

        
    @Override
    public double calculateTimeToDestination(){
        return (this.destination / this.mph) * 60;
    }
    
    @Override
    public int compareTo(Transportation t){
        double thisTimeToDestination = this.calculateTimeToDestination();
        double theirTimeToDestination = t.calculateTimeToDestination();

        if(thisTimeToDestination > theirTimeToDestination) return 1;
        else if(thisTimeToDestination < theirTimeToDestination) return -1;
        return 0;
    }

    @Override
    public String toString(){
        return "Walking " + this.mph + " mph will take you " + this.calculateTimeToDestination() + " minutes.";
    }
}
