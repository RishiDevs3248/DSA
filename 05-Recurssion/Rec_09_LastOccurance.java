public class Rec_09_LastOccurance {
    public static int lastOccurence(int[] arr, int i, int key){
        if(i == -1){
            return-1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurence(arr, i-1, key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,4,5,6,6,7,8,6};
        System.out.println(lastOccurence(arr, arr.length-1, 6));
    }
}
