public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
        
    @Override
    public double calculateArea(){
        return (2 * Math.PI * this.radius * this.height) + (2 * super.calculateArea());
    }
}
