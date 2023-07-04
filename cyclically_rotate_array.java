public class cyclically_rotate_array {
    static void rotate(int arr[], int size){
        int l = arr[size -1];
        for (int i = size-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = l;
    }

    public static void main(String[] args)
    {
        int arr[] = { 1,2,3,4,5 };
        int size = arr.length;
        rotate(arr,size);
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
