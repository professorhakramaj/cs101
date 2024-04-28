public abstract class Shape implements Comparable<Shape> {
    public Shape(){}

    public abstract double calculateArea();

    @Override
    public String toString(){
        return ( 
            "This shape is a " + this.getClass().getName() + ".\n" +
            "It's area is : " + this.calculateArea()
        );
    }
    
    @Override
    public boolean equals(Object o){
        return this.compareTo((Shape) o) == 0;
    }
    
    @Override
    public int compareTo(Shape s){
        double thisArea = this.calculateArea();
        double theirArea = s.calculateArea();

        if(thisArea > theirArea) return 1;
        else if(thisArea < theirArea) return -1;
        else return 0;
    }
}
