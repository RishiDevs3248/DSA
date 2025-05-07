
import java.util.ArrayList;

// Find in sorted arraylist has a target sum
public class AL_07_PairSum1 {
    /* 
     * method 1 : - brute force
     * make 2 nested for loop , and find all possible pairs
     * time complexity - O(n square)
     */


    /* 
     * method 2 : - 2 pointer approach
     * as arraylist is sorted 
     * pointing 1st pointer (i) at idx 0 & 2nd pointer (j) at last idx
     * if the sum is greater j-- else i++
     */


    //  2 pointer approach 
    public static int[] Pairsum(ArrayList<Integer> arr, int target) {
           // assuming arraylist is always sorted 
           int res[] = {-1,-1};
           int i = 0 , j = arr.size()-1;
            while (i<j){
                if((arr.get(i) + arr.get(j)) == target){
                    res[0] = arr.get(i);
                    res[1] = arr.get(j);
                    return res;
                }else if((arr.get(i) + arr.get(j)) < target){
                   i++;
                }else{
                    j--;
                }
            }
            return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);

        int res[] = Pairsum(arr, 5);

        System.out.println("Elements : "+res[0]+","+res[1]+" are eaual to target");
    }
}
