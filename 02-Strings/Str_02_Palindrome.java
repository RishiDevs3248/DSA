
public class Str_02_Palindrome {

    public static boolean isPalindrome(String str) {
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String check = "racecar";
        System.out.println(isPalindrome(check));
    }
}
