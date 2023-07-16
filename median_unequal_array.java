import java.util.Arrays;

public class median_unequal_array {
    public static void main(String[] args) {
        int arr1[] = {1, 3};
        int arr2[] = {2,4};
        int a = arr1.length;
        int b = arr2.length;
        int c = a + b;
        int arr3[] = new int[c];
        for (int i = 0; i < a; i = i + 1) {

            arr3[i] = arr1[i];
        }

        for (int i = 0; i < b; i = i + 1) {
            arr3[a + i] = arr2[i];
        }
        Arrays.sort(arr3);
        for (int i = 0; i < c; i = i + 1) {
            System.out.print(arr3[i] + " ");
        }
        if(c%2 != 0 ){
            int m = arr3[c/2];
            System.out.println("Median " + m);
        } else {
            double n = (arr3[c / 2 - 1] + arr3[c / 2]) / 2;
            System.out.println("Median " + n);
        }
    }
}
