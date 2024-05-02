public class Main {
    
    public static void main(String[] args) {
        // java Main.java 90 => figured out the fastest route for going 90 miles
        // java Main.java 30 => figured out the fastest route for going 30 miles
        // java Main.java 5 => figured out the fastest route for going 5 miles

        double destination = Integer.parseInt(args[0]);

        Transportation[] options = {
            new Car(60, destination, "A"),
            new Car(60, destination, "B"),
            new Car(60, destination, "C"),
            new Car(60, destination, "D"),
            new Train("B", 35, destination),
            new Train("F", 35, destination),
            new Train("N", 30, destination),
            new Train("Q", 29, destination),
            new Walking(5, destination)
        };

        java.util.Arrays.sort(options);
        for(Transportation option : options)
            System.out.println(option);

        java.util.Arrays.sort(options);

        // List top three
        System.out.println();
        System.out.println(options[0]);
        System.out.println(options[1]);
        System.out.println(options[2]);
    }
}
