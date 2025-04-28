public class Str_05_PrintLargestString {
    public static void main(String[] args) {
        String str1 = "apple";
        String str2 = "Apple";
        String str3 = "banana";

        // A > a
        // b > a

        if (str1.compareTo(str2) < 0) {
            System.out.println(str1);
        } else if (str1.compareTo(str2) == 0) {
            System.out.println("Equals");
        } else {
            System.out.println(str2);
        }

        if (str1.compareToIgnoreCase(str2) < 0) {
            System.out.println(str1);
        } else if (str1.compareToIgnoreCase(str2) == 0) {
            System.out.println("Equals");
        } else {
            System.out.println(str2);
        }

        if (str1.compareTo(str3) > 0) {
            System.out.println(str1);
        } else if (str1.compareTo(str3) == 0) {
            System.out.println("Equals");
        } else {
            System.out.println(str3);
        }
        
        
    }
}
