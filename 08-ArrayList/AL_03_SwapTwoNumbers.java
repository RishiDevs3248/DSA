
import java.util.ArrayList;

public class AL_03_SwapTwoNumbers {

    public static void swap(ArrayList<Integer> arr, int idx1, int idx2) {
        Integer temp = arr.get(idx1);
        arr.set(idx1, arr.get(idx2));
        arr.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(9);
        arr.add(3);
        arr.add(5);

        int idx1 = 1, idx2 = 3;
        System.out.println(arr);
        swap(arr, idx1, idx2);
        System.out.println(arr);

    }
}
