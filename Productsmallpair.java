import java.util.Arrays;

public class Productsmallpair {
    public static void main(String[] args) {
        int arr[] = {9 ,8, -7, 3, 9,3 };
        int sum =4;
        int ans;
        Arrays.sort(arr);
        if( arr[0] + arr[1] < sum){
            ans = arr[0]*arr[1];
            System.out.println(ans);
        }
    }
}
