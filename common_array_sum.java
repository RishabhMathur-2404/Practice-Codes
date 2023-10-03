public class common_array_sum {
    public static void main(String[] args) {

        int arr1[] = {1, 5, 10, 20, 40, 80};
        int n = arr1.length;
        int arr2[] = {6, 7, 20, 80, 100};
        int m = arr2.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]){
                   sum = sum + arr1[i];
                }
            }
        }
        System.out.println(sum);
    }
}
