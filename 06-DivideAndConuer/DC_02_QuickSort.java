
public class DC_02_QuickSort {
    //Pivot and Partition

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void QuickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        //pivot is last element 
        int pidx = partition(arr, si, ei);
        QuickSort(arr, si, pidx - 1); //left part
        QuickSort(arr, pidx + 1, ei); //right part
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; //to make place for ele smaller than pivot
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap

                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        //swap

        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 8, 2, 5};
        QuickSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
