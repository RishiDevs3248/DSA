public class Array02_Linear_Search {
    public static int Linear_Search(int array[],int target){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int array[]= {1,2,3,4,5,6,7,8,9,0};
        int target = 8;
        System.out.println(Linear_Search(array, target));
    }
}
