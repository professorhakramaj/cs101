public abstract class Vehicle implements Transportation{
    protected double mph;
    protected double destination;
    protected Vehicle(double mph, double destination){
        this.mph = mph;
        this.destination = destination;
    }

    @Override 
    public boolean equals(Object o){
            return this.compareTo((Vehicle) o) == 0;
    }

    @Override
    public int compareTo(Transportation t){
        double thisTimeToDestination = this.calculateTimeToDestination();
        double theirTimeToDestination = t.calculateTimeToDestination();

        if(thisTimeToDestination > theirTimeToDestination) return 1;
        if(thisTimeToDestination < theirTimeToDestination) return -1;
        return 0;
    }
}
