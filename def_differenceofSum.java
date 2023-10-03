import java.util.Scanner;

public class def_differenceofSum {
    public static void main(String[] args) {
        int m = 6;
        int n =30;
        int sum=0;
        int sum1=0;
        for(int i=1;i<=30;i++){
            if(i % 6 == 0){
                sum = sum + i;
            }
            else{
                sum1 = sum1 + i;
            }
        }
        System.out.println(sum1-sum);

    }
}
