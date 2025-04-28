public class Rec_05_SumOfnNaturalNumbers {
    public static int sumOFn(int n) {
        if (n == 1){
            return 1;
        }
        return n + sumOFn(n-1);
    }
    public static void main(String[] args) {
        System.out.println(sumOFn(100));
    }
}
