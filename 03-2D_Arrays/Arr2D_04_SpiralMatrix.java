
public class Arr2D_04_SpiralMatrix {

    public static void spiralPrint(int arr[][]) {
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = arr.length - 1;
        int endingCol = arr[0].length - 1;

        while (startingRow <= endingRow && startingCol <= endingCol) {
            //top 
            for (int j = startingCol; j <= endingCol; j++) {
                System.out.print(arr[startingRow][j] + " ");
            }

            //right
            for (int i = startingRow + 1; i <= endingRow; i++) {
                System.out.print(arr[i][endingCol] + " ");
            }

            //bottom
            for (int j = endingCol - 1; j >= startingCol; j--) {
                System.out.print(arr[endingRow][j] + " ");
            }

            //left 
            for (int i = endingRow - 1; i >= startingRow + 1; i--) {
                System.out.print(arr[i][startingCol] + " ");
            }
            startingRow ++ ;
            startingCol ++ ;
            endingRow --;
            endingCol --;
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int arr2[][] = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        spiralPrint(arr2);
    }
}
