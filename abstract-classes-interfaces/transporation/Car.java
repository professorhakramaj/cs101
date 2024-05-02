public class Car extends Vehicle{
    private String routeTaken;

    public Car(double mph, double destination){
        super(mph, destination);
        this.routeTaken = "";
    }

    public Car(double mph, double destination, String routeTaken){
            super(mph, destination);
            this.routeTaken = routeTaken;
    }

    public double getTotalDelayTime(){ 
        switch(this.routeTaken){
            case "A": return 20;
            case "B": return 11;
            case "C": return 7;
            case "D": return 5;
        }
        return 0;
    }

    @Override
    public double calculateTimeToDestination(){
            return (this.destination / this.mph) * 60 + this.getTotalDelayTime();
    }

    @Override
    public String toString(){
        return "Using route " + this.routeTaken + " will take you " + this.calculateTimeToDestination() + " minutes while driving.";
    }
}
