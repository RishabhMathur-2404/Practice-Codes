public class Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        int arr[] = {2,3,1,2,4,3};
        int s=7;
        int n = arr.length;
        int r = Integer.MAX_VALUE;
        int left =0;
        int val_sum = 0;
        for(int i=0;i<n;i++){
            val_sum += arr[i];

            while(val_sum >=s){
                r = Math.min(r,i+1 - left);
                val_sum -= arr[left];
                left++;
            }
        }
        System.out.println(r);
    }
}
