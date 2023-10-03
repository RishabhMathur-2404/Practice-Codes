public class Make_Palindrome {
    public void palin(String s1){
        int n= s1.length();
        char temp;
        int lt=0,rt=n-1,ans=0;
        while(lt<rt){
            int l = lt,r = rt;
            while(s1.charAt(l) != s1.charAt(r)){
                r--;
            }
            if(l==r){
               /* temp = s1.charAt(r);
                s1.charAt(r) = s1.charAt(r+1);
                s1.charAt(r+1) = temp;*/
            }
        }
    }


    public static void main(String[] args) {
        String s1 = "aabb";
    }
}
