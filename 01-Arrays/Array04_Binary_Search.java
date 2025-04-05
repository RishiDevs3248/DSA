public class Array04_Binary_Search {
    public static void Binary_search(int array[],int target){
        int s = 0; 
        int e = array.length-1;
        int mid ;
        while(s<=e){
            mid = (s+e)/2;
            if (target == array[mid]){
                System.out.println(mid + " : " + array[mid]);
                return;
            }
            else if(target < array[mid]){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        System.out.println("Not found");
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9};
        // Binary_search(array,6);
        Binary_search(array,600);
    }
}

// Time complexity is O(log(n))
// Space complexity is 0(n) cause of array used