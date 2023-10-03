public class kadane_algorithm {
    static long maxsum(int arr[]){
        int sum=0;
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            if(max<sum){
                max = sum;
            }
            if(sum <0){
                sum =0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        System.out.println(maxsum(arr));
    }
}
