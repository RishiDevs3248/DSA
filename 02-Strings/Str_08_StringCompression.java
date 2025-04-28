
public class Str_08_StringCompression {

    public static String strCompression(String str) {
        StringBuilder sb = new StringBuilder("");
        Integer count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                count++;
                sb.append(str.charAt(i));
                if (count > 1) {
                    sb.append(count.toString());
                }
                count = 0;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbbcddeeee";
        System.out.println(strCompression(str));
    }
}
