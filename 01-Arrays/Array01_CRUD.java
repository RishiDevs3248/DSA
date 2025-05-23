

public class Array01_CRUD {
    public static void main(String[] args) {
        // Create 
        // int array[] = new int[100];
        // int array2[] = {1,2,3,4,5,6,7,8,9,0};
        // String words[] = {"ads","cin","xla"};
        // char alphabets[] = {'a','v','s'};


        // input in array 
        // Scanner sc = new Scanner(System.in);
        // array[0] = sc.nextInt();
        // array[1] = sc.nextInt();
        // array[2] = sc.nextInt();
        // array[3] = sc.nextInt();
        
        
        // Print array value
        // System.out.println(array[0]);
        // System.out.println(array[1]);
        // System.out.println(array[2]);
        // System.out.println(array[3]);

        // Passing arrays as argument (pass by Reference) and not by (pass by value)
        int mark[] = {1,2,3,4,5};
        Update(mark);
        for (int i = 0; i < mark.length; i++) {
            System.out.println(mark[i]+" ");
        }

    }

    
    public static void Update (int marks[]){
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 10;
        }
    }

}
