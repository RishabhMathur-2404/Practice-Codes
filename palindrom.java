public class palindrom {
    public static void main(String[] args) {
        String s = "abba";
        String rstr = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            rstr = ch + rstr;
        }
            if(s.toLowerCase().equals(rstr.toLowerCase())){
                System.out.println("Palindrom");
            }
            else {
                System.out.println("its not");
            }
        }
}