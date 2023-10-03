import org.w3c.dom.ls.LSOutput;

public class reverse_array {

    static void reverse(int arr[],int s,int e){
        int temp;
        while(s<e) {
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    static void print(int arr[],int size){
        for (int i =0;i<=size;i++)
            System.out.print(arr[i]);
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverse(arr,0,4);
        System.out.println();
        print(arr,4);
    }
}
