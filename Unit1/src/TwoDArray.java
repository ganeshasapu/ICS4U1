

public class TwoDArray{
    public static void main(String[] args) {
        int [][] sales = new int[5][4];

        int[][] data = { {3, 2, 5},
                         {1, 4, 4, 8, 13},
                         {9, 1, 0, 2},
                         {0, 2, 6, 3, -1, -8} };


        int[][] scores = { {20, -5, 90, 22, 32},
                           {34, 29, -3, 44, 2},
                           {100, 0, 96, 37, -0} };

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[0].length; j++) {
                int x = (int) (Math.random() * 250) + 50;
                sales[i][j] = x;
            }
        }

        int grandTotal = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[0].length; j++) {
                grandTotal += sales[i][j];
            }
        }

        int row2Sum = 0;
        for (int i = 0; i < sales[1].length; i++) {
            row2Sum += sales[1][i];
        }

        int poorSales = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[0].length; j++) {
                if (sales[i][j] < 50){
                    poorSales += sales[i][j];
                }
            }
        }

        int largest = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[0].length; j++) {
                if (sales[i][j] > largest){
                    largest  = sales[i][j];
                }
            }
        }

        for(int i=0; i<scores.length; i++) {
            for(int j=0; j<scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        double colTotal = 0.0;
        for(int col=0; col<scores[0].length; col++) {
            colTotal = 0.0;
            for(int row=0; row<scores.length; row++){
                colTotal += scores[row][col];
            }
            System.out.printf("Average for column %d: %4.3f %n", col + 1, colTotal / scores.length);
        }
    }   
}


