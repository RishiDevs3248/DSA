
import java.util.ArrayList;



public class Al_01_Basics {
    public static void main(String[] args) {
        // it can only store non primitive type of data 
        
        // creating array list 
        ArrayList<Integer> arr = new ArrayList<>(); 
        ArrayList<Boolean> arr2 = new ArrayList<>(); 
        ArrayList<Float> arr3 = new ArrayList<>(); 


        // Operations on arraylist
        // Adding 
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(3);
        arr.add(5); // adding at next idx
        arr.add(5,9);// adding at certain idx

        System.out.println("ArrayList: "+arr);



        // get element at index
        System.out.println("Element at idx 2: "+arr.get(2));



        // Remove element at index 
        arr.remove(3);
        System.out.println("Array after removing: "+arr);



        // Set element at index
        arr.set(3, 10);
        System.out.println("Array after updating ele: "+arr);


        //Contains
        System.out.println(arr.contains(10));
        System.out.println(arr.contains(0));


        //Size of an array list
        System.out.println("Size of array: "+arr.size());


        // prin reverse of array list
        System.out.print("Reverse array: ");
        for (int i = arr.size()-1; i >=0; i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
 