public class Subarray_0_sum {
    public static void main(String[] args) {
        int arr[] = {4,2,-3,1,6};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (sum == 0)
                continue;
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == 0)
                    System.out.println("yes");
            }
        }
        }
}
