
import java.util.ArrayList;

public class AL_06_ContainerWithMostWater {

    // you can also do it using brute force but time complexity will be O(n square)


    // optimized way is using 2 pointer approach - time complexity O(n)
    // what? - comparing left pointer and right pointer whichever is smaller it changed lp++ or rp--
    // why? - here the water dependes on smallest side, so making the smallest side bigger so it can store more water
    public static void mostWater2PointerApproach(ArrayList<Integer> arr){
        int maxWater =0 ;
        int lp=0, rp=arr.size()-1;
        while(lp<rp){
            
            //getting widht and minimum height
            int height = Math.min(arr.get(lp) , arr.get(rp));
            int width = rp-lp;
            // calculate water area
            int curr = height*width;
            maxWater = Math.max(maxWater, curr);
            // update idx
            if(arr.get(lp) < arr.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        System.out.println("Max water: "+maxWater);
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        mostWater2PointerApproach(height);
    }
}
