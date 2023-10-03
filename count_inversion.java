public class count_inversion {
    public static int inversion(int arr[],int n){
        int c=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]) {
                    c++;
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int arr[] = {2 ,5 ,1 ,3 ,4};
        int n = arr.length;
        int c = inversion(arr,n);
        System.out.println(c);
    }
}
