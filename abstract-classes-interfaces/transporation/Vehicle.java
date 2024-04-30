public abstract class Vehicle implements Transportation{
    protected double mph;
    protected double destinationMiles;
    protected Vehicle(double mph, double destinationMiles){
        this.mph = mph;
        this.destinationMiles = destinationMiles;
    }

    public double getMph(){ return this.mph; }
    public double getDestinationMiles(){ return this.destinationMiles; }
    public void setDestinationMiles(double destinationMiles){
         this.destinationMiles = destinationMiles;
    }

    @Override 
    public boolean equals(Object o){
            return this.compareTo((Vehicle) o) == 0;
    }

    @Override
    public int compareTo(Transportation t){
        double thisTimeToDestination = this.calculateTimeToDestination(this.getDestinationMiles());
        double theirTimeToDestination = ((Vehicle) t).calculateTimeToDestination(((Vehicle) t).getDestinationMiles());

        if(thisTimeToDestination > theirTimeToDestination) return -1;
        if(thisTimeToDestination < theirTimeToDestination) return 1;
        return 0;
    }
}
