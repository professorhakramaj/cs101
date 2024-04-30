public class Main {
    
    public static void main(String[] args) {
        // Transportation bike = new Bike(2, 7.0);
        Transportation[] options = {
            new Train("B", 35, 20.0),
            new Train("F", 35, 5.0),
            new Train("N", 30, 0), 
            new Train("Q", 29, 12.5),
            new Car(45, "A"),
            new Car(35, "B"),
            new Car(100, "C"),
            new Car(75, "D")
        };

        // Imagine a destination 20 miles away
        for(Transportation t : options)
            ((Vehicle) t).setDestinationMiles(20);

        // Sort transportation possibilities 
        java.util.Arrays.sort(options);

        // List top three
        System.out.println(options[0]);
        System.out.println(options[1]);
        System.out.println(options[2]);
    }
}
