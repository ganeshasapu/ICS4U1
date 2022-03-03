public class ZRotateArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int elem1 = arr[0];
        int elem2 = arr[1];
        for (int i = 0; i < arr.length - 2; i++) {
            arr[i] = arr[i + 2];
        }
        arr[arr.length - 2] = elem1;
        arr[arr.length - 1] = elem2;

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
