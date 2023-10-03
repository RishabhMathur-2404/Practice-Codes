import java.util.*;
public class emp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int u = sc.nextInt();
        int x = sc.nextInt();
        int count=0;
        for(int j=i;j<=u;j++){
            if(j == x){
                count = count + 1;
            }
        }System.out.println(count);
    }
}
