import java.util.Scanner;

public class decimal_to_binary {
    public static void main(String[] args) {
        int binary[] = new int[32];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while(n>0){
            binary[i]=n%2;
            n=n/2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--){
            System.out.print(binary[j]);
        }
    }
}
