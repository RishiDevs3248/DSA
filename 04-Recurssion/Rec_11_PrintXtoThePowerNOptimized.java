public class Rec_11_PrintXtoThePowerNOptimized {
    public static int printXtoThePowerN(int x, int n) {

        if (n == 0) {
            return 1;
        }

        int halfpowersquare = printXtoThePowerN(x, n/2) * printXtoThePowerN(x, n/2);

        if (n % 2 != 0) {
            halfpowersquare = x * halfpowersquare;
        }
        return halfpowersquare;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(printXtoThePowerN(x, n));
    }
    
    
}
