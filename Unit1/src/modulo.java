//Ganesh A.
//February 10, 2022
//Practice with modulo function

public class modulo {
    public static void main(String[] args) {
        
        System.out.println("\n--------------------\n1-100 and cycling every 7\n--------------------\n");

        //looping through first 100 numbers
        for (int i = 0; i < 101; i++) {
                System.out.printf("%4d  %4d %n", i, (i % 8));
        }

        System.out.println("\n--------------------\nmultiples of 13 (1-200)\n--------------------\n");

        //looping through first 200 numbers
        for (int i = 1; i < 201; i++) {
            //if multiple of 13
                if(i % 13 == 0){
                    System.out.print(i + " ");
                }
        }

        System.out.println("\n--------------------\n1 through 200, newline after every 12\n--------------------\n");

         for (int i = 1; i < 201; i++) {
                System.out.print(i + " ");
                //if multiple of 12
                if(i % 12 == 0){
                    System.out.print("\n");
                }
        }

        System.out.println("\n--------------------\nFormatted with printF\n--------------------\n");

        for (int i = 1; i < 201; i++) {
                System.out.printf("%4d", i);
                //if multiple of 12
                if(i % 12 == 0){
                    System.out.print("\n");
                }
        }
    }
    
}
