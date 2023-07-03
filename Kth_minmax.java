import java.util.Scanner;
import java.util.Arrays;

public class Kth_minmax {
    static void kthmax(int arr[],int k){
        int min;
        Arrays.sort(arr);
        min = arr[k-1];
        System.out.println(min);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of elements  ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("K'th no: ");
        int k = sc.nextInt();
        System.out.println();
        kthmax(arr,k);

    }
}
