
import java.util.Arrays;

public class median_equal_array {
    public static void main(String[] args) {
        int arr1[] = {1, 12, 15, 26, 38};
        int arr2[] = {2, 13, 17, 30, 45};
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
        int s = (arr3[c/2 -1] + arr3[c/2])/2;
        System.out.println(s);
    }
}
