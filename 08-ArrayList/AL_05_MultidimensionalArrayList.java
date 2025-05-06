
import java.util.ArrayList;

public class AL_05_MultidimensionalArrayList {

    public static void main(String[] args) {
        //creating 2d arraylist
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        // arraylist 1
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        arr.add(list);

        // arraylist 2
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        arr.add(list1);

        // logic for printing each array list 
        for (int i=0; i<arr.size() ; i++){
            ArrayList<Integer> currentList = arr.get(i);
            for(int j=0; j<currentList.size();j++){
                 System.out.print(currentList.get(j)+" ");
            }
            System.out.println();
        }

        // or you can directly print arr
        System.out.println(arr );
    }
}
