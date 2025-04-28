public class Str_04_SubstringFunction {
    public static String subString(String str , int si, int ei){
        String subStr = "";
        for(int i = si ; i < ei; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println();
        System.out.println("Manual Function : "+subString(str, 0, 4));  // Manual way

        // Inbuild function
        System.out.println();
        System.out.println("Inbuild Fun : " + str.substring(0,4));
        System.out.println();
    }
}
