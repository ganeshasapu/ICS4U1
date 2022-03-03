//Ganesh A.
//February 10, 2022
//Practice with printF function

public class printF {
    public static void main(String[] args){

        //variables declaration
        
        String name = "Bessy";
        String colour = "brown";
        int weight = 1200;
        int num = 492;

        System.out.print("\n\n");
        double a = 1.0/7.0;
        System.out.printf("%.5f", a);
        //the output rounds the decimal value

        System.out.print("\n\n");

        System.out.printf("The cow's name is %s, she is %s and weighs %d kg.", name, colour, weight);

        System.out.print("\n\n");

        System.out.println("| 98765999 |");
        System.out.println("| &&&&&&&& |");
        System.out.printf("| %8d |%n", num);
        System.out.printf("| %08d |%n", num);
        System.out.printf("| %+8d |%n", num);
        System.out.printf("| %-8d |%n", num);
        System.out.printf("| %8.1f |%n", (double) num);

    }
}
