

public class Array06_TrappingRainwater {
    public static int trappedwater (int arr[] ){
        int barWidth = 1;
        int totalwater = 0;
        int height1[] = new int[arr.length];
        int height2[] = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            height1[i] = max;
            // System.out.println("loop 1");
        }

        max = Integer.MIN_VALUE;
        for (int i = arr.length-1; i >=0; i--) {
            max = Math.max(arr[i], max);
            height2[i] = max;
            // System.out.println("loop 2");
        }

        for (int i = 0; i < arr.length; i++) {
            int min = Math.min(height1[i], height2[i]);
            totalwater += (min - arr[i]) * barWidth;
            // System.out.println("loop 3");
        }        

        return totalwater;
    }

    public static void main(String[] args) {
        int arr [] = {4,2,0,6,3,2,5};
        System.out.println(trappedwater(arr));

    }
}
