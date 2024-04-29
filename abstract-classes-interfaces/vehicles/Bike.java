public class Bike implements Vehicle{
        private int wheels;
        public Bike(int wheels){
                this.wheels = wheels;
        }
        
        @Override
        public void start(){ System.out.println("Begin pedalling"); }
        
        @Override
        public void stop(){ System.out.println("End pedalling and hit the brakes");}
}
  