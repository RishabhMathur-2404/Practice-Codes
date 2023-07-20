public class Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6};
        int n = arr.length;
        int buy = arr[0];
        int max_profit =0;
        for (int i=0;i<n;i++){
            if(buy > arr[i]){
                buy = arr[i];
            } else if (arr[i] - buy > max_profit)
                max_profit = arr[i] - buy;
        }
        System.out.println(max_profit);
    }
}
