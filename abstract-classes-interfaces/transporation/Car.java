public class Car extends Vehicle{
    private String routeTaken;

    public Car(double mph, String routeTaken){
            super(mph, 0);
            this.routeTaken = routeTaken;
    }

    public double getTotalDelayTime(){ 
        switch(this.routeTaken){
            case "A": return 20;
            case "B": return 11;
            case "C": return 7;
            case "D": return 5;
            default: return 0;
        }
    }

    @Override
    public double calculateTimeToDestination(double miles){
            return (miles / this.mph) * 60 + this.getTotalDelayTime();
    }

    @Override
    public String toString(){
        return "Using route " + this.routeTaken + " will take you " + this.calculateTimeToDestination(this.getDestinationMiles()) + " minutes while driving.";
    }
}
