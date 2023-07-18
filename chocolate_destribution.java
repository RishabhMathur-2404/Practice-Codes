import java.util.Arrays;


public class chocolate_destribution {
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int N=8;
        int M=5;
        int mindiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
       for(int i=0;i+M-1<N;i++){
           mindiff = Math.min((arr[i+M-1] - arr[i]),mindiff);
           System.out.print(mindiff);
       }
    }
}
