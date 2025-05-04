
public class DC_03_SortedAndRotatedArrayCode {

    public static int search(int arr[], int target, int si, int ei) {
        //end case
        if (si > ei) {
            return -1;
        }

        //kaam 
        int mid = si + (ei - si) / 2; //(ei-si)/2

        //case Found
        if (arr[mid] == target) {
            return mid;
        }

        //mid on Line 1 
        if (arr[si] <= arr[mid]) {

            //case a : Left  
            if (arr[si] <= target && target <= arr[mid]) {
                search(arr, target, si, mid - 1);
            } //case b : Right
            else {
                search(arr, target, mid + 1, ei);
            }

        } //mid on Line 2

        else {
            //case c : Right  
            if (arr[mid] <= target && target <= arr[ei]) {
                search(arr, target, mid + 1, ei);
            } //case b : Left
            else {
                search(arr, target, si, mid - 1);
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int targetidx = search(arr, target, 0, arr.length);
        if (targetidx >= 0) {
            System.out.println(arr[targetidx]);
        } else {
            System.out.println("Target not found");
        }
    }

}
