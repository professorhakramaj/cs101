public class Train implements Vehicle{
        private int numCars;
        public Train(int numCars){
                this.numCars = numCars;
        }
        
        @Override
        public void start(){ System.out.println("Begin engine"); }
        
        @Override
        public void stop(){ System.out.println("Stop engine and hit the brakes");}
}
  