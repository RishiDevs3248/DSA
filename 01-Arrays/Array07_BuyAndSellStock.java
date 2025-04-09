public class Array07_BuyAndSellStock {
    public static int profitval(int arr[]){
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (buyprice < arr[i]){
                int profit = arr[i] - buyprice;
                maxProfit = Math.max(maxProfit, profit);
            }
            else{
                buyprice = arr[i];
            }
        }
        return maxProfit ;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println(profitval(arr));
    }
}
