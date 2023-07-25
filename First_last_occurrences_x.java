
public class First_last_occurrences_x {
    static int first(int arr[],int k,int n){
        int start = 0;
        int end = n - 1;
        int res = -1;
        int l = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) {
                res = mid;
                end = mid - 1;
            } else if (arr[mid] > k)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return res;
    }

    static int last(int arr[], int k, int n){
        int start = 0;
        int end = n - 1;
        int res = -1;
        int l = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) {
                res = mid;
                start = mid + 1;
            } else if (arr[mid] > k)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int n = arr.length;
        int k = 5;
        System.out.println(first(arr,k,n));
        System.out.println(last(arr,k,n));
    }
}
