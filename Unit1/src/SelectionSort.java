//Ganesh A.
//March 2, 2022
//Creates an array and sorts it using selection sort
public class SelectionSort {
    public static void main(String[] args) {

        //Creating Array
        int[] testArray = new int[12];
        for (int i = 0; i < testArray.length; i++) {
            //Setting all elements in array to random value between 1-100
            int x = (int) (Math.random() * 100) + 1;
            testArray[i] =  x;
        }

        //Printing out array
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }

        //looping through the array except last element
        for (int i = 0; i < testArray.length-1; i++) { 
            //creating a lowest value index variable (index of the lowest value)
            int minIndex = i;
            //looping through the array from the current element to the last element
            for (int j = i + 1; j < testArray.length; j++) {
                //if the next element is less than the previous element
                if(testArray[j] < testArray[minIndex]){
                    //set the lowest value index to the newly found lowest value index
                    minIndex = j;
                }
            }
            //creating temp variable for a swap
            int temp = testArray[minIndex];
            //swapping
            testArray[minIndex] = testArray[i];
            testArray[i] = temp;
        }

        System.out.println();

        //re-printing out the value
        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i] + " ");
        }
    }
}
