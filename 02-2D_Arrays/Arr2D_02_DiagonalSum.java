
public class Arr2D_02_DiagonalSum {

    public static void diagonalSum(int arr[][]) {
        int sum = 0;
        for (int i = 0,j = 0; i < arr.length; i++,j++) {
                    sum += arr[i][j];
        }
        System.out.println("Sum 1:"+sum);
        for (int i = 0,j = arr[0].length-1; i < arr.length; i++,j--) {
                if (i != j) {
                    sum += arr[i][j];
                }
        }

        System.out.println("Sum :"+sum);

    }

    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        diagonalSum(arr);

    }
}
