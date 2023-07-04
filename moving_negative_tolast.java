import java.util.Arrays;

public class moving_negative_tolast {
    static void segregated(int arr[],int size) {
        int temp[] = new int [size];
        int t = 0;
        for(int i=0;i<size;i++)
            if(arr[i] >=0)
                temp[t++] = arr[i];

            if (t == size || t == 0)
                return;

            for (int i = 0; i < size; i++)
                if (arr[i] < 0)
                    temp[t++] = arr[i];

            for (int i = 0; i < size; i++)
                arr[i] = temp[i];
    }


    public static void main(String[] args)
    {
        int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
        int size = arr.length;
        segregated(arr,size);
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
