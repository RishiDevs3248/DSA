public class Rec_02_NumInDecreasingOrder {
    // Number in increasing order
    public static int numInDecreasingOrder(int n) {
        if (n == 0){
            return 0;
        }
        System.out.print(n + " ");
        return numInDecreasingOrder(n-1);
    }
    public static void main(String[] args) {
        numInDecreasingOrder(10);
    }
}
