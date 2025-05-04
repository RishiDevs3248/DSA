public class Rec_10_PrintXtoThePowerN {
    public static int printXtoThePowerN(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * printXtoThePowerN(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(printXtoThePowerN(9,3));
    }
}
