import java.util.*;

public class Str_01_Basics {
    public static void main(String[] args) {
        String str = "abcd";
        String str2 = new String("xyz");
        // Strings are IMMUTABLE    


        // String Input 
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("name : "+name);
        String name2 = sc.nextLine();
        System.out.println("name : "+name2);


        // Length function
        System.out.println(name2.length());


        // CharAt function
        System.out.println(str.charAt(0));
        System.out.println(str2.charAt(2));


        // Concatination 
        String fname = "Rishi";
        String lname = "Aabnur";
        System.out.println(fname+" "+lname);
    }
}
