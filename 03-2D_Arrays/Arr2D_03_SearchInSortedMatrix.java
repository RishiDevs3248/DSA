public class Arr2D_03_SearchInSortedMatrix {
    public static boolean stairCaseSearch(int arr[][] , int key) {
        int row = 0;
        int col = arr[0].length-1;

        while(row < arr.length && col >= 0){
            if (arr[row][col] == key){
                return true;
            }else if(arr[row][col] < key){
                row++;
            }else{
                col--;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int arr[][]  = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

        int key = 33;
        System.out.println(stairCaseSearch(arr, key));
    }
}
