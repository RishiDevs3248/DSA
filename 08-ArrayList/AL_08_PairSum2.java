// Find in sorted And Rotated arraylist has a target sum  (Advance of pair sum)

import java.util.ArrayList;

public class AL_08_PairSum2 {

    /*
     * two pointer approach 
     * first finding the pivot (the point where its rotated )
     * the point is end of the array and the next idx is the starting point of the array
     * updating the lp and the rp using the modulo fun "%"
     */

     public static String pairSum2(ArrayList<Integer> arr, int target){
        int lp =0, rp =0 ;

        // finding pivot 
        for (int i = 0 ; i < arr.size()-1 ; i++){
            if(arr.get(i)>arr.get(i+1)){
                rp = i;  // largest element
                lp = i+1;// smallest element
                break;
            }
        }

        // now comparing with the target and updating the pointer using mod fun "%"
        while (lp != rp){
            if ((arr.get(lp)+arr.get(rp)) == target){
                return "Elements are "+arr.get(lp)+", "+arr.get(rp);
            }else if ((arr.get(lp)+arr.get(rp)) < target){
                lp = ((lp+1) % arr.size());
            }else{
                rp = ((rp-1+arr.size()) % arr.size());
            }
        }

        return "Elements not found";
     }

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        System.out.println(pairSum2(arr, 5));
    }
}
