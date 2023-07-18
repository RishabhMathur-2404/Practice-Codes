public class Common_elements {
    public static void main(String[] args) {

    int arr1[] = {1, 5, 10, 20, 40, 80};
    int n=arr1.length;
    int arr2[] = {6, 7, 20, 80, 100};
    int m = arr2.length;
    int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};
    int o =arr3.length;

    for (int i=0;i<n;i++){
        for (int j=0 ; j < m; j++)
            for (int k=0;k< o;k++)
            if (arr1[i] == arr2[j]) {
                if (arr2[j] == arr3[k]) {
                    System.out.println(arr1[i]);
                }
            }
    }
    }
}

