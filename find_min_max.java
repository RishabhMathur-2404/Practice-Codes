import java.util.Arrays;
import java.util.Scanner;

public class find_min_max {
    static void min_max(int arr[],int a){
        int min,max;
        Arrays.sort(arr);
        max = arr[a-1];
        min = arr[0];
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No of elements  ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<n;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        min_max(arr,n);
    }
}
