public class B_01_BacktrackingOnArray {
    public static void Change(int arr[] , int i , int val){
        //base case
        if(i == arr.length){
            PrintArr(arr);
            System.out.println();
            return;
        }

        //kaam
        arr[i] = val;
        Change(arr, i+1, val+1);
        arr[i] = arr[i] - 2;
    }

    public static void PrintArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = new int[5];
        Change(arr, 0, 1);
        PrintArr(arr);
    }
}

