public class Train extends Vehicle {
        private String name;
        public Train(String name, double mph, double destination) {
                super(mph, destination);
                this.name = name;
        }

        @Override
        public double calculateTimeToDestination() {
                return (this.destination / this.mph) * 60;
        }

        @Override
        public String toString() {
                return "The " + this.name + " train will take you " + this.calculateTimeToDestination() + " minutes.";
        }
}
