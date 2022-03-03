//Ganesh A.
//February 13, 2022
//Generates the 12 random numbers between 1-100, places them in an array, and outputs the smallest and biggest numbers generated
public class Array {
    public static void main(String[] args) {

        //creating int array of size 12
        int[] nums =new int[12];  

        //creating two variables, one for smallest value, one for biggest
        //both of these variables will be set the first generated value in the first loop
        int small = 101;
        int big = 0;

        //looping 12 times for 12 random digits
        for (int i = 0; i < 12; i++) {
            //obtaining a value from 1-100
            int x = (int) (Math.random() * 100) + 1;

            //setting array index to generated random value
            nums[i] = x;

            //if the generated value is less than the smallest value generated so far
            if (x < small){
                small = x;
            }

            //if the generated value is greater than the biggest value generated so far
            if (x > big){
                big = x;
            }
        }

        //printing out the array
        System.out.println("\n");
        for (int i = 0; i < nums.length; i++) {
	        System.out.print(nums[i] + " ");
        }
        
        //printing out the smallest and biggest values generated
        System.out.printf(" %n %nSmall: %3d , Big: %3d %n", small, big);
    }
}