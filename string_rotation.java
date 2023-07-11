import java.util.Scanner;

public class string_rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if(s1.length() != s2.length()){
            System.out.println("No rotation");
            System.exit(0);
        }
        else{
            String s3 = s1 + s1;
            if(s3.indexOf(s2) != -1){
                System.out.println("Rotation");
            }
            else{
                System.out.println("No Rotation");
            }
        }
    }
}