public class Arr2D_01_BasicSearch {
    public static void Search(int arr[][],int key) {
        for (int i = 0 ; i< arr.length ;i++){
            for (int j = 0 ; j < arr[0].length ; j++ ){
                if(arr[i][j] == key){
                    System.out.println("element found at [ " + i + ","+j+" ]");
                }
            }
        }
    }
    public static void main(String[] args) {
        // int arr [][] = new int[3][3];   one way of creating 2D array
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        Search(arr, 5);

    }
}
