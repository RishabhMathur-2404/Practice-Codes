public class repeate_number {

    public static int[] missing(int arr[]) {
        int n = arr.length;
        int r = -1, m = -1;
        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == i) {
                    count++;
                }
            }

                if (count == 2) r = i;
                else if (count == 0) m = i;

                if (r != -1 && m != -1)
                    break;
            }
            int ans[] = {r, m};
            return ans;
        }
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 2, 1, 1};
        int ans[] = missing(arr);
        System.out.println(ans[0]+" "+ans[1]);

    }
}
