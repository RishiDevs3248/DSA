public class Array03_Largest_in_array {
    public static int[] LargestValue(int array[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(largest < array[i]){
                largest = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if(smallest > array[i]){
                smallest = array[i];
            }
        }

        return new int[]{largest,smallest};
    }
    public static void main(String[] args) {
        int array[] = {1,2,4,3,6,7,9,5,3,5,2,4,0};
        System.out.println(LargestValue(array)[0]);
        System.out.println(LargestValue(array)[1]);
    }
}
