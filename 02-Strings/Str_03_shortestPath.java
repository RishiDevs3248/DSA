public class Str_03_shortestPath {
    public static int Path(String str){
        int y = 0;
        int x = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'E'){
                x++;
            }else if ( str.charAt(i) == 'W'){
                x--;
            }else if ( str.charAt(i) == 'N'){
                y++;
            }else{
                y--;
            }
        }
        return (int)Math.sqrt((x*x)+(y*y));
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(Path(path));
    }
}
