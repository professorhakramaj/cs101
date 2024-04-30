public class Train extends Vehicle{
        private String name;
        private double totalDelayTime;
        public Train(String name, double mph, double totalDelayTime){
                super(mph, 0);
                this.name = name;
                this.totalDelayTime = totalDelayTime;
        }

        public double getTotalDelayTime(){ return this.totalDelayTime; }
        public void setTotalDelayTime(double totalDelayTime){ 
                this.totalDelayTime = 0; 
        }

        @Override
        public double calculateTimeToDestination(double miles){
                return (miles / this.mph) * 60 + this.getTotalDelayTime();
        }

        @Override
        public String toString(){
            return "The " + this.name + " train will take you " + this.calculateTimeToDestination(this.getDestinationMiles()) + " minutes.";
        }
}
  