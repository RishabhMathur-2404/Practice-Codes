public class Value_equal_index_value {
    static int fixedpt(int arr[],int start,int end){
        int mid = start + (start+end) /2;
        if (end >= start){
        if(mid == arr[mid])
            return mid;
        if (mid > arr[mid])
            return fixedpt(arr,mid+1,end);
        else
            return fixedpt(arr, end, mid - 1);
    }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {-10, -1, 0, 3, 10, 11, 30, 50, 100};
        int n = arr.length;
        System.out.println(fixedpt(arr,0,n-1));
        }
}
