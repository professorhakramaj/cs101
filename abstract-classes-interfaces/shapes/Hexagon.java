public class Hexagon extends Shape{
    private double side;

    public Hexagon(double side){
        this.side = side;
    }
        
    @Override
    public double calculateArea(){
        return ((3*Math.sqrt(3)/2)*Math.pow(this.side, 2));
    }
}
    