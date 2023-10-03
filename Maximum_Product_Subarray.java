public class Maximum_Product_Subarray {
    public static void main(String[] args) {
        int ans = Integer.MIN_VALUE;
        int arr[] = {6, -3, -10, 0, 2};
        int n= arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]*arr[j] > ans)
                    System.out.println(ans);
            }
        }
    }
}
