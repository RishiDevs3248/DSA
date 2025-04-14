public class Rec_03_NumInIncresingOrder {
    public static void numInIncOrder(int n) {
        if (n == 0){
            return ;
        }
        numInIncOrder(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        numInIncOrder(10);
    }
}
