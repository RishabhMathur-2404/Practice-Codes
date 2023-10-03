import java.util.Scanner;

public class Fibonacci_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int f[] = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<n;i++){
            f[i] = f[i - 1] + f[i - 2];
        }

        for(int j=0;j<n;j++){
            System.out.print(f[j]);

        }
    }
}
