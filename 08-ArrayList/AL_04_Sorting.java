import java.util.ArrayList;
import java.util.Collections;

public class AL_04_Sorting {
    public static void main(String[] args) {
        // creating and soring elements in arraylist
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(9);
        arr.add(3);
        arr.add(5);


        // ptinting original arraylist
        System.out.println(arr);

        // sorting in accending order
        Collections.sort(arr); // sort in assending order 1,2,3,4,5...  // time comlexity - 
        System.out.println(arr);
        
        // sorting in decending order
        Collections.sort(arr, Collections.reverseOrder()); // sort in decending order ...5,4,3,2,1
        System.out.println(arr);
    }
}
